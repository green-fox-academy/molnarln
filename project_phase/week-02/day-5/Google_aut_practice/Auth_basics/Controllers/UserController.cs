using Auth_basics.Entities;
using Auth_basics.Services;
using Microsoft.AspNetCore.Authorization;
using Microsoft.AspNetCore.Mvc;
using Auth_basics.Helpers;
using Microsoft.IdentityModel.Tokens;
using System.IdentityModel.Tokens.Jwt;
using Microsoft.Extensions.Options;
using System.Text;
using System;
using Microsoft.Extensions.Configuration;
using Google.Apis.Gmail.v1;
using System.IO;
using Google.Apis.Auth.OAuth2;
using System.Collections.Generic;
using System.Threading;
using Google.Apis.Util.Store;
using Google.Apis.Services;
using Google.Apis.Gmail.v1.Data;
using Google.Apis.Auth.OAuth2.Responses;
using Google.Apis.Auth.OAuth2.Flows;

namespace Auth_basics.Controllers
{
    [Authorize]
    [ApiController]
    [Route("[controller]")]
    public class UsersController : ControllerBase
    {
        private IUserService _userService;
        private AppSettings _appSettings;

        public IEnumerable<string> Scopes { get; private set; }

        public UsersController(IUserService userService, IOptions<AppSettings> appSettings)
        {
            _userService = userService;
            _appSettings = appSettings.Value;
        }

        [AllowAnonymous]
        [HttpPost("authenticate")]
        public IActionResult Authenticate([FromBody]User userParam)
        {
            var user = _userService.Authenticate(userParam.Username, userParam.Password);

            if (user == null)
                return BadRequest(new { message = "Username or password is incorrect" });

            return Ok(user);
        }

        [HttpGet]
        public IActionResult GetAll()
        {
            var users = _userService.GetAll();
            return Ok(users);
        }

        [AllowAnonymous]
        [HttpGet("checktoken")]
        public IActionResult CheckTokenIsValid([FromHeader]string authorization)
        {
            var token = authorization.Replace("Bearer ", "");
            var key = Encoding.ASCII.GetBytes(_appSettings.Secret);

            var validationParameters = new TokenValidationParameters()
            {
                ValidateIssuerSigningKey = true,
                IssuerSigningKey = new SymmetricSecurityKey(key),
                ValidateIssuer = false,
                ValidateAudience = false,
                ValidateLifetime = true,
                ClockSkew = TimeSpan.Zero

            };

            var tokenHandler = new JwtSecurityTokenHandler();
            SecurityToken validatedToken = null;
            try
            {
                tokenHandler.ValidateToken(token, validationParameters, out validatedToken);
            }
            catch (SecurityTokenException)
            {
                return StatusCode(401, new { TokenIsVlaid = "false" });
            }
            catch (Exception e)
            {

                return StatusCode(111, new { message = e.ToString() });
            }

            //... manual validations return false if anything untoward is discovered
            return Ok(validatedToken);
        }
        /// <summary>
        /// Api for listing users emails.
        /// </summary>
        /// <returns></returns>
        [AllowAnonymous]
        [HttpGet("getmessages")]

        public IActionResult GetMessages()
        {
            {
                GmailService service = new GmailService();
                string userId = "laszlo.molnar25@gmail.com";
                string query = string.Empty;

                List<Message> result = new List<Message>();
                UsersResource.MessagesResource.ListRequest request = service.Users.Messages.List(userId);
                request.OauthToken = "ya29.GlvyBsXaXl4b_BLIznHhhXLURMJSCJ3yul6jUKS2od0h4USv6Bk70OeEEMWcPhCfoBzbwBEa1y_iAabFxbeKrDjj-GFaCUh5raQT0RRhx8rMWCc4qwj71dL88DnD";
                //request.Q = query;
                do
                {
                    try
                    {
                        ListMessagesResponse response = request.Execute();
                        result.AddRange(response.Messages);
                        request.PageToken = response.NextPageToken;
                    }
                    catch (Exception e)
                    {
                        Console.WriteLine("An error occurred: " + e.Message);
                    }
                } while (!String.IsNullOrEmpty(request.PageToken));

                int numberOfMessages = result.Count;
                return StatusCode(212, new {numberOfMails = numberOfMessages });
            }
        }

        //[AllowAnonymous]
        //[HttpGet("ga")]
        //public IActionResult GmailTest()
        //{

        //    If modifying these scopes, delete your previously saved credentials
        //     at ~/.credentials / gmail - dotnet - quickstart.json
        //    string[] Scopes = { GmailService.Scope.GmailReadonly };
        //    string ApplicationName = "Gmail API .NET Quickstart";

        //    UserCredential credential;

        //    using (var stream =
        //        new FileStream("credentials.json", FileMode.Open, FileAccess.Read))
        //    {
        //        ClientSecrets secrets = new ClientSecrets()
        //        {
        //            ClientId = "170306719503-roh40tdp32qsjfpv4u7jta1nnhqrk4t8.apps.googleusercontent.com",
        //            ClientSecret = "o910YzS1F5OtALtwIzqfkchc"
        //        };
        //        The file token.json stores the user's access and refresh tokens, and is created
        //         automatically when the authorization flow completes for the first time.
        //        string credPath = "token.json";
        //        credential = GoogleWebAuthorizationBroker.AuthorizeAsync(
        //            secrets,
        //            Scopes,
        //            "user",
        //            CancellationToken.None,
        //            new FileDataStore(credPath, true)).Result;
        //        Console.WriteLine("Credential file saved to: " + credPath);
        //    }


        //    var token = new TokenResponse() { };
        //    var credentials = new UserCredential(new GoogleAuthorizationCodeFlow(
        //        new GoogleAuthorizationCodeFlow.Initializer
        //        {
        //            ClientSecrets = secrets
        //        }),
        //        "user",
        //        token);

        //    Create Gmail API service.
        //    var service = new GmailService(new BaseClientService.Initializer()
        //    {
        //        HttpClientInitializer = credential,
        //        ApplicationName = ApplicationName,
        //    });

        //    Define parameters of request.
        //    UsersResource.LabelsResource.ListRequest request = service.Users.Labels.List("me");

        //    List labels.
        //    IList<Label> labels = request.Execute().Labels;
        //    Console.WriteLine("Labels:");
        //    if (labels != null && labels.Count > 0)
        //    {
        //        foreach (var labelItem in labels)
        //        {
        //            Console.WriteLine("{0}", labelItem.Name);
        //        }
        //    }
        //    else
        //    {
        //        Console.WriteLine("No labels found.");
        //    }
        //    Console.Read();

        //    return StatusCode(200, new { message = "Minden OK!" });
        //}
    }
}
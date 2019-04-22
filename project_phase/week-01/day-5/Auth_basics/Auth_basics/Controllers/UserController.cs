using Auth_basics.Entities;
using Auth_basics.Services;
using Microsoft.AspNetCore.Authorization;
using Microsoft.AspNetCore.Mvc;
<<<<<<< HEAD
using Auth_basics.Helpers;
using Microsoft.IdentityModel.Tokens;
using System.IdentityModel.Tokens.Jwt;
using Microsoft.Extensions.Options;
using System.Text;
using System;
using Microsoft.Extensions.Configuration;
=======
>>>>>>> b9d6485e7a11b1e69fa639c9ba52b22263b4e8f1

namespace Auth_basics.Controllers
{
    [Authorize]
    [ApiController]
    [Route("[controller]")]
    public class UsersController : ControllerBase
    {
        private IUserService _userService;
<<<<<<< HEAD
        private AppSettings _appSettings;

        public UsersController(IUserService userService, IOptions<AppSettings> appSettings)
        {
            _userService = userService;
            _appSettings = appSettings.Value;
=======

        public UsersController(IUserService userService)
        {
            _userService = userService;
>>>>>>> b9d6485e7a11b1e69fa639c9ba52b22263b4e8f1
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
<<<<<<< HEAD

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
    }
}
=======
    }
}
>>>>>>> b9d6485e7a11b1e69fa639c9ba52b22263b4e8f1

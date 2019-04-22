<<<<<<< HEAD
﻿using Auth_basics.Helpers;
using Auth_basics.Services;
using Microsoft.AspNetCore.Authentication.JwtBearer;
using Microsoft.AspNetCore.Builder;
=======
﻿using Microsoft.AspNetCore.Builder;
>>>>>>> b9d6485e7a11b1e69fa639c9ba52b22263b4e8f1
using Microsoft.AspNetCore.Hosting;
using Microsoft.AspNetCore.Mvc;
using Microsoft.Extensions.Configuration;
using Microsoft.Extensions.DependencyInjection;
<<<<<<< HEAD
using Microsoft.IdentityModel.Tokens;
using System;
using System.Text;
=======
using Auth_basics.Helpers;
using System.Text;
using Microsoft.AspNetCore.Authentication.JwtBearer;
using Microsoft.IdentityModel.Tokens;
using Auth_basics.Services;
>>>>>>> b9d6485e7a11b1e69fa639c9ba52b22263b4e8f1

namespace Auth_basics
{
    public class Startup
    {
        public Startup(IConfiguration configuration)
        {
            Configuration = configuration;
        }

        public IConfiguration Configuration { get; }

        // This method gets called by the runtime. Use this method to add services to the container.
        public void ConfigureServices(IServiceCollection services)
        {
            services.AddCors();
            services.AddMvc().SetCompatibilityVersion(CompatibilityVersion.Version_2_1);
<<<<<<< HEAD

=======
>>>>>>> b9d6485e7a11b1e69fa639c9ba52b22263b4e8f1
            var appSettingsSection = Configuration.GetSection("AppSettings");
            services.Configure<AppSettings>(appSettingsSection);
            
            var appSettings = appSettingsSection.Get<AppSettings>();
            var key = Encoding.ASCII.GetBytes(appSettings.Secret);
            //AddAuthentication can be set one-by-one:

            //services.AddAuthentication(x => x.DefaultChallengeScheme = JwtBearerDefaults.AuthenticationScheme);
            //Or with lambda iteration:

            services.AddAuthentication(x =>
            {
                x.DefaultAuthenticateScheme = JwtBearerDefaults.AuthenticationScheme;
                x.DefaultChallengeScheme = JwtBearerDefaults.AuthenticationScheme;
<<<<<<< HEAD
               
=======
>>>>>>> b9d6485e7a11b1e69fa639c9ba52b22263b4e8f1
            })
            .AddJwtBearer(x =>
            {
                x.RequireHttpsMetadata = false;
                x.TokenValidationParameters = new TokenValidationParameters
                {
                    ValidateIssuerSigningKey = true,
                    IssuerSigningKey = new SymmetricSecurityKey(key),
                    ValidateIssuer = false,
                    ValidateAudience = false,
<<<<<<< HEAD
                    ValidateLifetime = true,
                    ClockSkew = TimeSpan.Zero
=======
                    ValidateLifetime = true
                    
                    
                    
>>>>>>> b9d6485e7a11b1e69fa639c9ba52b22263b4e8f1
                };
            });

            // configure DI for application services
            services.AddScoped<IUserService,UserService>();
        }

        // This method gets called by the runtime. Use this method to configure the HTTP request pipeline.
        public void Configure(IApplicationBuilder app, IHostingEnvironment env)
        {
<<<<<<< HEAD

=======
>>>>>>> b9d6485e7a11b1e69fa639c9ba52b22263b4e8f1
            // global cors policy
            app.UseCors(x => x
                .AllowAnyOrigin()
                .AllowAnyMethod()
                .AllowAnyHeader());

<<<<<<< HEAD

=======
>>>>>>> b9d6485e7a11b1e69fa639c9ba52b22263b4e8f1
            app.UseAuthentication();

            //app.UseHttpsRedirection();
            app.UseMvc();
        }
    }
}

using Microsoft.AspNetCore.Builder;
using Microsoft.AspNetCore.Hosting;
using Microsoft.AspNetCore.Http;
using Microsoft.EntityFrameworkCore;
using Microsoft.Extensions.Configuration;
using Microsoft.Extensions.DependencyInjection;

namespace Database_project
{
    public class Startup
    {
        private readonly IConfiguration Configuration;
        private readonly IHostingEnvironment env;

        public Startup(IConfiguration configuration, IHostingEnvironment environment)
        {
            this.Configuration = configuration;
            this.env = environment;
        }

        // This method gets called by the runtime. Use this method to add services to the container.
        // For more information on how to configure your application, visit https://go.microsoft.com/fwlink/?LinkID=398940
        public void ConfigureServices(IServiceCollection services)
        {
            //if (env.IsDevelopment())
            //{
                services.AddDbContext<ApplicationContext>(builder =>
                        builder.UseSqlServer(Configuration["TestString:DefaultConnection"]));

             //   System.Console.WriteLine("ISDEVELOPEMENT");
            //}
            //if (env.IsProduction())
            //{
            //    System.Console.WriteLine("ISPRODUCTION");
            //    services.AddDbContext<ApplicationContext>(builder =>
            //            builder.UseSqlServer(Configuration.GetConnectionString("ProductionConnection")));
            //}
            services.AddMvc();

        }


        // This method gets called by the runtime. Use this method to configure the HTTP request pipeline.
        public void Configure(IApplicationBuilder app, IHostingEnvironment env)
        {

            if (env.IsDevelopment())
            {
                app.UseDeveloperExceptionPage();
            }
            app.UseMvc();


            app.Run(async (context) =>
            {
                await context.Response.WriteAsync("Hello World!");
            });

        }
    }
}

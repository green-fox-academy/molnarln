using Microsoft.AspNetCore;
using Microsoft.AspNetCore.Hosting;
using Microsoft.Extensions.Configuration;
using System.IO;

namespace Database_project
{
    public class Program
    {
        public static void Main(string[] args)
        {
            CreateWebHostBuilder(args).Build().Run();            
        }

        public static IWebHostBuilder CreateWebHostBuilder(string[] args) =>
            WebHost.CreateDefaultBuilder(args)
                        .ConfigureAppConfiguration((hostingContext, config) =>
                        {
                            config.SetBasePath(Directory.GetCurrentDirectory());
                            config.AddJsonFile("appsettings.json", optional: true, reloadOnChange: true);
                            config.AddJsonFile("appsettings.development.json", optional: true, reloadOnChange: true);
                            config.AddJsonFile("appsettings.production.json", optional: true, reloadOnChange: true);
                        })
                .UseStartup<Startup>();



        //static void ConfigConfiguration(WebHostBuilderContext ctx, IConfigurationBuilder config)
        //{
        //    config.SetBasePath(Directory.GetCurrentDirectory())
        //        .AddJsonFile("appsettings.json", optional: false, reloadOnChange: true)
        //        .AddJsonFile($"appsettings.{ctx.HostingEnvironment.EnvironmentName}.json", optional: true, reloadOnChange: true);

        //}
    }
}

using Microsoft.AspNetCore.Mvc;
using System;
using System.Collections.Generic;
using System.Diagnostics;
using System.Linq;
using System.Threading.Tasks;

namespace Async_Practice.Controllers
{
    public class HomeController : Controller
    {
        [Route("sync")]
        [HttpGet]
        public ActionResult Index()
        {
            Stopwatch watch = new Stopwatch();
            watch.Start();
            ContentManagement service = new ContentManagement();
            var content = service.GetContent();
            var count = service.GetCount();
            var name = service.GetName();

            watch.Stop();
            ViewBag.WatchMilliseconds = watch.ElapsedMilliseconds;
            return StatusCode(200, new { TimeElapsed = $"{watch.ElapsedMilliseconds}" });
        }
        [Route("async")]
        [HttpGet]
        public async Task<ActionResult> IndexAsync()
        {
            Stopwatch watch = new Stopwatch();
            watch.Start();
            ContentManagement service = new ContentManagement();
            var contentTask = Task.Run(() => service.GetContent()); //This row is the same as the row under:
            //var contentTask = service.GetContentAsync();
            var countTask = service.GetCountAsync();
            var nameTask = service.GetNameAsync();

            //var content = await contentTask;
            //var count = await countTask;
            //var name = await nameTask;

            await contentTask;
            await countTask;
            await nameTask;

            watch.Stop();
            ViewBag.WatchMilliseconds = watch.ElapsedMilliseconds;
            return StatusCode(200, new { TimeElapsed = $"{watch.ElapsedMilliseconds}" });
        }
    }
}

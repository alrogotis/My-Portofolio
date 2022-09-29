using Microsoft.AspNetCore.Mvc;
using Microsoft.AspNetCore.Mvc.RazorPages;

namespace WebAppSimple.Pages
{
    public class ProductsModel : PageModel
    {
        public IEnumerable<string>? Products { get; set; }
        public void OnGet()
        {
            ViewData["Title"] = "My shop";
            Products = new[] { "Honey", "Milk", "Sugar", "Chocolate" };
        }
    }
}

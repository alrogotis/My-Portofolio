
/* ΕΥρητηριο 1 */
create index index1 on production.products(product_name)

/* Εμφανίστε το όνομα και την ποσότητα των καταστημάτων που έχουν το προϊόν Trek Remedy 29 Carbon Frameset - 2016, σε φθίνουσα διάταξη . */

select store_name, quantity
from sales.stores, production.stocks, production.products
where stores.store_id = stocks.store_id and stocks.product_id = products.product_id and product_name = 'Trek Remedy 29 Carbon Frameset - 2016'
order by quantity desc


/* Ευρητηριο 2 */
create index index2 on sales.orders(order_date)

/* Εμφανίστε το όνομα, επώνυμο, τηλέφωνο, email των πελατών που έχουν παραγγείλει το προϊόν με όνομα 'Trek Remedy 29 Carbon Frameset - 2016' στις '2016-01-01' */


select last_name, first_name , phone, email
from sales.customers, sales.orders, sales.order_items, production.products
where customers.customer_id = orders.customer_id and orders.order_id = order_items.order_id and order_items.product_id = products.product_id and product_name = 'Trek Remedy 29 Carbon Frameset - 2016' and order_date = '2016-01-01'

/* ΕΥΡΗΤΗΡΙΟ 3 */

create index index3 on sales.stores(store_name)

/* Εμφανίστε το όνομα, επώνυμο, email, τηλέφωνο των υπάλληλων που δουλεύουν στο κατάστημα Baldwin Bikes . */

select first_name, last_name, staffs.email, staffs.phone
from sales.staffs, sales.stores
where staffs.store_id = stores.store_id and store_name = 'Baldwin Bikes'

/* ΕΥΡΗΤΗΡΙΟ 4 */

create index index4 on sales.customers(last_name)

/* Βρές μου  όλους τους πελάτες με το επώνυμο Henry */

select * from sales.customers
where last_name = 'Henry'

/* ΕΥΡΗΤΗΡΙΟ 5 */

create index index5 on production.categories(category_name)

/*Βρές μου όλα τα στοιχειά των ποδήλατων τις κατηγορίας Comfort Bicycles και βαλτά σε διάταξη συμφωνά με την μάρκα. */

select product_id, product_name, brand_name, category_name, model_year, list_price
from production.categories, production.brands, production.products
where production.categories.category_id = production.products.category_id and production.brands.brand_id = production.products.brand_id and category_name = 'Comfort Bicycles'
order by brand_name
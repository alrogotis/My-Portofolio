/* ΕΡΩΤΗΜΑ 1 */

/* Εμφανίστε τα ονόματα των καταστημάτων με αριθμό παραγγελιών κάτω από τον μέσο όρο . */

select store_name, count(order_id)
from sales.stores,sales.orders
where sales.orders.store_id = sales.stores.store_id
group by store_name
having count(order_id) < avg(order_id)


/* ΕΡΩΤΗΜΑ 2 */

/* Εμφανίστε το όνομα και το επώνυμο των πελατών που έχουν κάνει τουλάχιστον 3 παραγγελίες . */

select first_name, last_name
from sales.customers,sales.orders
where sales.customers.customer_id = sales.orders.customer_id
group by first_name, last_name
having count(order_id) >= 3

/* ΕΡΩΤΗΜΑ 3 */

/* Εμφανίστε την συνολική ποσότητα του προϊόντος Trek 820  2016 από όλα τα καταστήματα . */

select sum(quantity)
from production.stocks , production.products , sales.stores
where sales.stores.store_id = production.stocks.store_id and production.products.product_id = production.stocks.product_id and product_name = 'Trek 820 - 2016'


/* ΕΡΩΤΗΜΑ 4 */

/* Εμφανίστε το όνομα, επώνυμο, τηλέφωνο, email των πελατών που έχουν παραγγείλει το προϊόν με όνομα 'Trek Remedy 29 Carbon Frameset - 2016' στις '2016-01-01' */


select last_name, first_name , phone, email
from sales.customers, sales.orders, sales.order_items, production.products
where customers.customer_id = orders.customer_id and orders.order_id = order_items.order_id and order_items.product_id = products.product_id and product_name = 'Trek Remedy 29 Carbon Frameset - 2016' and order_date = '2016-01-01'


/* ΕΡΩΤΗΜΑ 5 */

/* Εμφανίστε το όνομα και την ποσότητα των καταστημάτων που έχουν το προϊόν Trek Remedy 29 Carbon Frameset - 2016, σε φθίνουσα διάταξη . */

select store_name, quantity
from sales.stores, production.stocks, production.products
where stores.store_id = stocks.store_id and stocks.product_id = products.product_id and product_name = 'Trek Remedy 29 Carbon Frameset - 2016'
order by quantity desc

/* ΕΡΩΤΗΜΑ 6 */

/* Εμφανίστε τα ονόματα των μάρκων που έχουν προϊόντα με τιμή τουλάχιστον 1000.  */

select distinct brand_name
from production.brands, production.products
where brands.brand_id = products.brand_id and list_price >= 1000

/* ΕΡΩΤΗΜΑ 7 */

/* Εμφανίστε τα ονόματα και τις πωλήσεις των προϊόντων σε φθίνουσα διάταξη . */

select product_name, sum(quantity) as sales
from sales.order_items, production.products
where order_items.product_id = products.product_id
group by product_name
order by sales desc

/* ΕΡΩΤΗΜΑ 8 */

/* Εμφανίστε τον αριθμο των προιοντών που παραγγελθηκαν στις '2016-01-01' */

select order_date, sum(quantity)
from sales.orders, sales.order_items
where orders.order_id = order_items.order_id and order_date = '2016-01-01'
group by order_date


/* ΕΡΩΤΗΜΑ 9 */

/* Εμφανίστε το όνομα, επώνυμο, email, τηλέφωνο των υπάλληλων που δουλεύουν στο κατάστημα Baldwin Bikes . */

select first_name, last_name, staffs.email, staffs.phone
from sales.staffs, sales.stores
where staffs.store_id = stores.store_id and store_name = 'Baldwin Bikes'

/* ΕΡΩΤΗΜΑ 10 */

/* Ενημερώστε την τιμή του προϊόντος με την ονομασία Heller Shagamaw Frame - 2016 και θέστε την ίση με 1000 . */

update production.products
set list_price = 1000
where product_name='Heller Shagamaw Frame - 2016'

/* ΕΡΩΤΗΜΑ 11 */

/* Βρές μου  όλους τους πελάτες με το επώνυμο Henry */

select * from sales.customers
where last_name = 'Henry'

/* ΕΡΩΤΗΜΑ 12 */

/*Βρές μου όλα τα στοιχειά των ποδήλατων τις κατηγορίας Comfort Bicycles και βαλτά σε διάταξη συμφωνά με την μάρκα. */

select product_id, product_name, brand_name, category_name, model_year, list_price
from production.categories, production.brands, production.products
where production.categories.category_id = production.products.category_id and production.brands.brand_id = production.products.brand_id and category_name = 'Comfort Bicycles'
order by brand_name





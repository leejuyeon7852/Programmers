-- 코드를 입력하세요
select year(o.sales_date) as year, month(o.sales_date) as month, u.gender, count(distinct o.user_id) as users
from online_sale as o
join user_info as u on o.user_id = u.user_id
where u.gender is not null
group by year(o.sales_date), month(o.sales_date), u.gender
order by year(o.sales_date) asc, month(o.sales_date) asc, u.gender asc;

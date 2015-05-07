排名的视表
create or replace view sale_view as select m.username,m.total_sales_num from merchant as m order by m.total_sales_num desc;
美食订单总额
create or replace view fooddata as select m.M_username,m.total,m.order_time from food_order as m where m.state='finish';
娱乐订单总额
create or replace view entertainmentdata as select m.M_username,m.total,m.order_time from entertainment_order as m where m.state='used';
住宿订单总额
create or replace view staydata as select m.M_username,m.total,m.order_time from stay_order as m where m.state='used';


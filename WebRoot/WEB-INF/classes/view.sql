�������ӱ�
create or replace view sale_view as select m.username,m.total_sales_num from merchant as m order by m.total_sales_num desc;
��ʳ�����ܶ�
create or replace view fooddata as select m.M_username,m.total,m.order_time from food_order as m where m.state='finish';
���ֶ����ܶ�
create or replace view entertainmentdata as select m.M_username,m.total,m.order_time from entertainment_order as m where m.state='used';
ס�޶����ܶ�
create or replace view staydata as select m.M_username,m.total,m.order_time from stay_order as m where m.state='used';


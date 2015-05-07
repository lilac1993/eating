set names gkk;

insert into school values('10001','中山大学南方学院','广州从化温泉镇');
insert into school values('10002','水利学院','广州从化温泉镇');

insert into merchant values('13533738748',null,'12345678','白菜专卖店','d:/','d:/','001,010,011','10001','H12','13533738748,668748','丁灿标','d:/','13533738748','abc@qq.com',0,now(),0,0);
insert into merchant values('13427463576',null,'12345678','nike专卖店','d:/','d:/','001,010,011','10001','H12','13533738748,668748','丁灿标','d:/','13533738748','abc@qq.com',1,now(),0,0);
insert into merchant values('13427260275',null,'12345678','anta专卖店','d:/','d:/','001,010,011','10001','H12','13533738748,668748','丁灿标','d:/','13533738748','abc@qq.com',2,now(),0,0);
insert into merchant values('13257508359',null,'12345678','yuan专卖店','d:/','d:/','001,010,011','10001','H12','13533738748,668748','丁灿标','d:/','13533738748','abc@qq.com',3,now(),0,0);
insert into merchant values('13760508490',null,'12345678','fish专卖店','d:/','d:/','001,010,011','10001','H12','13533738748,668748','丁灿标','d:/','13533738748','abc@qq.com',4,now(),0,0);

insert into food_order values('100000000000001','13427463576','12345678901','668748','H2',10.5,'finish','to_pay',now());
insert into food_order values('100000000000002','13427463576','12345678901','668748','H2',12.5,'finish','to_pay',now());
insert into food_order values('100000000000003','13427463576','12345678901','668748','H2',12.5,'submitted','to_pay',now());

insert into entertainment_order values('110000000000001','13427463576','12345678901',49.9,'小姐','668748','123456789','used','to_pay',now());
insert into entertainment_order values('110000000000002','13427463576','12345678901',20,'小姐','668748','123456789','used','to_pay',now());

insert into stay_order values('111000000000001','13427463576','12345678901',99,'小姐','668748',123456789,'used','to_pay',now());
insert into stay_order values('111000000000002','13427463576','12345678901',108.9,'小姐','668748',123456789,'used','to_pay',now());

insert into announcement values('1000000001','欢迎新商家的加入','11111111111','12345',now());
insert into announcement values('1000000002','新商家有优惠','11111111111','12345',now());
insert into announcement values('1000000003','回馈商家抽奖活动','11111111111','12345',now());
insert into announcement values('1000000004','恭喜中奖了','13427463576','12345',now());

insert into order_foods values('100000000000001','12345678901',2,10.0); 
insert into order_foods values('100000000000003','12345678901',2,10.0); 


select count(*) from (select * from food_order where food_order.m_username  = '13427463576' and food_order.state = 'submitted')as a,
(select * from entertainment_order where entertainment_order.m_username  = '13427463576' and entertainment_order.state = 'submitted')as b,
(select * from stay_order where stay_order.m_username  = '13427463576' and stay_order.state = 'submitted')as c;















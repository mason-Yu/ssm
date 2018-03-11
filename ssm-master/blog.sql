create TABLE MENU(
 menuId NUMBER  primary key, 
 menuName VARCHAR2(255),
 menuUrl VARCHAR2(255),
 parentMenuId NUMBER, 
 updateDate DATE


);


create sequence seq_menu_id; 

create table ROLE (

role_Id NUMBER  primary key, 
role_name VARCHAR2(50),
role_dec VARCHAR2(255),
update_date DATE

);
create sequence seq_role_id;


CREATE table UserInfo (
user_id NUMBER primary key,
user_name VARCHAR2(50),
password VARCHAR2(150),
is_disabled VARCHAR2(50)
);
create sequence seq_userinfo_id;


create TABLE userRole (
urid NUMBER primary key,
user_id NUMBER,
role_id NUMBER
);
create sequence seq_userRole_id;

CREATE table MenuRole (

id NUMBER primary key,
menuId NUMBER,
RoleId NUMBER


);
create sequence seq_menuRole_id;
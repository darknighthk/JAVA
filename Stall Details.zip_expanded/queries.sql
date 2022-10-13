
begin
   execute immediate 'drop table stall';
exception
   when others then null;
end;
/

create table stall(id number(10) not null primary key,
stall_name varchar2(255) not null,
detail varchar2(255) not null,
stall_owner varchar2(255) not null,
items_available varchar2(255) not null);
 
insert into stall(id,stall_name,detail,stall_owner,items_available)values (1,'Wok and roll','promotional type','Andrea','Johnson-Johnsons,Biba,Lakme');
insert into stall(id,stall_name,detail,stall_owner,items_available)values (2,'Planet Of the graphs','maxima type','Sasha','Kelly Wearstler,Diva,Louis Phillipe');
insert into stall(id,stall_name,detail,stall_owner,items_available)values (3,'Chez creations','promotional type','Sarah','Peter Marino,Loreal');




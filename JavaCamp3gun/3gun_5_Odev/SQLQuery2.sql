-- Select
-- ANSI 
-- "Bu şekilde satırın başına 2 adet Tire "--" koyarsanız. Yorum satırı olur.


-- Customers Tablosunki bütün veriyi getir.
select * from Customers

-- Customers tablasounda , contactAdı,şirketAdı,Şehir verilerini getir.
Select ContactName Adi,CompanyName Şirletadi,City Sehir from Customers

-- City ismi "Berlin" olanları getir.
Select * from Customers where City = 'Berlin'

-- Category'si = 1 YADA 3 olanları getir.
Select * from Products where CategoryID = 1 or CategoryID=3

-- Category'si = 1 olan ürünleri VE fiyatları 10'a eşit ve 10'dan yüksek olanları getir.
Select * from Products where CategoryID = 1 and UnitPrice>=10

-- Category'si = 1 olan ürünlerin fiyatlarını en düşük fiyattan , en yüksek fiyata doğru sıralayarak ver.
select * from Products order by UnitPrice asc -- ascending 'in kısaltışmışıdır. ascending = artan demek..

-- Category'si = 1 olan ürünlerin fiyatlarını en yüksek fiyattan , en düşük fiyata doğru sıralayarak ver.
select * from Products where CategoryID = 1 order by UnitPrice desc -- desc 'in kısaltılmışıdır. descending = düşen demektir yani azalan da diyebiliriz.	

-- Category'si = 2 olan Grubun adetini ver.
select COUNT(*) Adet from Products where CategoryID =2


-- Yönetim dediki, =D

-- ürün adeti 10'dan küçük olan category leri bana söyle bende onları destekliyeyim.
-- bu tarz kümilatif gruplarda sorgulamayı "where" koşulu yerine "having" koşulu ile yapılır.
-- burada yazılan count (adet)'ini , avg-average(ortalaması)'nı,sum (toplamı)'nı verir bizlere.
select CategoryID, COUNT(*)Adet from Products group by CategoryID having count(*)<10 

-- Datayı filtrelemek istersek where ile filtreleme yapabiliriz.
select CategoryID, COUNT(*)Adet from Products where Unitprice>20 group by CategoryID having count(*)<10 


select Products.ProductID,Products.ProductName,Products.UnitPrice,Categories.CategoryName
from Products inner join Categories -- inner join 
on Products.CategoryID = Categories.CategoryID
where Products.UnitPrice>10

-- DTO data transformation object
-- inner join, sadece 2 tabloda da eşleşenleri bir araya getirir, eşleşmeyen data varsa onu getirmez.

-- left join, Sol tabloda olup, sağ tabloda OLMAYANLARI da getir demek.

select * from Products p left join [Order Details] od
on p.ProductID = od.ProductID

select * from Customers c left join Orders o
on c.CustomerID= o.CustomerID
where o.CustomerID is null

-- birde right join var, bu da left join tam tersini verir. sağ tabloda olup , sol tablo da olmayan verileri getirir.
-- fakat her sorguda bu calısmaz bu neden genelde inner ve left join'i kullanırız.


-- ikiden fazla tabloyu join etmek istersekte.
-- 
select * from Products p inner join [Order Details] od
on p.ProductID = od.ProductID -- Ürün ID'si ile Ürün Detayındaki ID'yi getir.
inner join Orders o -- siparişleri join et 
on o.OrderID = od.OrderID -- siparişteki ID ile sipariş Detayındaki ID'yi getir.


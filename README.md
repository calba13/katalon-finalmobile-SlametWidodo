
| PROJECT : Hacktiv8 - Final Project - Mobile
| Title : Automation Mobile App
| Date : Dec 2023
| Author : calba13
-----------------------------------------------------

-----------------------------------------------------
** TEST CASE **
=====================================================
Total 8 :
> TC-Cart
1. TC-Add Item : Menambahkan item ke cart
2. TC-CheckOut : Melakukan proses check out

> TC-Common 
3. TC-Open Application Mobile : Open/Start Application
4. TC-Close Application Mobile : Close Application
   
> TC-Login 
5. TC-Login : Proses Login

> TC-Navigation
6. TC-Pilih Menu : fitur pilih menu menggunakan parameter text (use Switch condition)
   
> TC-SignOut
7. TC-SignOut : Proses Sign out

> TC-SignUp 
8. TC-SignUp : Register User 
----------------------------------------------------


-----------------------------------------------------
** TEST SUITE **
=====================================================
Total 4 :
1. 00 Sign Up [ Flow: TC3 > TC8(use dataBinding) ]
2. 01 Login and Logout [ Flow: TC3 > TC5(use dataBinding) > TC7 ]
3. 02 Add Product to Cart, Check Out and Sign Out [ Flow: TC3 > TC5 > TC1(use dataBinding) > TC2 > TC7 ]
4. All Collection [ Flow: TS1 > TS2 > TS3 ]
----------------------------------------------------

How to Run?
1. Open Katalon Studio
2. Buka Project 
3. Buka All Collection
4. Start with Happy ending (^_^)

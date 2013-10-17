* http://habrahabr.ru/post/158441/
* https://code.google.com/p/hunspell-merge/

Программа-с-хабра для соединения словарей Hunspell. Планирую перепилить под наш курсач. Отличается от выложенной на гуглекоде: 
* выставил кодировку проекта UTF-8, 
* убрал какие-то непонятки с символами, мешающие компиляции,
* убрал из build.xml строчку, вроде как приказывающую компиличть как Java 1.6, что выдавала warning.

2012-12-09 v.1.4
+ Added: Words count in dictionaries table
- Fixed: Reading self created dictionaries

2012-11-17 v.1.3
+ Changed affix merging algorithm
+ Support for affix aliases
+ Added open output folder option

2012-11-17 v.1.2
- Fixed loading affixes

2012-11-17 v.1.1
+ Improved dictionary merging
+ Decreased memory usage
+ Added work log panel
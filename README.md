Hello, Juhász Norbert vagyok és ez itt a Számológépem.

A feladat megvalósításához a java 11-es verzióját használom.
A calculator mappát a C meghajtóban helyezd el, mivel innen éri el az adatbázist, vagy adj hozzá új útvonalat az application.properties fájlban.

A project futtatása:

 	1. Nyisd meg a "calculator" projectet az intelliJ-ben
 	2. Jobb oldalt a maven fülnél keresd meg a "calculator-core" fület, ez alatt a 
 	   "Lyfecycle",  utána clean->compile->install.
 	3. Ezután keresd meg a "calculator desktop"-ot. Pluginoknál clean, compile, javafx:run 
 	   (ezzel elindult a Desktop verzió).
 	4. Add hozzá konfigurációnak a TomCatet (ha ez problema, akkor itt egy vidi 
 	   "https://www.youtube.com/watch?v=U2eqxOs2z4E").
 	5. Ha ez megvan, a nyílra kattintva a Tomcat mellett, indul is a webes rész.


Gomb magyarázat:

 	Tudományos számológép:
 		- M+: Az adatbázisba elmeniti a számolást.
 		- M-: Törli az adatbázisba mentett összes rekordot.
 		- M: Lekéri az eltárolt műveletekből a legutolsót.
 		- ANS: Minden egyenlőség gomb nyomás után, az 
 		  eredményt (a második sort) elmenti memóriába. Ezzel a gombbal a legutolsó eredmény kérhető le.

Webes rész:

	- Minden inputot ki kell töltened ahhoz, hogy eredményt
	  kapj a számolásra

Megjegyzés a követelményekhez:

	- Számomra nehéz feladat volt a zárójel kezelés, ezért úgy oldottam meg, hogy egyszerre csak egy műveletet tudok végezni. Ez kiegészitve az ANS gombbal, újra felhasználhatók a részeredmények, amiket a művelet elé vagy mögé is tudunk helyezni. Ezzel elérve azt, hogy a zárójeles számításokat egy az egyben meg tudjam csinálni.

Követelmények:

	
    - Valós és egész számok kezelése ✓
    - Alap aritmetikai műveletek biztosítása: +,-,*,% ✓
    - Zárójelezési lehetőség X

    További matematikai műveletek biztosítása
    - négyzetre emelés ✓
    - reciprok ✓
    - gyökvonás ✓
    - maradékos osztás ✓
    - sin, cos, tan ✓

    Tárolási műveletek műveletek
    - Művelet elmentése adatbázisba ✓
    - Korábbi művelet betöltése ✓
    - Adott eredmény elmentése memóriába ✓
    - Adott eredmény betöltése memóriából ✓

    - Számrendszerek közötti váltás (hex, dec, bin, oct) ✓

    Beépített konvertálók alkalmazása
    - Pénznem váltás (Fix EUR-HUF). Valuta tárolása
      adatbázisban ✓
    - Súly váltás (mg,g,dkg,kg,t) ✓
    - Hőmérséklet (F,C) ✓

    Rosszul megadott műveletek felismerése, mint például
    - rossz zárójelzés (nincs szükség rá) X
    - 5+*3 ✓

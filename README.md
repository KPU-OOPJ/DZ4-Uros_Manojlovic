**Kreirati aplikaciju koji će imati korisnički interfejs kao što je dato na slici i sledeću funkcionalnost:**

a)	Pritiskom na dugme Konvertuj obavlja se akcija konvertovanja temperature koja je upisana u odgovarajuće polje a izbor vrste konverzije zavisi od izabrane padajuće liste (“Konvertuj u C” ili “Konvertuj u F”).

b)	Akcije se obavljaju pomoću javne klase KonvertorTemperatura koja ima: 
-	Javnu metodu konvertujCuF koja prima kao ulazni parametar temperaturu izraženu u Celzijusima (realan broj npr. 27.9), pretvara je u temperaturu u Farenhajtima i vraća kao rezultat. Konverzija se vrši po formuli T(F) = (T(C)*9)/5 + 32. 
-	Javnu metodu konvertujFuC koja prima kao ulazni parametar temperaturu izraženu u Farenhajtima (realan broj npr. 100.4), pretvara je u temperaturu u Celzijusima i vraća kao rezultat. Konverzija se vrši po formuli T(C) = (T(F)-32)*(5/9). 

![6](https://scontent.fbeg6-1.fna.fbcdn.net/v/t1.15752-9/94121225_2248888648753099_3916658553569411072_n.png?_nc_cat=107&_nc_sid=b96e70&_nc_eui2=AeHD-KGeTqDb4TGGBm6gPL1atBnsJnnXL5K0GewmedcvkjndKVZjHrZV2SZn0k5WdbE&_nc_ohc=tD_S6WhwqAAAX_HJ_L5&_nc_ht=scontent.fbeg6-1.fna&oh=6d13adf5023a935f23c94d73e156818a&oe=5EC656F2)

package com.github.salihbasic.ematuraconverter;

import java.util.ArrayList;
import java.util.List;

public final class EMaturaData {

    private final List<Pitanje> bosanski;
    private final List<Pitanje> engleski;
    private final List<Pitanje> njemacki;
    private final List<Pitanje> latinski;

    private final List<Pitanje> matematika;
    private final List<Pitanje> fizika;
    private final List<Pitanje> hemija;
    private final List<Pitanje> biologija;
    private final List<Pitanje> geografija;
    private final List<Pitanje> informatika;

    private final List<Pitanje> historija;
    private final List<Pitanje> filozofija;
    private final List<Pitanje> logika;
    private final List<Pitanje> psihologija;
    private final List<Pitanje> sociologija;
    private final List<Pitanje> demokratija;

    private final List<Pitanje> muzicko;
    private final List<Pitanje> likovno;
    private final List<Pitanje> tjelesni;

    private final List<LinijskiOdgovor> historijaDopuniti;
    private final List<Pitanje> historijaIzborna;
    private final List<TrueFalseQuestion> historijaTacnoNetacno;

    private final List<Pitanje> hemijaIzborna;
    private final List<LinijskiOdgovor> hemijaDopuniti;

    private final List<LinijskiOdgovor> geografijaDopuniti;
    private final List<Pitanje> geografijaIzborna;
    private final List<TrueFalseQuestion> geografijaTacnoNetacno;

    private final List<Pitanje> biologijaIzborna;
    private final List<LinijskiOdgovor> biologijaDopuniti;

    private final List<Pitanje> fizikaIzborna;

    private final List<Pitanje> filozofijaIzborna;

    public EMaturaData() {
        this.bosanski = this.getBosnian();
        this.engleski = this.getEnglish();
        this.njemacki = this.getGerman();
        this.latinski = this.getLatin();

        this.matematika = this.getMath();
        this.fizika = this.getPhysics();
        this.hemija = this.getChemistry();
        this.biologija = this.getBiology();
        this.geografija = this.getGeo();
        this.informatika = this.getInf();

        this.historija = this.getHistory();
        this.filozofija = this.getPhilosophy();
        this.logika = this.getLogic();
        this.psihologija = this.getPsychology();
        this.sociologija = this.getSociology();
        this.demokratija = this.getDemocracy();

        this.muzicko = this.getMusic();
        this.likovno = this.getArt();
        this.tjelesni = this.getTizo();

        this.historijaDopuniti = this.getHisLine();
        this.historijaIzborna = this.gethisIZB();
        this.historijaTacnoNetacno = this.getHisTF();

        this.hemijaIzborna = this.getHemIZ();
        this.hemijaDopuniti = this.getHemDQ();

        this.geografijaDopuniti = this.getGeoDQ();
        this.geografijaIzborna = this.getGeoIZB();
        this.geografijaTacnoNetacno = this.getGeoTF();

        this.biologijaIzborna = this.getBioIZB();
        this.biologijaDopuniti = this.getBioDQ();

        this.fizikaIzborna = this.getFizIZB();

        this.filozofijaIzborna = this.getFilIZB();
    }

    private ArrayList<Pitanje> getBosnian() {
        ArrayList<Pitanje> Bosnian = new ArrayList<>();
        Bosnian.add(new Pitanje("Koja glasovna promjena je izvršena u riječima slici, ruci, nozi:", "II palatalizacija", "jotovanje", "jednačenje suglasnika po zvučnosti ", "I palatalizacija ", ""));
        Bosnian.add(new Pitanje("Pravilno je napisan naziv institucije:", "Filozofski fakultet Univerziteta u Tuzli", "Filozofski fakultet univerziteta u Tuzli", "filozofski fakultet Univerziteta u Tuzli", "filozofski fakultet univerziteta u Tuzli", "Velikim početnim slovom piše se prvi član naziva ustanova\nFilozofski fakultet je ustanova, Univerzitet u Tuzli je ustanova"));
        Bosnian.add(new Pitanje("Pravilno je napisano:", "Mostarac, Sarajlija, Tuzlak", "mostarac, sarajlija, tuzlak", "Mostarac, sarajlija, Tuzlak", "mostarac, Sarajlija, tuzlak", "Velikim početnim slovom se pišu nazivi stanovnika(etnici) izvedeni od imena kontinenata, država, pokrajina, otoka, poluotoka, gradova, itd"));
        Bosnian.add(new Pitanje("Prema načinu tvorbe, u sonante se ubrajaju:", "j, v, r, l, lj, m, n, nj", "b, p, d, t, g, k", "f, h, s, z, ž, š", "ć, č, c, dž, đ", ""));
        Bosnian.add(new Pitanje("Prijedlozi su:", "u, na, po, kroz, niz", "lijepo, brzo, sporo", "a, e, i, o, u", "i, pa, te, niti, ni", "A,e,i,o,u – samoglasnici\nlijepo, brzo, sporo – prilozi\ni,pa,te,ni,niti-veznici"));
        Bosnian.add(new Pitanje("Kojem književnom rodu pripadaju djela koja su pisali pisci Homer (Ilijada, Odiseja) i Vergilije (Eneida)?", "epskom ", "lirskom", "lirsko-epskom", "dramskom", "Ilijada, Odiseja i Eneida su antički epovi"));
        Bosnian.add(new Pitanje("Ep o Nibelunzima je:", "njemački ep", "francuski ep", "asirsko-babilonski ep", "starogrčki ep", "Ep o Nibelunzima je germanski ep na srednjogornjonjemačkom jeziku. Govori o boravku junaka Sigfrida Zmajoubojice na burgundskom dvoru, usmrćenju Sigfrida te o tome kako se njegova supruga Kriemhilda osvetila."));
        Bosnian.add(new Pitanje("Ekspresionizam svoju poetiku gradi, između ostalog, na otporu prema:", "impresionizmu", "nadrealizmu", "futurizmu", "realizmu", ""));
        Bosnian.add(new Pitanje("Roman Pop Ćira i pop Spira napisao je:", "Stevan Sremac", "Simo Matavulj", "Borisav Stanković", "Svetozar Marković", "Pop Ćira i pop Spira je roman Stevana Sremca i ujedno njegovo najpopularnije delo. Tematski je vezan za vojvođansku sredinu (piščev rodni kraj), jednu od tri sredine koje je Sremac prikazivao u svojim književnim delima."));
        Bosnian.add(new Pitanje("Moderna je skupni naziv za više različitih stilskih formacija od druge polovice 19. stoljeća:", "simbolizam, impresionizam, parnas", "naturalizam, racionalizam, romantizam", "realizam, ekspresionizam, nadrealizam", "futurizam, nadrealizam, ekspresionizam", ""));
        Bosnian.add(new Pitanje("Koji od navedenih južnoslavenskih pisaca ne pripada periodu romantizma:", "Antun Gustav Matoš", "Petar Preradović", "Jovan Jovanović Zmaj", "Laza Kostić", "Antun Gustav Matoš je predstavnik moderne"));
        Bosnian.add(new Pitanje("Kako glasi ime djevojke u koju je Verter bio zaljubljen?", "Lotta", "Lenora", "Laura", "Lidija", "Riječ je o romanu Jadi mladog Vertera"));
        Bosnian.add(new Pitanje("Molijer i Rasin pripadaju epohi:", "klasicizma", "renesanse", "romantizma", "baroka", "Molijer i Rasin su veliki francuski komediografi 17. stoljeća"));
        Bosnian.add(new Pitanje("Antigona je tragična junakinja koja je u sukobu sa:", "zemaljskim zakonima", "patrijarhalnim običajima", "nebeskim zakonima", "rimskim zakonima", "Izdavanjem zapovijedi da Polinik, Antigonin brat, ostane nesahranjen, Kreont, novi vladar Tebe, slijedi atinski zakon koji ne dozvoljava pokop neprijatelja države"));
        Bosnian.add(new Pitanje("Sonet je vrsta lirske pjesme sastavljena od: ", "14 stihova raspoređenih u 4 strofe", "12 stihova raspoređenih u 3 strofe", "16 stihova raspoređenih u 4 strofe", "18 stihova raspoređenih u 5 strofa", "Sonet se sastoji iz dva katrena(4 stiha) i dvije tercine(3 stiha), ukupno 14"));
        Bosnian.add(new Pitanje("Osnovni red riječi u bosanskom jeziku je: ", "subjekat – predikat – objekat", "objekat – subjekat – predikat", "subjekat – objekat – predikat", "atribut-predikat-subjekat", "Red riječi u bosanskom jeziku je slobodan, ali osnovni red je SPO"));
        Bosnian.add(new Pitanje("Veznici suprotnih rečenica su: ", "a, ali, nego, već, dok", "samo, jedino, tek, tek što, jedino što", "i, pa, te, ni niti", "u, na, o, po", ""));
        Bosnian.add(new Pitanje("Koje su se glasovne promjene dogodile u sljedećim primjerima: vuci, znaci, orasi?", "II palatalizacija", "I palatalizacija", "III palatalizacija", "jotovanje", "Druga palatalizacija: k,g,h prelazi u c,z,s\norah->orahi->orasi"));
        Bosnian.add(new Pitanje("Veznik \"ili\" je:", "rastavni", "zaključni", "sastavni", "suprotni", "Rastavni veznici su: ili, ili – ili, bilo – bilo"));
        Bosnian.add(new Pitanje("Obilježi pravilno napisan superlativ:", "najjužniji", "naj južniji", "najužniji", "najjjužniji", "Kod pridjeva i priloga koji počinju slovom j, u superlativu dolazi do dupliranja ovog glasa\njak->najjači južni->najjužniji"));
        Bosnian.add(new Pitanje("Šta predstavlja prolog u djelu M. Držića \"Dundo Maroje\" u razvoju dramske radnje?", "ekspoziciju", "propoziciju", "egzibiciju", "peripetiju", "Na početku, u obliku ekspozicije u djelo, Držić je napisao dva prologa, jedan autorski te jedan negromantov (čarobnjakov). Kao i u mnogim ranijim komedijama, tako i u ovoj prolog je iznimno važan za razumijevanje djela. Prvi prolog je prolog negromanta u kojem Držić govori da će ova komedija pokazati ko su \"ljudi nahvao\", a ko su \"ljudi nazbilj\"."));
        Bosnian.add(new Pitanje("Autor drama: „Kralj Edip“, „Antigona“ „Ajant“ je:", "Sofokle", "Eshil", "Aristofan", "Anakreont", "Riječ je o antičkim tragedijama"));
        Bosnian.add(new Pitanje("Intertekst je:", "tekst  jednog autora prisutan u  tekstu drugog autora", "okvirna priča", "niz tekstova", "kontekst", ""));
        Bosnian.add(new Pitanje("Koja je stilska figura upotrijebljena u sljedećim stihovima:\n" +
                " „Treba da živiš međ ljudima a riječi nemaš\n" +
                " treba da živiš međ vucima a zuba nemaš“\n", "anafora", "epifora", "metonimija", "onomatopeja", "Anafora je stilska figura ponavljanja niza riječi na početku više uzastopnih stihova\nU ovom slučaju: Treba da živiš međ"));
        Bosnian.add(new Pitanje("Autor pjesme „Pjesnici“ iz koje je stih: \"Pjesnici su čuđenje u svijetu\"  je:", "Antun Branko Šimić", "Musa Ćazim Ćatić", "Antun Gustav Matoš", "Meša Selimović", "Pjesma je dio Šimićeve zbirke Preobraženja"));
        Bosnian.add(new Pitanje("Tragedija „Hamlet“ V. Šekspira pripada:", "renesansi", "klasicizmu", "baroku", "racionalizmu", "Šekspir je najveći dramatičar renesanse"));
        Bosnian.add(new Pitanje("Potur-Šehidija, rječnik u stihovima iz 1631. godine nastao je u okolini Tuzle. Sadrži oko 700 riječi bosanskog jezika. Svoj jezik autor dosljedno naziva bosanskim. Rječnik je sačinio: ", "Muhamed Hevaji Uskufi", "Mula Mustafa Bašeskija", "Derviš-paša Bajezidagić", "Muhamed Nerkesija", ""));
        Bosnian.add(new Pitanje("Šta povezuje djela \"Nečista krv\" B. Stankovića i M. Krleže \" Gospoda Glembajevi\"?", "vjerski ambijent", "mjesto radnje", "nacionalni ambijent", "ideja panslavizma", ""));
        Bosnian.add(new Pitanje("\"Svjestan sam da moram učiniti sve da istina iziđe na vidjelo... Osuđen sam istinom.\" Ovo su riječi iz monologa:", "Ahmeda Nurudina", "Hamleta", "Leona Glembaja", "Sluge Muzafera", "Monolog iz romana Derviš i smrt"));
        Bosnian.add(new Pitanje("U \"Kanconijeru\" ljubav je izražena prema: ", "Lauri", "Juliji", "Penelopi", "Merimi", "Kanconijer je zbirka pjesama Franćeska Petrarke"));
        Bosnian.add(new Pitanje("Zaokruži tačnu tvrdnju:", "Alber Kami je poginuo u automobilskoj nesreći.", "Alber Kami je umro od pretjerane konzumacije alkohola.", "Alber Kami je poginuo u avionskoj nesreći.", "Alber Kami je umro od starosti.", "Alber Kami je poginuo u saobraćajnoj nesreći 1960. nadomak Pariza"));
        Bosnian.add(new Pitanje("Zaokruži tačnu tvrdnju: ", "Meša Selimović je rođen u Tuzli, a umro u Beogradu.", "Meša Selimović je rođen u Tuzli, a umro u Sarajevu.", "Meša Selimović je rođen i umro u Tuzli.", "Meša Selimović je rođen u Tuzli, a umro u Mostaru.", ""));
        Bosnian.add(new Pitanje("Zaokruži tačnu tvrdnju:", "Mak Dizdar je rođen u Stocu a umro u Sarajevu.", "Mak Dizdar je rođen i umro u Stocu.", "Mak Dizdar je rođen u Konjicu a umro u Sarajevu.", "Mak Dizdar je rođen i umro u Sarajevu.", ""));
        Bosnian.add(new Pitanje("Zaokruži tačnu tvrdnju:", "Pjesmu \"Sumatra\" napisao je Miloš Crnjanski.", "Pjesmu \"Sumatra\" napisao je Tin Ujević.", "Pjesmu \"Sumatra\" napisao je Antun Branko Šimić.", "Pjesmu \"Sumatra\" napisao je\" Aleksa Šantić.", ""));
        Bosnian.add(new Pitanje("Koju zbirku pjesama nije napisao Mak Dizdar:", "Lelek sebra", "Kameni spavač", "Okrutnost kruga", "Koljena za madonu", "Lelek Sebra je djelo Tina Ujevića"));
        Bosnian.add(new Pitanje("Junakinja romana Nečista krv zove se:", "Sofka", "Refka", "Štefka", "Koštana", "Riječ je o djelu Bore Stankovića"));
        Bosnian.add(new Pitanje("Djelo Danila Kiša Čas anatomije je:", "polemički pamflet", "roman", "pripovijetka", "drama", "Čas anatomije je veliki polemički spis u kome ovaj pisac govori o književnosti, svojim delima, ali i o politici i društvu."));
        Bosnian.add(new Pitanje("Junak romana Stranac, na pitanje zbog čega je ubio, odgovara:", "zbog sunca", "zbog snijega", "zbog kiše", "zbog magle", "Junak romana Stranac, Merso, je ubio jer mu je smetao odsjaj koji se odbijao od nož"));
        Bosnian.add(new Pitanje("Zaokruži slovo pod kojim se nalazi dio koji ne pripada  zbirci pjesama Maka Dizdara Kameni spavač:", "Slovo o vodi", "Slovo o čovjeku", "Slovo o nebu", "Slovo o slovu", "Slovo o vodi ne postoji"));
        Bosnian.add(new Pitanje("Junaci Krležinih djela Gospoda Glembajevi i Povratak Filipa Latinovicza su:", "Filip i Leon", "Lion i Filip", "Leon i Sizif", "Sizif i Filip", ""));
        Bosnian.add(new Pitanje("Zaokruži pravilno napisane oblike!", "Sjedinjene Američke Države, Obala Slonove Kosti", "sjedinjene Američke države, Obala slonove kosti", "Sjedinjene američke države, Obala Slonove kosti", "Sjedinjene Američke države, obala Slonove Kosti", "Velikim početnim slovom se pišu svi članovi naziva država, izuzev prijedloga i veznika\n" +
                "npr Bosna i Hercegovina"));
        Bosnian.add(new Pitanje("Bosanski/hrvatski/srpski jezik spadaju u grupu:", "slavenskih jezika", "ruskih jezika", "germanskih jezika", "zasebnih jezika", "Bosanski, hrvatski i srpski spadaju u južnoslavenske jezike"));
        Bosnian.add(new Pitanje("U našem jeziku postoji:", "30 glasova", "40 glasova", "26 glasova", "29 glasova", "A,B,C,Č,Ć,D,DŽ,Đ,E,F,G,H,I,J,K,L,LJ,M,N,NJ,O,P,R,S,Š,T,U,V,Z,Ž"));
        Bosnian.add(new Pitanje("U vokativu jednine imenice VOJNIK (VOJNIČE) izvrešna je slijedeća glasovna promjena:", "I palatalizacija", "II palatalizacija", "III palatalizacija", "ačenje suglasnika po zvučnosti", "Prva palatalizacija: k,g,h prelazi u č,ž,š \nvojnik->vojnike->vojniče"));
        Bosnian.add(new Pitanje("U komparativu pridjeva MLAD (MLAĐI) izvršena je slijedeća glasovna promjena:", "Jotovanje", "Nepostojano A", "Jednačenje suglasnika po načinu tvorbe", "Gubljenje suglasnika", "Jotovanje: mlad+ji->mladji->mlađi"));
        Bosnian.add(new Pitanje("U našem jeziku sonanata ima:", "osam", "deset", "dvanaest", "sedam", "Sonanti su j,v,r,l,lj,m,n,nj"));
        Bosnian.add(new Pitanje("Pravilno je napisano:", "kuća, kreč, noć", "kuča, kreč, noč", "kuća, kreć, noć", "kuća, kreć, noč", ""));
        Bosnian.add(new Pitanje("U našem jeziku postoji", "7 padeža", "6 padeža", "8 padeža", "5 padeža", "Nominativ, genitiv, dativ, akuzativ, vokativ, instrumental, lokativ"));
        Bosnian.add(new Pitanje("Priloškim odredbama se obilježava", "mjesto, vrijeme, način, uzrok i namjera", "vršilac radnje", "predmet radnje", "sama radnja", ""));
        Bosnian.add(new Pitanje("Sevdalinka je", "tip usmene lirske pjesme", "tip usmene epske pjesme", "tip usmene epsko-lirske pjesme", "tip usmene lirsko-epske pjesme", ""));
        Bosnian.add(new Pitanje("Drugi naziv za figure dikcije je", "glasovne figure", "figure riječi", "figure konstrukcije", "figure misli", ""));
        Bosnian.add(new Pitanje("Najveće djelo asirsko-babilonske književnosti je", "Ep o Gilgamešu", "Ilijada", "Odiseja", "Šahnama", ""));
        Bosnian.add(new Pitanje("Samo jedan pisac pripada renesansi", "Viljem Šekspir", "Valter Skot", "Žan Žak Ruso", "Molijer", "Valter Skot je predstavnik realizma, Ruso prosvetiteljstva, a Molijer klasicizma"));
        Bosnian.add(new Pitanje("Koji od ovih pisaca je predstavnik hrvatske renesanse", "Marin Držić", "Ivan Gundulić", "August Šenoa", "Ante Kovačić", "Marin Držić, najveće ime hrvatske renesanse"));
        Bosnian.add(new Pitanje("Ono što je pisano na bosanskom jeziku arapskim pismom naziva se", "alhamijado književnost", "epsitolarna književnost", "književnost na orijentalnim jezicima", "srednjovjekovna književnost", ""));
        Bosnian.add(new Pitanje("Koji je hronološki slijed književnih epoha i pravaca ispravan?", "antika, srednji vijek, renesansa, klasicizam, romantizam", "antika, srednji vijek, renesansa, romantizam, klasicizam", "antika, srednji vijek, klasicizam, renesansa, romantizam", "antika, renesansa, srednji vijek, klasicizam, romantizam", "Antika (od 6.st pne do 5. st nove) \n" +
                "Srednji vijek (od 6. do 13 st.)\n" +
                "Renesansa (13. do 16. st)\n" +
                "Klasicizam(druga polovina 17.st i prva polovina 18.st)\n" +
                "Romantizam(kraj 18. st do polovine 19.st)"));
        Bosnian.add(new Pitanje("Andrić je naročito volio da razgovara sa jednim slikarom", "sa Gojom", "sa Gogenom", "sa Pikasom", "sa Rembrantom", ""));
        Bosnian.add(new Pitanje("Ko Kosari «na putevima Gospodnjim» poručuje da je voli", "Gorčin", "Semorad", "Gurbač", "Mak", "Pjesma Maka Dizdara, Gorčin"));
        Bosnian.add(new Pitanje("Imenice, glagoli, pridjevi, brojevi, zamjenice i prilozi ubrajaju se u", "punoznačne riječi", "sintakseme", "nepunoznačne riječi", "morfeme", ""));
        Bosnian.add(new Pitanje("Prvo slavensko pismo je", "glagoljica", "ćirilica", "bosančica", "latinica", "Glagoljica je staroslavensko pismo nastalo sredinom 9. vijeka. Autorima ovog pisma smatraju se braća Ćiril i Metodije"));
        Bosnian.add(new Pitanje("Dio gramatike koji se bavi oblicima i tvorbom riječi naziva se", "morfologija", "fonetika", "sintaksa", "leksikologija", ""));
        Bosnian.add(new Pitanje("Glagolski vid izražava", "(ne)ograničenost glagolske radnje", "način glagolske radnje", "preciznost glagolske radnje", "validnost glagolske radnje", "Glagolski vid može biti svršeni i nesvršeni"));
        Bosnian.add(new Pitanje("Ispravno je napisano", "ćevabdžinica", "ćevapdžinica", "ćevapđinica", "ćevapčinica", "U riječi ćevabdžinica dolazi do jednačenja suglasnika po zvučnosti; p postaje b"));
        Bosnian.add(new Pitanje("Antigona zastupa", "božansku pravdu", "volju brata", "kralja", "društvene zakone", ""));
        Bosnian.add(new Pitanje("Najveći pjesnik srednjega vijeka bio je", "Frančesko Petrarka", "Dante Aligijeri", "Viljem Šekspir", "Đovani Bokačo", "Petrarka je poznat po zbirci Kanconijer"));
        Bosnian.add(new Pitanje("Iz koje pjesme su sljedeći stihovi: Pučina plava spava   prohladni pada mrak  vrh hridi crne trne  zadnji rumeni zrak", "Veče na školju", "Sumatra", "Zapis o zemlji", "Pjesma jednom brijegu", "Riječ je o pjesmi Alekse Šantića"));
        Bosnian.add(new Pitanje("Događaji opisani u noveli Miroslava Krleže Baraka 5 be vezani su za", "Prvi svjetski rat", "Drugi svjetski rat", "Balkanske ratove", "Zalivski rat", ""));
        Bosnian.add(new Pitanje("Koje djelo ne pripada Lavu Tolstoju", "Braća Karamazovi", "Rat i mir", "Ana Karenjina", "Hadži Murat", "Braća Karamazovi je djelo Fjodora Dostojevskog"));
        Bosnian.add(new Pitanje("U baladi Hasanaginica imotski kadija je Hasanaginičin", "prosac", "muž", "brat", "otac", ""));
        Bosnian.add(new Pitanje("Ivo Andrić je napisao sljedeća djela", "Na Drini ćuprija, Travnička hronika, Gospođica", "Na Drini ćuprija, Travnička hronika, Hasanaginica", "Na Drini ćuprija, Travnička hronika, Tvrđava", "Na Drini ćuprija, Travnička hronika, Pobune", "Hasanaginica je narodna balada, Tvrđava je djelo Meše Selimovića, Pobune je djelo Derviša Sušića"));
        Bosnian.add(new Pitanje("Roman U registraturi je napisao", "Ante Kovačić", "August Šenoa", "Ivica Kičmanović", "Kšaver Šandor Đalski", ""));
        Bosnian.add(new Pitanje("Pravilno je napisano:", "Narod vjeruje u jednog Boga i naziva Ga različitim imenima", "Narod vjeruje u jednog Boga i naziva ga različitim imenima", "Narod vjeruje u jednog boga i naziva ga različitim imenima", "Narod vjeruje u Jednog boga i naziva ga različitim imenima", "Velikim početnim slovom se piše Bog, pridjev Božiji, kao i svi zamjenički oblici koji se odnose na Boga (On, Njega, Ga, Mu,...)"));
        Bosnian.add(new Pitanje("Pravilno je napisano:", "Smješteni smo u hotelu «Tuzla»", "Smješteni smo u Hotelu «Tuzla»", "Smješteni smo u hotelu Tuzla", "Smješteni smo u Hotelu tuzla", ""));
        Bosnian.add(new Pitanje("U imenici BUREGDŽINICA izvršena je glasovna promjena", "jednačenje suglasnika po zvučnosti", "palatalizacija", "jotovanje", "jednačenje suglasnika po mjestu tvorbe", "U riječi ćevabdžinica dolazi do jednačenja suglasnika po zvučnosti; p postaje b"));
        Bosnian.add(new Pitanje("Silazni akcenti nalaze se isključivo na:", "jednosložnoj riječi", "prvom slogu", "posljednjem slogu", "srednjem slogu", ""));
        Bosnian.add(new Pitanje("Infinitiv je", "osnovni bezlični glagolski oblik", "osnovni lični glagolski oblik", "izvedeni bezlični glagolski oblik", "izvedeni lični glagolski oblik", ""));
        Bosnian.add(new Pitanje("U pravilu, pridjevi se slažu s imenicom uz koju dolaze i to se naziva", "kongruencija", "konjugacija", "konkurencija", "deklinacija", ""));
        Bosnian.add(new Pitanje("Kako se zove Antigonin brat?", "Polinik", "Kreont", "Laj", "Edip", "Riječ je o istoimenoj drami, Antigona"));
        Bosnian.add(new Pitanje("Događaji opisani u noveli Hasana Kikića K. und K. goveda vezani su za", "Prvi svjetski rat", "Otadžbinski rat", "Balkanske ratove", "Drugi svjetski rat", "K und K je skraćenica za kaiserlich und königlich , odnosi se na austro-ugarsku vojsku"));
        Bosnian.add(new Pitanje("Koje djelo pripada Lavu Tolstoju", "Braća Karamazovi", "Zločin i kazna", "Mrtve duše", "Hadži Murat", "Zločin i kazna te Braća Karamazovi su djela Fjodora Dostojevskog, a Mrtve duše Gogolja"));
        Bosnian.add(new Pitanje("Ivo Andrić nije napisao", "Nevakat", "Ex Ponto", "Asku i vuka", "Travničku hroniku", "Nevakat je napisao Derviš Sušić"));
        Bosnian.add(new Pitanje("Pravilno je napisano", "Nekada je na Balkanu vladala Austro-Ugarska", "Nekada je na Balkanu vladala austro-ugarska", "Nekada je na balkanu vladala Austro-ugarska", "Nekada je na Balkanu vladala austro-ugarska", "Balkan kao regija se piše velikim slovom, dok se svi članovi imena država pišu velikim slovom"));
        Bosnian.add(new Pitanje("Pravilno je napisano:", "Najmlađi se obraduju dolasku Djeda Mraza", "Najmlađi se obraduju dolasku djeda mraza", "Najmlađi se obraduju dolasku Djeda mraza", "Najmlađi se obraduju dolasku djeda Mraza", "Djeda Mraz se tretira kao ime i prezime; slično je i sa Snješkom Bijelićem"));
        Bosnian.add(new Pitanje("U instrumentalu jednine imenice KRV (krvlju) izvršena je glasovna promjena", "jotovanje", "prelazak o>e", "prelazak l>o", "nepostojano a", ""));
        Bosnian.add(new Pitanje("Jednosložne riječi uvijek imaju", "silazne akcente", "uzlazne akcente", "duge akcente", "kratke akcente", ""));
        Bosnian.add(new Pitanje("Epski žanrovi u stihu su", "epska pjesma i ep", "lirska pjesma i poema", "komedija i tragedija", "novela i pripovijetka", ""));
        Bosnian.add(new Pitanje("Aristofan i Plaut su bili", "najveći komediografi antičke književnosti", "najveći pjesnici antičke književnosti", "najveći pisci tragedija u antičkoj književnosti", "najveći prozni pisci antičke književnosti", "Aristofan je antički grčki komediograf, a Plaut rimski"));
        Bosnian.add(new Pitanje("Tri pisca pripadaju istome književnom pravcu, jedan ne. Ko je ovdje uljez?", "Miguel de Servantes", "Viktor Igo", "J. V. Gete", "A. S. Puškin", "Servantes pripada renesansi dok ostali pripadaju romantizmu"));
        Bosnian.add(new Pitanje("Kanconijer je napisao:", "Frančesko Petrarka", "Dante Aligijeri", "Đovani Bokačo", "Ludoviko Ariosto", "Kanconijer je zbirka soneta"));
        Bosnian.add(new Pitanje("U komediji Marina Držića Dundo Maroje", "Pera je bila vjerenica a Laura ljubavnica Marova", "i Pera i Laura su bile vjerenice Marove", "i Pera i Laura su bile ljubavnice Marove", "Pera je bila ljubavnica a Laura vjerenica Marova", ""));
        Bosnian.add(new Pitanje("Koji je hronološki slijed književnih epoha i pravaca ispravan?", "klasicizam, romantizam, realizam, simbolizam", "klasicizam, romantizam, simbolizam, realizam", "klasicizam, realizam, romantizam, simbolizam", "klasicizam, realizam, simbolizam, romantizam", "Klasicizam(druga polovina 17.st i prva polovina 18.st)\nRomantizam(kraj 18.st do polovine 19.st)\nRealizam(tridesete godine do sedamdesetih 19.st)\nSimbolizam(dio Moderne, koja traje od sredine 19.st do 1914.)"));
        Bosnian.add(new Pitanje("Ako .................... sretnete \n" +
                "Na putevima  Gospodnjim \n" +
                "Molju Skažite\n" +
                "Za vjernost Moju\n", "Kosara", "Laura", "Lota", "Dora", "Posljednji stihovi pjesme Gorčin (Mak Dizdar)"));
        Bosnian.add(new Pitanje("Latinica je", "fonetsko-fonolosko pismo", "fonolosko pismo", "morfonolosko pismo", "fonetsko pismo", ""));
        Bosnian.add(new Pitanje("Fonologija proučava", "glasovni sastav riječi", "glasove s njihove fiziološko-akusticne strane", "glasove kao razlikovne jedinice", "vrste, oblike i tvorbu riječi", "Fonologija je nauka koja proučava kako jezik iskorištava razlikovnu funkciju fonema radi komunikacije"));
        Bosnian.add(new Pitanje("Rod je gramatička kategorija", "koja se ogleda u slaganju imenica s pridjevskim riječima i, često, glagolima", "po kojoj se razlikuje jedinka onoga sto imenica označava", "Koja ovisi o suglasnicima na kraju osnove", "kojom se izražavaju različiti odnosi onoga što riječ znači prema ostalim riječima u sintagmi i rečenici", ""));
        Bosnian.add(new Pitanje("Imenice otac, krojač, žena, lisac, ovca, sestra imaju", "prirodni rod", "gramatički rod", "neprirodni rod", "opisni rod", "Prirodni rod imaju imenice koje označavaju bića i njihovu razliku u polu. Prirodni rod može biti samo muški ili ženski jer u prirodi ne postoje bića srednjeg pola. Međutim, imenice koje označavaju mlada lica, kod kojih još nisu jasno izražene karakteristike pola, su imenice srednjeg roda."));
        Bosnian.add(new Pitanje("Koliko veznika ima u sljedećoj rečenici: Srela sam drugaricu i njezinu sestru pa dogovorila s njima odlazak  u kino.", "dva", "nijedan", "jedan", "tri", " Veznici u ovoj rečenici su *i* i *pa*"));
        Bosnian.add(new Pitanje("Jedan od ponuđenih naslova nije tačan", "Vitomir Lukić: Hodnici svijetloga straha", "Mirko Kovač: Ruganje s dušom", "Anđelko Vuletić: Deveto čudo na istoku", "Vesna Parun: Ti koja imaš nevinije ruke", "Pravilan naslov je Hodnici svijetloga praha"));
        Bosnian.add(new Pitanje("Jedan autor nije “vlasnik“ svoga djela:", "Oskar Davičo: Krov", "Ranko Marinković: Ruke", "Mirko Kovač: Ruganje s dušom", "Vladan Desnica: Proljeća Ivana Galeba", ""));
        Bosnian.add(new Pitanje("Hamza Humo je 1919. godine objavio zbirku pjesama naglašene ekspresionističke stilizacije, koja nosi naslov:", "Nutarnji život", "Haremska lirika", "Hercegovački pejzaži", "Lelek sebra", ""));
        Bosnian.add(new Pitanje("Kojem književnom rodu pripadaju djela Teubei-nesuh, Gorčin, Emina?", "lirskom", "epskom", "dramskom", "lirsko-epskom", "Riječ je o pjesmama"));
        Bosnian.add(new Pitanje("Kako se zove bjegunac koji je potražio spas u tekiji u romanu Derviš i smrt?", "Ishak", "Hasan", "Mula Jusuf", "Harun", ""));
        Bosnian.add(new Pitanje("Onjegin, Pečorin i Oblomov su tipološki izdvojena skupina likova u ruskoj književnosti poznata kao:", "tip suvišnog čovjeka", "tip malog čovjeka", "tip velikog čovjeka", "tip dosadnog čovjeka", "Riječ je o glavnim junacima djela iz romantizma"));
        Bosnian.add(new Pitanje("U zbirci pjesama Kanconijer Frančeska Petrarke, netačno je", "nekoliko pjesama ispjevano je u formi poeme", "najveći broj pjesama ispjevan je u formi soneta", "nekoliko pjesama ispjevano je u formi madrigala", "nekoliko pjesama ispjevano je u formi kancone", ""));
        Bosnian.add(new Pitanje("U epskoj pjesmi Budalina Tale dolazi u Liku junak Tale", "odlazi u Kotare do kule Smiljanića da otme Smiljanića seju Anđeliju", "odlazi u Kotare do kule Smiljanića da se priključi slavlju", "odlazi u Kotare do kule Smiljanića da mu preda knjigu od Mustaj-bega Ličkog", "odlazi u Kotare do kule Smiljanića da ga izazove na mejdan", ""));
        Bosnian.add(new Pitanje("Jedan od navedenih pisaca je uljez", "Aristofan", "Eshil", "Euripid", "Sofokle", "Aristofan je pisao komedije, a ostala trojica tragedije"));
        Bosnian.add(new Pitanje("U jednoj ljubavnoj pjesmi Maka Dizdara pojavljuju se", "Gorčin i Kosara", "Stjepan i Katarina", "Medžnun i Lejla", "Gorčin i Teodora", "Riječ je o pjesmi Gorčin"));
        Bosnian.add(new Pitanje("Prozni epski žanrovi su", "novela i pripovijetka", "komedija i tragedija", "lirska pjesma i poema", "epska pjesma i ep", ""));
        Bosnian.add(new Pitanje("Jedan od navedenih pisaca ne pripada renesansi", "Žan Rasin", "Fransoa Rable", "Miguel de Servantes", "Viljem Šekspir", ""));
        Bosnian.add(new Pitanje("Kako se zove mladić kojega je Ahmed Nurudin još kao dječaka doveo u tekiju?", "Mula Jusuf", "Hafiz Muhamed", "Hasan", "Ishak", "Pitanje se odnosi na roman Derviš i Smrt"));
        Bosnian.add(new Pitanje("Holden, lik iz romana Lovac u žitu , kao uspomenu na mrtvog brata Elija čuva", "rukavicu za bejzbol", "prsten", "dnevnik", "sat", ""));
        Bosnian.add(new Pitanje("Koja se stilska figura nalazi u sljedećim stihovima Alekse Šantića:  Ko li mi te štedi, ko li mi te brani\nod gladnih ptica, muko moja tvrda?", "retoričko pitanje", "metafora", "alegorija", "paradoks", "Retoričko pitanje stilska je figura u kojoj se na postavljeno pitanje ne očekuje odgovor."));
        Bosnian.add(new Pitanje("Kojom je vrstom stiha napisana Ilijada?", "heksametrom", "dvostruko rimovanim dvanaestercem", "aleksandrincem", "epskim desetercem", "Heksametar je stih od šest metričkih jedinica. Najpoznatiji i najvažniji je daktilski heksametar"));
        Bosnian.add(new Pitanje("Najveći dramski pisac renesanse bio je", "Šekspir", "Kornej", "Molijer", "Rasin", ""));
        Bosnian.add(new Pitanje("Koja se rečenica ne odnosi na barok", "Književnost toga razdoblja obilježava težnja za raskošnosti i gomilanjem stilskih sredstava", "Književnost toga razdoblja njeguje religioznu poemu i melodramu, a dominiraju ljubavna i rodoljubiva tematika", "Književnici toga doba nisu željeli podražavati Prirodu, i teže ka neočekivanom, bizarnom (neobičnom i čudnom) i opskurnom", "Za književnost toga razdoblja tipične su teme društvena stvarnost i čovjekov psihički život", ""));
        Bosnian.add(new Pitanje("Zaokruži pravilno izvedenu komparaciju", "visok – viši – najviši", "visok – višlji – najvišlji", "visok – visočiji – najvisočiji", "visok – visokiji ‒ najvisokiji", "Pridjev visok gubi sufiks -ok i dodaje se nastavak -ji. Tom prilikom dolazi do glasovne promjene jotovanja (s + j = š) te potom komparativ pridjeva visok glasi viši."));
        Bosnian.add(new Pitanje("Skraćeni (enklitički) oblici prezenta pomoćnog glagola biti, oblika jesam, glase:", "sam, si, je, smo, ste, su", "jesam, jesi, jest, jesmo, jeste, jesu", "budem, budeš, bude, budemo, budete, budu", "ne postoje skraćeni oblici", ""));
        Bosnian.add(new Pitanje("U rečenici Zaista mi se svidio sestrin prsten, riječ sestrin je", "prisvojni pridjev", "opisni pridjev", "gradivni pridjev", "imenica", ""));
        Bosnian.add(new Pitanje("Rečenica \"Zamandalih vrata i krenuh od kuće\" ubraja se u", "sastavne rečenice", "suprotne rečenice", "rastavne rečenice", "mjesne rečenice", "Prisustvo veznika *i* nas upućuje da je riječ o sastavnoj rečenici"));
        Bosnian.add(new Pitanje("Kada je nastala Povelja Kulina bana?", "1189. godine", "1172. godine", "1192. godine", "1202. godine", "Povelja Kulina bana je nastala 29.08.1189."));
        Bosnian.add(new Pitanje("Zaokruži slovo ispred pravilno napisanog primjera", "Modračko jezero", "Modračko Jezero", "modračko Jezero", "modračko jezero", "Kod geografskih imena velikim početnim slovom se piše samo prvi član, osim ako se ostali članovi sami po sebi ne pišu velikim slovom. Ovo se odnosi na jezera"));
        Bosnian.add(new Pitanje("Interpunkcijski znak „tačka-zarez“ ; koristi se kada se", "označava rečenična pauza duža od zareza a kraća od tačke", "završava rečenica s nepreciznom informacijom", "ističe nedovršenost rečenice", "naglašava izostavljenost dijela rečenice", "Tačka zarez se obično stavlja između jedinica koje bi tačka razdvojila preoštro, a zarez nedovoljno uočljivo"));
        Bosnian.add(new Pitanje("Zaokruži slovo ispred tačno napisanog glagolskog pridjeva radnog glagola željeti", "želio", "željeo", "želijo", "želeći", "Glagolski pridjev radni tvori se od infinitivne osnove i nastavaka: -o (nastao vokalizacijom od -l), -la, -lo; -li, -le, -la; -ao (ako osnova završava suglasnikom i u glagola s nastavkom -ći), -la, -lo; -li, -le, -la."));
        Bosnian.add(new Pitanje("U promjeni hljeb > hljepčić vrši se", "jednačenje suglasnika po zvučnosti", "druga palatalizacija", "jednačenje suglasnika po mjestu tvorbe", "asimilacija samoglasnika", "B prelazi u svoj bezvučni parnjak p ispred c, č, ć, f, h, k, s, š, t"));
        Bosnian.add(new Pitanje("Zaokruži slovo ispred pravilno napisanih skraćenica za: kilometar, Televiziju Tuzlanskog kantona i Bosnu i Hercegovinu", "km, TVTK, BiH", "KM, TV TK, BIH", "Km, TVTK, BiH", "KM, TVTK, BiH", "Veznik *i* se piše malim slovom u složenim skraćenicama, a ostala slova su velika"));
        Bosnian.add(new Pitanje("Izaberi pravilno napisane oblike jednina/množina/genitiv jednine", "rušilac  rušioci  rušioca", "rušioc  rušilci  rušioca", "rušioc  rušioci  rušioca", "rušilac  rušilci  rušioca", "Kod imenica koje završavaju na -lac dolazi do zamjene l/o i nepostojanog a"));
        Bosnian.add(new Pitanje("Pravilno je napisano", "Učenica sam Gimnazije „Meša Selimović“", "Učenica sam gimnazije Meša Selimović", "Učenica sam „gimnazije Meša Selimović", "Učenica sam „gimnazije 'Meša Selimović'“", "Ukoliko se želi naglasiti zvanični naziv pojmova koji imaju šire i uže ime, među navodnicima se piše iže ime:\nGimnazija „Meša Selimović“"));
        Bosnian.add(new Pitanje("Dante je najpoznatiji kao autor čuvene Božanstvene komedije . Kojeg pisca dovodimo u vezu s Ljudskom komedijom", "Balzaka (Honore de Balzac)", "Borisava Stankovića", "Šekspira (W. Shakespeare)", "Edhema Mulabdića", "Ljudska komedija (franc. La Comédie humaine) zajednički je naziv za romane Onore de Balzaka, međusobno povezane, u kojima nastoji da pruži sliku o svom vremenu"));
        Bosnian.add(new Pitanje("Gilgameš, junak Epa o Gilgamešu , traga za besmrtnošću i vječnim životom. U tome, nažalost, ne uspijeva. Kako se završava njegov život?", "Smrt ga je ugrabila dok je spavao", "Pojeo je otrovnu travu", "Usmrtila ga je sveštenica", "Umire od gladi", ""));
        Bosnian.add(new Pitanje("Saputnik Don Kihota iz Servantesovog romana Don Kihot jaše svog magarca i hrabro prati svoga gospodara u borbi protiv nepravde. Ovaj simpatični debeljko zove se:", "Sančo Pansa", "Viktor", "raul", "Pančo Vilja", ""));
        Bosnian.add(new Pitanje("Šta je uzrok dramskoga sukoba između Antigone i Kreonta u Sofokleovoj tragediji Antigona ?", "sestrinska ljubav prema braći", "Antigonino ovladavanje magijom", "Antigonina ljubav prema mužu", "Kreontova strast prema Antigoni", ""));
        Bosnian.add(new Pitanje("Roman Zeleno busenje Edhema Mulabdića obrađuje temu", "austro-ugarske okupacije Bosne i  Hercegovine", "osmanske okupacije Bosne i Hercegovine", "pada srednjovjekovnog bosanskog kraljevstva", "moderne historije Bosne i Hercegovine", ""));
        Bosnian.add(new Pitanje("Kojoj vrsti romana pripada Geteov roman Jadi mladog Vertera?", "epistolarnog romana", "pustolovnog romana", "naučno-fantastičnog romana", "romana u stihovima", "Epistolarni roman je roman koji je sastavljen od serije nekih dokumenata, najčešće pisama, pa se ta vrsta romana još naziva i romanom u pismima."));
        Bosnian.add(new Pitanje("Označeni dio rečenice: Meša Selimović,poznati bošnjački pisac, rođen je u Tuzli. – je", "apozicija", "objekat", "atribut", "priloška odredba za vrijeme", "Apozicija je rečenični dio, imenica koja pobliže označava drugu imenicu i s njom se slaže u rodu, broju i padežu."));
        Bosnian.add(new Pitanje("Označena zavisna rečenica: Nisam ti se javio iako sam to obećao. – je", "dopusna", "vremenska", "uzročna", "namjerna", "Veznici dopusnih rečenica su: iako, premda i makar"));
        Bosnian.add(new Pitanje("Imenice tipa vojvoda, hadžija, aga i sl. mjenjaju se", "po  e-vrsti imeničke promjene", " po  a-vrsti imeničke promjene", "po  i-vrsti imeničke promjene", "u perfektu", "Vrsta imeničke promjene se može odrediti po zadnjem slovu date imenice u genitivu jednine, u ovom slučaju aga->age"));
        Bosnian.add(new Pitanje("Zaokruži pravilno napisanu riječ", "nečovjek", "neznam", "naj jasnije", "ne mam", "Negacija se uvijek piše odvojeno od glagola (ne znam), sa izuzetkom glagola kojima je negacija dio osnovice (nemam). Kod imenica se negacija uvijek piše sastavljeno (nečovjek). Superlativi se uvijek pišu sastavljeno (najjasnije)"));
        Bosnian.add(new Pitanje("Koju dramu nije napisao Viljem Šekspir", "Tartif", "Hamlet", "Kralj Lir", "Romeo i Julija", "Tartif (Tartuffe) je napisao Molier"));
        Bosnian.add(new Pitanje("Iz kojeg je romana navedeni odlomak:\nOdlučeno je, Lota, ja hoću da umrem i pišem ti ovo bez romantične pretjeranosti, spokojno, u jutro dana kada ću te posljednji put vidjeti", "J.V. Gete «Jadi mladog Vertera»", "Viktor Igo «Jadnici»", "Gistav Flober «Gospođa Bovari»", "A.S. Puškin «Evgenije Onjegin»", ""));
        Bosnian.add(new Pitanje("Tip suvišnog čovjeka je", "junak romana romantizma", "junak renesansnog romana", "junak baroknog romana", "junak romana realizma", "Poznati „suvišni ljudi“: Jevgenij Onjegin, Verter"));
        Bosnian.add(new Pitanje("Ferkonja je lik u romanu", "U registraturi", "Nečista krv", "Grozdanin kikot", "Ponornica", "Ferkonja je sporedni lik u romanu Ante Kovačića, U registraturi"));
        Bosnian.add(new Pitanje("Ko je sličan albatrosu u Bodlerovoj pjesmi «Albatros»", "pjesnik", "kapetan broda u buri", "brodski mornar", "malograđanin", ""));
        Bosnian.add(new Pitanje("Pjesma Tina Ujevića «Svakidašnja jadikovka» pripada zbirci", "Lelek sebra", "Kolajna", "Žedan kamen na studencu", "Auto na korzu", ""));
        Bosnian.add(new Pitanje(" Koji od navedenih likova nije iz romana Meše Selimovića", "Tahir Talha", "Ahmed Nurudin", "Ahmet Šabo", "Mula Ibrahim", "Ahmed Nurudin je lik iz romana Derviš i smrt, dok su Ahmet Šabo i Mula Ibrahim likovi iz romana Tvrđava"));
        return Bosnian;
    }

    private ArrayList<Pitanje> getEnglish() {
        ArrayList<Pitanje> English = new ArrayList<>();
        English.add(new Pitanje("A burglar .......when I was away on vacation and stole of my electronic goods.", "broke in", "broke off", "broke open", "broke up", "Break open znači naglo otvoriti; break off znači otkinuti (ili prekinuti razgovor broke off the conversation); break up znači prekinuti s nekim"));
        English.add(new Pitanje("I have never been .......more beautiful than Thailand.", "anywhere", "nowhere", "somewhere", "everywhere", "U engleskom jeziku nije dozvoljena dvostruka negacija; zbog toga nowhere ne može biti tačan odgovor"));
        English.add(new Pitanje("I've just .......that the price has gone up again.", "been told", "am told", "have told", "was told", "Po priloškoj odredbi “just” vidimo da treba upotrijebiti present perfect. Također, riječ je o pasivnoj rečenici. "));
        English.add(new Pitanje("If you were stopped by the police for speeding, what .......you do? ", "would", "do", "will", "shall", "Drugi kondicional: if + past simple, ...would + infinitive; koristi se kada govorimo o nerealnim scenarijima"));
        English.add(new Pitanje("How many bottles of water did you bring for the trip? — I just have ....... bottles.", "a few", "much", "any", "a little", "A few znači nekoliko/par. A little ne može biti tačan odgovor jer se koristi uz zbirne i nebrojive imenice"));
        English.add(new Pitanje("Will you come to dinner with us if we .......a babysitter for you?", "find", "had found", "will find", "would found", "Prvi kondicional: if + present simple, ... will + infinitive\nKoristi se za radnje koje bi se realno mogle desiti u budućnosti"));
        English.add(new Pitanje("If you want to .......that book remember to bring it back.", "borrow", "lend", "loan", "owe", "Borrow i lend su riječi koje se na bosanski jezik oboje prevode kao „posuditi“, ali je njihovo značenje različito. Borrow znači posuditi od nekog nešto, dok lend znači posuditi nekome nešto. Loan ima slično značenje kao lend"));
        English.add(new Pitanje("I honestly couldn't follow a word you ........", "were saying", "are saying", "will say", "did say", ""));
        English.add(new Pitanje("The chairman of the board has been employed in the finance industry .......1984.", "since", "in", "on", "at", "Zbog prisustva present perfecta (has been employed), akcenat je na trajanju radnje. Uz present perfect koristimo for i since, a pošto se govori o radnji koja traje od x-trenutka, uzimamo since."));
        English.add(new Pitanje("Rick's father and mother didn't .......with his grandparents and were always having disagreements.", "get along", "get about", "get off", "get at", "Get along je frazalni glagol za dobro slaganje"));
        English.add(new Pitanje("He was quite definite about it and assured me he .......come.", "would", "will", "shall", "should", ""));
        English.add(new Pitanje("I .......complete silence now while I try this experiment", "want", "am wanting", "did want", "have wanted", "Now nam govori da je radnja smještena u sadašnjosti"));
        English.add(new Pitanje("She told me .......carefully on the icy roads.", "to drive", "to be driven", "to have driven", "to be drive", ""));
        English.add(new Pitanje("The castle .......built in the 15th century.", "was", "is", "has been", "will be", "Riječ je o pasivnoj rečenici"));
        English.add(new Pitanje("Sharon ______________ to travel. She goes abroad almost every summer.", "loves", "love", "loved", "has loved", ""));
        English.add(new Pitanje("You look really great! __________________ at the fitness centre?", "Have you been exercising", "Are you exercising", "Had you exercised", "Did you exercise", ""));
        English.add(new Pitanje("When Carol called last night, I ______________ my favourite show on television.", "was watching", "has been watching", "had been watching", "is watching", "Kraća radnja (poziv) je prekinula dužu (gledanje emisije)"));
        English.add(new Pitanje("The man ______________wife I met at the conference phoned earlier to ask us to dinner.", "whose", "which", "whom", "who", ""));
        English.add(new Pitanje("The car _____________ yesterday.", "was repaired", "is repaired", "has repaired", "had repaired", "Riječ je o pasivnoj rečenici („yesterday“ nas upućuje na past simple)"));
        English.add(new Pitanje("Could you just stand there quietly without ____________________ a sound?", "making", "creating", "doing", "causing", "Make a sound je frazalni glagol"));
        English.add(new Pitanje("I can’t afford this car. If I earned more, I _______________ it for you.", "would buy", "bought", "am buying", "buy", "Drugi kondicional: if + past simple, ...would + infinitive\nKoristi se kada govorimo o nerealnim scenarijima"));
        English.add(new Pitanje("I hate_____________by my parents what to do.", "being told", "told", "to tell", "telling", ""));
        English.add(new Pitanje("What sort of books are you interested __?", "in", "for", "at", "with", "Interested in je frazalni glagol"));
        English.add(new Pitanje("Sam, could you go to the bakery and buy a _________ of bread please?", "loaf", "piece", "slice", "bar", "Loaf of bread je izraz za jedan hljeb"));
        English.add(new Pitanje("The hurricane caused ______________damage to the city.", "extensive", "extended", "extending", "extend", ""));
        English.add(new Pitanje("We've lived in this flat ________ five years.", "for", "since", "already", "ago", ""));
        English.add(new Pitanje("Polly wants to cycle round the world. She's really keen _______ the idea.", "on", "at", "for", "about", "Keen on je frazalni glagol"));
        English.add(new Pitanje("I really enjoyed the disco. It was great, ________?", "wasn't it", "was it", "isn't it", "is it", ""));
        English.add(new Pitanje("Sara is a doctor, ________?", "isn't she", "is she", "was she", "doesn't she", ""));
        English.add(new Pitanje("He makes a lot of money, ________?", "doesn't he", "does he", "is he", "isn't he", ""));
        English.add(new Pitanje("They both work, ________?", "don't they", "do they", "are they", "won't they", ""));
        English.add(new Pitanje("What colour shall we have? I don't mind. Pick ________ colour you like.", "any", "that", "what", "some", "Pick any color (izaberi bilo koju boju)"));
        English.add(new Pitanje("Sam has two brothers, but he doesn't speak to ________ of them.", "either", "any", "both", "nobody", ""));
        English.add(new Pitanje("Would you mind waiting ________ minutes?", "a few", "a little", "much", "little", "A few i a little oboje znači nekoliko. Minutes je brojiva imenica u množini u engleskom, prema tome, uz minutes ćemo reći a few."));
        English.add(new Pitanje("Nancy isn't very well. Oh, I'm sorry to hear ________.", "that", "this", "it", "she", "I'm sorry to hear that je fraza, čest način izražavanja žala"));
        English.add(new Pitanje("I _________ missed the bus. I was only just in time to catch it.", "nearly", "mostly", "near", "nearest", ""));
        English.add(new Pitanje("Yes, I have got the report. ________ it.", "I'm just reading", "I just am reading", "I'm reading just", "I  just  reading", "Radnja se odvija u trenutku govora, dakle potreban je present continuous. Just u ovom slučaju ide prije glavnog glagola"));
        English.add(new Pitanje("We're really sorry. We regret what happened ________.", "very much", "very many", "a bit", "much", ""));
        English.add(new Pitanje("I've read this paragraph three times, and I ________ understand it.", "still can't", "can't still", "can't yet", "yet can't", ""));
        English.add(new Pitanje("Because of their expertise the two young engineers have been ____ the opportunity to join our staff", "offered", "offer", "offering", "offers", "Riječ je o pasivnom obliku present perfecta"));
        English.add(new Pitanje("One of the indicators of success in any business is how ____ types of communication channels they use", "many", "much", "lot", "lots", "Types je brojiva imenica, prema tome, uz types koristimo many"));
        English.add(new Pitanje("Carol ________ you with your homework. It’s important that you do it yourself", "shouldn’t help", "can’t help", "mustn’t help", "wouldn’t help", ""));
        English.add(new Pitanje("Anti-lock brakes (ABS) help you to maintain steering control of your car even while braking on ____ roads", "slippery", "lonesome", "fast", "reckless", "Reckless znači nesmotren, nemaran; Lonesome znači samotan; Fast znači brz. Kada prevedemo riječi, jasno je da samo slippery(klizav) ima smisla ubaciti."));
        English.add(new Pitanje("What's the name of the man  ________ gave us a lift?", "who", "what", "he", "which", ""));
        English.add(new Pitanje("When we_____at the airport we ____ that we_____our passports at the office", "arrived / noticed / had left", "arrived / had noticed / had left", "have arrived / noticed / left", "had arrived / have noticed / have left", "Radnja zaboravljanja pasoša u kancelariji je „najstarija“ (desila se prva od navedenih) i zato mora biti u past perfectu."));
        English.add(new Pitanje("If someone _______________ you a helicopter, what would you do with it?", "gave", "will give", "gives", "give", "Drugi kondicional: if + past simple, ...would + infinitive\nKoristi se kada govorimo o nerealnim scenarijima"));
        English.add(new Pitanje("On the third day of the shipwreck they gave up all hope of finding any ____", "survivors", "deserters", "conclusions", "suppliers", ""));
        English.add(new Pitanje("I didn’t see _________________.", "anybody anywhere", "nobody nowhere", "anybody nowhere", "nobody anywhere", "Engleski ne dozvoljava duplu (pa tako ni trostruku) negaciju u rečenici. Zbog toga ne možemo upotrijebiti ni nowhere ni nobody"));
        English.add(new Pitanje("If I had realized that the traffic lights were red, I ________________.", "would have stopped", "will stop", "would stop", "stop", "Treći kondicional: if + past perfect, ...would + have + past participle\nKoristi se za situacije koje se nisu desile, da se špekuliše o ishodu tih situacija"));
        English.add(new Pitanje("I was watching TV at home when suddenly ________ rang.", "the doorbell", "doorbell", "an doorbell", "a doorbell", ""));
        English.add(new Pitanje("If ________ my passport, I'll be in trouble", "I lose", "I'll lose", "I lost", "I would lose", "Prvi kondicional: if + present simple, ... will + infinitive\nKoristi se za radnje koje bi se realno mogle desiti u budućnosti"));
        English.add(new Pitanje("A company's success will largely depend _____ how far ahead into the future it can forecast", "on", "of", "at", "in", "Depends on je fraza koja znači ovisi o"));
        English.add(new Pitanje("Up to now, the equipment _____ regularly, but from now on, we ______ it before every outing", " hasn’t been checked / are going to check", "hasn’t checked / will be checking", "isn’t being checked / should be checked", "wasn’t checked / are checking", "Going to se koristi za buduće namjere koje su već odlučene."));
        English.add(new Pitanje("After 11 days in …… prison they were released", "/", "the", "a", "an", "Uz prison ne ide nikakav član. Isto važi i za jail"));
        English.add(new Pitanje("Don’t wait for us, help ……to some food", "yourself", "you", "them", "on your own", "Help yourself/yourselves znači poslužite se"));
        English.add(new Pitanje("The works of Picasso were quite ……during various periods of his artistic life", "different", "differ", "different from", "different than", ""));
        English.add(new Pitanje("He…… be in a meeting. I am not certain", "may", "ought", "needs", "shouldn't", "Druga rečenica (I am not certain) nam govori da je riječ o nagađanju"));
        English.add(new Pitanje("Oh, I’m sorry, I’ve spilt some tea.   Where ……the paper towels?", "do you keep", "are you keeping", "did you keep", "have you kept", ""));
        English.add(new Pitanje("Bob ……a lot of help since we arrived", "has given", "gave", "was giving", "had given", ""));
        English.add(new Pitanje("……a fierce competition between Tuzla University and the University of Sarajevo for the Big Ten Championships.", "There’s", "theirs", "Its", "It has", "There's ili u punom obliku there is"));
        English.add(new Pitanje("The weather ……to be changing", "appears", "was appeared", "is appeared", "their appeared", ""));
        English.add(new Pitanje("The train ……passengers", "is packed with", "packs with", "has packed by", "is packing with", "Is packed with znači prepun, krcat"));
        English.add(new Pitanje("Oh! Something is strange here! Someone ____ a bunch which was here", "has taken", "took", "is taking", "takes", ""));
        English.add(new Pitanje("We ___ practise so hard next month. The tests are over", "don't need to", "mustn't", "will have to", "hasn't to", ""));
        English.add(new Pitanje("He was listening to a radio while his cat ____ in his arms", "was sleeping", "is sleeping", "slept", "has slept", "Riječ je o dvije radnje u prošlosti koje se dešavaju istovremeno. Zbog toga, obje su u past continuousu."));
        English.add(new Pitanje("English and French ____ all over the world.", "are spoken", "is spoken", "have spoken", "has spoken", ""));
        English.add(new Pitanje("The Berlin wall ___ down in 1989.", "was knocked", "is knocked", "were knocked", "knocked", ""));
        English.add(new Pitanje("Plenty of evidence has come to light to prove that he has been involved ____ smuggling", "in", "at", "through", "by", "Involved in je fraza koja u ovom slučaju konkretno znači biti upetljan u nešto"));
        English.add(new Pitanje("The newspaper doesn't state why they have chosen to play the next national game in Bursa,__?", "does it", "haven't they", "don't they", "do they", ""));
        English.add(new Pitanje("You _______ your own canoe in order to join the canoe club. They cost a lot of money. You    _________ mine whenever you want to go canoeing", "needn’t buy / can borrow", "mustn’t buy / had borrowed", "won’t have bought / should borrow", "might not buy / would borrow", ""));
        English.add(new Pitanje("If Columbus__ money from Queen Isabella, he ______ across the Atlantic", "had not received / might not have sailed", "do not receive / could not sail", "did not receive / might not have sailed", "would not receive / might not sail", "Treći kondicional: if + past perfect, ...would + have + past participle. Koristi se za situacije koje se nisu desile, da se špekuliše o ishodu tih situacija"));
        English.add(new Pitanje("We all wondered how Jack's wife ___ when she ____ about his new job in Outer-Mongolia", "would react / heard", "reacts / has heard", "had reacted / would hear", "has been reacting / hears", ""));
        English.add(new Pitanje("Someone ________ the tickets are free", "told me", "said me", "said me that", "told to me", "Said i told se često miješaju jer imaju slično značenje i obje riječi se na naš jezik prevode kao rekao. Razlika je u tome što say predstavlja izraziti nešto svojim glasom, svojim riječima; dok tell znači nekome nešto reći (bilo usmeno ili pismeno)"));
        English.add(new Pitanje("The story I've just read _____________ Zejćir Hasić", "was written by", "was written", "was written from", "wrote", "Riječ je o pasivnoj rečenici. Kada je naveden vršioc radnje u pasivnoj rečenici, uz njega stoji riječ by"));
        English.add(new Pitanje("Agatha Christie didn't tell ....... why she disappeared in December 1926", "anyone", "no one", "nobody", "somebody", "Engleski jezik ne dozvoljava dvostruku negaciju, zbog čega ni no one ni nobody ne mogu biti tačan odgovor"));
        English.add(new Pitanje("Agatha Christie wrote her first detective story in 1920 and became very ........ ", "successful", "success", "successive", "successor", ""));
        English.add(new Pitanje("We've run ....... of sugar. Could you please buy some more?", "out", "away from", "down on", "on with", "To run out of something znači potrošiti nešto"));
        English.add(new Pitanje(". ....... of the names did you choose for the puppy?", "Which", "Who", "What", "Whom", ""));
        English.add(new Pitanje("After two rings of the bell she suddenly ....... in the doorway", "appeared", "seemed", "looked", "viewed", ""));
        English.add(new Pitanje("My father asked me if I_____ an increase in salary the following month", "was getting", "am getting", "am going to get", "will get", ""));
        English.add(new Pitanje("Adrian should have never ....... home. If he hadn't, he'd be in a better situation right now", "left", "leave", "leaved", "leaving", ""));
        English.add(new Pitanje("Perhaps she would have been ....... by that dog if its owner hadn't been faster and caught him right on time", "bitten", "bit", "bite", "bitted", ""));
        English.add(new Pitanje("I would have ....... pictures from my trip, if I had a camera", "taken", "had took", "took", "take", "Drugi kondicional: if + past simple, ...would + infinitive\nKoristi se kada govorimo o nerealnim scenarijima"));
        English.add(new Pitanje("I ....... some great books from the library this past weekend.", "borrowed", "lent", "had a loan of", "loaned", "Borrow i lend su riječi koje se na bosanski jezik oboje prevode kao „posuditi“, ali je njihovo značenje različito. Borrow znači posuditi od nekog nešto, dok lend znači posuditi nekome nešto. Loan ima slično značenje kao lend"));
        English.add(new Pitanje("Her mother ....... when she was just a little girl", "died", "is dead", "dead", "was dead", ""));
        English.add(new Pitanje("I ....... forgotten to set my alarm clock, so I was late for my train", "had", "was", "were", "did", "Radnja zaboravljanja alarma se desila u daljoj prošlosti, nego kašnjenje na voz. Zbog zoga zaboravljanje alarma izražavamo past perfectom"));
        English.add(new Pitanje("After looking for him all day, Jeremy finally found his dog ....... under a cave", "hidden", "hid", "hide", "hit", ""));
        English.add(new Pitanje("______ people are choosing to buy music online", "More and more", "The most", "many and many", "a lot", "More and more znači sve više"));
        English.add(new Pitanje("The flowers need _________ once a day", "to be watered", "being watered", "been watered", "watered", ""));
        English.add(new Pitanje("Brian said he ____________ ill the previous week", "had been", "would be", "will be", "has been", "Riječ je o neupravnom govoru. Aktivna rečenica bi glasila „Brian: I was sick last week“"));
        English.add(new Pitanje("I ___________ come to the cinema because I had so much homework to do.", "couldn't", "mustn't", "shouldn't", "may not", ""));
        English.add(new Pitanje("Sarah __________ her hair cut at the moment", "is having", "has", "had", "was having", "Radnja se dešava u trenutku govora, dakle treba nam present continuous"));
        English.add(new Pitanje("It would have been better if you ____________ the truth.", "had told", "told", "tell", "are telling", "Treći kondicional: if + past perfect, ...would + have + past participle\nKoristi se za situacije koje se nisu desile, da se špekuliše o ishodu tih situacija"));
        English.add(new Pitanje("Frank has taken ________ jogging to keep fit", "up", "over", "on", "in", "Take up je fraza koja znači početi se baviti nečim"));
        English.add(new Pitanje("They _____________ Paris twice this week", "have been to", "have gone in", "had gone to", "had been in", ""));
        English.add(new Pitanje("Peter, __________________ father is a politician, works for the times", "whose", "which", "who's", "who", ""));
        English.add(new Pitanje("_______ Panama Canal divides North and South America", "the", "a", "/", "an", "Ispred kanala, kao što su Suecki i Panamski, ide član the"));
        English.add(new Pitanje("I'm going to buy _________ tomatoes at the supermarket.", "a few", "a couple", "a little", "lots", " A few znači nekoliko/par. A little ne može biti tačan odgovor jer se koristi uz zbirne i nebrojive imenice. A couple i lots bi oboje bili validni odgovori da ispred tomatoes stoji „of“"));
        English.add(new Pitanje("When I got home, I saw that someone __________ one of my windows", "had broken", "was breaking", "broke", "has broken", "Radnja provaljivanja u kuću se desila u daljoj prošlosti nego dolazak kući, pa je zato potreban past perfect"));
        English.add(new Pitanje("If I had the chance to live abroad, I _________.", "would go", "would be gone", "would have gone", "ll go", "Drugi kondicional: if + past simple, ...would + infinitive\nKoristi se kada govorimo o nerealnim scenarijima"));
        English.add(new Pitanje("The police ________ about the bank robbery", "are asking", "is asking", "asks", "has asked", "Imenica police se tretira kao množina, i kao takva zahtjeva glagole u množini"));
        English.add(new Pitanje("She is the film star ___________ husband is a famous writer", "whose", "which", "that", "who’s", ""));
        English.add(new Pitanje("I’m going now ________ you want me to stay", "unless", "if", "as long as", "provided", ""));
        English.add(new Pitanje("The judge sent the murderer to ___________ for 40 years.", "prison", "the prison", "a prison", "an prison", "Uz prison ne ide nikakav član. Isto važi i za jail"));
        English.add(new Pitanje("Jack’s party was boring. I didn’t meet _________ I knew there.", "anyone", "someone", "no one", "somebody", "Engleski jezik ne dozvoljava dvostruku negaciju"));
        English.add(new Pitanje("Did you see a bird in the tree?’ Nick wonders ____________ a bird in the tree", "if I had seen", "whether I saw", "if I saw", "if I have seen", "Kad rečenica prelazi iz upravnog u neupravni govor, past simple prelazi u past perfect"));
        English.add(new Pitanje("In my experience ________ are always friendly.", "the Chinese", "Chinese", "a Chinese", "this Chinese", "Kada govorimo uopšteno o nekom narodu, ispred naroda ide član the"));
        English.add(new Pitanje("I can't wait for my next holiday. I am really __________.", "excited", "excitement", "excite", "exciting", ""));
        English.add(new Pitanje("Nobody believed Paul at first but he ____________ to be right", "turned out", "came out", "worked out", "carried out", "Turned out znači ispostavilo se"));
        English.add(new Pitanje("I can't get a car because I am not ________ to drive", "old enough", "quite old", "so old", "enough old", ""));
        English.add(new Pitanje("You'll _________ tell the police that your house was broken into", "have to", "had to", "must", "should", ""));
        English.add(new Pitanje("The accident happened last night. It __________ that the accident was caused by engine problems.", "is said", "say", "saying", "would say", ""));
        English.add(new Pitanje("Michelle is quite ___________ in London and misses her friends in Manchester.", "lonely", "only", "alone", "single", ""));
        English.add(new Pitanje("My sister isn’t ________________ me", "as tall as", "as tall than", "tall enough than", "taller as", ""));
        English.add(new Pitanje("__________ his bad health, he is very active", "Despite", "In spite", "However", "although", "Despite znači uprkos. In spite ima isto značenje, ali zahtijeva „of“ ispred uslova"));
        English.add(new Pitanje("J. K. Rowling, __________ first name is actually Joanne, is one of the world's most successful writers.", "whose", "who", "that", "which", ""));
        English.add(new Pitanje("Reports are coming in of a major oil spill in ______ Mediterranean", "the", "a", "some", "/", "Ispred imena mora se nalazi član the (the Mediterranean, the Adriatic Sea, the North Sea)"));
        English.add(new Pitanje("I'd like ________ sugar with that, please", "a little", "a bit", "a few", "few", " A little znači malo i koristi se uz zbirne i nebrojive imenice"));
        English.add(new Pitanje("'How many brothers do you have?' 'Two, and ______ of them are older than me.'", "both", "none", "they all", "all", ""));
        English.add(new Pitanje("Living in _____ European city can be expensive", "a", "an", "some", "/", "Nije određeno na koji grad se misli, može biti bilo koji europski grad. Zbog toga nam treba neodređeni član, odnosno u ovom slučaju \"a\""));
        English.add(new Pitanje("The results showed that ______ the candidates were of a very high standard", "most of", "a little of", "few", "many", ""));
        English.add(new Pitanje("Mozart died in Vienna in 1791, _____ the age of 35", "at", "of", "on", "in", ""));
        English.add(new Pitanje("The model planes can ________ varnish or paint", "be painted with", "paint with", "have painted with", "be painting with", "Rečenica je u pasivu"));
        English.add(new Pitanje("Boston is _____ the east coast of the United States.", "on", "in", "at", "away", "Kada govorimo da se nešto nalazi na zapadnoj/istočnoj/sjevernoj/južnoj obali, uz coast ide on"));
        English.add(new Pitanje("Mark ________ the drama club if he had more free time", "would join", "will join", "is joining", "joins", "Drugi kondicional: if + past simple, ...would + infinitive\nKoristi se kada govorimo o nerealnim scenarijima"));
        English.add(new Pitanje("You __________ take the files home. It's against the company rules", "can't", "don't have to", "can", "must", ""));
        English.add(new Pitanje("You look worried. What _____ about?", "are you thinking", "you are thinking", "you think", "were you thinking", "Radnja se odvija u trenutku govora i zato nam treba present continuous"));
        English.add(new Pitanje("How long _______ English?", "have you been learning", "do you learn", "are you learning", "have you learnt", "Proces učenja engleskog je idalje u toku"));
        English.add(new Pitanje("Mr. Williams ________ here a minute ago. He's just left", "was", "has been", "had been", "were", "Ago je priloška odredba koja nas upućuje na past simple"));
        English.add(new Pitanje("The phone is ringing. Don't get up, I ______it", "will answer", "am answering", "am going to answer", "answer", "will se koristi za spontane odluke"));
        English.add(new Pitanje("I've bought the plane tickets to Paris. Alex and I ______ tomorrow", "are leaving", "to leave", "is leaving", "left", "Present Continuous se može koristiti za budućnost kada govorimo o nekim budućim aranžmanima"));
        English.add(new Pitanje("That _______ be Alex over there. He called me from Japan twenty minutes ago", "can't", "isn't able to", "shouldn't", "won't", "That/it can't be u suštini znači nemoguće je"));
        English.add(new Pitanje("The article won't be finished unless I _______ late tonight", "work", "worked", "will work", "had worked", ""));
        English.add(new Pitanje("The film ________ at the moment. You'll have your photos in a minute", "is being developed", "is developed", "has been developed", "was being developed", "Radnja se odvija u trenutku govora i zato nam treba present continuous"));
        English.add(new Pitanje("His first film was ________ than the second one", "much better", "very good", "more better", "as good", ""));
        English.add(new Pitanje("They wanted to know ________ going to stay in Wales", "how  long we were", "if were we", "were we", "how long were we", "Riječ je o upitnoj rečenici u neupravnom govoru. Uptine neupravne rečenice nemaju isti redoslijed riječi kao obične upitne rečenice"));
        English.add(new Pitanje("Ken Sheldon, ____ film have won awards, is one of the most famous directors in Britain", "whose", "who", "whom", "which", ""));
        English.add(new Pitanje("Did you like _______ ring he gave you for your birthday?", "the", "a", "an", "/", "Pošto se tačno zna o kojem prstenu je riječ, koristimo određeni član, the"));
        English.add(new Pitanje("Can you give us the description _____ the robbers?", "of", "at", "about", "off", ""));
        English.add(new Pitanje("That was a great offer. You shouldn't have ________ it down", "turned", "put", "let", "pulled", "Turn down znači odbiti nešto"));
        return English;
    }

    private ArrayList<Pitanje> getGerman() {
        ArrayList<Pitanje> German = new ArrayList<>();
        German.add(new Pitanje("Welches Land grenzt nicht an Deutschland:", "Italien", "Dänemark", "Österreich", "Belgien", "Koja se država ne graniči s Njemačkom? Odgovor: Italija"));
        German.add(new Pitanje("Was ist richtig?", "sehen - sah - hat gesehen", "sehen - sehte - gesehen", "sehen - sehte - ist gesehen", "sehen - sah – ist gesehen", "Sehen je nepravilni glagol"));
        German.add(new Pitanje("Was ist „die Zugspitze“?", "ein Berg", "ein Fluss", "ein See", "eine Stadt", "Zugspitze je sa 2.962 m nadmorske visine najviša planina Njemačke. "));
        German.add(new Pitanje("Mit welchen Zeitformen (Tempora) bezeichnet man die Vergangenheit:", "Präteritum, Perfekt, Plusquamperfekt", "Futur I, Futur II", "Präsens", "Präteritum, Präsens", "Njemački jezik ima tri prošla vremena: preterit, perfekt i pluskvamperfekt"));
        German.add(new Pitanje("Welche deutsche Stadt ist berühmt für ihre „Stadtmusikanten“:", "Bremen", "Berlin", "Wien", "Zürich", "Bremenski gradski svirači (njem. Die Bremer Stadtmusikanten) su jedna od bajki braće Grimm"));
        German.add(new Pitanje("Welche Stadt bezeichnen wir in unserer Sprache als „Beč“?", "Wien", "Berlin", "Brüssel", "Salzburg", "Ime Beč je u naš jezik došlo iz mađarskog (mađ. Becs)"));
        German.add(new Pitanje("Was bezeichnet man in der deutschen Sprache als „Verben“?", "glagoli", "imenice", "pridjevi", "prilozi", ""));
        German.add(new Pitanje("Welcher Fluss fließt durch Deutschland:", "die Donau", "die Save", "die Drau/Drave", "die Drina", "Koja rijeka teče kroz Njemačku? Odgovor: Dunav"));
        German.add(new Pitanje("Was bezeichnet man mit „Goldener Bär“?", "Auszeichnung für Filme", "Auszeichnung für Musik", "Auszeichnung für Sport", "einen Zoo", "Za šta se dodjeljuje nagrada Zlatni medvjed? Odgovor: Za filmove"));
        German.add(new Pitanje("Ich freue mich ________ den nächsten Monat, dann habe ich nämlich Geburtstag. ", "auf", "an", "über", "für", ""));
        German.add(new Pitanje("Im Satz ist ein Fehler unterstrichen. Unterstreiche die richtige Form! Ich fahre am Wochenende oft mit meine kleine Schwester zu den Großeltern.", "meiner kleinen Schwester", "mein kleiner Schwester", "meiner kleiner Schwester", "meines kleinen Schwester", ""));
        German.add(new Pitanje("Ich würde mir ein neues Fahrrad kaufen, _______ ich das Geld dafür hätte.", "wenn", "weil", "dass", "aber", ""));
        German.add(new Pitanje("Welche dieser Städte sind in Österreich?", "Graz, Salzburg, Wien", "Frankfurt, München, Heidelberg", "Zürich, Genf, Basel", "Hamburg, Hannover, Köln", "Koji od ovih gradova se nalaze u Austriji? Odgovor: Graz, Salzburg i Beč"));
        German.add(new Pitanje("Ich rufe dich morgen an, ich muss … etwas besprechen.", "mit dir", "mit dich", "mit du", "mit deinem", "Mit uz sebe zahtijeva dativ"));
        German.add(new Pitanje("Welcher weltberühmte Schriftsteller hat das Werk „Steppenwolf“ geschrieben?", "Hermann Hesse", "Thomas Mann", "Johann Wolfgang von Goethe", "Franz Kafka", "Koji svjetski poznati pisac je napisao Stepski vuk? Odgovor: Hermann Hesse"));
        German.add(new Pitanje("Welches dieser Länder grenzt nicht an Deutschland?", "Ungarn", "Polen", "Österreich", "Niederlande", "Koja se država ne graniči s Njemačkom? Odgovor: Mađarska"));
        German.add(new Pitanje("Wie viele Bundesländer gibt es in Deutschland?", "16", "12", "14", "10", "Njemačka u svom sastaavu ima 16 saveznih država ili pokrajina. Postoji 14 pokrajina(njem:Länder) i 2 države (Freistaat), pri čemu je razlika samo u nazivu koji je zadržan iz tradicionalnih razloga."));
        German.add(new Pitanje("Wie heißt die Hauptstadt von Bayern?", "München", "Berlin", "Freiburg", "Hannover", "Glavni grad Bavarske je Minhen"));
        German.add(new Pitanje("In welchem dieser Länder wird Deutsch gesprochen?", "Die Schweiz", "Frankreich", "Niederlande", "Belgien", "U kojoj od ovih zemalja se govori njemački? Odgovor: u Švicarskoj"));
        German.add(new Pitanje("Wen haben die Nationalsozialisten im Zweiten Weltkrieg (1939-1945) vor allem verfolgt,  vertrieben und ermordet?", "die Juden", "die Moslems", "die Ausländer", "die Franzosen", ""));
        German.add(new Pitanje("Nach dem zweiten Weltkrieg wurde Deutschland in zwei Staaten geteilt (von 1949 bis 1990), wie hießen diese?", "DDR und BRD", "CDU und CSU", "DFB und DRD", "RBD und BBD", "DDR je Istočna Njemačka (Deutsche Demokratische Republik), a BRD je Zapadna Njemačka (Bundesrepublik Deutschland)"));
        German.add(new Pitanje("Welcher dieser Flüsse fließt nicht durch Deutschland?", "Die Seine", "der Rhein", "die Isar", "Die Donau", "Koja od ovih rijeka ne teče kroz Njemačku? Odgovor: Sena"));
        German.add(new Pitanje("Thomas hat gestern der Meinung des Lehrers ... ", "widersprochen", "gewählt", "geäußert", "zugegeben", ""));
        German.add(new Pitanje("Nächste Woche habe ich Geburtstag. Ich freue mich jetzt schon ... ", "darauf", "darüber", "dazu", "danach", ""));
        German.add(new Pitanje("Welche der folgenden Bezeichnungen bezieht sich auf den größten See in Deutschland?", "der Bodensee", "der Chiemsee", "der Starnberger See", "der Bergsee", "Koji od sljedećih naziva se odnosi na najveće jezero u Njemačkoj? Odgovor: Bodensee"));
        German.add(new Pitanje("In welchem Jahr wurde die Berliner Mauer gebaut?", "1949", "1989", "1961", "1945", "Koje godine je sagrađen Berlinski zid? Odgovor: 1949"));
        German.add(new Pitanje("Die Hauptstadt von Östereich ist ... ", "Wien", "Bern", "Berlin", "Graz", "Glavni grad Austrije je Beč"));
        German.add(new Pitanje("Die Berliner Mauer trennte", "den Osten vom Westen", "eine Insel", "das Stadtzentrum", "die Bundesländer", "Berlinski zid je razdvajao istok od zapada"));
        German.add(new Pitanje("Wie heißt der weibliche Artikel?", "die", "der", "das", "ein", ""));
        German.add(new Pitanje("Wie heißen die Fälle im Deutschen?", "Nominativ, Genitiv, Dativ, Akkusativ", "Nominativ, Genitiv, Dativ, Vokativ", "Nominativ, Dativ, Akkusativ, Instrumental", "Femininum, Maskulinum, Neutrum, Plural", "Njemački jezik ima 4 padeža: Nominativ, genitiv, dativ i akuzativ"));
        German.add(new Pitanje("Wie heißt das Meer in Deutschland", "Die Nordsee", "Die Adria", "Das Mittelmeer", "Die Donau", "Njemačka izlazi na Sjeverno ledeno more"));
        German.add(new Pitanje("Futur bezeichnet ...", "die Zukunft", "die Gegenwart", "die Vergangenheit", "das Geschlecht", ""));
        German.add(new Pitanje("Der Superlativ von “hoch”  lautet:", "am höchsten", "am höhsten", "am höher", "am höhersten", ""));
        German.add(new Pitanje("Welcher Satz ist richtig?", "Sie ging ins Kino, ohne auf mich zu warten", "Sie ging ins Kino, ohne auf mich warten", "Sie ging ins Kino, ohne auf mich zu wartet", "Sie ging ins Kino, ohne auf mich wartet", ""));
        German.add(new Pitanje("„Der Prozess“ ist ein Roman von", "Franz Kafka", "Thomas Mann", "Hermann Hesse", "Heinrich Böll", ""));
        German.add(new Pitanje("Koje je staro njemačko pismo?", "gotica", "latinica", "ćirilica", "arebica", ""));
        German.add(new Pitanje("Kakve članove ima njemački jezik i koliko?", "Njemački jezik ima određeni i neodređeni član", "Njemački jezik ima 1 član", "Njemački jezik ima 3 člana", "Njemački jezik nema članova", ""));
        German.add(new Pitanje("Ima li neodređeni član množinu?", "Neodređeni član nema množine", "Neodređeni član ima množinu", "Neodređeni član ima dvojinu", "Neodređeni član nema značenje", ""));
        German.add(new Pitanje("Da li je der određeni ili neodređeni član i za koji rod?", "Der je određeni član za muški rod.", "Der je određeni član za ženski rod", "Der je neodređeni član za muški rod", "Der je neodređeni član za ženski rod", ""));
        German.add(new Pitanje("Mogu li modalni glagoli stajati samostalno i kakvu dopunu zahtijevaju?", "zahtjevaju dopunu sa drugim glagolom u infinitvu bez zu", "mogu stajati samostalno", "ne zahtijevaju dopunu sa nekim drugim glagolom", "se dopunjavaju sa pomoćnim glagolima", ""));
        German.add(new Pitanje("In der Schweiz werden __________ gesprochen", "Deutsch, Italienisch, Französisch und Rätoromanisch", "Deutsch, Italienisch, Französisch und Englisch", "Deutsch, Englisch, Französisch und Rätoromanisch", "Deutsch, Italienisch, Englisch und Rätoromanisch", "U Švicarskoj se govore njemački, italijanski, francuski i retoromanski jezik"));
        German.add(new Pitanje("Johann Wolfgang Goethe wurde in __________ geboren", "Frankfurt am Main", "München", "Leipzig", "Berlin", "Goethe se rodio u Frankfurtu"));
        German.add(new Pitanje("auf / bei / mit / nach / von / zu / mit / in  sind", "Präpositionen", "substantive", "Verben", "Zahlen", ""));
        German.add(new Pitanje("Wer wagt,__________", "gewinnt", "das verschiebe nicht auf morgen", "dem ist nicht zu helfen", "soll auch nicht essen", "Ko se usudi, pobijedi"));
        German.add(new Pitanje("wollen / sollen / dürfen / können / mögen / müssen     sind", "Modalverben", "starke Verben", "Hilfsverben", "große Verben", ""));
        German.add(new Pitanje("Was ist richtig?", "Deutsch spricht man in Deutschland, Österreich und in der Schweiz", "Deutsch spricht man nur in Deutschland", "Deutsch spricht man in Deutschland und Österreich", "In der Schweiz spricht man kein Deutsch", "Njemački se također govori u Lihtenštajnu i Luksemburgu, te kao manjinski jezik u Belgiji"));
        return German;
    }

    private ArrayList<Pitanje> getLatin() {
        ArrayList<Pitanje> Latin = new ArrayList<>();
        Latin.add(new Pitanje("Gloria discipuli, gloria magistri.", "Slava učenikova je slava učiteljeva.", "Učenici su slavni zahvaljujući učitelju.", "Slava učenika je radost učitelja.", "Slavni učenici zahvaljuju učitelju.", ""));
        Latin.add(new Pitanje("Quidquid agis, prudenter agas et respice finem. ", "Sve što radiš, radi pažljivo i misli na kraj. ", "Pazi šta radiš", "Radi kako misliš da je najbolje", "Strpljenjem i radom sve možeš postići", ""));
        Latin.add(new Pitanje("Nulla regula sine exceptione", "Nijedno pravilo bez izuzetka", "Djela, ne riječi", "Jedna lasta ne čini proljeće", "Sve što je previše, škodi", ""));
        Latin.add(new Pitanje("Timeo Danaos et dona ferentes", "Bojim se Danajaca (Grka) i kad darove donose", "Zla kokoš, zlo jaje", "Jedan je bio svijet", "Rad sve pobjeđuje", ""));
        Latin.add(new Pitanje("Quot linguas cales, tot homines vales znači:", "Koliko jezika znaš, toliko ljudi vrijediš", "Rad sve pobjeđuje", "Škrtost je uzrok svih mana.", "Sve što je previše, škodi.", ""));
        Latin.add(new Pitanje("Non scholae, sed vitae discimus  znači:", "Ne učimo za školu, nego za život", "Ponavljanje je majka znanja.", "Prijatelj je polovica duše.", "O ukusima se ne raspravlja.", ""));
        Latin.add(new Pitanje("Amor omnia vincit", "Ljubav sve pobjeđuje", "Ljubav i ljubomora su isto", "Ljubi i čini što hoćeš", "Važno je sudjelovati", ""));
        Latin.add(new Pitanje("Non progredi est regredi", "Ne napredovati znači nazadovati", "U progresu je spas", "Jednoga dobitnik, drugoga gubitnik", "Samo hrabri napreduju", ""));
        Latin.add(new Pitanje("Historia est magistra vitae", "Historija  je učiteljica života", "Svatko je kovač svoje sreće", "Brada ne čini filozofa", "Čist račun, duga ljubav", ""));
        Latin.add(new Pitanje("Omnia mea mecum porto znači", "Sve svoje nosim sa sobom", "Povijest je učiteljica života", "Brada ne čini filozofa", "Čist račun, duga ljubav", ""));
        Latin.add(new Pitanje("Domus propria domus optima", "Vlastita je kuća najbolja kuća", "Spas naroda neka bude najviši zakon", "Vremena se mijenjaju i mi se mijenjamo u njima", "O ukusima se ne raspravlja", ""));
        Latin.add(new Pitanje("Aetate reddimur prudentiores", "S vremenom postajemo pametniji", "Povijest je učiteljica života", "Čist račun, duga ljubav", "Sve svoje nosim sa sobom", ""));
        Latin.add(new Pitanje("Verus amicus est tamquam alter idem", "Pravi je prijatelj kao drugo ja", "Jedan za sve i svi za jednoga", "Tko nije samnom, protiv mene je", "Ispravno je i od neprijatelja učiti", ""));
        Latin.add(new Pitanje("Beneficium accipere est libertatem vendere", "Uslugu primiti, znači prodati svoju slobodu", "Kad se dobar čovjek pokvari, postaje najgori", "Slušaj, gledaj, šuti, ako želiš živjeti u miru", "Najgora je zloupotreba najboljeg", ""));
        Latin.add(new Pitanje("Gloriam invidia sequitur", "Slavu zavist prati", "Tuga je pratilac veselja", "U ratu ćute zakoni", "Sinovi heroja su slabići", ""));
        Latin.add(new Pitanje("Ab alio exspectes alteri quod feceris", "Od drugog očekuj ono što budeš drugome učinio", "Kome zločin koristi, on ga je učinio", "Za dobar život kratko vreme je dovoljno dugo", "Primiti dobročinstvo znači prodati slobodu", ""));
        Latin.add(new Pitanje("Dominium generosa recusat", "Vlast plemeniti odbijaju", "Plemeniti drže vlast", "Generali dobijaju revoluciju", "Ne učimo za školu, nego za život", ""));
        Latin.add(new Pitanje("De mortius nihil nisi bene", "o mrtvima treba govoriti samo dobro", "budale dok se klone grešaka padaju u još veće", "svjetlo dolazi sa istoka", "duševni bol je teži od tjelesnog", ""));
        Latin.add(new Pitanje("Cornix cornici oculos non effodiet:", "vrana vrani oči ne kopa", "dok dišem nadam se", "vježbanje je najbolji učitelj", "lopov lopova poznaje", ""));
        return Latin;
    }

    private ArrayList<Pitanje> getMath() {
        ArrayList<Pitanje> Math = new ArrayList<>();
        Math.add(new Pitanje("Ako je A={x|xεN ٨ x≤6}\nB={x|x ε Z ٨|x|≤ 2}\nC={x|x ε Z  ٨-2<x≤2}.\nIzračunati (B U C)∩A ", "{1,2}", "B", "{0,1,2}", "Ø", "drawable_math_1"));
        Math.add(new Pitanje("Knjiga je poskupila 20%, a zatim je pojeftinila 20%. Koliko sad košta ako je prvobitna cijena bila 60KM?", "57,6KM", "60KM", "62,6KM", "58KM", "drawable_math_2"));
        Math.add(new Pitanje("Rastavi na proste faktore (4x²-36).", "4(x - 3)(x + 3)", "(2x – 9)²", "(2x – 4)(2x + 9)", "4(x–9)", "drawable_math_3"));
        Math.add(new Pitanje("Nakon obavljenog kvadriranja (2-√3)² dobijemo:", "7 - 4√3", "7 + 2√3", "7 - 2√3", "7 + 4√3", "drawable_math_4"));
        Math.add(new Pitanje("Površina pravouglog trougla čija je hipotenuza c=10 a visina na hipotenuzi hc=6 je:", "30", "60", "40", "80", "drawable_math_5"));
        Math.add(new Pitanje("3^(2/x) = 1/9", "-1", "1", "1/2", "-1/2", "drawable_math_6"));
        Math.add(new Pitanje("Cipele su pojeftinile 10%, a zatim još 20%. Koliko sad koštaju ako je početna cijena bila 100KM", "72KM", "81KM", "70KM", "80KM", "drawable_math_7"));
        Math.add(new Pitanje("Izraz  5√8−√18−√50  ima vrijednost", "2√2", "3", "2", "3√2", "drawable_math_8"));
        Math.add(new Pitanje("Rastaviti na proste faktore  4x² −16", "4(x−2)(x+2)", "(2x−4)²", "4x(x-4)", "(2x-8)(2x+2)", "drawable_math_9"));
        Math.add(new Pitanje("Druga kateta pravouglog trougla, čija je jedna kateta 7, a površina 14, je:", "4", "2", "8", "6", "drawable_math_10"));
        Math.add(new Pitanje("Rješenja jednačine 2x²- 32 = 0 su:", "±4", "±9", "±3", "±6", "drawable_math_11"));
        Math.add(new Pitanje("Oblast vrijednosti funkcije y = 2sinx-3  je", "-5≤y≤-1", "-1≤y≤5", "0≤y≤4", "1≤y≤5", "drawable_math_12"));
        Math.add(new Pitanje("Vrijednost izraza sin(π/2)-cos(π/3) je", "1/2", "0", "1", "3/2", "drawable_math_13"));
        Math.add(new Pitanje("Dva brata zajedno su skupila 120KM. Koliko je imao svaki od njih ako 2/3 sume prvog iznosi sumu drugog?", "72 i 48", "74 i 46", "90 i 30", "85 i 35", "drawable_math_14"));
        Math.add(new Pitanje("Na početku sezonskog sniženja proizvod je pojeftinio 10%, a zatim još jednom 10%. Koliko trenutno košta ako je prvobitna cijena proizvoda bila 80 KM?", "64,8 KM", "64 KM", "65 KM", "68,2 KM", "drawable_math_15"));
        Math.add(new Pitanje("Nakon obavljenog kvadriranja (1-√5)²  dobijemo", "2(3-√5)", "6+√5", "6+2√5", "6-√5", "drawable_math_16"));
        Math.add(new Pitanje("Površina pravouglog trougla čija je hipotenuza c=12 i visina na hipotenuzu h=5 iznosi:", "30", "60", "40", "80", "drawable_math_17"));
        Math.add(new Pitanje("Koja od vrijednosti X = cos0; Y = cos30 ; Z = cos45 ; W = cos60 je najveća", "X", "Y", "Z", "W", "drawable_math_18"));
        Math.add(new Pitanje("Ako se isti broj doda brojniku, a oduzme od nazivnika razlomka x=7/11 dobije se rezultat 2. Koji je to broj?", "5", "4", "7", "6", "drawable_math_19"));
        Math.add(new Pitanje("Knjiga je pojeftinila za  10%, a onda još jednom za 10%. Koliko sada košta ako joj je prvobitna cijena bila 200KM?", "162KM", "175KM", "180KM", "150KM", "drawable_math_20"));
        Math.add(new Pitanje("Rastavi na proste faktore izraz: 8x³ + 1", "(2x+1)(4x²-2x+1)", "(2x+1)³", "(2x+1)(2x+1)²", "(2x+1)(2x-1)²", "drawable_math_21"));
        Math.add(new Pitanje("Kvadriranjem binoma (3√2 - 1)² − dobijamo:", "19-6√2", "19+6√2", "6-19√2", "6+28√2", "drawable_math_22"));
        Math.add(new Pitanje("Površina kruga poluprečnika r=5cm je", "25π cm2", "10π cm2", "5π cm2", "50π cm2", "drawable_math_23"));
        Math.add(new Pitanje("Izračunaj (3²*2³)²", "5184", "4096", "6400", "6561", "drawable_math_24"));
        Math.add(new Pitanje("Koji je broj najveći\nA=sin0,   B=sin30,   C=sin45,   D=sin60,   E=sin90", "E", "d", "A", "b", "drawable_math_25"));
        Math.add(new Pitanje("Izračunaj sin60+cos30", "√3", "2", "0.5", "1", "drawable_math_26"));
        Math.add(new Pitanje("Dva druga su zajedno imala 120 KM. Koliko je imao svaki od njih ako 1/3 sume prvoga iznosi koliko i suma drugoga?", "90 i 30", "80 i 40", "70 i 50", "100 i 20", "drawable_math_27"));
        Math.add(new Pitanje("Ako obim kruga iznosi 12π , kolika je njegova površina?", "36π", "12π", "24π", "18π", "drawable_math_28"));
        Math.add(new Pitanje("Rješenja jednačine 2x²-18=0 su", "x=±3", "x=±6", "x=±3/2", "x=±9", "drawable_math_29"));
        Math.add(new Pitanje("Vrijednost izraza (√3 * ∛5)⁶ je", "675", "655", "225", "275", "drawable_math_30"));
        Math.add(new Pitanje("Odredi x iz jednačine cosx= -√2/2\nπ<x<3π/2", "5π/4", "9π/4", "7π/4", "3π/4", ""));
        Math.add(new Pitanje("Zapremina valjka poluprečnika baze r=2cm i visine H=10cm je:", "40π cm3", "20π cm3", "30π cm3", "50π cm3", "drawable_math_32"));
        Math.add(new Pitanje("Izračunati: (√3 *√2)⁶", "216", "6√6", "36", "36√6", "drawable_math_33"));
        Math.add(new Pitanje("Odrediti vrijednost nepoznate x u relaciji\nlog₁/₃x=-4", "81", "-81", "1/81", "-1/81", "drawable_math_34"));
        Math.add(new Pitanje("Koji je broj najmanji", "sin30", "sin45", "sin60", "sin90", "drawable_math_35"));
        Math.add(new Pitanje("Koji dvocifren broj ima osobinu da mu je zbir cifara 10 i da je 16 puta veći od cifre jedinica?", "64", "82", "56", "46", "drawable_math_36"));
        Math.add(new Pitanje("Ako je sinx=4/5 i 0<x<90, odrediti sin2x", "8/5", "2/5", "24/25", "12/25", ""));
        Math.add(new Pitanje("Rastavi na proste faktore izraz:\nx⁶-1", "(x-1)(x+1)(x²-x+1)(x²+x+1)", "(x-1)²(x²+x+1)²", "(x+1)2(x²-x+1)²", "(x-1)³(x+1)³", "drawable_math_38"));
        Math.add(new Pitanje("Rastavi na proste faktore izraz: 3x²-27", "3(x+3)(x-3)", "(3x-3)(3x+3)", "3(x-3)", "(3x-3)2", "drawable_math_39"));
        Math.add(new Pitanje("Koji dvocifren broj ima osobinu da mu je zbir cifara 6 i da je 6 puta veći od cifre jedinica?", "24", "33", "42", "51", "drawable_math_40"));
        return Math;
    }

    private ArrayList<Pitanje> getPhysics() {
        ArrayList<Pitanje> Physics = new ArrayList<>();
        Physics.add(new Pitanje("Tijelo mase 2 kg počne slobodno da pada sa visine 100 m. Poslije 2s padanja njegova kinetička energija je:", "400 J", "2000 J", "200 J", "100 J", ""));
        Physics.add(new Pitanje("Koliko km/h je 36 m/s ?", "130 km/h ", "10 km/h ", "20 km/h ", "36 km/h ", ""));
        Physics.add(new Pitanje("U zatvorenoj posudi nalazi se gas na temperaturi 200C.  Da bi mu se pritisak smanjio dva puta gas treba ohladiti do", "10°C", "-20°C", "-126.5°C", "-196.5°C", ""));
        Physics.add(new Pitanje("Ekvivalentni kapacitet dva jednaka kondenzatora, vezana paralelno, iznosi 12 μF.  Kapacitet jednog kondenzatora, izražen u mikrofaradima, je: ", "6 μF", "3 μF", "9 μF", "12 μF", ""));
        Physics.add(new Pitanje("Kolika je energija fotona čija je talasna dužina 620 nm?", "2,0 eV", "0,8 eV", "1,2 eV", "1,6 eV", ""));
        Physics.add(new Pitanje("Alfa čestica je", "jezgra helija", "jezgra vodika", "proton", "elektron", ""));
        Physics.add(new Pitanje("Veličina jezgre atoma vodika je približno", "10⁻¹⁵m", "10⁻¹²m ", "10⁻⁹m", "10⁻¹⁰m", ""));
        Physics.add(new Pitanje("Brzina svjetlosti u vakuumu je:", "3·10^8 m/s", "3·10³ m/s", "3·10⁶ m/s", "300 000 m/s", ""));
        Physics.add(new Pitanje("Jedinica za magnetsku indukciju je", "tesla", "veber", "bor", "gaus", ""));
        Physics.add(new Pitanje("Na električnoj sijalici stoji oznaka 220 V/100 W. Njen elekrtrični otpor izražen  u  omima, kada se priključi na gradsku mrežu, je:", "484", "2,2", "22", "0.45", ""));
        Physics.add(new Pitanje("Značajan dio tamne materije čine:", "neutrini", "neutroni", "protoni", "elektroni", ""));
        Physics.add(new Pitanje("Na horizontalnoj podlozi miruje tijelo mase 600 g. Sila reakcije podloge je", "6 N", "600 N", "0.6 N", "60 N", ""));
        Physics.add(new Pitanje("Čovjek stoji i drži kofer mase 10 kg, na visini 1m. Rad koji izvrši u toku 5 s je", "0 J", "5 J", "50 J", "500 J", ""));
        Physics.add(new Pitanje("SI jedinica za osvijetljenost je:", "luks", "fluks", "lumen", "kandela", ""));
        Physics.add(new Pitanje("h/mv  je matematički izraz za", "talasnu dužinu fotona", "impuls fotona", "energiju fotona", "1. Bohrov postulat", ""));
        Physics.add(new Pitanje("Prvi laser je konstruisan", "1960.", "1940.", "1950.", "1970.", ""));
        Physics.add(new Pitanje("Tijelo mase 300 g kreće se brzinom 72 km/h. Njegova kinetička energija je", "60 J", "108 J", "10,8 J", "6 kJ", ""));
        Physics.add(new Pitanje("SI jedinica za težinu je", "njutn", "gram", "kilogram", "kilopond", ""));
        Physics.add(new Pitanje("Voda prilikom hladjenja od 4°C do 0°C:", "povećava zapreminu", "smanjuje zapreminu", "povećava gustinu", "ne mijenja gustinu", ""));
        Physics.add(new Pitanje("Niels Bohr je objavio svoj model atoma:", "u pvoj polovini 20. stoljeća", "u pvoj polovini 19. stoljeća", "u drugoj polovini 19. stoljeća", "u drugoj polovini 20. stoljeća ", ""));
        Physics.add(new Pitanje("mvr je matematički izraz za:", "moment količine kretanja", "količinu kretanja", "impuls", "intenzitet", ""));
        Physics.add(new Pitanje("Automobil se kreće brzinom 54 km/h. Za 6 minuta predje put od", "5,4 km", "32,4 km", "3,24 km", "10,8 km", ""));
        Physics.add(new Pitanje("SI jedinica za elektromotornu silu izvora struje je", "volt", "njutn", "kilopond", "džul", ""));
        Physics.add(new Pitanje("Newton je formulisao zakone mehanike", "krajem 17 stoljeća", "početkom 16. stoljeća", "krajem 16. stoljeća", "početkom 17. stoljeća", ""));
        Physics.add(new Pitanje("Vrsta atoma zavisi od", "broja neutrona u atomu", "broja elektrona u atomu", "broja protona u atomu", "zbira protona i elektrona u atomu", ""));
        Physics.add(new Pitanje("Prema Teoriji velikog praska Svemir je nastao prije", "13 milijardi godina", "13 miliona godina", "130 miliona godina", "1,3 milijarde godina", ""));
        Physics.add(new Pitanje("Automobil se kreće brzinom 72 km/h. Za 6 minuta predje put od", "7,2 km", "12 km", "1,2 km", "43,2 km", ""));
        Physics.add(new Pitanje("Fizika, kao posebna naučna disciplina, nastala je u:", "17. stoljeću", "13. stoljeću", "2. stoljeću", "7. stoljeću", ""));
        Physics.add(new Pitanje("Ako se brzina tijela poveća 3 puta,  koji od odgovora vezanih za kinetičku energiju je tačan?", "poveća se 9 puta", "poveća se 3 puta", "smanji se 3 puta", "smanji se 9 puta", ""));
        Physics.add(new Pitanje("Promjena određene količine idealnog gasa pri konstantnoj temperaturi naziva se", "izotermna promjena", "izobarna promjena", "izohorna promjena", "adijabatska promjena", ""));
        Physics.add(new Pitanje("Koji od parova atoma predstavljaju izotope?", "(12/6)C (14/6)C", "(16/8)O (14/7)N", "(16/8)O (23/11)Na", "(14/7)N (14/6)C", ""));
        Physics.add(new Pitanje("Koji od ponuđenih odgovora predstavlja SI jedinicu  za jačinu električne struje:", "C/s  (C -Kulon, s- sekunda)", "Cs", "V*Ω  (Volt x Om)", "Ω/V", ""));
        Physics.add(new Pitanje("Totalna unutrašnja refleksija svjetlosti  moguća je", "pri prelasku svjetlosti  iz optički gušće u optički rjeđu sredinu", "pri prelasku svjetlosti  iz optički rjeđe u optički gušću sredinu", "samo pri postiranju svjetlosti  kroz vodu", "uvijek kada svjetlost pada na granicu između dvije različite optičke sredine", ""));
        Physics.add(new Pitanje("Koja od pojava dokazuje da elektron ima valna svojstva?", "difrakcija elektrona na kristalnoj rešetki", "fotoelektrični efekt", "zračenje crnog tijela", "niti jedna od navedenih", ""));
        Physics.add(new Pitanje("Tijelo mase 2,0 kg miruje na horizontalnoj podlozi. Koeficijent trenja izmedju tijela i podloge je 0,3. Najmanja sila koja ga može pokrenuti je", "6,0 N", "60 N", "0,6 N", "0,06 N", ""));
        Physics.add(new Pitanje("U hladnom jutru, na temperaturi 70C, pritisak u automobilskoj gumi je 200 kPa. U toku dana temperatura u gumama se podigne na 37oC. Pritisak u gumama se poveća za:", "214 kPa", "21,48 kPa", "1,07 kPa", "10,7 kPa", ""));
        Physics.add(new Pitanje("U otporniku od 20 Ω, pri prolasku električne struje, oslobodi se 1 kWh toplote za 30 minuta. Kolika jačina struje prolazi kroz otpornik?", "10A", "20A", "18A", "22A", ""));
        Physics.add(new Pitanje("Toplotna mašina ima stepen iskorištenja 34 %. Koliki će izvršiti rad, ako primi 5 MJ toplote?", "1,70 MJ", "0,17 MJ", "1,70 kJ", "17 kJ", ""));
        Physics.add(new Pitanje("Kolika je energija fotona čija je talasna dužina 500 nm?", "2,48 eV", "0,248 eV", "24,8 eV", "248 eV", ""));
        Physics.add(new Pitanje("Kolikom početnom brzinom treba baciti tijelo vertikalno naniže sa visine h = 60 m da bi ono palo na površinu Zemlje za 3 s?", "5,285 m/s", "10,193 m/s", "15,192 m/s", "20,193 m/s", ""));
        Physics.add(new Pitanje("Korito rijeke ima oblik pravougaonika stranica a = 18 m i b = 2 m. Brzina rijeke je 7,2 km/h. Koliki je zapreminski protok vode?", "72 m3/s", "5 m3/s", "62 m3/s", "259,2 m3/s", ""));
        Physics.add(new Pitanje("Elastična opruga se stisne za 25 cm pod djelovanjem sile od 12,5 N. Koliki je izvršeni rad pri sabijanju opruge?", "1,5625 J", "0,2431 J", "0,6326 J", "6,342 J", ""));
        Physics.add(new Pitanje("Dva jednaka tačkasta naboja od 4μC, u petroleju, (ɛr = 2,5), međusobno se odbijaju silom  od 20 mN. Koliko je rastojanje između njih?", "1,7 m", "15 cm", "27 mm", "1,7 mm", ""));
        Physics.add(new Pitanje("Na kolikom rastojanju od beskonačno dugog pravolinijskog provodnika u vazduhu,  kroz kojeg ide struja jačine 2 A, magnetna indukcija iznosi 4μT?", "10 cm", "1 cm", "1 m", "10 m", ""));
        Physics.add(new Pitanje("Kolika je energija fotona čija je talasna dužina 400 nm?", "3,1 eV", "2,48 eV", "0,248 eV", "4,23 eV", ""));
        Physics.add(new Pitanje("Izvjesna količina gasa zauzima zapreminu V1= 3 litra kod pritiska 1 bar. Koliki je pritisak gasa ako se on sabije na V2 = 500 cm3? Temperatura gasa se ne mijenja", "6 bara", "4 bara", "5 bara", "3 bara", ""));
        Physics.add(new Pitanje("Kada se u kolo naizmjenične električne struje priključi kondenzator kapaciteta 2 μF njegov otpor iznosi 2 kΩ. Kolika je frekvencija naizmjenične električne struje?", "39,8 Hz", "20,5 Hz", "25,6 Hz", "42,5 Hz", ""));
        Physics.add(new Pitanje("Naelektrisana kapljica ulja mase 10^-4kg miruje u homogenom električnom polju jačine 98,1N/C. Koliki je naboj naelektrisane kapljice?", "10 µC", "0,1 µC", "1 µC", "100 µC", ""));
        Physics.add(new Pitanje("Automobil se kreće brzinom 20 m/s,a zatim brzinom 72 km/h", "Automobil nije promijenio brzinu", "Automobil je ubrzao", "Automobil je usporio", "Automobil se kretao stalnim usporenjem", ""));
        Physics.add(new Pitanje("Čvrsto tijelo, gustine 8 g/cm3, uroni se u vodu gustine 1 g/cm3. Uronjeno tijelo  će u vodi da", "tone", "Lebdi", "Pliva", "bude djelomično iznad vode", ""));
        Physics.add(new Pitanje("Apsolutni indeks prelamanja neke sredine je", "odnos brzine svjetlosti u vakuumu i toj sredini", "odnos brzine svjetlosti u toj sredini i vazduhu", "odnos brzine svjetlosti u vazduhu i toj sredini", " odnos brzine svjetlosti u vakuumu i vazduhu", ""));
        Physics.add(new Pitanje("Relacija I = σT^4 je matemitički izraz za", "Stefan-Boltzmanov zakon zračenja", "Wienov zakon pomjeranja", "Planckov zakon zračenja", "Prvi Bohrov postulat", ""));
        return Physics;
    }

    private ArrayList<Pitanje> getChemistry() {
        ArrayList<Pitanje> Chemistry = new ArrayList<>();
        Chemistry.add(new Pitanje("Zapremina jednog mola gasa pri STP je:", "22,4 dm3", "11,2 dm3", "5,6 dm3", "33,6 dm3", ""));
        Chemistry.add(new Pitanje("Relativna molekulska masa H2SO4 iznosi:", "98", "141", "107", "106", "Mr(H2SO4)=2*Ar(H)+Ar(S)+4*Ar(O)\nMr(H2S04)=2*1+32+4*16\nMr(H2SO4)=98"));
        Chemistry.add(new Pitanje("Heksoza je: ", "glukoza ", "maltoza ", "riboza ", "2-deoksiriboza", "Heksoze su monosaharidi sa šest ugljikovih atoma, sa hemijskom formulom C6H12O6."));
        Chemistry.add(new Pitanje("R-COOH predstavlja opću formulu:", "organskih kiselina", "estera", "etera", "anhidrida", ""));
        Chemistry.add(new Pitanje("Jedinica za masenu koncentraciju je:", "g/dm3", "mol/dm3", "mol/kg", "mol/mol", ""));
        Chemistry.add(new Pitanje("Heterociklična baza nukleinskih kiselina je:", "adenin", "anilin", "aldehid", "alanin", ""));
        Chemistry.add(new Pitanje("Maseni broj atoma označava", "zbir protona i neutrona u jezgri atoma", "broj protona u jezgru", "broj elektrona u omotaču", "zbir protona i elektrona", ""));
        Chemistry.add(new Pitanje("Na katodi u procesu elektrolize odvija se:", "redukcija", "oksidacija", "jonizacija", "polimerizacija", ""));
        Chemistry.add(new Pitanje("Peptidna veza obrazuje se između: ", "karboksilne grupe i amino grupe", "amino grupe i hidroksidne grupe", "karbonilne i hidroksidne grupe", "keto i amino grupe", ""));
        Chemistry.add(new Pitanje("Brzina hemijske reakcije: ", "je promjena koncentracije reaktanata u jedinici vremena", "je pređeni put u jedinici vremena", "ne zavisi od temperature", "je brzina preraspodjele atoma", ""));
        Chemistry.add(new Pitanje("Elementi IA grupe su:", "jaki reducenti", "jaki oksidansi", "lahko se redukuju", "teško se oksidiraju", "To su vodik, litijum, natrij, kalij, rubidij, cezij i francij"));
        Chemistry.add(new Pitanje("Primarni amin je", "amonijak", "dietilamin", "anilin", "amid", ""));
        Chemistry.add(new Pitanje("U alkenima, dvostruka veza sastoji se od", "jedne σ i jedne π veze", "dvije σ veze", "dvije π veze", "dvije kovalentne veze", ""));
        Chemistry.add(new Pitanje("Baze su spojevi koji u vodenom rastvoru:", "disociraju na jone metala i hidroksidne jone", "disociraju na jone metala i jone kiselinskog ostatka", "ne disociraju", "disociraju na hidrogenove jone i hidroksidne jone", ""));
        Chemistry.add(new Pitanje("Masti se rastvaraju u: ", "nepolarnim organskim rastvaračima", "polarnim organskim rastvaračima", "vodi", "kiselinama", ""));
        Chemistry.add(new Pitanje("Elementi u PSE su poredani: ", "po porastu atomskog broja", "po broju elektrona u K-ljusci", "po abecednom redu", "po broju orbitala", ""));
        Chemistry.add(new Pitanje("Atom karbona ima ukupno", "6 elektrona", "12 elektrona", "8 elektrona", "4 elektrona", ""));
        Chemistry.add(new Pitanje("Elektronska konfiguracija 1s2 2s2 2p6 3s1 je konfiguracija atoma", "natrijuma", "hlora", "neon", "cinka", ""));
        Chemistry.add(new Pitanje("Dijamant i grafit su", "alotropske modifikacije karbona", "alotropske modifikacije sumpora", "provodnici elektriciteta", "izolatori", ""));
        Chemistry.add(new Pitanje("Od navedenih spojeva po jonskom tipu veze građen je", "CaCl2", "H2O", "HCl", "CH4", ""));
        Chemistry.add(new Pitanje("Koji od navedenih spojeva nije so", "NH3", "NH4Cl", "NH4NO3", "(NH4)2S", ""));
        Chemistry.add(new Pitanje("Alanil-glicin je", "dipeptid", "aminokiselina", "protein", "aldehid", ""));
        Chemistry.add(new Pitanje("Esteri nastaju reakcijom", "kiselina i alkohola", "aldehida i alkohola", "ketona i kiselina", "baza i kiselina", ""));
        Chemistry.add(new Pitanje("Atomska masa nitrogena je:", "14", "28", "28 g/mol", "14 g/mol", ""));
        Chemistry.add(new Pitanje("Oksidacioni broj oksigena u spojevima je", "-2", "+2", "1", "0", ""));
        Chemistry.add(new Pitanje("Kiseline", "jonizacijom daju H3O+ jone", "ne joniziraju", "jonizacijom daju OH- jone", "su samo anorganske", ""));
        Chemistry.add(new Pitanje("Zasićeni karbohidrogen je", "metan", "benzen", "cikloheksen", "eten", ""));
        Chemistry.add(new Pitanje("U disaharide spada", "Maltoza", "glukoza", "skrob", "celuloza", ""));
        Chemistry.add(new Pitanje("Kationi su", "pozitivno naelektrisani joni", "neutralni atomi", "negativni joni", "pozitivni atomi metala", ""));
        Chemistry.add(new Pitanje("CH3CH2OH predstavlja formulu", "etanola", "etanala", "metanola", "ketona", ""));
        return Chemistry;
    }

    private ArrayList<Pitanje> getBiology() {
        ArrayList<Pitanje> Biology = new ArrayList<>();
        Biology.add(new Pitanje("Najuočljiviji hromosomi su u:", "metafazi", "telofazi", "profazi", "interfazi", ""));
        Biology.add(new Pitanje("Glatke mišićne stanice izgrađuju:", "krvne sudove", "srce", "jezik", "mišiće ruku", "Nalaze se u građi krvnih i limfnih žila, crijeva, dušnika, mokraćnog mjehura, maternice, kože, unutrašnjih mišića oka itd"));
        Biology.add(new Pitanje("Nosioci imuniteta u organizmu su", "T-limfociti", "eritrociti", "trombociti", "neuroni", ""));
        Biology.add(new Pitanje("Srce riba je građeno iz:", "1 komore i 1 pretkomore", "2 komore i 2 pretkomore", "2 pretkomore i 1 komore", "1 pretkomore i 2 komore", ""));
        Biology.add(new Pitanje("Redukciona dioba je", "mejoza", "partenokarpija", "mitoza", "partenogeneza", "S obzirom da se broj hromosoma u kćerkama ćelijama u odnosu na majku ćeliju smanjuje na pola, ova dioba se naziva i redukciona (lat. reductio = smanjenje)"));
        Biology.add(new Pitanje("Somatotropni hormon izlučuje: ", "hipofiza", "gušterača", "štitna žlijezda", "timus", "Somatotropni hormon ili hormon rasta"));
        Biology.add(new Pitanje("Uloga leukocita je u: ", "odbrani organizma od stranih čestica", "dijeljenju ćelije", "prenosu kiseonika", "zaustavljanju krvarenja", "Prenos kisika je zadatak eritrocita, a zaustavljanje krvarenja trombocita"));
        Biology.add(new Pitanje("Škrge su organi za disanje kod:", "riba", "insekata", "sisara", "ptica", ""));
        Biology.add(new Pitanje("Ćelijski ciklus obuhvata:", "interfazu i mitozu", "interfazu i amitozu", "profazu i mitozu", "interfazu i telofazu", "Interfaza je faza između dvije uzastopne diobe i najduži je dio ćelijskog ciklusa"));
        Biology.add(new Pitanje("U usnoj šupljini čovjeka se nalazi enzim", "amilaza", "himotripsin", "tripsin", "pepsin", "Amilaza je enzim koji katalizira hidrolizu škroba u šećere"));
        Biology.add(new Pitanje("Srce čovjeka je građeno od:", "dvije komore i dvije pretkomore", "dvije komore i pretkomore", "komore i pretkomore", "komore i dvije predkomore", ""));
        Biology.add(new Pitanje("Nauka koja proučava građu i funkciju ćelije je:", "citologija", "histologija", "zoologija", "antropologija", ""));
        Biology.add(new Pitanje("Nefron je", "osnovna jedinica bubrega", "osnovna jedinica nervnog sistema", "veza između nervnih ćelija", "organ za izlučivanje kod rakova", ""));
        Biology.add(new Pitanje("Normalan puls kod čovjeka iznosi:", "od 60 do 80 otkucaja u minuti", "od 10 do 15 otkucaja u minuti", "od 50 do 60 otkucaja u minuti", "od 100 do 150 otkucaja u minuti", ""));
        Biology.add(new Pitanje("Povišena vrijednost krvnog pritiska označava se kao", "hipertenzija", "hipotenzija", "izotenzija", "sistola", "Hipotenzija je nizak pritisak"));
        Biology.add(new Pitanje("Genetička informacija je zapisana", "jedru", "citoplazmi", "lizozomima", "ribosomima", ""));
        Biology.add(new Pitanje("Uloga ribozoma je u", "biosintezi  bjelančevina", "odbrani organizma", "transportu kroz membranu", "razgradnji glukoze", ""));
        Biology.add(new Pitanje("Enzim koji razlaže masti je", "lipaza", "nukleaza", "saharaza", "maltaza", "Masti se zovu još i lipidi, a imena enzma se izvode od imena materije na koju djeluju i nastavka -aza"));
        Biology.add(new Pitanje("Citoplazmatske organele koje učestvuju u proizvodnji energije su:", "mitohondrije", "lizosomi", "endoplazmatski retikulum", "plazmalema", ""));
        Biology.add(new Pitanje("Informaciju o sintezi proteina iz jedra prenosi", "iRNK", "DNK", "tRNK", "rRNK", ""));
        Biology.add(new Pitanje("Izbaci uljeza", "bubreg", "prazno crijevo (jejunum)", "želudac", "jednjak", "Svi ostali odgovori se odnose na probavni sistem, osim bubrega koji je dio ekskretornog sistema"));
        Biology.add(new Pitanje("Uloga eritrocita je u:", "prijenos oksigena", "odbrani organizma od stranih čestica", "zgrušavanju krvi", "termoregulaciji", "Zaštita organizma je zadatak leukocita, a zaustavljanje krvarenja trombocita"));
        Biology.add(new Pitanje("Spolni hormoni su", "estrogen", "adrenalin", "tiroksin", "somatotropni hormona", "Ženski spolni hormoni su estrogen i progesteron, a muški testosteron"));
        Biology.add(new Pitanje("Ćelijsko disanje kod biljaka odvija se:", "noću", "i danju i noću", "danju", "samo zimi", "Biljke danju vrše proces fotosinteze, a noću disanja"));
        Biology.add(new Pitanje("Spolne ćelije imaju hromosomsku garnituru koja se označava sa", "n", "2n", "3n", "4n", ""));
        Biology.add(new Pitanje("Estrogen je hormon", "jajnika", "gušterače", "hipofize", "štitne žlijezde", "Estrogen je ženski spolni hormon"));
        Biology.add(new Pitanje("Organela koje ne pripada životinjskoj ćeliji je", "ćelijski zid", "golđijev aparat", "endoplazmatski retikulum", "plazmalema", "Ćelijski zid je karakterističan za biljne ćelije"));
        Biology.add(new Pitanje("U mišićnoj kontrakciji važnu ulogu imaju bjelančevine", "aktin i miozin", "valin i glicin", "tripsin i pepsin", "leucin i izoleucin", "Sposobnost kontrakcije se zasniva na prisustvu kontraktilnih vlakana, miofibrila, koja su izgrađena od proteina aktina i miozina"));
        Biology.add(new Pitanje("Nedostatak somatotropnog hormona dovodi do", "patuljastog rasta", "gušavosti", "rahitisa", "šećerne bolesti", "Somatotropni hormon je hormon rasta"));
        Biology.add(new Pitanje("Mejozom nastaju", "gameti", "somatske ćelije", "tjelesne ćelije", "krvne ćelije", "Gameti su polne ćelije koje se stvaraju putem mejoze te sadrže haploidan broj hromozoma"));
        Biology.add(new Pitanje("Životinjske ćelije ne sadrže", "hloroplaste", "membranu", "jedro", "mitohondrije", "Hloroplasti su organele koje se nalaze u biljnim ćelijama i drugim eukariotskim organizmima koji vrše proces fotosinteze"));
        Biology.add(new Pitanje("Receptori su", "prijemnici podražaja", "veze između ćelija", "transmiteri", "sinapse", ""));
        Biology.add(new Pitanje("Leukociti sintetiziraju", "antitijela", "hormone", "kisik", "lipide", ""));
        Biology.add(new Pitanje("Hromosom je građen od dvije", "hromatide", "hromoneme", "hromomere", "centromere", "Hromatida je uzdužna polovina metafaznog hromozoma."));
        Biology.add(new Pitanje("Kortikosteroide izlučuju", "nadbubrežne žlijezde", "jajnici", "testisi", "paraštitne žlijezde", ""));
        Biology.add(new Pitanje("Životinjske ćelije ne sadrže", "celulozu", "glikogen", "lipide", "proteine", "Celuloza nastaje u prirodi fotosintezom i čini gotovo polovinu tvari od koje su građene stijene ćelija u drveću i jednogodišnjim biljkama"));
        Biology.add(new Pitanje("Cjevasti nervni sistem se javlja kod", "čovjeka", "glista", "insekata", "dupljara", "U najrazvijenijem obliku javlja se kod čovjeka."));
        Biology.add(new Pitanje("Hromosomska garnitura tjelesnih ćelija čovjeka je", "diploidna", "haploidna", "poliploidna", "aneuploidna", "Diploidna(2n) hromozomska garnitura, 46 hromozoma"));
        Biology.add(new Pitanje("Skrob se u ustima razlaže pod dejstvom", "ptijalina", "tripsina", "pepsina", "tiroksina", ""));
        Biology.add(new Pitanje("Lizozomi su odgovorni za", "varenje u ćeliji", "sintezu energije", "sintezu proteina", "sintezu masti", ""));
        Biology.add(new Pitanje("Hormon rasta izlučuje:", "hipofiza", "jajnik", "gušterača", "bubreg", "Hormon rasta ili somatotropni hormon"));
        Biology.add(new Pitanje("Razviće bez oplodnje je", "partenogeneza", "mitoza", "mejoza", "amitoza", ""));
        Biology.add(new Pitanje("Neurotransmiter je", "acetilholin", "progesteron", "estrogen", "testosteron", "Svi ostali odgovori su spolni hormoni"));
        Biology.add(new Pitanje("U zgrušavanju krvi učestvuju", "trombociti", "monociti", "leukociti", "eritrociti", ""));
        Biology.add(new Pitanje("Somatske ćelije nastaju:", "mitozom", "amitozom", "mejozom", "partenogenezom", "Somatske ćelije su ustvari tjelesne ćelije, a one nastaju mitozom"));
        Biology.add(new Pitanje("Srce vodozemaca je građeno iz", "2 pretkomore i 1 komore", "2 komore i 2 pretkomore", "1 pretkomore i 2 komore", "1 komore i 1 pretkomore", ""));
        Biology.add(new Pitanje("Tiroksin izlučuje:", "štitna žlijezda", "testis", "jajnik", "nadbubrežna žlijezda", "Štitna žlijezda se još zove i tiroidna"));
        Biology.add(new Pitanje("Kontraktilnost mišićnoj ćeliji daju", "Miofibrili", "neurofibrili", "cilije", "fibrinogeni", "Sposobnost kontrakcije se zasniva na prisustvu kontraktilnih vlakana, miofibrila, koja su izgrađena od proteina aktina i miozina"));
        Biology.add(new Pitanje("Nadbubrežne žlijezde stvaraju:", "adrenalin", "antitijela", "aglutinogen", "eritropoetin", ""));
        Biology.add(new Pitanje("Prvi znak trudnoće je", "izostanak menstruacije", "povraćanje", "promjena oblika stomaka", "nervoza, depresija", ""));
        Biology.add(new Pitanje("Uloga štapića u stvaranju slike predmeta je", "uočavanje predmeta", "razlikovanje konture predmeta", "razlikovanje boja predmeta", "razlikovanje udaljenosti  predmeta", ""));
        Biology.add(new Pitanje("Difuzni nervni sistem se javlja kod", "dupljara", "člankovitih glista", "pljosnatih glista", "hordata", "Difuzni nervni sistem sastavljen je od mrežasto povezanih nervnih ćelija, među kojima se izvorni nadražaj ravnmjerno rasprostire u svim pravcima. U procesu koncentričnog širenja, intenzitet nadražaja postepeno opada i na izvjesnoj udaljenosti od podraženog mjesta - potpuno se gubi. Nervni spletovi jedini su tip nervnog sistema dupljara"));
        Biology.add(new Pitanje("Ptijalin je enzim koji razlaže", "skrob u ustima", "bjelančevine", "maltozu", "masti u želudcu", ""));
        Biology.add(new Pitanje("Hemolimfa je tjelesna tečnost:", "beskičmenjaka", "kičmenjaka", "insekata", "čovjeka", "Hemolimfa je tjelesna tečnost koja cirkuliše kroz sudove i međutkivne prostore u telu beskičmenjaka (nekih crva, mekušaca, zglavkara, bodljokožaca, plaštaša)."));
        return Biology;
    }

    private ArrayList<Pitanje> getGeo() {
        ArrayList<Pitanje> Geo = new ArrayList<>();
        Geo.add(new Pitanje("Zemlja obilazi (revoluira) oko Sunca od zapada prema istoku po putanji koja se naziva:", "ekliptika čiji obim iznosi 940 miliona kilometara", "galaktika čiji obim iznosi 970 miliona kilometara", "galaksija čiji obim iznosi 720 miliona kilometara", "geoid čiji obim iznosi 650 miliona kilometara", "drawable_geo_2"));
        Geo.add(new Pitanje("Zemljina Atmosfera se dijeli u pet glavnih slojeva, a to su:", "troposfera, stratosfera, mezosfera, termosfera i egzosfera", "troposfera, stratosfera, mezosfera, termosfera i geosfera", "troposfera, stratosfera, mezosfera, termosfera i astenosfera", "troposfera, stratosfera, mezosfera, termosfera i fotosfera", ""));
        Geo.add(new Pitanje("S obzirom na izgled oblaci se dijele na tri osnovne skupine: ", "gomilaste (kumuluse), slojevite (stratuse) i pramenaste (ciruse)", "gomilaste (ciruse), guste (stratuse) i slojevite (kumuluse)", "slojevite (kumuluse), gomilaste (stratuse) i tamne (ciruse) ", "guste (kumuluse), slojevite (ciruse) i pramenaste (stratuse)", ""));
        Geo.add(new Pitanje("Bosna i Hercegovina je zemlja:", "jugoistočne Europe, smještena na zapadnom dijelu Balkanskog poluotoka", "srednje Europe, smještena na zapadnom dijelu Balkanskog poluotoka", "zapadne Europe, smještena na sjevernom dijelu Balkanskog poluotoka", "jugozapadne Europe, smještena na istočnom dijelu Balkanskog poluotoka", ""));
        Geo.add(new Pitanje("Geološki najstariji dio Sjeverne Amerike je: ", "Kanadski štit", "Apalačko gorje", "Kordiljeri", "Središnja nizija", "Kanadski štit je formiran prije oko 3 milijarde godina i dobio je ime po tvrdom gnajsu i granitu koji leže ispod njegove površine i spadaju među najstarije stijene na Zemlji."));
        Geo.add(new Pitanje("Europska unija danas broji:", "28 zemalja članica", "15 zemalja članica", "20 zemalja članica", "22 zemlje članice", "Od 31.1.2020. EU ima 27 članova, nakon izlaska Velike Britanije"));
        Geo.add(new Pitanje("Površinski oblik kraškog reljefa je :", "Vrtače", "Cirkovi", "jame", "dine", "drawable_geo_7"));
        Geo.add(new Pitanje("U egzogene sile spada :", "Sunčeva energija", "vulkani", "regresija", "zemljotresi", "Egzogene sile, naziv za sile koje izvana utiču na oblikovanje Zemljine kore (Sunčevo zračenje, ledenjaci, vjetar, vode, hemijsko i biološko trošenje itd"));
        Geo.add(new Pitanje("Koju rijetku pojavu susrećemo u blizini vulkana :", "gejziri", "barhane", "vrulje", "vrela", "Gejzir je posebna vrsta geotermalnog izvora čija je karakteristika naglo i neočekivano izbacivanje tople ili vrele vode i vodene pare."));
        Geo.add(new Pitanje("Prirodni faktor razvoja privrede je:", "Tržište", "Sirovine", "Kapital", "Saobraćaj", ""));
        Geo.add(new Pitanje("Posljedica Zemljine rotacije je", "Smjena dana i noći", "smjena godišnjih doba", "toplotni pojasevi", "nejednaka dužina dana i noći", ""));
        Geo.add(new Pitanje("Sjeveroistočna Bosna bogata je sa ", "ugljem", "željeznom rudom", "boksitom", "bakrom", ""));
        Geo.add(new Pitanje("Zemljina polulopta podijeljena je na", "24 satne  zone", "12 satnih zona", "48 satnih zona", "60 satnih zona", "Granice vremenskih zona u pravilu leže na meridijanima geografske dužine koji su višekratnici 15º, pa razlika između susjednih vremenskih zona iznosi jedan sat. Ipak, ponegdje je razlika i drugačija. Osim toga, vremenske zone mogu imati prilično nepravilne oblike jer obično prate granice država ili drugih administrativnih područja."));
        Geo.add(new Pitanje("Najmanju geografsku širinu imaju tačke na ekvatoru, a najveću na polovima", "0° na ekvatoru i 90° na polovima", "0° na ekvatoru i 180° na polovima", " 90° na ekvatoru i 90° na polovima", "90° na ekvatoru i 180° na polovima", "Geografska širina je udaljenost nekog mjesta od ekvatora prema sjevernom i južnom geografskom polu"));
        Geo.add(new Pitanje("Kraški proces je", "hemijsko razaranje krečnjaka vodom", "biološko razaranje stijena", "mehaničko razaranje stijena", "djelovanje vjetra", ""));
        Geo.add(new Pitanje("Vodene površine na planeti Zemlji zauzimaju površinu od", "361 000 000 km2 ili 71% od ukupne površine planete", "362 000 000 km2 ili 72% od ukupne površine planete", "382 000 000 km2 ili 75% od ukupne površine planete", "392 000 000 km2 ili 79% od ukupne površine planete", ""));
        Geo.add(new Pitanje("Naša zemlja Bosna i Hercegovina zauzima površinu od", "51 129 km2", "41 129 km2", "51 120 km2", "38 219 km2 ", ""));
        Geo.add(new Pitanje("Lisabon je glavni grad", "Portugala", "Španije", "Andore", "Malte", ""));
        Geo.add(new Pitanje("Kraški proces je", "hemijsko razaranje krečnjaka vodom", "biološko razaranje stijena", "mehaničko razaranje stijena", "djelovanje vjetra", ""));
        Geo.add(new Pitanje("Reljefne cjeline Angloamerike su:", "Kanadski štit, Apalači, Kordiljeri i Središnja nizija", "Baltički štit, Apalači, Kordiljeri i Središnja nizija", "Kanadski štit, Apenini, Kordiljeri i Velika nizija", "Apalači, Apenini, Pirineji i i Središnja nizija", "Apenini(Italija),Pirineji(Španija) i baltički štit(Skandinavija) su svi u Europi"));
        Geo.add(new Pitanje("Brisel je glavni grad:", "Belgije", "Luksemburga", "Holandije", "Farskih Ostrva", ""));
        Geo.add(new Pitanje("Grčki naučnik (poznat kao \"otac geografije\") koji je u III stoljeću p.n.e. prvi upotrijebio riječ geografija je", "Eratosten", "Aristotel", "Al-Biruni", "Humboldt", ""));
        Geo.add(new Pitanje("Planeta Zemlja u toku jednog sata okrene se oko svoje ose za", "15°", "5°", "10°", "20°", "Zapamtite: krug ima 360 stepeni, dan 24 sata. 360/24=15"));
        Geo.add(new Pitanje("Najviša tačka na Zemlji je na Mount Everestu i njena nadmorska visina iznosi", "8848m", "7748m", "8223m", "9010m", ""));
        Geo.add(new Pitanje("U BiH su zastupljeni sljedeći tipovi klime", "mediteranska, umjereno – kontinentalna i planinska", "planinska, polupustinjska i suptropska", "ekvatorijalna, atlantska i polarna", "atlantska, mediteranska i kontinentalna", ""));
        Geo.add(new Pitanje("Kanbera je glavni grad", "Australije", "Novog Zelanda", "Kanade", "Bahama", "Nije Sidnej :D"));
        Geo.add(new Pitanje("Najzastupljeniji tip klimata u našoj zemlji je", "Cfb umjereno topli vlažni klimat sa toplim ljetom", "Cfa umjereno topli vlažni klimat sa žarkim ljetom", "Cfc umjereno topli vlažni klimat sa svježim ljetom", "Csa mediteranski klimatski tip", ""));
        Geo.add(new Pitanje("Geografska širina može biti:", "sjeverna i južna. Najmanju geografsku širinu imaju tačke koje leže na ekvatoru(0), dok polovi imaju najveću geografsku širinu(90)", "istočna i zapadna. Najmanju geografsku širinu imaju tačke koje leže na ekvatoru(0), dok polovi imaju najveću geografsku širinu(180)", "istočna, zapadna, sjeverna i južna. Najmanju geografsku širinu imaju tačke koje leže na ekvatoru(0), dok polovi imaju najveću geografsku širinu(360)", "sjeverna i južna. Najmanju geografsku širinu imaju tačke koje leže na početnom meridijanu(0),dok polovi imaju najveću geografsku širinu(270)", ""));
        Geo.add(new Pitanje("Monsuni su", "vjetrovi koji pušu s kopna na more i obrnuto, a mijenjaju smjer dva puta godišnje", "vjetrovi koji pušu okeanskim prostorima, a dijele se na tople i hladne", "periodični vjetrovi koji se javljaju na svim dijelovima Zemlje, a dijele se na slabe i jake", "jaki vjetrovi koji pušu iz prostora sjeverne Afrike, a mogu biti vlažni i suhi", ""));
        Geo.add(new Pitanje("Dinaridi u Bosni i Hercegovini imaju pravac pružanja", "sjeverozapad - jugoistok", "sjever - jug", "jugozapad - sjeveroistok", "zapad - istok", ""));
        Geo.add(new Pitanje("U (- 4) vremenskoj zoni (zapadno od Greenwich-a) je 12 sati zonskog vremena.   Koliko je sati u Bosni i Hercegovini (1. zona istočno od Greenwich-a)?", "17 sati", "18 sati", "10 sati", "9 sati", "Ako je u -4 zoni 12 sati, u Greenwichu je 16:00. BiH je sat vremena ispred Greenwicha, prema tome 17:00"));
        Geo.add(new Pitanje("Na horizontu Sydneja, 22.06. nastupa:", "zima", "jesen", "ljeto", "proljeće", "Na južnoj hemisferi su godišnja doba obrnuta od sjeverne, kad je na sjevernoj ljeto, na južnoj je zima"));
        Geo.add(new Pitanje("Na horizontu Sydneja, 21.03. nastupa", "jesen", "proljeće", "Ljeto", "zima", "Na južnoj hemisferi su godišnja doba obrnuta od sjeverne, kad je na sjevernoj proljeće, na južnoj je jesen"));
        Geo.add(new Pitanje("Na karti razmjere 1:100 000 izmjerena je dužina od 5cm. Kolika je njezina dužina u prirodi?", "5 000 m", "500 000 m", "50 000 m", "nemoguće je ovo izračunati", "Razmjera 1:100000 znači da su predmeti na slici 100 hiljada puta manji nego u stvarnosti. 500 000 centimetara je 5000 metara"));
        Geo.add(new Pitanje("Travna oblast na Zemlji je", "prerije", "selvasi", "ergovi", "hamade", "Selvasi su vlažne ekvatorijalne šume, ergovi su ravna područja u pustinjama prekrivena pješčanim dinama, a hamade su kamenite pustinje"));
        Geo.add(new Pitanje("Mineralna sirovina je ", "bakar", "pamuk", "vuna", "drvo", ""));
        Geo.add(new Pitanje("Rudnik željezne rude u BiH nalazi se u", "Ljubija", "Breza", "Vlasenica", "Banovići", "U Brezi i Banovićima je rudnik mrkog uglja, a u Vlasenici je rudnik boksita"));
        Geo.add(new Pitanje("Slivu Atlantskog okeana pripada", "Rajna", "Volga", "Rona", "Po", "Rona se ulijeva u Sredozemno more, Po u Jadransko more, a Volga u Kaspijsko jezero"));
        return Geo;
    }

    private ArrayList<Pitanje> getInf() {
        ArrayList<Pitanje> Inf = new ArrayList<>();
        Inf.add(new Pitanje("Koji je od navedenih zadataka funkcija operacijskoga sistema?", "Upravljanje datotekama", "Dodavanje podataka u tabelarni kalkulator", "Kreiranje izveštaja iz baze podataka", "Stvaranje prezentacije", "Ostalim navedenim operacijama se bavi aplikativni softver"));
        Inf.add(new Pitanje("Cache memorija je ", "skrivena memorija znatno manjeg kapaciteta od kapaciteta radne memorije", "skrivena memorija malog kapaciteta na strani radne memorije", "softverska tehnika za ubrzavanje pristupa radnoj memoriji", "programeru dostupna memorija manjeg kapaciteta", "U cache memoriju se čuvaju podaci koji se često koriste tako da se budući zahtjevi za tim podacima izvršavaju brže"));
        Inf.add(new Pitanje("Binarni zapis decimalnog broja 13 je:", "1101", "1011", "1003", "1111", "drawable_inf_1"));
        Inf.add(new Pitanje("Koliko nаjmаnje (umreženih) rаčunаrа čini rаčunаrsku mrežu?", "dva", "pet", "od pet do petnaest", "preko petnaest", ""));
        Inf.add(new Pitanje("U centralnu memoriju kompjutera ne spada: ", "PROMOTZ", "RAM", "ROM", "PROM", "RAM – random access memory, ROM – read only memory, PROM – programmable read only memory, PROMOTZ ne postoji \uF04A"));
        Inf.add(new Pitanje("Koliko bajta sadrži jedan kilobajt:", "1024 bajta", "Hiljadu bajta ", "Milion bajta", "512 bajta", ""));
        Inf.add(new Pitanje("Kada na kompjuteru vidim fajl koji ima nastavak .jpg znam da se radi o", "O slici", "Dokumentu rađenom u Wordu", "Dokumentu rađenom u MS Access-u", "O pjesmi", "Neki od nastavaka za slikovne fajlove: png, jpg, jpeg, bmp, tif"));
        Inf.add(new Pitanje("\"Calculator“ je program iz Windows-a koji služi za", "Računanje", "Pisanje", "Crtanje", "Tabelarne proračune", "Calculator znači digitron"));
        Inf.add(new Pitanje("Microsoft Word je", "Program za obradu teksta", "Program za proračunske tablice", "Program za grafički dizajn", "Program za kreiranje i prikaz prezentacija", ""));
        Inf.add(new Pitanje("Kompjuter u osnovi radi na slijedećem brojnom sistemu", "binarnom", "mašinskom", "oktalnom", "heksadekadnom", ""));
        Inf.add(new Pitanje("U kojim se jedinicama mjeri količina memorije", "Bajtima", "Pikselima", "bitima", "Vektorima", ""));
        Inf.add(new Pitanje("Kada na kompjuteru vidim fajl koji ima nastavak .mp3 znam da se radi o:", "pjesmi", "slici", "filmu", "Word dokumentu", ""));
        Inf.add(new Pitanje("© -  Kada vidite  ovakav znak i da pored njega piše Copyright, onda znate da   se to  odnosi na", "Zaštitu autorskih prava", "Zaštitni znak neke kompanije", "Poznatu svjetsku marku", "Web adresu", ""));
        Inf.add(new Pitanje("Corel je", "Program za grafički dizajn", "Program za proračunske tablice", "Program za kreiranje i prikaz prezentacija", "Program za pregled web stranica", ""));
        Inf.add(new Pitanje("Zaokružiti šta ne spada u osobine kompjutera", "Pouzdanost", "Brzina", "Inteligencija", "Tačnost", ""));
        Inf.add(new Pitanje("U izlaznu jedinicu kompjutera ne spada jedan od slijedećih dijelova. Koji?", "Mikrofon", "Monitor", "Štampač", "Ploter", "Mikrofon je ulazna jedinica"));
        Inf.add(new Pitanje("Zaokružiti šta ne spada u osobine kompjutera", "Repetitivnost - ponavljanje", "Brzina", "Inteligencija", "Tačnost", ""));
        Inf.add(new Pitanje("Osnovna jedinica za memoriju kompjutera je", "Bit", "Pixel", "Hard Disk", "Zip disk", ""));
        Inf.add(new Pitanje("Koji od ovih brojeva je najveći?", "121(10)", "1111000(2)", "167(8)", "76(16)", "Najbolji pristup ovom zadatku je da sve brojeve pretvorimo u dekadni sistem. \n" +
                "76(16)= 6*160+7*161=6+112= 118\n" +
                "111000(2)=0*20+0*21+0*22+1*23+1*24+1*25+1*26=0+0+0+8+16+32+64= 120\n" +
                "167(8)=7*80+6*81+1*82=7+48+64= 119\n" +
                "121 je već  u dekadnom sistemu i on je najveći broj\n"));
        Inf.add(new Pitanje("Kolika mora biti najveća vrijednost varijable Y u dijelu programa da bi se riječ MATURA ispisala na ekranu tačno 5 puta? While y<=10 Do \n{izlaz („MATURA“); \ny=y+3}", "-2", "-5", "0", "1", "Početna vrijednost: y=-2 => ispisuje se MATURA\n" +
                "Poslije prvog kruga: y=1 => ispisuje se MATURA\n" +
                "Poslije drugog kruga: y=4 => ispisuje se MATURA\n" +
                "Poslije trećeg kruga: y=7 => ispisuje se MATURA\n" +
                "Poslije četvrtog kruga: y=10 => ispisuje se MATURA\n" +
                "Poslije petog kruga: y=13; petlja se završava\n"));
        Inf.add(new Pitanje("Baze oktalnog i heksadecimalnog brojnog sistema su", "8 i 16", "8 i 2", "2 i 10", "8 i 10", ""));
        Inf.add(new Pitanje("Kojem broju decimalnog brojnog sistema odgovara broj 3E(16) ?", "62", "58", "36", "57", "E u heksadekadnom sistemu predstavlja broj 14.\nPrema tome: 15*160+3*161=14+48=63"));
        Inf.add(new Pitanje("Ispis „sloj po sloj“ karakteristika je", "ink jet pisača/ printera", "matričnog pisača/ printera", "laserskog pisača/ printera", "3D pisača/ printera", ""));
        Inf.add(new Pitanje("Koja od sljedećih jednakosti je istinita?", "1AF(16)=657(8)", "1AF(16)=110100111(2)", "1AF(16)=430(10)", "1AF(16)=431(8)", ""));
        Inf.add(new Pitanje("Koje vrijednosti će sadržavati varijable a i b nakon izvođenja algoritma\na=7,b=10\na=a+b\nb=a-b\na=a-b", "a = 10; b = 7", "a = 17; b = 7", "a = 10; b = 17", "a = 7;  b = 10", "a=7+10 = 17\n" +
                "b=17-10 = 7\n" +
                "a=17-7 = 10\n" +
                "a= 10, b=7 (ovo je algoritam za zamjenu varijabli)\n"));
        Inf.add(new Pitanje("Koja od navedenih jedinica jeste glavna ili interna memorija  računara", "RAM", "Disketa", "Tvrdi disk", "Optički disk", ""));
        Inf.add(new Pitanje("Štampač ili pisač je vrsta koje jedinice računara", "Izlazna jedinica", "Ulazna jedinica", "upravljačka jedinica", "memorijska jedinica", ""));
        Inf.add(new Pitanje("U MS Word programu opcije <<Save, Save As>>  se nalaze  u meniju", "File", "Edit", "tools", "format", ""));
        Inf.add(new Pitanje("Program Power Point kao dio MS Office programa je po svojoj namjeni", "Program za kreiranje prezentacija", "Program za tablične proračune", "sistemski softver", "Program za obradu teksta", ""));
        return Inf;
    }

    private ArrayList<Pitanje> getHistory() {
        ArrayList<Pitanje> History = new ArrayList<>();
        History.add(new Pitanje("Kojoj grupi plemena pripadaju Desidijati, Autarijati, Daorsi, Japodi :", "Iliri", "Germani", "Slaveni", "Kelti", ""));
        History.add(new Pitanje("Reformator crkve u Njemačkoj bio je", "Martin Luter", "Cvingli", "Toma Akvinski", "Žan Kalvin", "Martin Luter je bio osnivač hrišćanske protestantske (luteranske) crkve u Nemačkoj i jedan od vođa reformacije"));
        History.add(new Pitanje("Teoriju relativiteta razvio je: ", "Albert Ajnštajn", "Nikola Tesla", "Tomas Edison", "Stiv Džobs", ""));
        History.add(new Pitanje("Kako se zvala vladarska dinastija u srednjovjekovnoj Bosni:", "Kotromanići", "Izetbegovići", "Kosače", "Nemanjići", "Dinastiju je osnovao ban Prijezda"));
        History.add(new Pitanje("Atlansku povelju potpisali su Ruzvelt i Čerčil na brodu Princ od Velsa", "1941", "1940", "1939", "1942", "Atlantska povelja je sadržavala četiri, takozvana, Rooseveltova pravila koja je iste godine objavio u Povelji o četiri slobode: misli, vjere, od bijede i od straha. S Churchillom je potpisao i Zakon o zajmu i najmu kojim je omogućio američku pomoć u borbi protiv Sila Osovine. Atlanska povelja značila je začetak Ujedinjenih naroda."));
        History.add(new Pitanje("Dan državnosti u Bosni i Hercegovini obilježava se:", "25. novembar", "1. mart", "9. maj", "2. oktobar", ""));
        History.add(new Pitanje("U toku Narodnooslobodilačke borbe 1941-1945 godine pisali su i književnici  iz Bosne i Hercegovine. Jedan od njih je:", "Skender Kulenović", "Miroslav Krleža", "Franc Prešern", "Vladimir Nazor", "Kulenović u ratu piše poeme i uređuje listove (Bosanski udarnik, Glas, Oslobođenje)"));
        History.add(new Pitanje("Jedna od osnivača Pokreta nesvrstanih bila je:", "Jugoslavija", "Njemačka", "Argentina", "Italija", "„Zemlje osnivači“ su bili Jugoslavija, Indija i Egipat"));
        History.add(new Pitanje("Drugi svjetski rat završen je:", "1945.", "1946.", "1944.", "1943.", "Drugi svjetski rat je završen kapitulacijom Japana 1945. godine"));
        History.add(new Pitanje("Treće zasjedanje ZAVNOBiH-a održano je:", "6. aprila 1945. u Sarajevu", "5-26. novembra 1943. u Varcar Vakufu", "30. juna-2. jula 1944. u Sanskom Mostu", "29. novembra 1943. godine u Jajcu", ""));
        History.add(new Pitanje("Dejtonski mirovni sporazum za Bosnu i Hercegovinu, ratificiran je u Parizu", "14. decembra 1995. godine", "01. marta, 1995. godine", "06. aprila, 1995. godine", "25. novembra, 1945. godine", ""));
        History.add(new Pitanje("Prvi svjetski rat završen je", "1918.", "1917.", "1919.", "1915.", "Prvi svjetski rat je završen 11.11.1918. porazom Njemačke"));
        History.add(new Pitanje("Drugo zasijedanje AVNOJ-a održano je u", "Jajcu", "Bihaću", "Sarajevu", "Mrkonjić Gradu", ""));
        History.add(new Pitanje("Referendum za suverenu i nezavisnu Bosnu i Hercegovinu održan je", "29. februara i 1. marta 1992. god.", "1. maja 1991. god.", "22. maja 1994. god.", "2.maja 1995. god.", ""));
        History.add(new Pitanje("Drugi svjetski rat počeo je napadom Njemačke na Poljsku", "1. septembra 1939. god.", "1. oktobra 1939. god.", "6. aprila 1941. god.", "6. aprila 1940. god.", ""));
        History.add(new Pitanje("Kolijevkom nacizma smatra se", "Njemačka", "Austro-Ugarska", "Japan", "Italija", ""));
        History.add(new Pitanje("Prvo zasijedanje ZAVNOBiH-a održano je", "25. novembra 1943. god.", "29. novembra 1943  god.", "25. novembra 1942 god.", "25. oktobra 1943. god.", ""));
        History.add(new Pitanje("Dan nezavisnosti Bosne i Hercegovine obilježava se", "1. marta", "29. novembra", "25 novembra", "1. aprila", "Dan nezavisnosti se obilježava na dan održavanja referenduma za nezavisnost BiH od Jugoslavije"));
        History.add(new Pitanje("Grad Rim su osnovali", "Romul i Rem", "Etruščani", "Gali", "latini", "Prema legendi, grad Rim su 756. pne osnovali Romul i Rem"));
        History.add(new Pitanje("Najstariji  poznati stanovnici današnje Bosne i Hercegovine", "Iliri", "Gali", "Goti", "Slaveni", "Iliri su naseljavali prostor današnje BiH sve do dolaska Slavena"));
        History.add(new Pitanje("Povelja bana Kulina izdata je", "1189.", "1203.", "1180.", "1199.", "Tačan datum 29.08.1189."));
        History.add(new Pitanje("Martin Luter je bio inicijator reforme crkve u", "njemačkoj", "holandiji", "Engleskoj", "Belgiji", ""));
        History.add(new Pitanje("Prve Olimpijske igre održane su", "776. pne", "779. pne", "777. pne", "771. pne", "Antičke olimpijske igre su se održavale u Olimpiji, a prve su održane 776. pne"));
        History.add(new Pitanje("Osmanlije su dovršile osvajanje Hercegovine godine", "1482.", "1493.", "1463.", "1459.", "Bosansko kraljevstvo je palo 1463. ali je Osmanlijama trebalo još 19 godina da dovrše osvajanje Hercegovine"));
        History.add(new Pitanje("Najpoznatiji ustanak Ilira protiv rimske vladavine bio je Batonov ustanak, koji je trajao:", "od 6. do 9.  n.e", "od 6. do 10. n.e", "od 5. do 10. n.e", "od 2. do 10. n.e.", "Batonov ustanak (Bellum Batonianum) ili Veliki ilirski ustanak, je bio najveći vojni sukob između nekoliko ilirskih plemena i antičkog Rima koji je trajao četiri godine"));
        History.add(new Pitanje("Najpoznatija ilirska kraljica zvala se", "Teuta", "jelena", "silvana", "dijana", "Teuta je bila ilirska kraljica koja je vladala od 231. p. n. e. do 228. p. n. e."));
        History.add(new Pitanje("Osnovni oblik zemljišnog posjeda u srednjovjekovnoj Bosni je:", "baština", "pronija", "beneficij", "leno", ""));
        History.add(new Pitanje("Habsburška vojska pod vođstvom Eugena Savojskog prodrla je do Sarajeva i zapalila ga godine:", "1697.", "1683.", "1684.", "1699.", ""));
        History.add(new Pitanje("Aneksija BiH je izvršena", "1908.", "1910.", "1906.", "1878.", "Austro-Ugarska je 1878. okupirala Bosnu i Hercegovinu a 1908. je izvršila aneksiju"));
        History.add(new Pitanje("Danas se u svijetu, kao Dan pobjede nad fašizmom,obilježava", "9. maj", "15. maj", "6. april", "2. septembar", "Za dan pobjede nad fašizmom se uzima datum kapitulacije Njemačke u Drugom svjetskom ratu"));
        History.add(new Pitanje("Deklaracija o pravima građana BiH donešena je na", "Drugom zasijedanju ZAVNOBiH-a", "Prvom zasijedanju ZAVNOBiH -a", "Trećem zasijedanju ZAVNOBiH-a", "Drugom zasjedanju AVNOJ-a", ""));
        History.add(new Pitanje("Bosna i Hercegovina je svoju prvu Narodnu vladu dobila 1945. godine, a njen prvi predsjednik je bio:", "Rodoljub Čolaković", "Zaim Šarac", "Ivan Ribar", "Josip Broz Tito", ""));
        return History;
    }

    private ArrayList<Pitanje> getPhilosophy() {
        ArrayList<Pitanje> Philosophy = new ArrayList<>();
        Philosophy.add(new Pitanje("Kako se naziva krajnje empirističko gledište koje smatra da je izvor svih naših spoznaja isključivo osjetilno iskustvo?", "senzualizam", "iracionalizam", "misticizam", "empirizam", ""));
        Philosophy.add(new Pitanje("Izvorno značenje riječi filozofija je", "ljubav spram mudrosti", "nauka", "mudrost", "istraživanje", "Riječ je nastala od grčkih riječi phylos, što znači voljeti i sophia, što znači mudrost"));
        Philosophy.add(new Pitanje("Kako glasi poznata Marksova \"11 teza o Fojerbahu\" ?", "\"Filozofi su različito tumačili svijet, a radi se o tome da se svijet promjeni\"", "\"Filozofi su različito tumačili svijet, a radi se o tome da se svijet  spozna\"", "\"Filozofi su slično tumačili svijet, a radi se o tome da se svijet promijeni\"", "\"Filozofi su samo tumačili svijet, a radi se o tome da se svijet prilagodi čovjeku\"", ""));
        Philosophy.add(new Pitanje("Empirizam uči da je", "bezumna volja iznad razuma", "razum izvor svih naših znanja", "sumnja put do istine", "ideja izvor naše spoznaje", "Empirizam zastupa stav da je iskustvo osnovni izvor spoznaje i da joj ono određuje domet, mogućnosti i granice"));
        Philosophy.add(new Pitanje("Osnovna metoda koju Bejkn zagovara u svom učenju je metoda:", "Indukcije", "generalizacija", "sinteze", "analize", ""));
        Philosophy.add(new Pitanje("U Platonovoj teoriji o državi, šta je temelj svakog društva?", "pravičnost", "iskrenost", "poslušnost", "dobrota", ""));
        Philosophy.add(new Pitanje("Praktičnim filozofskim disciplinama pripada", "Etika", "Gnoseologija", "Ontologija", "Metafizika", ""));
        Philosophy.add(new Pitanje("Fridrih Niče je svojim učenjem izricao kritiku prema", "Zapadno-evropskoj kulturi", "Umjetnosti tragedije", "Iracionalističkoj filozofiji", "Svjetskoj politici", ""));
        Philosophy.add(new Pitanje("Hegel je u povijesti filozofije slavna ličnost. Spočitano mu je da se njegov filozofski sistem ne podudara sa činjenicama. Šta je Hegel na to odgovorio?", "Utoliko gore po činjenice", "Ovdje se ne govori o činjenicama", "Činjenice nisu bitne", "Čin prethodi činjenici", ""));
        Philosophy.add(new Pitanje("Materijalizam je ontološka koncepcija koja uči da je:", "materija primarna a svijest, ideja, duh su sekundarni, izvedeni", "materija duhovnog porijekla", "ideja primarna a materija izvedena, sekundarna", "bitak bića jedinstven u svojoj osnovi", ""));
        Philosophy.add(new Pitanje("Filozofija u Srednjem vijeku poprima karakter:", "služavke teologije", "istraživačke djelatnosti", "proučavanja čovjeka", "racionalističke filozofije", ""));
        Philosophy.add(new Pitanje("Spoznajnu moć koja prekoračuje granice iskustva i zapada u antinomije Kant naziva", "razum", "percepcija", "mišljenje", "um", ""));
        Philosophy.add(new Pitanje("Ontologija ili opća metafizika je", "Spoznajna teorija", "učenje o porijeklu izvijesnosti i dosegu ljudske spoznaje", "Filozofija umjetnosti", "učenje o bitku bića", ""));
        Philosophy.add(new Pitanje("Islamski mislilac koji je bio najveći komentator Aristotelove filozofije zvao se", "Ibn Sina", "Ibn Rušd", "Al-Gazali", "Al-Farabi", ""));
        Philosophy.add(new Pitanje("U Fihteovoj filozofiji apsolutnog idealizma gdje JA postavlja NE-JA, svijet je shvaćen kao čin", "svijesti", "savjesti", "prirode", "morala", ""));
        Philosophy.add(new Pitanje("Estetika je filozofska disciplina koja raspravlja o", "lijepom u umjetnosti i u prirodi", "dobru i zlu", "lijepom ponašanju", "vjerovanju kao putu do istine", ""));
        Philosophy.add(new Pitanje("U Dekartovoj „ Raspravi o metodi“, navode se", "četiri pravila metode", "dva pravila metode", "tri pravila metode", "šest pravila metode", ""));
        Philosophy.add(new Pitanje("Postoji samo jedna supstancija: Bog ili priroda. Supstancija i sama beskonačna, ima beskonačno mnogo atributa, a čovjek može spoznati samo dva, protežnost i mišljenje- mišljenje je novovjekovnog filozofa", "Spinoze", "Dekarta", "Lajbnica", "Loka", ""));
        Philosophy.add(new Pitanje("Džon Lok je utemeljio", "spoznajnu teoriju (gnoseologiju)", "ontologiju", "etiku", "novovjekovnu filozofiju", ""));
        Philosophy.add(new Pitanje("Dva osnovna problema srednjevjekovne filozofije su", "problem odnosa vjere i uma i problem univerzalija", "problem čovjeka i prirode", "problem odnosa vjere i uma i problem čovjeka", "problem univerzalija i problem apologije vjere", ""));
        Philosophy.add(new Pitanje("Temeljna težnja Kozmološkog razdoblja grčke filozofije je da se ispita", "temeljni princip postojanja", "problem ljudske prakse", "problem moralnog djelovanja", "društvo", ""));
        Philosophy.add(new Pitanje("Apriorni oblici razuma za Kanta su", "kategorije", "percepcije", "ideje", "antinomije", ""));
        Philosophy.add(new Pitanje("Ontološka koncepcija monizam uči", "jedan je temelj svijeta", "bitak je materijalan", "ideja je bitak bića", "monolog kao temeljni odnos svijesti i svijeta", ""));
        Philosophy.add(new Pitanje("Pored Đordana Bruna, zagovornik panteizma u novovekovnoj filozofiji bio je", "Baruh de Spinoza", "Rene Dekart", "Imanuel Kant", "Frensis Bekon", ""));
        return Philosophy;
    }

    private ArrayList<Pitanje> getPsychology() {
        ArrayList<Pitanje> Psychology = new ArrayList<>();
        Psychology.add(new Pitanje("Veza između dva neurona zove se", "sinapsa", "neuronska", "klavikula", "motorna", ""));
        Psychology.add(new Pitanje("Frojd tumači da se ličnost sastoji iz tri segmenta ličnosti, i to:", "Id, ego, superego", "Ego, id, ono", "Tanatos, eros, id", "Mašta, svijest, savjest", ""));
        Psychology.add(new Pitanje("Broj sadržaja koje istovremeno možemo obuhvatiti odnose se na:", "Obim pažnje", "Pokretljivost pažnje", "Trajanje pažnje", "Fluktuaciju pažnje", ""));
        Psychology.add(new Pitanje("Praćenje jedne loše navike kao (npr. prekomjerno trošenje kredita) možemo pratiti sljedećom metodom:", "Ekstrospektivnom ili posmatranjem", "- Introspektivnom ili samoposmatranjem", "Eksperimentalnom", "Sociometrijskim postupkom", ""));
        Psychology.add(new Pitanje("Kada smo suočeni sa događajima koje ne možemo staviti pod kontrolu i koji ugrožavaju naš integritet, tada govorimo o:", "frustraciji", "konfliktu", "stresu", "sukobu motiva", ""));
        Psychology.add(new Pitanje("Humor, fizička relaksacija, upoznavanje vlastitih emocija pomažu nam u sopstvenoj:", "kontroli emocija", "bijegu od stvarnosti", "budućnosti", "hedonizmu", ""));
        Psychology.add(new Pitanje("Mašta je najčešća u doba:", "Djetinjstva", "adolescencije", "Srednjeg doba", "Starosti", ""));
        Psychology.add(new Pitanje("Kada smo sretni, opušteni, zadovoljni, ponosni, vedri tada govorimo o emociji", "Radosti", "Ljubomore", "Straha", "Zavisti", ""));
        Psychology.add(new Pitanje("Pojava kojom mi na temelju jedne osobine, koja nam se sviđa ili ne, stvaramo sud o čitavu čovjeku naziva se:", "Halo Efekat", "Potkrepljenje", "Temperament", "Karakter", ""));
        Psychology.add(new Pitanje("Oblik interpersonalnog ponašanja kada pojedinac popušta pritisku grupe u suđenju ili akciji, što proizilazi iz sukoba vlastitog mišljenja i onoga koje zastupa grupa predstavlja:", "Konformizam", "Altruizam", "Stav", "Grupu", ""));
        Psychology.add(new Pitanje("Empatija je", "Suosjećanje, odnosno uživljavanje u psihičko stanje jedne osobe", "Sebična ljubav", "Zavist", "Stid", ""));
        Psychology.add(new Pitanje("Složeni psihički procesi koji odražavaju naš odnos prema stvarima, ljudima, bićima, predmetima, pojavama, događajima, prema nama samima, našim aktivnostima i postupcima su:", "Emocije", "Predstave", "Iluzije", "Mašta", ""));
        Psychology.add(new Pitanje("U procesu mišljenja otkrivamo", "Veze i odnose", "predmete i pojave", "Suštinska pitanja", "općenitost", ""));
        Psychology.add(new Pitanje("Šta označava temperament?", "Označava način i karakteristiku emocionalnog reagovanja", "Označava moralne norme", "Ponašanje pojedinca", "Slobodno djelovanje", ""));
        Psychology.add(new Pitanje("Šta je osjet ?", "Zapažanje pojedinih svojstava objekta", "Spoznaja cjelovitog objekta opažanja", "Kvalitet draži", "Intelektualni proces", ""));
        Psychology.add(new Pitanje("Testovi inteligencije mogu biti", "Verbalni i neverbalni", "Kreativni", "Slikovni", "Motorni", ""));
        Psychology.add(new Pitanje("Sposobnost da se obnove sadržaji koje smo ranije učili predstavlja", "Pamćenje", "Učenje", "Mišljenje", "Motivaciju", ""));
        Psychology.add(new Pitanje("Hijerarhiju motiva predstavio je piramidom potreba", "A.Maslow", "K.G.Jung", "J.Piaget", "S.Frojd", ""));
        Psychology.add(new Pitanje("Preduslovi za uspješno obavljanje poslova i aktivnosti su", "Sposobnosti", "Učenje", "Navike", "Interesi", ""));
        Psychology.add(new Pitanje("Najpoznatija tipologija ličnosti je", "Jungova", "Pavlovljeva", "Gilfordova", "Frojdova", ""));
        Psychology.add(new Pitanje("Predstave su", "Reprodukcija ranijih opažanja", "Stanje potpune koncentracije", "Polje iluzije", "Urođeni refleks", ""));
        Psychology.add(new Pitanje("Čulni organi koji primaju podražaj iz vanjske sredine ili samog organizma zovu se:", "Receptori", "Centri", "Čula", "Efektori", ""));
        Psychology.add(new Pitanje("Cilj, potreba, osjećaj, želja, aktivnost- navedeni  pojmovi govore nam o:", "Motivacionom ciklusu", "Osjećanjima", "Ravnoteži", "Vezi između osjećanja i aktivnosti", ""));
        Psychology.add(new Pitanje("Transfer je jedna od najvažnijih pojava u psihologiji učenja i može biti", "Pozitivan i negativan", "Pozitivan i neutralan", "Aktivni i pasivni", "Negativan i trajan", ""));
        Psychology.add(new Pitanje("Vrste inteligencije su", "Apstraktna, socijalna, konkretna", "Apstraktna, primarna", "Fiziološka, tjelesna, konkretna", "Emocionalna, sekundarna", ""));
        return Psychology;
    }

    private ArrayList<Pitanje> getLogic() {
        ArrayList<Pitanje> Logic = new ArrayList<>();
        Logic.add(new Pitanje("Zaokruži tačan odgovor: ", "Pojam je misao o biti onoga što mislimo ", "Pojam je značenje riječi koju izgovaramo", "Pojam je značenje riječi koju izgovaramo", "Pojam je bit o misli onoga što mislimo", ""));
        Logic.add(new Pitanje("Zaokruži tačan odgovor:", "Sud je skup pojmova kojima se nešto tvrdi ili poriče", "Sud je rečenica kojom se nešto iskazuje", "Sud je rečenica kojom se nešto izjavljuje", "Sud je pojam kojim se utvrđuje značenje", ""));
        Logic.add(new Pitanje("Zaokruži tačan odgovor:", "Definicija je sud kojim se nedvosmisleno utvrđuje sadržaj nekog pojma", "Definicija je skup pojmova kojima se izražava značenje riječi", "Definicija je skup pojmova kojima se nedvosmisleno utvrđuje opseg", "Definicija je skup pojmova kojima se utvrđuje značenje suda", ""));
        Logic.add(new Pitanje("Posredan zaključak je zaključak koji se sastoji od: ", "Najmanje tri ili više drugih sudova", "Najmanje jednog ili više drugih sudova", "Najmanje dva ili više drugih sudova", "Najmanje četiri uli više drugih sudova", ""));
        Logic.add(new Pitanje("Divizija je: ", "Logički postupak kojim se utvrđuje opseg nekog pojma", "Sud kojim se nedvosmisleno određuje sadržaj jednog pojma", "Logički postupak kojim se utvrđuje opseg suda", "Sud kojim se iskazuje način formiranja pojmova", ""));
        Logic.add(new Pitanje("Šta su negativni pojmovi?", "To su pojmovi kojima se misli na odsustvo pozitivnih osobina", "To su pojmovi kojim se misli na negativne predmete", "To su pojmovi kojima se misli na negativan opseg i odsustvo negativnih  osobina", "To su pojmovi kojima nam nije poznat sadržaj", ""));
        Logic.add(new Pitanje("Šta je teorija imanencije?", "Teorija po kojoj je bit svakog suda u imanentnosti sadržaja predikata sadržaju subjekta", "Teorija po kojoj je bit svakog suda u supsumiranju opsega subjekta pod opseg suda", "Teorija po kojoj je bit svakog suda u supsumiranju opsega subjekta pod opseg predikata", "Teorija suda koja ukazuje na to da se svaki sud nužno sastoji od subjekta i predikata", ""));
        Logic.add(new Pitanje("Kakvi su to subkontrarni sudovi?", "Dva suda od kojih je jedan partikularno-afirmativan a drugi partikularnonegativan koji imaju isti subjekat i predikat isti kvantitet a raztličit kvalitet", "Dva suda od kojih je jedan univerzalno-afirmativan a drugi partikularnonegativan koji imaju isti subjekat i predikat isti kvantitet a raztličit kvalitet", "Dva suda koji imaju isti subjekat i predikat a razlukuju se i po kvantitetu i po kvalitetu", "To su sudovi do kojih se dođe postupkom zaključivanja", ""));
        Logic.add(new Pitanje("Zaokruži tačan odgovor", "Deduktivan je zaključak kojim se iz opštih premisa izvodi posebna konkluzija", "Deduktivan je zaključak kojim se iz opštih premisa izvodi opšta konkluzija", "Deduktivan je zaključak kojim se iz posebnih premisa izvodi posebna konkluzij", "Deduktivan je zaključak kojim se iz opštih konkluzija izvodi posebna premisa", ""));
        Logic.add(new Pitanje("Zaokruži tačan odgovor", "Sudovi kojima tvrdimo da nešto nužno jeste onako kako jeste nazivamo apodiktičkim", "Sudovi kojima tvrdimo da nešto nužno jeste onako kako jeste nazivamo asertoričkim", "Sudovi kojima tvrdimo da nešto nužno jeste onako kako jeste nazivamo problematičkim", "Sudovi kojima tvrdimo da nešto nužno jeste onako kako jeste nazivamo hipotetičkim", ""));
        Logic.add(new Pitanje("Zaokruži tačan odgovor", "Sud čija se istinitost dokazom utvrđuje naziva se tvrdnja ili teza", "Sud čija se istinitost dokazom utvrđuje naziva se argument", "Sud čija se istinitost dokazom utvrđuje naziva se konkluzija", "Sud čija se istinitost dokazom utvrđuje naziva se premisa", ""));
        Logic.add(new Pitanje("Osnivačem logike u staroj Grčkoj smatra se", "Aristotel", "Platon", "Sokrat", "Heraklit", ""));
        Logic.add(new Pitanje("Zaokruži tačan odgovor", "Deduktivan zaključak je kojim se iz općih premisa izvodi posebna konkluzija", "Deduktivan je zaključak kojim se iz općih premisa izvodi opća konkluzija", "Deduktivan zaključak je u kojem se iz općih premisa izvodi posebna premisa", "Deduktivan zaključak je u kojem se iz posebnih  premisa izvodi posebna konkluzija", ""));
        Logic.add(new Pitanje("Zaokruži tačan odgovor", "Identični pojmovi su pojmovi koji imaju isti sadržaj i isti opseg", "Identični pojmovi su pojmovi koji imaju djelimično isti sadržaj i opseg", "Identični pojmovi su pojmovi koji imaju suprotan sadržaj", "Identični pojmovi su pojmovi koji imaju različit opseg a isti sadržaj", ""));
        Logic.add(new Pitanje("Zaokruži tačan odgovor:", "Silogizam je posredni deduktivan zaključak koji se sastoji od dvije premise", "Silogizam je posredni deduktivan zaključak koji se sastoji od dvije ili više premisa", "Silogizam je posredni deduktivan zaključak koji se sastoji od tri ili više premisa", "Silogizam je posredni deduktivan zaključak koji se sastoji od jedne ili više premisa", ""));
        Logic.add(new Pitanje("Šta je vulgarnomaterijalistička teorija pojma?", "To je teorija po kojoj je pojam misaoni odraz bitnih svojstava materijalnih stvari", "To je teorija po kojoj je pojam veza među sudovima", "Teorija po kojoj je bit svakog suda u supsumiranju opsega subjekta pod opseg suda", "To je teorija po kojoj je pojam elemenat zaključka", ""));
        Logic.add(new Pitanje("Šta su partikularni pojmovi?", "To su pojmovi kojima mislimo samo neke članove klase o kojoj mislimo", "To je pojam čiji nam je doseg nepoznat", "To su pojmovi kojima mislimo samo na određene članove klase, čitavu klasu ali ne znamo koje", "To su pojmovi kojima mislimo na neodređene članove klase.", ""));
        Logic.add(new Pitanje("Kakvi su to neposredni zaključci?", "To su zaključci koji se sastoje od samo dva suda", "To je zaključak koji se sastoji od najmanje tri ili više sudova", "To je zaključak u kojem se iz općenite premise izvodi općenita konkluzija", "Premise su sudovi do kojih se dođe postupkom zaključivanja", ""));
        Logic.add(new Pitanje("Kakvi su to hipotetički sudovi?", "To su sudovi u kojima je odnos subjekta i predikata nečim uvjetovan", "To su sudovi sa pozitivnim predikatom i  negativnim subjektom", "To su sudovi u kojima odnos subjekta i predikata nije ničim uvjetovan", "To su sudovi kojima se misli samo na jednog člana opsega pojma", ""));
        return Logic;
    }

    private ArrayList<Pitanje> getSociology() {
        ArrayList<Pitanje> Sociology = new ArrayList<>();
        Sociology.add(new Pitanje("Tip/oblik porodice u kojoj se kao stariješina javlja žena nazivamo:", "matrijarhalna porodica", "proširena porodica", "monogamna porodica", "patrijarhalna porodica", ""));
        Sociology.add(new Pitanje("Resocijalizacija je:", "učenje novih obrazaca ponašanja, ponekad posve suprotnih od ranije naučenih", "sticanje novih znanja, stavova i vrijednosti potrebnih za učešće u životu društva", "norme i vrijednosti koje određuju kakvo se ponašanje očekuje od pojedinca u društvu", "psihoterapeutski oporavak osoba", ""));
        Sociology.add(new Pitanje("Jedan medij ne pripada vrsti novih medija:", "printani", "teletekst", "videotekst", "internet", ""));
        Sociology.add(new Pitanje("Institucija koja služi reprodukciji, socijalizaciji i podizanju potomstva je:", "porodica", "bolnica", "škola", "centar za socijalni rad", ""));
        Sociology.add(new Pitanje("Proces učenja i usvajanja društvenih uloga i vrijednosti putem odgoja naziva se: a) komunikacija", "socijalizacija", "devijantnost", "sekularizacija", "stratifikacija", ""));
        Sociology.add(new Pitanje("Komunikacija koja se temelji na jeziku naziva se: ", "verbalna", "slikovna", "posredna", "neverbalna", ""));
        Sociology.add(new Pitanje("Ogist Kont, jedan od osnivača sociologije, dijeli sociologiju kao nauku na: ", "socijalnu statiku i socijalnu dinamiku", "socijalnu fiziku i antropologiju", "socijalni i organsku teoriju o društvu", "sociologiju i filozofiju", ""));
        Sociology.add(new Pitanje("Socijalno i političko učenje stoičke škole je karakteristično po: ", "kozmopolitizmu", "aristokratizmu", "totalitarizmu", "idealnoj državi", ""));
        Sociology.add(new Pitanje("Klasičnu teoriju konflikta – marksizam, utemeljio je", "Karl Marks", "Talkot Parsons", "Maks Veber", "Herbert Spenser", ""));
        Sociology.add(new Pitanje("Prema učenju Maksa Vebera, vlast koja se legitimira na nadnaravnim osobinama koje ljudi pripisuju jednom vođi naziva se", "harizmatska vlast", "tradicionalna vlast", "racionalna vlast", "izvršna vlast", ""));
        Sociology.add(new Pitanje("Socijalna mobilnost ili pokretljivost može biti", "horizontalna i vertikalna", "tradicionalna i moderna", "unutrašnja i vanjska", "kulturna i subkulturna", ""));
        Sociology.add(new Pitanje("Proces u kojem se dešava porast gradskog stanovništva uz istovremeno smanjenje seoskog naziva se", "urbanizacija", "migracija", "stratifikacija", "socijalizacija", ""));
        Sociology.add(new Pitanje("Šta je sociologija i šta je predmet njenog proučavanja?", "Opšta nauka o društvu.Predmet njenog proučavanja je društvo u svom totalitetu", "Opšta nauka o čovjeku.Predmet njenog proučavanja je čovjek u svom totalitetu", "Opšta nauka o lojepom.Predmet njenog proučavanja jelijepo u svom totalitetu", "Nauka o biljkama", ""));
        Sociology.add(new Pitanje("Društvo za Vebera je", "Ponašanje ljudi i njihova međusobna interakcija", "Prost zbir pojedinaca", "Proces učenja i usvajanja društvenih normi", "Socijalna karika", ""));
        Sociology.add(new Pitanje("Kastama nazivamo?", "Izrazito zatvorene društvene grupe nastale na odgovarajućoj društvenoj podjeli rada u  kojoj je društveni položaj pojedinca čvrsto određen", "Izrazito otvorene društvene grupe nastale na odgovarajućoj društvenoj podjeli rada u kojoj je društveni položaj pojedinca čvrsto određen", "Grupe ljudi koje su usmjerene ka ostvarivanju vlastitih ciljeva", "Seosku zajednicu", ""));
        Sociology.add(new Pitanje("Kako definišemo devijantnost?", "Svako odstupanje sa društveno usvojenog puta, narušavanje normi i očekivanja određene društvene grupe ili određenog društva", "Svako normalno ponašanje određene društvene grupe ili određenog društva", "Narušavanje normi", "Poštivanje uobićajenih pravila i normi", ""));
        Sociology.add(new Pitanje("Šta je „javno mnjenje”?", "mišljenje društvene skupine i širokih masa o važnim pojavama i pitanjima koja tu skupinu interesuje", "vrijednosni sud moćnog pojedinca", "izbor pojedinačnih mišljenja o jednom fenomenu", "vođenje javne debate", ""));
        Sociology.add(new Pitanje("Kada je sociologija nastala kao nauka?", "u 19. vijeku", "zahvaljujući protestantizmu", "u antičkoj (grčkoj) civilizaciji", "u srednjem vijeku", ""));
        Sociology.add(new Pitanje("Nacije su", "specifične narodne zajednice nastale na osnovu podjele rada epohe kapitalizma, na kompaktnoj teritoriji u okviru zajedničkog jezika i bliske etničke i kulturne srodnosti uopšte", "grupe ljudi koje govore zajedničkim jezikom", "grupe ljudi koje žive u istoj državi", "grupe ljudi koje nastoje da ostvare svoja nacionalna prava", ""));
        Sociology.add(new Pitanje("Šta znači pojam sekularizacije?", "prevladavanje svjetovne nad duhovnom misli, smanjenje društvenog uticaja crkve i religije", "dominacija religije nad svjetovnom misli u društvu", "zabrana religije u javnom životu", "zabrana rada svjetovnih i religijskih institucija", ""));
        Sociology.add(new Pitanje("Šta je umjetnost?", "specifičan oblik društvene svijesti kojim se na estetski način izražava ukupna objektivna stvarnost i iskazuje bogatsvo života u prirodi i društvu", "ljudsko promišljanje o ljepoti prirodnog", "specifičan oblik društvene svijesti kojim se estetski izražava ukupna objektivna stvarnost i  radost doživljaja lijepog", "to je osobina ljudi da rade posebne vrste poslova", ""));
        Sociology.add(new Pitanje("Multikulturalizam podrazumijeva", "puno uvažavanje različitih kultura na jednom prostoru i njihovo proširavanje", "kulturne vrijednosti monoetničkih zajednica", "izraz kulturnog pluralizma koji je statičan i koji razdvaja kulture – znači i život jednih pored drugih, a ne jednih sa drugima", "postojanje više kultura, koje se razvijaju neovisno jedna od druge", ""));
        Sociology.add(new Pitanje("Vrste političkih izbora su", "posredni i neposredni, opći i lokalni, redovni i vanredni", "demokratski i nedemokratski", "državni i općinski", "javni i tajni", ""));
        Sociology.add(new Pitanje("Moral definišemo kao", "vrijednosno procjenjivanje ljudskih postupaka i htijenja kao pozitivno ili negativno vrijednih pri čemu se prvi odobravaju a drugi ne", "skup nepisanih pravila neke društvene zajednice", "sposobnost uočavanja devijantnog ponašanja kod drugih", "vrijednosno procjenjivanje ljudskih postupaka i ponašanja u okviru društvenih grupa u   važnim društvenim odnosima i situacijama", ""));
        Sociology.add(new Pitanje("Ideologija predstavlja", "skup ideja o najboljim političkim ciljevima koje društvo treba da ostvari", "pravac delovanja političkih subjekata", "sistem sudova ili normi o društvenim vrijednostima", "sistem mera kojima se brane politički interesi neke grupe", ""));
        Sociology.add(new Pitanje("Šta je masovna kultura?", "kultura modernih društava koja se prenosi masama ljudi putem masovnih sredstava komunikacije", "kultura masa u urbanim sredinama", "kultura masa u ruralnim sredinama", "kultura koja se prenosi putem štampanih medija", ""));
        Sociology.add(new Pitanje("Ukupnost društvenih normi koje propisuje i sankcioniše država naziva se", "pravo", "ustav", "nauka", "moral", ""));
        Sociology.add(new Pitanje("Predstavnik teorije društvenog ugovora u sociologiji je", "Tomas Hobs", "Nikolo Makijaveli", "Ibn Haldum", "Robert Merton", ""));
        Sociology.add(new Pitanje("U osnovne elemente morala spadaju", "norma, sud i sankcija", "Historija i prahistorija", "Ideja,misao i shvatanja", "Kultura i civilizacija", ""));
        Sociology.add(new Pitanje("Tolerancija je", "prihvatanje drugog i drugačijeg bez predrasuda i diskriminacije", "ograničavanje sloboda i prava drugih", "sportsko nadmetanje bez pravila", "dozvoljeno i slobodno kretanje u određenom vremenu i prostoru", ""));
        Sociology.add(new Pitanje("Pravo je", "skup pisanih pravila i normi ponašanja", "pravac i proces društvenih promjena", "državna moć pojedinaca", "čovjekova vizija prirode i društva", ""));
        return Sociology;
    }

    private ArrayList<Pitanje> getDemocracy() {
        ArrayList<Pitanje> Democracy = new ArrayList<>();
        Democracy.add(new Pitanje("Pravednost načina na koji se prikupljaju informacije u donošenju odluka definira", "proceduralnu pravdu", "distributivnu pravdu", "korektivnu pravdu", "administrativnu pravdu", ""));
        Democracy.add(new Pitanje("Koja grana vlasti donosi zakone u državi:", "zakonodavna", "sudska (pravosudna)", "izvršna", "lokalna", ""));
        Democracy.add(new Pitanje("Na kojem nivou vlasti se vodi vanjska politika BiH?", "državnom", "entitetskom", "lokalnom", "na nivou mjesne zajednice", "Vanjsku politiku Bosne i Hercegovine vodi tročlano Predsjedništvo i Ministarstvo vanjskih poslova"));
        Democracy.add(new Pitanje("Predsjedništvo BiH vrši sljedeću vlast?", "izvršnu", "zakonodavnu", "sudsku", "lokalnu", ""));
        Democracy.add(new Pitanje("Magna Karta (Velika povelja) nastala je", "1215.", "1212.", "1216.", "1463.", "Magna Carta je predstavljala prvi pisani ustavni dokument u engleskoj historiji i presedan kojim je ustanovljen princip ljudskih i građanskih prava u anglosaksonskoj pravnoj tradiciji."));
        Democracy.add(new Pitanje("Biračko pravo (Pravo da bira i bude biran) spada u grupu", "Političkih prava", "građanskih prava", "ekonomskih prava", "kulturnih prava", ""));
        Democracy.add(new Pitanje("Ograničena vlast je", "Vladavina uspostavljena ograničenjem svojih moći putem zakona i slobodnih izbora koje  poštuju", "Vladavina uspostavljena od strane manjeg broja ljudi koji sami donose zakone", "Vladavina uspostavljena vladavinom bogatih ljudi koji o svemu odlučuju", "Vladavina uspostavljena voljom pojedinca ili grupe i za vladavinu im nisu potrebni zakoni", ""));
        Democracy.add(new Pitanje("Referendum je", "Oblik neposrednog odlučivanja, izjašnjavanje građana o nekim naročito važnim pitanjima. Izjašnjava se samo sa „da“ ili „ne“ ili „za“ ili „protiv“", "Oblik posrednog odlučivanja u parlamentu o nekim naročito važnim pitanjima. Izjašnjava   se samo sa „da“ ili „ne“ ili „za“ ili „protiv“", "Oblik posebnog odlučivanja u sudovima u kojima se utvrđuje krivnja o nekim naročito važnim pitanjima. Izjašnjava se samo sa „da“ ili „ne“ ili „za“ ili „protiv“", "Oblik glasanja u parlamentu u kojem se parlamentarci izjašnjavaju o nekim naročito važnim     pitanjima. Izjašnjava se samo sa „da“ ili „ne“ ili „za“ ili „protiv“", ""));
        Democracy.add(new Pitanje("Ustav je", "obično dokument ili skup dokumenata koji određuje osnovne zakone i principe ili uređenje vlasti političkog sistema", "usmeni dogovor predstavnika svih nivoa vlasti", "završna odredba mirovnih sporazuma u kojima je glavnu ulogu preuzela Generalna skupština UN", "normativ kojim se usklađuju odnosi između stranaka na vlasti i stranaka u opoziciji", ""));
        Democracy.add(new Pitanje("Brčko je", "distrikt", "kanton", "Općina", "entitet", ""));
        Democracy.add(new Pitanje("Koja su prirodna prava čovjeka", "pravo na život, imovinu i slobodu", "pravo na obrazovanje, slobodu izražavanja i zdravu hranu", "pravo na slobodu kretanja, prebivališta i zdravu životnu sredinu", "pravo na slobodu misli, savjesti i vjere", ""));
        Democracy.add(new Pitanje("Opozicija je", "manjinska politička partija koja nije na vlasti", "stranka na vlasti", "politička partija koja se takmiči za vlast", "stranka koja nije parlamentarna", ""));
        Democracy.add(new Pitanje("Interesne grupe su", "Postdejtonske formalno organizirane skupine ljudi koje vrše utjecaj na vršenje zakonodavne, izvršne i sudske vlasti sa ciljem očuvanja ustavnog ustrojstva države, njenog suvereniteta i teritorijalnog integriteta", "Formalne i neformalne skupine organizirane oko ostvarivanja zajedničkih ciljeva u očuvanju životne sredine i zaštiti socijalne sigurnosti građana", "Udruženja građana sastavljena od pojedinaca ili organizacija koje se okupljaju da unaprijede neka dobra ili beneficije za svoje članove ili za javnost općenito putem utjecaja na politiku vlasti", "Slobodno udruživanje građana u državi sa ciljem osnivanja političkih stranaka i uspostavom demokratskog sistema vladavine u oblasti ekonomije i privrede", ""));
        Democracy.add(new Pitanje("Jedna od navedenih osobina predstavlja karakteristiku nedemokratskoh sistema:", "Moć nije podijeljena", "Sloboda kretanja", "Vladavina prava", "Pravedan zakonski proces", ""));
        Democracy.add(new Pitanje("Monetarna politika spada u nadležnost", "države", "kantona", "entiteta", "Brčko Distrikta", "Monetarna politika Bosne i Hercegovine regulirana je Zakonom o Centralnoj banci Bosne i Hercegovine"));
        Democracy.add(new Pitanje("Koja je primarna funkcija vlasti u demokratskom društvu?", "da štiti prava i slobode svojih građana", "da štiti i upravlja slobodama građana", "da krši prava i slobode svojih građana", "da rukovodi njihovim pravima i slobodama", ""));
        Democracy.add(new Pitanje("Koliko članova broji Predsjedništvo BiH?", "3", "4", "8", "10", ""));
        return Democracy;
    }

    private ArrayList<Pitanje> getMusic() {
        ArrayList<Pitanje> Music = new ArrayList<>();
        Music.add(new Pitanje("Verizam se javlja", "krajem 19 stoljeća u italijanskoj operi", "početkom 19 stoljeća u italijanskoj operi", "početkom 18 stoljeća u italijanskoj operi", "sredinom 19 stoljeća u italijanskoj operi", "Verizam se manifestirao u težnji za naglašeno realističkim prikazivanjem ljudskih sudbina, njihovih elementarnih strasti, mračnih nagona i žestokih sukoba."));
        Music.add(new Pitanje("Kompozitori klasike su:", "Hajdn, Mocart, Betoven", "Betoven, Štraus, Brams", "Brams, Mocart, Šuman", "Verdi, Mocart, Vagner", "Hajdn, Mocart i Betoven su poznati kao Bečki klasici"));
        Music.add(new Pitanje("Oda radosti je dio Beethowenove", "devete simfonije", "treće simfonije", "osme simfonije", "pete simfonije", "Oda radosti se sada koristi kao himna Europske unije"));
        Music.add(new Pitanje("Franjo Bosanac", "je kompozitor renesanse", "je kompozitor klasike", "je kompozitor rokokoa", "je kompozitor baroka", "Živio je od  1485 do 1535"));
        Music.add(new Pitanje("Asim Horozić", "napisao je operu „Hasanaginica“ ", "napisao je operu „Jazavac pred sudom“ ", "napisao je simfonijski ples za orkestar „Djeveruša“", "napisao je solo pjesmu „Azemina“", ""));
        Music.add(new Pitanje("Betoven uvodi hor u svojoj simfoniji", "petoj", "devetoj", "trećoj", "prvoj", ""));
        Music.add(new Pitanje("Koja je Betoveniova simfonija vokalno-instrumentalna", "IX simfonija", "I simfonija", "III simfonija", "VI simfonija", ""));
        Music.add(new Pitanje("Violina spada u grupu", "Kordofonih gudačkih instrumenata", "Kordofonih trzanih instrumenata", "Kordofonih udarnih instrumenata", "Aerofonih drvenih instrumenata", ""));
        Music.add(new Pitanje("Impresionizam se javlja", "Na prelazu iz 19. u 20. stoljeće", "Krajem 18. stoljeća", "Sredinom 20. stoljeća", "Početkom 19. stoljeća", ""));
        Music.add(new Pitanje("Monodija je", "Jednoglasno pjevanje uz pratnju instrumenata", "Troglasno pjevanje uz klavirsku pratnju", "Dvoglasno pjevanje uz pratnju instrumenata", "Dvoglasno pjevanje A Capella", ""));
        Music.add(new Pitanje("Opera je", "najsloženije muzičko-scensko djelo", "višeglasno pjevanje uz instrumentalnu pratnju", "orkestarsko djelo", "jednoglasno pjevanje uz klavirsku pratnju", ""));
        Music.add(new Pitanje("Igor Stravinski je", "ruski kompozitor", "italijanski kompozitor", "češki kompozitor", "poljski kompozitor", ""));
        Music.add(new Pitanje("„Labudovo jezero“ napisao je", "Petar Iljič Čajkovski", "Vatroslav Lisinski", "Mihail Ivanovič Glinka", "Nikolaj Rimski Korsakov", ""));
        Music.add(new Pitanje("Frederic Chopin je", "Poljski kompozitor iz perioda romantizma", "Austrijski kompozitor iz perioda klasike", "Njemački kompozitor iz perioda baroka", "Češki kompozitor iz perioda romantizma", ""));
        Music.add(new Pitanje("Harfa je", "kordofoni instrument", "gudači instrument", "drveni duvači instrument", "udaraljka", ""));
        Music.add(new Pitanje("Simfonija je", "orkestarsko djelo", "kompozicija za klavir", "kompozicija solo instrument", "kompozicija za hor", ""));
        Music.add(new Pitanje("Kordofoni instrumenti su", "Žičani instrumenti", "udaraljke", "gudački instrumenti", "drveni druvački instrumenti", ""));
        return Music;
    }

    private ArrayList<Pitanje> getArt() {
        ArrayList<Pitanje> Art = new ArrayList<>();
        Art.add(new Pitanje("Bosanskohercegovački slikari su:", "Ismet Mujezinović, Safet Zec, Vojo Dimitrijević", "B. Šotra, B. Kućanski, Meštrović", "Đoto, Mazačo, Dučo", "Dante Aligijeri, Brankusi, Kokoška", ""));
        Art.add(new Pitanje("Pablo Pikaso je .... ?", "špansko-francuski slikar, kipar i grafičar", "francuski arhitekta i graver", "italijanski muzičar i keramičar", "španski književnik i zlatar", ""));
        Art.add(new Pitanje("Henri Matis je predstavnik .... ? ", "fovizma", "nadrealizma", "dadaizma", "pop arta", ""));
        Art.add(new Pitanje("Stećak „Kula“ ukrašen je sa:", "figurativnim scenama", "apstraktnim dekoracijama", "lunarnim i biljnim ornamentima", "prahistorijskim reljefima", ""));
        Art.add(new Pitanje("Najpoznatiji umjetnici ekspresionizma", "Eduard Munk, V.V.Gogh", "Modiljani, S.Dali", "P.Gogen, Sera ", "Anri Matis, Vlamenk", " "));
        Art.add(new Pitanje("Svjetski vajari koji su najpoznatiji u Evropi:", "N. Firentinac, B. Jakac", ") I. Meštrović, Kovačić", "Franjo, Dimitrijević", ") Henri Mur, Rodin, Kućanski", ""));
        Art.add(new Pitanje("Mersad Berber, Dževad Hozo i Halil Tikveša su bosanskohercegovački", "grafičari", "vajari", "slikari", "kipari", ""));
        Art.add(new Pitanje("Navedi najljepši stećak u BiH!", "stećak Kule", "biljni stećak", "geometrijski stećak", "orijentalni", ""));
        Art.add(new Pitanje("Kipari Hrvatske su", "Ivan Meštrović, A. Augustinčić, F. Kršinić", "Henri Mur i Brankuši Konstantin", "Vladimir Tatljin, Vlamenk, Difi", "Kosta Milovanović, Nadežda F. Miličević Kosta", ""));
        Art.add(new Pitanje("Grčki vajari su", "Miron, Lizip, Skopas, Fidija, Praksitel, Poliklet", "Aron, Fidel, Markus, Sirius, Oktonazis", "Rebus, Citrus, Kiprus, Kolos, Ramzes", "Posejdon, Herakle, Lizikrat, Epidaur, Panteon", ""));
        Art.add(new Pitanje("Stilovi grčke arhitekture su", "Korintski, dorski, jonski", "Dvodimenzionalni, tonski, koloristički", "Trodimenzionalni, pastozni, lazurni", "Arhajski, crnogorički, četvrtasti", ""));
        Art.add(new Pitanje("Umjetnost stećaka odvija se zajedno sa .........? ", "umjetnošću renesanse", "kanokršćanskom umjetnošću", "umjetnošću islama", "romanikom i gotikom", ""));
        Art.add(new Pitanje("Navedi tri osnovne struje svjetskog slikarstva XX vijeka!", "fantazija, ekspresija, apstrakcija", "simbolizam, realizam, klasicizam", "nadrealizam, naiva, optimizam", "pesimizam, manirizam, naturali", ""));
        Art.add(new Pitanje("Najpoznatiji vajari XX stoljeća u Bosni i Hercegovini su", "Mustafa Skopljak, Arfan Hozić, Nikola Njirić, Kučukalić", "Ismet Mujezinović, Dimitrijević, Bečić", "Mica Todorović, Safet Zec, Tikveša", "Paja Jovanović, S. Hasanefendić, Ismar Mujezinović", ""));
        Art.add(new Pitanje("Najpoznatiji vajari XX stoljeća", "Moore, Brancusi, Picasso", "Pollock, Marc, Chagall", "Picasso, M. Selimović", "Maljević, Mujezinović", ""));
        Art.add(new Pitanje("Kipari u Bosni i Hercegovini", "Grgić, A. Kučukalić, Hozić, Skopljak, Njirić", "Rizvić, Majstorović, Hasanefendić", "Ćirić, Avdičević, Ahmić", "Begović Vezirović, Osmanlija", ""));
        return Art;
    }

    private ArrayList<Pitanje> getTizo() {
        ArrayList<Pitanje> Tizo = new ArrayList<>();
        Tizo.add(new Pitanje("Olimpijada traje", "petnaest dana", "deset dana", "četiri godine", "mjesec dana", ""));
        Tizo.add(new Pitanje("Koji od navedenih borilačkih sportova nije olimpijski?", "karate", "taekwondo", "boks", "džudo", "Karate će po prvi put postati olimpijski sport na Ljetnim Olimpijskim igrama u Tokiju 2020"));
        Tizo.add(new Pitanje("Koje godine je košarkaški klub Jedinstvo Aida osvojio titulu evropskog prvaka?", "1989", "1979", "1985", "1990", ""));
        Tizo.add(new Pitanje("U fudbalskoj ekipi desno krilo najčešće nosi broj", "7", "9", "10", "3", ""));
        Tizo.add(new Pitanje("Koji od navedenih pojmova ne spada u zimske sportove", "triatlon", "bob", "karling", "biatlon", "Najčešće se pod triatlonom podrazumijeva sportsko natjecanje u disciplinama: plivanje, biciklizam i trčanje"));
        Tizo.add(new Pitanje("Koja od navednih gimnastičkih disciplina nije u programu za žene", "vratilo", "greda", "preskok", "parter", ""));
        Tizo.add(new Pitanje("Smečiranje je izraz vezan za", "odbojku", "boks", "rukomet", "plivanje", "U odbojci smeč je potez postizanja poena agresivnim udaranjem lopte preko mreže u teren protivničke ekipe"));
        Tizo.add(new Pitanje("Pivotmen je napadač u", "rukometu", "fudbalu", "hokeju na ledu", "vaterpolu", "PIVOT-linijski čovjek na šest metara , čeka loptu od bekova"));
        Tizo.add(new Pitanje("Košarkaška utakmica traje", "4x10 minuta", "2x20 minuta", "2x45 minuta", "4x5 minuta", "NBA utakmice traju 4*12 minuta"));
        Tizo.add(new Pitanje("„Prednji vezni“ je termin koji se koristi u", "Fudbalu", "Odbojci", "Košarci", "Rukometu", ""));
        Tizo.add(new Pitanje("Košarkaški  klub „BOSNA“ je bio prvak Evrope:", "1979", "1969", "1989", "2009", ""));
        Tizo.add(new Pitanje("„Cepelin“ je popularan naziv za napadačku tehniku koja se koristi u", "Rukometu", "Vaterpolu", "Odbojci", "Košarci", ""));
        Tizo.add(new Pitanje("Kako se zove igrač u odbojci, označen drugom bojom dresa", "Libero", "korektor", "pivotmen", "centar", ""));
        Tizo.add(new Pitanje("Visina koša je", "3,05", "3,00", "2,80", "2,50", ""));
        Tizo.add(new Pitanje("Koji od navedenih pojmova ne spada u alpske discipline", "biatlon", "spust", "slalom", "veleslalom", ""));
        Tizo.add(new Pitanje("Najviše olimpijskih medalja osvojio/la je", "Michael Phelps", "Carl Lewis", "Larisa Latinjina", "Muhammed Ali", "Osvojio je ukupno 28 olimpijskih medalja, od čega su 23 zlatne "));
        Tizo.add(new Pitanje("Koji sport nije na programu 2012 u Londonu", "golf", "boks", "streličarstvo", "stoni tenis", "Golf nije bio bio na programu ljetnih olimpijskih igara od 1904. sve do 2016. kad je vraćen"));
        Tizo.add(new Pitanje("Koliko se igra odbojkaška utakmica:", "Igra se igra u tri dobivena seta", "Igra se 2 x 45 minuta", "Igra se u dva dobivena seta", "Igra se 4 x 10 minuta", ""));
        Tizo.add(new Pitanje("Kraljica sportova je", "atletika", "fudbal", "gimnastika", "plivanje", ""));
        Tizo.add(new Pitanje("Broj igrača u ekipama (odbojka, košarka, fudbal)", "odbojka 6 igrača, košarka 5 igrača, fudbal 11 igrača", "odbojka 7 igrača, košarka 6 igrača, fudbal 12 igrača", "odbojka 5 igrača, košarka 7 igrača, fudbal 10 igrača", "odbojka 8 igrača, košarka 4 igrača, fudbal  9 igrača", ""));
        Tizo.add(new Pitanje("U bazične sportove spadaju", "plivanje, atletika, gimnastika", "nogomet, rukomet, košarka", "skijanje, biciklizam, streličarstvo", "aerobik, zumba, tabata", ""));
        Tizo.add(new Pitanje("Geslo olimpijskih igara glasi", "citius, altius, fortius", "momento mori", "per aspera ad astra", "veni, vidi, vici", "U prijevodu brže, više, snažnije"));
        Tizo.add(new Pitanje("Moderni petoboj sastoji se iz", "mačevanja, streljaštva, jahanja, plivanja i trčanja", "trčanja, bacanja koplja, bacanja diska, skoka u dalj i hrvanja", "trčanja, skoka u vis, dizanja tegova, plivanja i bacanja koplja", "trčanja, plivanja, vožnje bicikla, skakanja u vis i skakanja u dalj", ""));
        Tizo.add(new Pitanje("Maksimalan broj ličnih grešaka u košarci za jednog igrača je", "5", "4", "3", "2", ""));
        Tizo.add(new Pitanje("Tokom košarkaške utakmice ekipa može napraviti", "Neograničen broj izmjena", "5 izmjena", "10 izmjena", "8 izmjena", ""));
        Tizo.add(new Pitanje("Duge staze su trkačke discipline duže od", "5000m", "400m", "1500m", "800m", ""));
        Tizo.add(new Pitanje("Ishrana mladih sportista treba da je", "Raznovrsna", "bogata kalorijama", "dijetalna", "masna", ""));
        Tizo.add(new Pitanje("Olimpijski grad u Bosni i Hercegovini je", "Sarajevo", "tuzla", "mostar", "banja luka", "U Sarajevu su održane Zimske olimpijske igre 1984."));
        Tizo.add(new Pitanje("Brazil je svjetska velesila u", "fudbalu", "hokeju na travi", "rukometu", "skijanju", "Brazil ima najviše titula svjetskog prvaka u fudbalu (pet)"));
        return Tizo;
    }

    private ArrayList<LinijskiOdgovor> getHisLine() {
        ArrayList<LinijskiOdgovor> hisSQ = new ArrayList<>();
        hisSQ.add(new TekstualnoPitanje("Starješina Crkve bosanske zvao se djed (did) dok su se viši sveštenici zvali________", "starci", "stsrci", "starci"));
        hisSQ.add(new TekstualnoPitanje("Otkriće Kristofora Kolumba potvrdio je ___________________________. Po njemu je nova zemlja dobila ime Tera Amerika.", "Vespući", "Vespuci", "Vespuči"));
        hisSQ.add(new TekstualnoPitanje("Osnivačka skupština UN-a održana je u ___________ od 25. aprila do 26. juna 1945", "New Yorku", "Nju Jorku", "Njujorku"));
        hisSQ.add(new TekstualnoPitanje("Dan državnosti Bosne i Hercegovine je____________________", "25. novembar", "25 novembar", "25.11."));
        hisSQ.add(new TekstualnoPitanje("Grad Novi osnovao je bosanski kralj _____________________________", "Tvrtko I", "Tvrtko", "Tvrtko prvi"));
        hisSQ.add(new TekstualnoPitanje("Rodonačelnikom dinastije Kotromanića smatra se ban ________________________.", "Prijezda", "Ban prijezda", "Prijezda I"));
        hisSQ.add(new TekstualnoPitanje("Aneksijom Bosne i Hercegovine Austro-Ugarska je jednostrano izmijenila _________________________ugovor i time izazvala veliku diplomatsku aktivnost", "berlinski", "berlinskog", "berlinski kongres"));
        hisSQ.add(new TekstualnoPitanje("Jugoslovenski odbor je predstavljao jugoslovenske zemlje unutar___________________________monarhije", "Austro-Ugarske", "austrougarske", "Austro Ugarske"));
        hisSQ.add(new TekstualnoPitanje("Na inicijativu SSSR osnovan je 1955.god.savez koji se zvao _____________________________________", "Varšavski pakt", "Varsavski pakt", "Varšavski pakt"));
        hisSQ.add(new DoubleQuestion("Rimski car _____________ je podjelio Carstvo na dva dijela________ godine n.e.", "Teodozije", "395."));
        hisSQ.add(new DoubleQuestion("Rodnim listom bosanske državnosti smatra se Povelja bana_________ iz____ godine", "Kulina", "1189."));
        hisSQ.add(new DoubleQuestion("Srednjovjekovnu Bosnu osvojio je sultan _________________ godine __________ ", "Mehmed II", "1463."));
        hisSQ.add(new DoubleQuestion("Martin Luter je bio profesor na Univerzitetu u ________________.Svoje učenje je obznanio u _______ teza", "Erfurtu", "95"));
        hisSQ.add(new DoubleQuestion("Aneksija Bosne i Hercegovine izvršena je_______ godine. Naredne godine sultan  je priznao aneksiju uz finansijsko obeštećenje od 2,5 miliona funti, ali i obavezu da  povuče svoje garnizone iz_______________________.", "1908.", "novopazarskog sandžaka"));
        hisSQ.add(new DoubleQuestion("Jugoslovenska muslimanska organizacija je osnovana _____ godine u __________ ", "1919.", "Sarajevu"));
        hisSQ.add(new DoubleQuestion("Sparta je predstavljala grčki polis sa________________________ društvenim uređenjem. Njen najviši organ vlasti bila je__________________________", "aristokratskim", "apela"));
        hisSQ.add(new DoubleQuestion("Prvi historičari javljaju se u  Staroj Grčkoj, a najznačajniji su bili_________________i (2) ________________________", "Herodot", "Tukidid"));
        hisSQ.add(new DoubleQuestion("Nakon završetka Drugog svjetskog rata osnovana su dva vojnopolitička saveza i to (2) _____________________________________ i___________________________________", "Nato", "Varšavski pakt"));
        hisSQ.add(new DoubleQuestion("Za postanak Rima veže se legenda o braći blizancima __________ i __________.", "Romulu", "Remu"));
        hisSQ.add(new DoubleQuestion("Latinsko carstvo je bila država koju su osnovali ____________________ nakon što su zauzeli Carigrad ___________ godine", "Krstaši", "1204."));
        hisSQ.add(new DoubleQuestion("Kontinent Ameriku otkrio je moreplovac __________________ godine _________", "Kolumbo", "1492."));
        hisSQ.add(new DoubleQuestion("Odluka o okupaciji Bosne i Hercegovine od strane Austrougarske donijeta je na _________________________, godine_____________________", "Berlinskom kongresu", "1878."));
        hisSQ.add(new DoubleQuestion("Kulturno-umjetnička društva u BiH formirana su na nacionalnoj osnovi. Jevreji su formirali svoje društvo pod imenom ___________, a Bošnjaci pod imenom ____________.", "La Benevolentia", "Gajret"));
        hisSQ.add(new DoubleQuestion("Hercegovina je dobila ime po tituli_____________, koju je nosio bosanski velikaš____________________.", "Herceg", "Stjepan vukčić kosača"));
        hisSQ.add(new DoubleQuestion("Najpoznatija djela Leonarda da Vinčija su:_______________i______________.", "Mona Lisa", "Posljednja večera"));
        hisSQ.add(new DoubleQuestion("Vojnička klasa u Osmanskom carstvu sastojala se od dva vojnička reda koji su bili_______________i_______________ ", "janjičari", "spahije"));
        hisSQ.add(new DoubleQuestion("Vidovdanski ustav za Kraljevinu Srba, Hrvata i Slovenaca izglasan je_______ godine, a članom 135 garantirana je cjelovitost __________________________", "1921.", "Bosne"));
        hisSQ.add(new DoubleQuestion("Pred Prvi svjetski rat velike imperijalističke sile podijelile su se na dva saveza.To su: a)________________________________b)________________________________", "Antanta", "Centralne Sile"));
        hisSQ.add(new DoubleQuestion("Jugoslovenski odbor je formiran aprila____________godine u Parizu a za predsjednika je izabran___________________________________________.", "1914.", "Ante Trumbić"));
        hisSQ.add(new DoubleQuestion("Navedi zemlje u kojima su se (po vašem mišljenju)između dva svjetska rata uspostavili totalitarni režimi:  a)_______________________________b)________________________________", "Njemačka", "Italija"));
        hisSQ.add(new DoubleQuestion("Napoleon je uspješnim ratovima ukinuo i dvije države-republike na Jadranu.Bile su to:  a)________________________________b)________________________________", "Venecija", "Dubrovnik"));
        return hisSQ;
    }

    private ArrayList<Pitanje> gethisIZB() {
        ArrayList<Pitanje> hisIZB = new ArrayList<>();
        hisIZB.add(new Pitanje("Grčko – perzijske ratove opisao je historičar", "Herodot", "Tukidid", "Demosten", "Aristotel", ""));
        hisIZB.add(new Pitanje("Religija stare Grčke bila je", "politeistička", "judaizam", "Monoteistička", "ateistička", ""));
        hisIZB.add(new Pitanje("Dužničko ropstvo u staroj Atini ukinuo je:", "Solon", "Drakon", "Pizistrat", "Klisten", ""));
        hisIZB.add(new Pitanje("Grčka je pala pod vlast Makedonije 338. godine st. e. nakon poraza u bici", "kod Heroneje", "na Maratonskom polju", "u Termopilskom klancu", "Kod plateje", ""));
        hisIZB.add(new Pitanje("Starosjedioci, odnosno potomci osnivača grada Rima zvali su se", "patriciji", "plebejci", "eupatridi", "latini", ""));
        hisIZB.add(new Pitanje("Sukobi između Rimljana i Kartažana započeli su na", "Siciliji", "Sardiniji", "Korzici", "Peloponezu", ""));
        hisIZB.add(new Pitanje("Vrhovnim božanstvom u starom Rimu smatran je Jupiter. On je bio", "bog neba i svjetla", "bog svakog početka", "bog lova, šume i prirode", "bog domaćeg ognjišta", ""));
        hisIZB.add(new Pitanje("Prvi Ilirski odbrambeni rat protiv Rimljana 228. godine st. e. predvodila je kraljica", "Teuta", "Dijana", "Venera", "Julija", ""));
        hisIZB.add(new Pitanje("Najpoznatija Ilirska kraljica bila je", "Teuta", "Kleopatra", "junona", "atena", ""));
        hisIZB.add(new Pitanje("Rodonačelnik srednjovjekovne bosanske dinastije Kotromanića je", "ban Prijezda", "ban Borić", "Ban Kulin", "Kralj Tvrtko", ""));
        hisIZB.add(new Pitanje("Svoj najveći uspon srednjovjekovna Bosna doživjela je za vrijeme vladavine", "kralja Tvrtka I", "kralja Tvrtka II", "Bana Stjepana II", "Bana Prijezde", ""));
        hisIZB.add(new Pitanje("Da bi Bosansko Kraljevstvo ekonomski osnažio kralj Tvrtko I. je 1382. godine  podigao grad na Jadranskom moru Bio je to grad:", "Novi", "Kotor", "Neum", "dubrovnik", ""));
        hisIZB.add(new Pitanje("Prva  žena na bosanskom prijestolju bila je:", "Jelena", "Katarina", "Jelisaveta", "Kleopatra", ""));
        hisIZB.add(new Pitanje("Bosanski biskup se iz srednjovjekovne Bosne preselio u Đakovo:", "1252.", "1249.", "1340.", "1377.", ""));
        hisIZB.add(new Pitanje("Na čelu Crkve bosanske nalazio se:", "djed(did)", "patrijarh", "papa", "starci", ""));
        hisIZB.add(new Pitanje("Srednjovjekovnu  bosansku državu osvojili su", "Osmansko Carstvo", "Ugarska", "venecija", "Srbija", ""));
        hisIZB.add(new Pitanje("Bosanski ejalet, osnovan 1580. godine, prvobitno je imao sjedište u", "Banja Luci", "Sarajevu", "Travniku", "Brčkom", ""));
        hisIZB.add(new Pitanje("Nakon što je došao do zakona o kretanju planeta, osnivačem moderne  astronomije i mehanike proglašen je", "Johan Kepler", "Galileo Galilej", "Isak Njutn", "Toskaneli", ""));
        hisIZB.add(new Pitanje("Martin Luter je inicijator refome crkve u:", "Njemačkoj", "Holandiji", "Francuskoj", "Engleskoj", ""));
        hisIZB.add(new Pitanje("Početkom 16. stoljeća nastalo je djelo ''Utopija'' u kojem je dat nacrt idealne države organizirane prema načelima pravde. Autor tog djela je", "Tomas Mor", "Frančesko Petrarka", "Erazmo Roterdamski", "Lorenco Vala", ""));
        hisIZB.add(new Pitanje("Francuska građanska revolucija počela je 14. jula 1789. godine napadom na Bastilju koja je bila simbol", "apsolutizma", "komunizma", "demokratije", "kapitalizma", ""));
        hisIZB.add(new Pitanje("Proglašenje Njemačkog Carstva izvršeno je 18. januara 1871. godine u", "Versaju", "Berlinu", "Bonu", "Frankfurtu", ""));
        hisIZB.add(new Pitanje("Berlinski kongres, na kome je Austro-Ugarska monarhija dobila mandat velikih sila da okupira Bosnu i Hercegovinu, održan je", "1878.", "1877.", "1879.", "1888.", ""));
        hisIZB.add(new Pitanje("Prvi svjetski rat počeo je 28. jula 1914. godine napadom Austro-Ugarske na:", "Srbiju", "crnu goru", "Bosnu i Hercegovinu", "Osmansko Carstvo", ""));
        hisIZB.add(new Pitanje("Centralne sile su u Prvom svjetskom ratu bile poražene od sila Antante.  Rat je završen kapitulacijom Njemačke", "11. 11. 1918. godine", "29. 9. 1918. godine", "10. 11. 1918. godine", "3. 11. 1918. godine", ""));
        hisIZB.add(new Pitanje("Drugi svjetski rat počeo je 1. septembra 1939. godine napadom", "Njemačke na Poljsku", "NJemačke na Čehoslovačku", "NJemačke na Francusku", "Njemačke na Jugoslaviju", ""));
        hisIZB.add(new Pitanje("BiH je u članstvo UN primljena", "22.maja 1992.godine", "22.maja 1991.godine", "22.maja 1993.godine", "22.maja 1995.godine", ""));
        hisIZB.add(new Pitanje("Ilijada i Odiseja su najstariji grčki", "Epovi", "Mitovi", "romani", "polisi", ""));
        hisIZB.add(new Pitanje("Kršćanstvo je slobodnom i ravnopravnom religijom unutar Rimskog carstva proglasio car", "Konstantin", "teodosije", "Dioklecijan", "Trajan", ""));
        hisIZB.add(new Pitanje("Jedan od najvećih robovskih ustanaka u starom Rimu počeo je pod vodstvom", "Spartaka 74. g. s.e.", "Demofila 72. g. s.e.", "Livija Druza 74. g. s.e.", "Licinija Krasa 71. g. s.e.", ""));
        hisIZB.add(new Pitanje("Pismo u srednjovjekovnoj bosanskoj državi bilo je", "Bosančica", "Ćirilica", "Arebica", "Latinica", ""));
        hisIZB.add(new Pitanje("Protjeravši porodicu Šubića 1322. godine vlast nad srednjovjekovnom Bosnom uspostavio je", "Stjepan II", "Stjepan I", "Prijezda", "Borić", ""));
        hisIZB.add(new Pitanje("Bosanki vladar Tvrtko I Kotromanić je vladao u periodu", "1353-1391", "1350-1390", "1353-1381", "1355-1391", ""));
        hisIZB.add(new Pitanje("Posljednji bosanski kralj kojeg su Osmanlije porazile bio je", "Stjepan Tomašević", "Sjepan Ostojić", "Stjepan Dabiša", "Stjepan Tomaš", ""));
        hisIZB.add(new Pitanje("Prva uspješno izvedena građanska revolucija bila je u:", "Engleskoj", "Rusiji", "Francuskoj", "Austriji", ""));
        hisIZB.add(new Pitanje("Kojem vladaru se pripisuju riječi „Poslije nas potop“", "Luj XIV", "Luj XV", "Luj XVI", "Henrik IV", ""));
        hisIZB.add(new Pitanje("Posljednji poraz Napoleon je doživio u bici kod", "Vaterloa", "Lajpciga", "Moskve", "Svete Helene", ""));
        hisIZB.add(new Pitanje("Mirovni kongres u Beču održan je:", "1814/1815", "1814", "1815", "1813/1814", ""));
        hisIZB.add(new Pitanje("Akt kojim su Sjedinjene Američke Države proglasile nezavisnost 1776. godine naziva se", "Deklaracija o nezavisnosti", "Ustav SAD", "Povelja naroda", "Velika povelja sloboda", ""));
        hisIZB.add(new Pitanje("Konačno ujedinjenje Italije završeno je:", "1870.", "1871.", "1850.", "1866.", ""));
        hisIZB.add(new Pitanje("Njemačka je ujedinjena:", "18. januara 1871.", "8. januara 1870.", "28.januara 1872.", "1. januara 1871.", ""));
        hisIZB.add(new Pitanje("Zemlje članice Atante su", "Francuska, Engleska i Rusija", "Italija, Austro-Ugarska i Njemačka", "Engleska, Italija i Francuska", "Rusija, Njemačka, Italija", ""));
        hisIZB.add(new Pitanje("Atlansku povelju potpisali su Ruzvelt i Čerčil na brodu Princ od Velsa", "1941", "1940", "1939", "1942", ""));
        hisIZB.add(new Pitanje("Prvo zasijedanje ZAVNOBiH-a održano je", "25. novembra 1943. godine u Mrkonjić Gradu", "29. novembra 1943. godine u Jajcu", "25. oktobra u Bihaću", "30 juna – 2. jula 1944. u Sanskom Mostu", ""));
        hisIZB.add(new Pitanje("Referendum za suverenu i nezavisnu Bosnu i Hercegovinu održan je", "1992", "1991", "1993", "1995", ""));
        return hisIZB;
    }

    private ArrayList<TrueFalseQuestion> getHisTF() {
        ArrayList<TrueFalseQuestion> HisTF = new ArrayList<>();
        HisTF.add(new TrueFalseQuestion("Posljednji atinski kralj je bio Kodros", "true"));
        HisTF.add(new TrueFalseQuestion("Prvi rimski car bio je Gaj Julije Cezar", "false"));
        HisTF.add(new TrueFalseQuestion("Prvi bosanki vladar koji je kovao novac bio je ban Kulin", "false"));
        HisTF.add(new TrueFalseQuestion("Srednjovjekovnu bosansku državu osvojio je Murat I", "false"));
        HisTF.add(new TrueFalseQuestion("Mehmed paša Sokolović je osmanski sultan", "false"));
        HisTF.add(new TrueFalseQuestion("Zemaljski muzej u Sarajevu je osnovan je 1881. godine", "false"));
        HisTF.add(new TrueFalseQuestion("SAD su ušle u Prvi svjetski rat 1914. godine", "false"));
        HisTF.add(new TrueFalseQuestion("Treće zasijedanje ZAVNOBiH-a je održano u Sarajevu 6.aprila 1945. godine", "false"));
        HisTF.add(new TrueFalseQuestion("Drugi svjetski rat je završen kapitulacijom Japana 2. septembra 1945 godine", "true"));
        HisTF.add(new TrueFalseQuestion("Dan Državnosti Bosne i Hercegovine je 1. mart", "false"));
        HisTF.add(new TrueFalseQuestion("Autor prvog bosansko–turskog rječnika bio je Muhamed Hevai Uskufi", "true"));
        HisTF.add(new TrueFalseQuestion("BiH je u članstvo UN primljena 6.aprila 1992. godine", "false"));
        HisTF.add(new TrueFalseQuestion("Sparta se nalazilana jugu Grčke, u oblasti Lakoniji", "true"));
        HisTF.add(new TrueFalseQuestion("Mezopotamija je nastala u dolini rijeke Nil", "false"));
        HisTF.add(new TrueFalseQuestion("Posljednji bosanski  kralj bio je Stjepan Tomaš", "false"));
        HisTF.add(new TrueFalseQuestion("Iliri su prvi poznati stanovnici Bosne", "true"));
        HisTF.add(new TrueFalseQuestion("Mehmed paša Sokolović je bio veliki vezir", "true"));
        return HisTF;
    }

    private ArrayList<Pitanje> getHemIZ() {
        ArrayList<Pitanje> HemClassic = new ArrayList<>();
        HemClassic.add(new Pitanje("Elementi u PSE su poredani", "po porastu atomskog broja", "po broju elektrona u K-ljusci", "po broju elektrona u posljednjem energetskom nivou", "ništa od navedenog", ""));
        HemClassic.add(new Pitanje("Zapremina 0,5 mola nekog gasa pri STP je:", "11,2 dm3", "5,6 dm3", "22,4 dm3", "33,6 dm3", ""));
        HemClassic.add(new Pitanje("Jedan mol helijuma, pri normalnim uslovima, ima", "Avogadrov broj atoma", "22,4 atoma", "Avogadrov broj molekula", "22,4 molekula", ""));
        HemClassic.add(new Pitanje("Relativna molekulska masa NaHCO3 iznosi (ArNa=23; ArC=12; ArO=16):", "84", "100", "107", "106", ""));
        HemClassic.add(new Pitanje("U kom omjeru masa se spajaju N i O u NO2 (ArN=14; ArO=16)", "7:16", "7:4", "8:4", "14:4", ""));
        HemClassic.add(new Pitanje("Koliku masu ima 3,05 x 1021 atoma zlata (ArAu=196,97)", "10³ mg", "10² mg", "1 mg", "1", ""));
        HemClassic.add(new Pitanje("Orbitala može da primi", "2 elektrona", "8 elektrona", "10 elektrona", "4 elektrona", ""));
        HemClassic.add(new Pitanje("Zasićeni karbohidrogen je:", "ciklopentan", "benzen", "cikloheksen", "eten", ""));
        HemClassic.add(new Pitanje("Glukoza je", "aldoheksoza", "Ketoheksoza", "2-deoksiriboza", "maltoza", ""));
        HemClassic.add(new Pitanje("Masti i ulja su", "triacilgliceroli", "fenoli", "acetali", "enoli", ""));
        HemClassic.add(new Pitanje("Etan podliježe reakcijama", "supstitucije", "adicije", "dekarboksilacije", "polimerizacije", ""));
        HemClassic.add(new Pitanje("Sapuni su", "površinski aktivne tvari", "soli aminokiselina", "alkoholi", "soli lizina", ""));
        HemClassic.add(new Pitanje("Prelazni elementi", "popunjvaju d-ljusku", "su svi nemetali", "su gasovi", "ništa od navedenog nije tačno", ""));
        HemClassic.add(new Pitanje("Funkcionalna grupa koja sadrži sp2 hibridizovani C atom je", "karboksilna", "amino", "hidroksilna", "nitro", ""));
        HemClassic.add(new Pitanje("Sulfatna kiselina", "je jaka dehidrataciona tvar", "je čvrsta tvar", "ima formulu H2SO3", "ima formulu H2SO2", ""));
        HemClassic.add(new Pitanje("R-CH2OH predstavlja opću formulu", "primarnih alkohola", "anhidrida", "etera", "estera", ""));
        return HemClassic;
    }

    private ArrayList<LinijskiOdgovor> getHemDQ() {
        ArrayList<LinijskiOdgovor> HemDQ = new ArrayList<>();
        HemDQ.add(new DoubleQuestion("Napisati simbole slijedećih elemenata : \n" + "a)Hlor,litij,kalaj,olovo\n" + "b)Cink,bakar,ksenon,fluor\n", "Cl, Li, Sn, Pb", "Zn, CU, Xe, F"));
        HemDQ.add(new DoubleQuestion("Napisati simbole slijedećih elemenata : \n" + "a)Sumpor,nitrogen,barij,fosfor\n" + "b)Kalcij,zlato,aluminij,antimon\n", "S, N, Ba, P", "Ca, Au, Al, Sb"));
        HemDQ.add(new DoubleQuestion("Metali i nemetali međusobno grade ________ spojeve, a nemetali međusobno __________spojeve", "jonske", "kovalentne"));
        HemDQ.add(new DoubleQuestion("Oksidi metala sa vodom grade _______ a oksidi nemetala sa vodom grade_______", "baze", "kiseline"));
        HemDQ.add(new TekstualnoPitanje("AgNO3 +       -> AgCl + KNO3", "KCl", "KCl", "KCL"));
        HemDQ.add(new TekstualnoPitanje("2NaOH + H2SO4 ->            ", "Na2SO4+2H2O", "Na2SO4 + 2H2O", "Na2SO4 + 2 H2O"));
        HemDQ.add(new TekstualnoPitanje("H2CO3 +       -> Na2CO3 + 2H2O", "2NaOH", "2 NaOH", "2NaoH"));
        HemDQ.add(new TekstualnoPitanje("      + 2HCl  ->CaCl2 + H2O + CO2", "CaCO3", "CaCO3", "CaCO3"));
        HemDQ.add(new TekstualnoPitanje("Imenovati spojeve po IUPAC nomenklaturi", "2-aminopropanska kiselina", "2 - aminopropanska kiselina", "2aminopropanska kiselina"));
        HemDQ.add(new TekstualnoPitanje("Imenovati spojeve po IUPAC nomenklaturi", "1,2-etandiol", "12etandiol", "1,2 - etandiol"));
        HemDQ.add(new TekstualnoPitanje("Imenovati spojeve po IUPAC nomenklaturi", "5-hlor-4-metil-2-heksin", "5 - hlor - 4 - metil - 2 - heksin", "5hlor 4metil 2heksin"));
        HemDQ.add(new TekstualnoPitanje("Spoj sastavljen od hidrogena i nitrogena sadrži 82,4% nitrogena. Relativna molekulska masa spoja je 17. Odrediti formulu tog spoja. (ArN=14; ArH=1)", "NH3", "NH 3", "N H 3"));
        HemDQ.add(new TekstualnoPitanje("Koliko treba odvagati čvrstog natrijevog hidroksida da se neutralizira 0,1mol hloridne kiseline? (ArNa=23;  ArH=1; ArO=16)", "4g", "4 g", "4 grama"));
        HemDQ.add(new TekstualnoPitanje("Izračunaj maseni udio hloridne kiseline u rastvoru količinske koncentracije 12mol/dm3, gustoće 1,18g/cm3! (ArH=1; ArCl=35,45)", "37,1%", "37.1%", "37,1 %"));
        HemDQ.add(new TekstualnoPitanje("Kolika će biti pH rastvora, ako u 100cm3 rastvora pomiješamo 20g NaOH i 20g HCl? (ArH=1; ArCl=35,45; ArNa=23; ArO=16)", "0,32", "0.32", "0.3"));
        return HemDQ;
    }

    private ArrayList<LinijskiOdgovor> getGeoDQ() {
        ArrayList<LinijskiOdgovor> geoDQ = new ArrayList<>();
        geoDQ.add(new DoubleQuestion("Navedi imena naučnih disciplina koje proučavaju pojedine strukturne dijelove prirodne sredine\na) reljef\nb) vrijeme i klima", "geomorfologija", "klimatologija"));
        geoDQ.add(new DoubleQuestion("Navedi imena naučnih disciplina koje proučavaju pojedine strukturne dijelove prirodne sredine\na) vode\nb) tlo", "hidrologija", "pedologija"));
        geoDQ.add(new DoubleQuestion("Organizacija UN-a nastala je Poveljom prihvaćenom 24.oktobra 1945. godine. Njene specijalizirane organizacije su\na) ILO_______\nb) FAO_______", "International Labour Organisation", "Food and Agriculture Organisation"));
        geoDQ.add(new DoubleQuestion("Organizacija UN-a nastala je Poveljom prihvaćenom 24.oktobra 1945. godine. Njene specijalizirane organizacije su\na) WHO_______\nb) UNESCO_______", "World Health organisation", "united nations educational scientific and cultural organisation"));
        geoDQ.add(new DoubleQuestion("Dopiši čemu služe navedeni instrumenti:\na) barometar\nb) termometar", "mjerenje atmosferskog pritiska", "Mjerenje temperature zraka"));
        geoDQ.add(new DoubleQuestion("Dopiši čemu služe navedeni instrumenti:\na) anemomoetar\nb) higrometar", "mjerenje jačine vjetra", "mjerenje vlažnosti zraka"));
        geoDQ.add(new DoubleQuestion("Navedi najviše planine na kontinentima\na) Azija\nb) Afrika", "Mount Everest", "Kilimandžaro"));
        geoDQ.add(new DoubleQuestion("Navedi najviše planine na kontinentima\na) Australija\nb) Europa", "Kosciuszko", "Mont Blanc"));
        geoDQ.add(new DoubleQuestion("Navedi najviše planine na kontinentima\na) Sjeverna Amerika\nb) Južna Amerika", "Denali", "Aconcagua"));
        return geoDQ;
    }

    private ArrayList<Pitanje> getGeoIZB() {
        ArrayList<Pitanje> geoIN = new ArrayList<>();
        geoIN.add(new Pitanje("Grčki naučnik koji je u III stoljeću p.n.e. prvi upotrijebio riječ geografija zvao se", "Eratosten", "Aristotel", "Al Biruni", "Humbolt", ""));
        geoIN.add(new Pitanje("Sinodički i siderički Mjesec u danima traju", "29,5 i 27,3 dana", "27,3 i 29,5 dana ", "30 i 29 dana ", "29 i 30 dana", ""));
        geoIN.add(new Pitanje("U (-5) vremenskoj zoni (zapadno od Greenwhic-a) je 12 sati zonskog vremena. Koliko je sati u Bosni i Hercegovini (1. zona istočno od Greenwhic-a)?", "18 sati", "17 sati", "10 sati", "9 sati", ""));
        geoIN.add(new Pitanje("Mjesečeva (hidžretska) godina traje 365,25 dana dok Gregorijanska godina traje 355 dana", "nijedna tvrdnja nije tačna", "ne", "da", "ne zanimaju me kalendari", ""));
        geoIN.add(new Pitanje("Na karti razmjere 1:100 000 izmjerena je dužina od 5 cm. Kolika je njezina stvarna dužina u prirodi?", "5 000 m", "50 000 m", "500 000 m", "nemoguće je ovo izračunati", ""));
        geoIN.add(new Pitanje("Obim Zemlje po ekvatoru je", "40.076,6 km ", "41.176,6 km", "43.276,6 km", "44.376,6 km", ""));
        geoIN.add(new Pitanje("Planeta Zemlja u toku jednog sata okrene se oko svoje ose za", "15 stepeni", "10 stepeni", "5 stepeni", "20 stepeni", ""));
        geoIN.add(new Pitanje("Skale za mjerenje snage potresa zovu se:", "Merkalijeva skala (MCS) i Rihterova skala", "Boforova skala i Kelvinova", "Kelvinova skala i Merkalijeva", "Celzijusova i Merkalijeva skala", ""));
        geoIN.add(new Pitanje("Zaokruži tačan odgovor: Hipotezu o horizontalnom pomicanju kontinenata iznio je", "Geofizičar A. Wegener", "Geomorfolog Jovan Cvijić", "Geomorfolog E. Sis", "Geolog F. Katzer", ""));
        geoIN.add(new Pitanje("Osnivačima moderne geografije smatraju se", "A. Humboldt i K. Ritter", "Aristotel i Ptolomej", "Eratosten i Al Biruni", "G. Galilej i N. Kopernik", ""));
        geoIN.add(new Pitanje("Koja od navedenih zemalja nije članica EU?", "Švicarska", "Bugarska", "Kipar", "Rumunija", ""));
        return geoIN;
    }

    private ArrayList<TrueFalseQuestion> getGeoTF() {
        ArrayList<TrueFalseQuestion> geoTF = new ArrayList<>();
        geoTF.add(new TrueFalseQuestion("Bosna i Hercegovina je zemlja sjeverne Europe", "false"));
        geoTF.add(new TrueFalseQuestion("Bosna i Hercegovina ima površinu od 51129 km2", "true"));
        geoTF.add(new TrueFalseQuestion("Bosna i Hercegovina graniči sa pet susjednih zemalja", "false"));
        geoTF.add(new TrueFalseQuestion("Cunami su vjetrovi koji izazivaju podmorski zemljotres", "false"));
        geoTF.add(new TrueFalseQuestion("Izoseiste su linije koje spajaju mjesta sa istom snagom zemljotresa", "true"));
        geoTF.add(new TrueFalseQuestion("Rusija (Ruska federacija) je površinom najveća država na svijetu", "true"));
        geoTF.add(new TrueFalseQuestion("Kozmopoliti naseljavaju samo određeni dio zemlje i nema ih nigdje više", "false"));
        geoTF.add(new TrueFalseQuestion("Oslo je glavni grad Norveške", "true"));
        geoTF.add(new TrueFalseQuestion("Jablanica, Salakovac i Grabovica su hidroelektrane na Vrbasu", "false"));
        geoTF.add(new TrueFalseQuestion("Pećina Vjetrenica je u Popovu polju", "true"));
        return geoTF;
    }

    private ArrayList<Pitanje> getBioIZB() {
        ArrayList<Pitanje> bioIN = new ArrayList<>();
        bioIN.add(new Pitanje("Krajnji ishod u Krebsovom citratnom ciklusu u energetskom bilansu je:", "36 molekula ATP-a", "40 molekula ATP-a", "2 molekule ATP-a", "30 molekula ATP-a", ""));
        bioIN.add(new Pitanje("Svjetlosna faza fotosinteze odvija se u", "tilakoidima hloroplasta", "matriksu mitohondrija", "stromi hloroplasta", "jedru ćelije", ""));
        bioIN.add(new Pitanje("U biotičke ekološke faktore spadaju", "fitogeni faktori", "klimatski faktori", "edafski faktori", "orografski faktori", ""));
        bioIN.add(new Pitanje("Parenhim je tkivo kod biljaka koje spada u :", "Osnovna tkivo", "Kožno tkivo", "Mehaničko tkivo", "Provodno tkivo", ""));
        bioIN.add(new Pitanje("Paralelna nervatura lista karakteristična je za", "jednosupnice", "dvosupnice", "borove", "sve skrivenosjemenjače", ""));
        bioIN.add(new Pitanje("Kad je izvanćelijska tekućina hipertonična u odnosu na sadržaj ćelije tada:", "voda izlazi iz ćelije", "voda ulazi u ćeliju", "nema transporta vode", "samo ioni ulaze u stanicu", ""));
        bioIN.add(new Pitanje("Hromosom je građen od dvije:", "hromatide", "hromoneme", "hromomere", "centromere", ""));
        bioIN.add(new Pitanje("Za prokariote vrijedi tvrdnja: nasljedna uputa je na nivou:", "jedra", "nukleotida", "nukleoida", "nukleoproteida", ""));
        bioIN.add(new Pitanje("Mitohondriji", "sve navedene tvrdnje su ispravne", "su energetske centrale stanice", "su glavni proizvođači ATP-a", "imaju dvostruku ovojnicu", ""));
        bioIN.add(new Pitanje("U inhibitorne neuromedijatore spadaju", "gama-aminobuterna kiselina", "noradrenalin", "acetilholin", "sve od navedenog", ""));
        bioIN.add(new Pitanje("Vrpčasti nervni sistem javlja se kod", "pljosnatih glista i nižih mekušaca", "člankovitih glista i zglavkara", "hordata", "sisara", ""));
        bioIN.add(new Pitanje("Uloga tromocita je u:", "zgrušavanje krvi", "odbrani organizma od stranih čestica", "prijenos oksigena", "prijenos CO2", ""));
        bioIN.add(new Pitanje("Stvaranje eritrocita (eritropoeza) obavlja se u", "koštanoj srži", "krvi", "jetri", "slezeni", ""));
        bioIN.add(new Pitanje("Homozigot je", "zigot koji ima oba gena ista", "je zigot koji nosi nejednake gene", "obje tvrdnje su tačne", "nijedna tvrdnja nije tačna", ""));
        bioIN.add(new Pitanje("Somatske ćelije imaju", "diploidan broj hromosoma", "haploidan broj hromosoma", "tetraidan broj hormosoma", "nijedna tvrdnja nije tačna", ""));
        bioIN.add(new Pitanje("Citoplazmatske organele koje imaju vlastitu DNK su", "mitohondrije", "Golđijev aparat", "Jedro", "Lizosomi", ""));
        bioIN.add(new Pitanje("Krupnije čestice u ćeliju se unose procesima", "fagocitoze i pinocitoze", "osmoze i difuzije", "osmoze i difuzije", "Osmoze", ""));
        bioIN.add(new Pitanje("Protamini spadaju u", "Proste bjelančevine", "Složene bjelančevine", "Proteide", "Steroidi", ""));
        bioIN.add(new Pitanje("Ćelijski zid imaju:", "biljne ćelije", "sve ćelije", "životinjske ćelije", "mišične ćelije", ""));
        bioIN.add(new Pitanje("Organizmi koji proizvode organske materije iz neorganskih su", "autotrof", "heterotrofi", "komensali", "saprofiti", ""));
        bioIN.add(new Pitanje("Interakcija dva organizma u kojoj jedan organzam ima korist a drugi nema ni korist ni štetu naziva se:", "amensalizam", "kompeticija", "komensalizam", "simbioza", ""));
        bioIN.add(new Pitanje("Osnivač evolucije je", "Čarls Darvin", "Aristotel", "Tales", "Heraklit", ""));
        bioIN.add(new Pitanje("Mutacije su", "nenasljedne promjene", "nasljedne promjene", "promjene u citoplazmi ćelija", "nijedna tvrdnja nije tačna", ""));
        bioIN.add(new Pitanje("Selekcija je", "prirodni odabir", "dokaz evolucije", "izolacioni mehanizam", "borba za opstanak", ""));
        bioIN.add(new Pitanje("Populacija je:", "skup jedinki iste vrste", "skup jedinki različite vrste", "skup vrsta u jednoj biocenozi", "skup biljaka i životinja", ""));
        bioIN.add(new Pitanje("Žuč je proizvod funkcije ćelija:", "jetre", "gušterače", "pankreasa", "žučnog mjehura", ""));
        bioIN.add(new Pitanje("Enzim koji razlaže skrob do maltoze je", "amilaza", "fosforilaza", "maltaza", "saharaza", ""));
        bioIN.add(new Pitanje("U sastavu definitivne mokraće zdravog čovjeka ne smije biti", "glukoza", "urea", "kreatinin", "voda", ""));
        bioIN.add(new Pitanje("Kičma je građena od:", "33-34 kičmena pršljena", "35-36 kičmena pršljena", "43-44 kičmena pršljena", "30 kičmenih pršljenova", ""));
        bioIN.add(new Pitanje("Kod višestaničnih organizama intracelularna tečnost nalazi se", "u ćelijama", "u međućelijskom prostoru", "u lakunama", "u crijevima", ""));
        bioIN.add(new Pitanje("Eferentna ili nishodna nervna vlakna provode nadražaj od :", "nervnog centra ka perifernim organima", "centripetalno", "periferije organizma ka odgovorajućim nervnim centrima", "nijedna tvrdnja nije tačna", ""));
        bioIN.add(new Pitanje("Porfirinski skelet hlorofila sadrži", "četiri pirolova prstena", "tri pirolova prstena", "dva pirolova prstena", "jedan pirolov prsten", ""));
        bioIN.add(new Pitanje("Za vrh stabla i korjena karakterističan je", "apikalni rast", "bazalni rast", "interkalarni rast", "rast lisne drške", ""));
        bioIN.add(new Pitanje("Antigen je:", "Strana supstanca, obično protein koji stimuliše stvaranje antitijela", "Gen koji koči funkciju drugog gena", "Gen koji se izražava u fenotipu", "Protein koji inaktiviše antitijelo", ""));
        return bioIN;
    }

    private ArrayList<LinijskiOdgovor> getBioDQ() {
        ArrayList<LinijskiOdgovor> bioDQ = new ArrayList<>();
        bioDQ.add(new DoubleQuestion("__________________________ faza fotosinteze odvija se u tilakoidima hloroplasta na svjetlosti, a\n__________________________ faza fotosinteze u stromi i ne zavisi direktno od svjetlosti.", "svijetla", "tamna"));
        bioDQ.add(new DoubleQuestion("Virusne čestice ili partikule građene su od dva osnovna dijela. To su______________ i _______________", "kapside", "nukleinske kiseline"));
        bioDQ.add(new DoubleQuestion("Ćelijske/stanične organele se nalaze u osnovnoj citoplazmatskoj masi koja se naziva\n___________ili______________", "matriks", "hijaloplazma"));
        bioDQ.add(new DoubleQuestion("Inzulin je hormon koji luči ________________, a njegova uloga je u", "gušterača", "snižavanju nivoa šećera u krvi"));
        bioDQ.add(new DoubleQuestion("Pljuvačne žlijezde luče ferment ____________ ili ___________", "Amilaza", "ptijalin"));
        bioDQ.add(new DoubleQuestion("Organizacija nervnog sistema javlja se u dva osnovna oblika\n_____________ i _____________ ", "centralni", "periferni"));
        bioDQ.add(new DoubleQuestion("U osnovi postoje dvije vrste fiksacije azota _______________ i ________________.", "biološka", "abiološka"));
        bioDQ.add(new DoubleQuestion("Virusne čestice sastoje se iz dva dijela", "kapsomera", "nukleinska kiselina"));
        bioDQ.add(new DoubleQuestion("Plazmoliza je pojava odvajanja __________________________ od _____________________.", "ćelijske membrane", "ćelijskog zida"));
        bioDQ.add(new DoubleQuestion("Jedrov sok se označava i kao:\n ________________________ili________________________.", "nukleoplazma", "karioplazma"));
        bioDQ.add(new DoubleQuestion("Endoplazmatski retikulum se dijeli na\n __________________ i ______________________", "granulirani", "agranulirani"));
        bioDQ.add(new DoubleQuestion("Postoje kratki nervni nastavci ili ________________ i duži nervni nastavci __________________.", "dendriti", "neuriti"));
        bioDQ.add(new DoubleQuestion("Protoplazma se sastoji od\n ______________ i________________.", "citoplazme", "jedra"));
        bioDQ.add(new DoubleQuestion("Nervna ćelija ili _____________ sastoji se od\n ________________________i nervnih nastavaka.", "neuron", "jedra"));
        return bioDQ;
    }

    private ArrayList<Pitanje> getFizIZB() {
        ArrayList<Pitanje> fizIN = new ArrayList<>();
        fizIN.add(new Pitanje("Sto mikrometara je", "0,1 mm", "10 mm", "1 mm", "0,01 mm", ""));
        fizIN.add(new Pitanje("Pretvoriti 15 m/s u km/h?", "54 km/h", "36 km/h", "72 km/h", "108 km/h", ""));
        fizIN.add(new Pitanje("Trgovac je izmjerio 1 kg sa greškom 5 g. Kolika je relativna greška mjerenja?", "0,5%", "5%", "0,05%", "0,005%", ""));
        fizIN.add(new Pitanje("Tijelo se kreće ravnomjerno ubrzano sa početnom brzinom 2 m/s. Nakon 3 s kretanja dostigne brzinu 6 m/s. Koliki je put tijelo prešlo za vrijeme kretanja?", "12 m", "9 m", "16 m", "24 m", ""));
        fizIN.add(new Pitanje("Tijelo slobodno pada sa visine h = 30 m. Kolika je brzina tijela pri udaru u zemlju?", "24,26 m/s", "19,62 m/s", "18,65 m/s", "15,19 m/s", ""));
        fizIN.add(new Pitanje("Kolikom maksimalnom brzinom smije ući automobil u krivinu poluprečnika 150 m?  Cesta je horizontalna, a koeficijent trenja 0,3.", "75,64 km/h", "61,76 km/h", "54,34 km/h", "38,18 km/s", ""));
        fizIN.add(new Pitanje("Na vrhu zgrade okačeno je uže na kojem visi tijelo koje osciluje sa periodom T = 6,28 s.  Kolika je dužina užeta?", "9,81 m", "19,62 m", "29,43 m", "39,24 m", ""));
        fizIN.add(new Pitanje("Dubina jezera je h = 15 m. Atmosferski pritisak iznosi 1,013 bara. Koliki je ukupni pritisak na dnu jezera?", "2,48 bara", "3, 48 bara", "1,47 bara", "1,013 bara", ""));
        fizIN.add(new Pitanje("Korito rijeke ima oblik pravougaonika stranica a = 12 m i b = 3 m. Brzina rijeke je 7,2 km/h.  Koliki je zapreminski protok vode?", "72 m3/s", "720 m3/s", "7,2 m3/s", "0,72 m3/s", ""));
        fizIN.add(new Pitanje("Elastična opruga se istegne za 20 cm pod djelovanjem sile od 10 N. Koliki rad izvrši sila pri istezanju opruge?", "1 J", "10 J", "0,1 J", "0,01 J", ""));
        fizIN.add(new Pitanje("Pumpa podigne 1 m3 vode na visinu 15 m za 1 minutu. Kolika je snaga pumpe ako je njen koeficijent korisnog dejstva 80 %?", "3,066 kW", "2,84 kW", "1,38 kW", "0,84 kW", ""));
        fizIN.add(new Pitanje("U vodu mase m1 = 5 kg i temperature t1 = 20 °C doda se m2 = 1 kg vode na temperaturi    t2 = 80 °C. Kolika je temperatura smjese?", "30 °C", "44 °C", "58 °C", "68 °C", ""));
        fizIN.add(new Pitanje("Izvjesna količina gasa zauzima zapreminu V1 = 3 litra kod pritiska 1 bar. Koliki je pritisak gasa ako se on sabije na V2 = 500 cm3? Temperatura gasa se ne mijenja", "6 bara", "5 bara", "3 bara", "2 bara", ""));
        fizIN.add(new Pitanje("Koliko ima molekula u 22,4 litra idealnog gasa na temperaturi od 0 °C i pritisku 101 325 Pa?", "6,022×10²3", "6,022×10^-34", "6,022×10^-23", "6,022×10⁻¹9", ""));
        fizIN.add(new Pitanje("Dva jednaka pozitivna tačkasta naboja od 5μC, u vakuumu, nalaze se na rastojanju od 5 dm.  Koliko silom se oni odbijaju?", "900 mN", "90 mN", "0,9 mN", "0,9 kN", ""));
        fizIN.add(new Pitanje("Potencijal naelektrisane metalne lopte je 10 V, a jačina električnog polja na njenoj površini 100 N/C. Koliki je poluprečnik metalne lopte?", "10 cm", "0,1 cm", "1 cm", "1 m", ""));
        fizIN.add(new Pitanje("Kapacitet pločastog kondenzatora iznosi 8,85 nF. Rastojanje između ploča iznosi 1 mm.  Između ploča je izolator, εr = 5. Kolika je površina kondenzatorskih ploča?", "0,2 m2", "2 m2", "2 dm2", "2 cm2", ""));
        fizIN.add(new Pitanje("Za 4 s kroz provodnik presjeka S = 1,6 mm2 prođe 4*10^19 elektrona. Kolika je gustina električne struje?", "I = 1 A/mm2", "I = 1 mA/m2", "I = 1 μA/mm2", "I = 1kA/m2", ""));
        fizIN.add(new Pitanje("Za koje vrijeme grijač bojlera snage 2 kW zagrije 50 litara vode od 17 °C do 37 °C?(c = 4 186 J/(kg°C))", "34,88 min", "45,13 min", "55,65 min", "65,83 min", ""));
        fizIN.add(new Pitanje("Kolika je magnetna indukcija na rastojanju 2 m od beskonačno dugog pravolinijskog provodnika u vazduhu, kroz kojeg teče struja jačine 1 A?", "0,1 μT", "1 mT", "0,1 mT", "1 μT", ""));
        fizIN.add(new Pitanje("U solenoidu (kalemu) se promijeni jačina električne struje za 4 A  za vrijeme 10 ms. Pri tome nastaje ems samoindukcije od 12 V. Koliki je induktivitet solenoida?", "30 mH", "300 mH", "3 mH", "0,3 mH", ""));
        fizIN.add(new Pitanje("Zavojnica induktiviteta 200 mH i termogeni otpornik otpora R = 30Ω priključeni su redno  u kolo naizmjenične električne struje frekvencije 50 Hz. Koliko iznosi impedanca?", "69,6 Ω", "72,4 Ω", "84,7 Ω", "101,2 Ω", ""));
        fizIN.add(new Pitanje("Kolika je energija fotona čija je talasna dužina 500 nm?", "2,48 eV", "3,98 eV", "6,36 eV", "0,44 eV", ""));
        fizIN.add(new Pitanje("Fotoni imaju energiju 3,0 eV i izbijaju elektrone iz osvijetljenog metala. Elektroni koji napuštaju metalnu površinu imaju maksimalnu kinetičku energiju od 1,0 eV. Kolika je najmanja energija koju moraju imati fotoni da bi izazvali fotoefekat na tom metalu?", "2,0 eV", "1,0 eV", "3,0 eV", "4,0 eV", ""));
        fizIN.add(new Pitanje("Početna aktivnost radioaktivnog izvora je 5*10^18 Bq. Za četiri godine ona opadne na 2,5*10^18 Bq. Koliki je period poluraspada radioaktivnih elemenata?", "4 godine", "3 godine", "5 godine", "6 godina", ""));
        fizIN.add(new Pitanje("Sto nanometara je", "10⁻⁷ m", "10⁻⁶ m", "10⁻⁵ m", "10⁻¹ m", ""));
        fizIN.add(new Pitanje("Pretvoriti 13 m/s u km/h?", "46,8 km/h", "39,6 km/h", "54,3 km/h", "72,6 km/h", ""));
        fizIN.add(new Pitanje("Piljar je izmjerio 7 kg povrća sa greškom 10 g. Kolika je relativna greška mjerenja?", "0,14 %", "0,014 %", "0,0014 %", "1,4 %", ""));
        fizIN.add(new Pitanje("Tijelo se kreće ravnomjerno ubrzano sa početnom brzinom 5 m/s. Nakon 5 s kretanja tijelo dostigne brzinu 15 m/s. Koliki je put tijelo prešlo za vrijeme kretanja?", "50 m", "40 m", "25 m", "4 m", ""));
        fizIN.add(new Pitanje("Kolikom početnom brzinom treba baciti tijelo vertikalno uvis da bi ono palo na površinu Zemlje za 7 s?", "34,335 m/s", "29,432 m/s", "24,525 m/s", "19,810 m/s", ""));
        fizIN.add(new Pitanje("Maksimalna brzina je 72 km/h kojom smije ući automobil u horizontalnu krivinu poluprečnika  80 m. Koliki je koeficijent trenja između podloge i točkova?", "0,51", "0,31", "0,11", "0,81", ""));
        fizIN.add(new Pitanje("Za vrh zgrade okačeno je uţe duţine 25 m. Za uţe je vezana cigla mase 2 kg, koja osciluje. Koliki je period oscilovanja cigle?", "10,02 s", "19,20 s", "28,97 s", "89,67 s", ""));
        fizIN.add(new Pitanje("Na dubini h = 10 m, u vodi, ukupni pritisak iznosi p = 1,99425 bara. Koliko bara iznosi  atmosferski pritisak?", "1,01325", "10,1325", "101,325", "0,101325", ""));
        fizIN.add(new Pitanje("Na stolu, visine H = 0,9 m, nalazi se posuda sa vodom. Na dnu posude, sa bočne strane, nalazi se otvor kroz koji ističe mlaz vode u horizontalnom pravcu i pada na udaljenosti x = 1m od stola. Kolika je visina h vodenog stuba u posudi?", "27,8 cm", "54,3 cm", "187,3 cm", "21,5 cm", ""));
        fizIN.add(new Pitanje("Kolikom brzinom se kreće automobil, mase 1,8 tona, ako ima istu kinetičku energiju kao i projektil mase 18 kg,  koji se kreće brzinom 500 m/s?", "180 km/h", "200 km/h", "150 km/h", "120 km/h", ""));
        fizIN.add(new Pitanje("Avion, mase 60 tona, uzleti brzinom 360 km/h na kraju horizontalne piste, dužine 3 km. Kretanje aviona je jednakoubrzano. Kolika je snaga avionskog motora?", "5 MW", "5 kW", "10 MW", "15 MW", ""));
        fizIN.add(new Pitanje("Vagon mase m1 = 50 tona kreće se brzinom v1=3 m/s po horizontalnoj pruzi. On stigne drugi vagon mase m2 = 30 tone,  koji se kreće brzinom v2 = 1 m/s i udari u njega. Nakon sudara nastavljaju da se kreću zajedno. Kolika je zajednička brzina vagona nakon sudara?", "2,25 m/s", "2,50 m/s", "2,15 m/s", "1,15 m/s", ""));
        fizIN.add(new Pitanje("Koliki je pritisak 5 molova idealnog gasa u posudi, zapremine 5 dm3, na temperaturi od 227 °C?", "4,155 MPa", "3,155 MPa", "2,155kPa", "1,155 Pa", ""));
        fizIN.add(new Pitanje("Stepen korisnog djelovanja toplotne mašine je 0,3. Temperatura hladnog rezervoara je 7°C. Kolika je temperatura toplog rezervoara?", "127 °C", "139 °C", "153 °C", "400 °C", ""));
        fizIN.add(new Pitanje("Tačkasti naboj od q1 = + 8 mC i q2 = + 3μC međusobno su udaljeni 30 cm u vazduhu. Odrediti elektrostatičku silu između naboja q1 i q2.", "2,4 kN", "24 kN", "240 N", "24 N", ""));
        fizIN.add(new Pitanje("Naelektrisana kapljica ulja, mase 1mg, miruje u homogenom električnom polju jačine 98,1 N/C. Koliki je naboj  naelektrisane kapljice?", "0,1 μC", "1 μC", "10 μC", "100 μC", ""));
        fizIN.add(new Pitanje("Koliki rad izvrši sila električnog polja naboja q1 = + 5 mC pri premještanju naboja q2 = + 5μC sa rastojanja  r1 = 25 cm na rastojanje r2 = 50 cm?", "450 J", "350 J", "135 J", "135 mJ", ""));
        fizIN.add(new Pitanje("Na krajeve provodnika od volframa, specifičnog električnog otpora p = 53 nΩm, prečnika 0,8 mm i duţine 50  m, uspostavi se razlika potencijala od 12 V. Kolika jačina električne struje ide kroz provodnik?", "2,275 A", "227,5 mA", "22,75 A", "227,5 A", ""));
        fizIN.add(new Pitanje("Elektromotor ima korisnu snagu Pk = 3,5 kW i priključen je napon od 220 V. Stepen korisnog dejstva motora je 70%. Kolika jačina električne struje ide kroz elektromotor?", "22,73 A", "227,27 A", "2,27 A", "227 mA", ""));
        fizIN.add(new Pitanje("Kolika je jačina magnetnog polja u kome se kreće elektron po kruţnici, poluprečnika r = 10 cm, brzinom v = 1,6*10⁶ m/s, okomito na pravac silnica magnetnog polja ?", "72,45 A/m", "679 A/m", "7,79 A/m", "724,5 mA/m", ""));
        fizIN.add(new Pitanje("U solenoidu, koji ima 500 namotaja, magnetni fluks iznosi 1 mWb. Za koliko vremena treba da nestane taj fluks, da bi se u solenoidu indukovala elektromotorna sila od 5 V?", "0,1 ms", "10 s", "1 s", "0,01 s", ""));
        fizIN.add(new Pitanje("Kada se u kolo naizmjenične električne struje priključi kalem induktiviteta 2 mH njegov otpor iznosi 12,56 Ω. Kolika je frekvencija naizmjenične električne struje?", "1 kHz", "500 Hz", "100 Hz", "50 Hz", ""));
        fizIN.add(new Pitanje("Kolika je energija fotona čija je talasna duţina 500 nm?", "2,48  eV", "1,96 eV", "13,62  eV", "20,7  eV", ""));
        fizIN.add(new Pitanje("Na površinu tečnosti, iz vazduha, pada svjetlost pod uglom od 50° i prelama se  pod uglom od 30°. Kolika je brzina svjetlosti u tečnosti?", "195 811 km/s", "1 958 km/s", "195,8 km/s", "1958 km/h", ""));
        fizIN.add(new Pitanje("Aktivnost radioaktivnog ugljika C u svakom ţivom organizmu iznosi 250 Bq/kg. Koliko godina je star predmet, čija je aktivnost 50 Bq/kg? T = 5 600 godina", "13 005", "130", "1 300", "1 300 556", ""));
        return fizIN;
    }

    private ArrayList<Pitanje> getFilIZB() {
        ArrayList<Pitanje> Philosophy = new ArrayList<>();
        Philosophy.add(new Pitanje("Osnovna metoda koju Bejkn zagovara u svom učenju je metoda:", "Indukcije", "analize", "sinteze", "dedukcije", ""));
        Philosophy.add(new Pitanje("Svrha Bejknovog učenja o idolima je", "Oslobađanje od idola", "imenovanje idola", "Pronalaženje idola", "dedukcija idola", ""));
        Philosophy.add(new Pitanje("Koji idol(zablude, predrasude) po Bekonovoj teoriji ne pripada ovom nizu?", "idoli zavjere", "idoli plemen", "idoli spilje", "idoli trga", ""));
        Philosophy.add(new Pitanje("Država je stvar ugovora ljudi, druuštvenog ugovora o uređenju odnosa među ljudima a ne Boga ili drugih sila, smatrao je:", "Tomas Hobs", "Rene Dekart", "Dejvid Hjum", "Džordć Berkli", ""));
        Philosophy.add(new Pitanje("Tri stupnja spoznaje u Lokovoj filozofiji su", "senzitivna, demonstrativna i intuitivna", "idealna, praktična i afektivna", "čulna, razumska i umna", "osjetilna, psihička i mentalna", ""));
        Philosophy.add(new Pitanje("Lokov liberalizam polazi od stava", "da se svi ljudi rađaju jednaki i slobodni", "da svi ljudi nisu po rođenju jednaki u pitanju prava i sloboda", "temelj ljudskog djelovanja su društveni odnosi", "temelj ljudskih odnosa su privilegije koje dolaze rođenjem", ""));
        Philosophy.add(new Pitanje("Osnivač liberalizma i jedan od prvih zastupnika vjerske tolerancije je", "Džon Lok", "Rene Dekart", "Tomas Hobs", "Dejvid Hjum", ""));
        Philosophy.add(new Pitanje("Za osjetilne stvari, postojati znači biti percipiran stav je filozofa", "Dž. Berklija", "T. Hobsa", "Dž. Loka", "D. Hjuma", ""));
        Philosophy.add(new Pitanje("Koje je osnovno načelo zaključaka o činjenicama vanjskog svijeta prema Hjumu", "kauzalitet", "mehanicizam", "interakcija", "dedukcija", ""));
        Philosophy.add(new Pitanje("Hjumov konačni spoznajno-teorijski stav je stav da nije moguća objektivna spoznaja a priori. Kako se to stajalište naziva?", "empirizam", "skepticizam", "agnosticizam", "racionalizam", ""));
        Philosophy.add(new Pitanje("Kojem filozofu se pripisuje da je bio duhovni vođa prosvetiteljstva?", "Volteru", "Rusou", "Holbahu", "Robespijeru", ""));
        Philosophy.add(new Pitanje("Kada je Volter pokliknuo 'Uništite bestidnicu' na koga je on tada mislio?", "Na crkvu", "na vlast", "na državu", "na politiku", ""));
        Philosophy.add(new Pitanje("Izvorno značenje riječi filozofija određuje filozofiju kao:", "istraživanje-traganje za smislom", "vjerovanje", "mudrovanje", "meditaciju", ""));
        Philosophy.add(new Pitanje("Izvorno značenjne riječi filozofija je", "ljubav spram mudrosti", "nauka", "mudrost", "istraživanje", ""));
        Philosophy.add(new Pitanje("Teorijskim filozofskim disciplinama pripada:", "ontologija", "etika", "estetika", "filozofija politike", ""));
        Philosophy.add(new Pitanje("Idealizam se dijeli na", "subjektivni i objektivni", "primarni i sekundarni", "Platonov i Hegelov", "skepticizam i dogmatizam", ""));
        Philosophy.add(new Pitanje("Pitanjima o porijeklu naših spoznaja bavi se gnoseološka koncepcija", "empirizam", "skepticizam", "materijalizam", "dogmatizam", ""));
        Philosophy.add(new Pitanje("Etika se bavi problemima", "morala", "lijepog u umjetnosti", "bitka bića", "postojanja", ""));
        Philosophy.add(new Pitanje("Ocem grčke filozofije se smatra", "Tales", "Aristotel", "Sokrat", "Heraklit", ""));
        Philosophy.add(new Pitanje("Četiri su temeljna principa bića, voda, vatra zrak i zemlja, tvrdio je", "Empedokle", "Tales", "Anaksagora", "Anaksimandar", ""));
        Philosophy.add(new Pitanje("Neki od temeljnih izvora filozofije su", "čudjenje, potresenost, sumnje", "vjera", "razmišljanje", "idealizam, naturalizam", ""));
        Philosophy.add(new Pitanje("Koja od navedenih filozofskih disciplina pripada teorijskim filozofskim disciplinama?", "ontologija", "etika", "estetika", "filozofija politike", ""));
        Philosophy.add(new Pitanje("Poetičkim filozofskim disciplinama pripada:", "estetika", "etika", "filozofija politike", "gnoseologija", ""));
        Philosophy.add(new Pitanje("Ontologija ili opća metafizika je", "učenje o bitku bića", "spoznajna teorija", "učenje o porijeklu izvijesnosti i dosegu ljudske spoznaje", "filozofija umjetnosti", ""));
        Philosophy.add(new Pitanje("Materijalizam je koncepcija", "ontologije", "etike", "gnoseologije", "estetike", ""));
        Philosophy.add(new Pitanje("Materijalizam uči da je:", "materija primarna a svijest, ideja, duh su sekundarni, izvedeni", "materija duhovnog porijekla", "ideja primarna a materija izvedena, sekundarna", "bitak bića jedinstven u svojoj osnovi", ""));
        Philosophy.add(new Pitanje("Džon Lok je utemeljio", "spoznajnu teoriju (gnoseologiju)", "novovijekovnu filozofiju", "etiku", "ontologiju", ""));
        Philosophy.add(new Pitanje("Džon Lok je svoj zadatak odredio namjerom da istraži:", "porijeklo, izvijesnost i doseg ljudske spoznaje", "zablude (idole) ukorijenjene u ljudskom razumu", "osnovu sveg što jeste", "solipsizam", ""));
        Philosophy.add(new Pitanje("Pitanjima o porijeklu naših spoznaja bavi se gnoseološka koncepcija", "empirizam", "skepticizam", "materijalizam", "dogmatizam", ""));
        Philosophy.add(new Pitanje("Empirizam uči da je", "iskustvo izvor svih naših znanja", "bezumna volja iznad razuma", "sumnja put do istine", "razum izvor svih naših znanja", ""));
        Philosophy.add(new Pitanje("Racionalizam uči da", "do bitnih spoznaja dolazim umovanjem, čistim mišljenjem", "je iskustvo izvor svih naših znanja", "je racio (razum) bitak bića", "umovanje za svoj predmet ima svijet ideja", ""));
        Philosophy.add(new Pitanje("Škola Kozmološkog razdoblja grčke filozofije je", "Elejska", "Stoička", "Skeptička", "Kinička", ""));
        Philosophy.add(new Pitanje("Kao praelement, osnovu svega što jest, bitak bića, predstavnik Miletske škole Tales je odredio:", "voda", "vazduh", "apeiron", "vatra", ""));
        Philosophy.add(new Pitanje("Pitagorejci su odredili bitak bića kao", "broj", "neprekidnu promjenu", "pratvar", "vatru", ""));
        Philosophy.add(new Pitanje("Kojem filozofu se može pripisati slijedeći citat?\n„Svijet, ovaj isti za sva bića, nije stvorio nikakav Bog i nikakav čovjek, nego je uvijek bio, jeste i bit će vječno živa vatra koja se s mjerom pali i s mjerom gasi\".", "Heraklitu", "Hesiodu", "Hermodoru", "Empedoklu", ""));
        Philosophy.add(new Pitanje("Koje učenje povezuje Heraklita, Platona i Hegela?", "dijalektika", "materijalizam", "kozmologija", "idealizam", ""));
        Philosophy.add(new Pitanje("Demokrit je predstavnik", "atomista", "apologeta", "Elejaca", "skeptičke škole", ""));
        Philosophy.add(new Pitanje("Demokritovo filozofsko učenje se karakteriše kao", "materijalizam", "spiritualizam", "idealizam", "objektivni idealizam", ""));
        Philosophy.add(new Pitanje("Jedan od navedenih odgovora je tačan. Prepoznajte koji?", "Agnosticizam je odricanje spoznaji sposobnosti da spozna svijet", "Agnosticizam je priznavanje spoznaji sposobnosti da spozna svijet", "Agnosticizam je i priznavanje i odricanje spoznaji sposobnosti da spozna svijet", "Agnosticizam je sposobnost spoznaje a priori", ""));
        Philosophy.add(new Pitanje("Filozof koji je izvršio sintezu cjelokupnog znanstvenog iskustva grčke civilizacije, nakon kojeg otpočinje proces osamostaljivanja samostalnih znanstvenih područja kao područja samostalnih traganja, naziva se:", "Aristotel", "Tales", "Platon", "Protagora", ""));
        Philosophy.add(new Pitanje("Filozofija na Zapadu počinje", "u sedmom i šestom vijeku p.n.", "u šestom i sedmom vijeku vijeku n.e.", "u antropološkom periodu grčke filozofije", "u periodu srednjeg vijeka", ""));
        return Philosophy;

    }

}
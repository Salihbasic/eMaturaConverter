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
        Bosnian.add(new Pitanje("Koja glasovna promjena je izvr??ena u rije??ima slici, ruci, nozi:", "II palatalizacija", "jotovanje", "jedna??enje suglasnika po zvu??nosti ", "I palatalizacija ", ""));
        Bosnian.add(new Pitanje("Pravilno je napisan naziv institucije:", "Filozofski fakultet Univerziteta u Tuzli", "Filozofski fakultet univerziteta u Tuzli", "filozofski fakultet Univerziteta u Tuzli", "filozofski fakultet univerziteta u Tuzli", "Velikim po??etnim slovom pi??e se prvi ??lan naziva ustanova\nFilozofski fakultet je ustanova, Univerzitet u Tuzli je ustanova"));
        Bosnian.add(new Pitanje("Pravilno je napisano:", "Mostarac, Sarajlija, Tuzlak", "mostarac, sarajlija, tuzlak", "Mostarac, sarajlija, Tuzlak", "mostarac, Sarajlija, tuzlak", "Velikim po??etnim slovom se pi??u nazivi stanovnika(etnici) izvedeni od imena kontinenata, dr??ava, pokrajina, otoka, poluotoka, gradova, itd"));
        Bosnian.add(new Pitanje("Prema na??inu tvorbe, u sonante se ubrajaju:", "j, v, r, l, lj, m, n, nj", "b, p, d, t, g, k", "f, h, s, z, ??, ??", "??, ??, c, d??, ??", ""));
        Bosnian.add(new Pitanje("Prijedlozi su:", "u, na, po, kroz, niz", "lijepo, brzo, sporo", "a, e, i, o, u", "i, pa, te, niti, ni", "A,e,i,o,u ??? samoglasnici\nlijepo, brzo, sporo ??? prilozi\ni,pa,te,ni,niti-veznici"));
        Bosnian.add(new Pitanje("Kojem knji??evnom rodu pripadaju djela koja su pisali pisci Homer (Ilijada, Odiseja) i Vergilije (Eneida)?", "epskom ", "lirskom", "lirsko-epskom", "dramskom", "Ilijada, Odiseja i Eneida su anti??ki epovi"));
        Bosnian.add(new Pitanje("Ep o Nibelunzima je:", "njema??ki ep", "francuski ep", "asirsko-babilonski ep", "starogr??ki ep", "Ep o Nibelunzima je germanski ep na srednjogornjonjema??kom jeziku. Govori o boravku junaka Sigfrida Zmajoubojice na burgundskom dvoru, usmr??enju Sigfrida te o tome kako se njegova supruga Kriemhilda osvetila."));
        Bosnian.add(new Pitanje("Ekspresionizam svoju poetiku gradi, izme??u ostalog, na otporu prema:", "impresionizmu", "nadrealizmu", "futurizmu", "realizmu", ""));
        Bosnian.add(new Pitanje("Roman Pop ??ira i pop Spira napisao je:", "Stevan Sremac", "Simo Matavulj", "Borisav Stankovi??", "Svetozar Markovi??", "Pop ??ira i pop Spira je roman Stevana Sremca i ujedno njegovo najpopularnije delo. Tematski je vezan za vojvo??ansku sredinu (pi????ev rodni kraj), jednu od tri sredine koje je Sremac prikazivao u svojim knji??evnim delima."));
        Bosnian.add(new Pitanje("Moderna je skupni naziv za vi??e razli??itih stilskih formacija od druge polovice 19. stolje??a:", "simbolizam, impresionizam, parnas", "naturalizam, racionalizam, romantizam", "realizam, ekspresionizam, nadrealizam", "futurizam, nadrealizam, ekspresionizam", ""));
        Bosnian.add(new Pitanje("Koji od navedenih ju??noslavenskih pisaca ne pripada periodu romantizma:", "Antun Gustav Mato??", "Petar Preradovi??", "Jovan Jovanovi?? Zmaj", "Laza Kosti??", "Antun Gustav Mato?? je predstavnik moderne"));
        Bosnian.add(new Pitanje("Kako glasi ime djevojke u koju je Verter bio zaljubljen?", "Lotta", "Lenora", "Laura", "Lidija", "Rije?? je o romanu Jadi mladog Vertera"));
        Bosnian.add(new Pitanje("Molijer i Rasin pripadaju epohi:", "klasicizma", "renesanse", "romantizma", "baroka", "Molijer i Rasin su veliki francuski komediografi 17. stolje??a"));
        Bosnian.add(new Pitanje("Antigona je tragi??na junakinja koja je u sukobu sa:", "zemaljskim zakonima", "patrijarhalnim obi??ajima", "nebeskim zakonima", "rimskim zakonima", "Izdavanjem zapovijedi da Polinik, Antigonin brat, ostane nesahranjen, Kreont, novi vladar Tebe, slijedi atinski zakon koji ne dozvoljava pokop neprijatelja dr??ave"));
        Bosnian.add(new Pitanje("Sonet je vrsta lirske pjesme sastavljena od: ", "14 stihova raspore??enih u 4 strofe", "12 stihova raspore??enih u 3 strofe", "16 stihova raspore??enih u 4 strofe", "18 stihova raspore??enih u 5 strofa", "Sonet se sastoji iz dva katrena(4 stiha) i dvije tercine(3 stiha), ukupno 14"));
        Bosnian.add(new Pitanje("Osnovni red rije??i u bosanskom jeziku je: ", "subjekat ??? predikat ??? objekat", "objekat ??? subjekat ??? predikat", "subjekat ??? objekat ??? predikat", "atribut-predikat-subjekat", "Red rije??i u bosanskom jeziku je slobodan, ali osnovni red je SPO"));
        Bosnian.add(new Pitanje("Veznici suprotnih re??enica su: ", "a, ali, nego, ve??, dok", "samo, jedino, tek, tek ??to, jedino ??to", "i, pa, te, ni niti", "u, na, o, po", ""));
        Bosnian.add(new Pitanje("Koje su se glasovne promjene dogodile u sljede??im primjerima: vuci, znaci, orasi?", "II palatalizacija", "I palatalizacija", "III palatalizacija", "jotovanje", "Druga palatalizacija: k,g,h prelazi u c,z,s\norah->orahi->orasi"));
        Bosnian.add(new Pitanje("Veznik \"ili\" je:", "rastavni", "zaklju??ni", "sastavni", "suprotni", "Rastavni veznici su: ili, ili ??? ili, bilo ??? bilo"));
        Bosnian.add(new Pitanje("Obilje??i pravilno napisan superlativ:", "najju??niji", "naj ju??niji", "naju??niji", "najjju??niji", "Kod pridjeva i priloga koji po??inju slovom j, u superlativu dolazi do dupliranja ovog glasa\njak->najja??i ju??ni->najju??niji"));
        Bosnian.add(new Pitanje("??ta predstavlja prolog u djelu M. Dr??i??a \"Dundo Maroje\" u razvoju dramske radnje?", "ekspoziciju", "propoziciju", "egzibiciju", "peripetiju", "Na po??etku, u obliku ekspozicije u djelo, Dr??i?? je napisao dva prologa, jedan autorski te jedan negromantov (??arobnjakov). Kao i u mnogim ranijim komedijama, tako i u ovoj prolog je iznimno va??an za razumijevanje djela. Prvi prolog je prolog negromanta u kojem Dr??i?? govori da ??e ova komedija pokazati ko su \"ljudi nahvao\", a ko su \"ljudi nazbilj\"."));
        Bosnian.add(new Pitanje("Autor drama: ???Kralj Edip???, ???Antigona??? ???Ajant??? je:", "Sofokle", "Eshil", "Aristofan", "Anakreont", "Rije?? je o anti??kim tragedijama"));
        Bosnian.add(new Pitanje("Intertekst je:", "tekst  jednog autora prisutan u  tekstu drugog autora", "okvirna pri??a", "niz tekstova", "kontekst", ""));
        Bosnian.add(new Pitanje("Koja je stilska figura upotrijebljena u sljede??im stihovima:\n" +
                " ???Treba da ??ivi?? me?? ljudima a rije??i nema??\n" +
                " treba da ??ivi?? me?? vucima a zuba nema?????\n", "anafora", "epifora", "metonimija", "onomatopeja", "Anafora je stilska figura ponavljanja niza rije??i na po??etku vi??e uzastopnih stihova\nU ovom slu??aju: Treba da ??ivi?? me??"));
        Bosnian.add(new Pitanje("Autor pjesme ???Pjesnici??? iz koje je stih: \"Pjesnici su ??u??enje u svijetu\"  je:", "Antun Branko ??imi??", "Musa ??azim ??ati??", "Antun Gustav Mato??", "Me??a Selimovi??", "Pjesma je dio ??imi??eve zbirke Preobra??enja"));
        Bosnian.add(new Pitanje("Tragedija ???Hamlet??? V. ??ekspira pripada:", "renesansi", "klasicizmu", "baroku", "racionalizmu", "??ekspir je najve??i dramati??ar renesanse"));
        Bosnian.add(new Pitanje("Potur-??ehidija, rje??nik u stihovima iz 1631. godine nastao je u okolini Tuzle. Sadr??i oko 700 rije??i bosanskog jezika. Svoj jezik autor dosljedno naziva bosanskim. Rje??nik je sa??inio: ", "Muhamed Hevaji Uskufi", "Mula Mustafa Ba??eskija", "Dervi??-pa??a Bajezidagi??", "Muhamed Nerkesija", ""));
        Bosnian.add(new Pitanje("??ta povezuje djela \"Ne??ista krv\" B. Stankovi??a i M. Krle??e \" Gospoda Glembajevi\"?", "vjerski ambijent", "mjesto radnje", "nacionalni ambijent", "ideja panslavizma", ""));
        Bosnian.add(new Pitanje("\"Svjestan sam da moram u??initi sve da istina izi??e na vidjelo... Osu??en sam istinom.\" Ovo su rije??i iz monologa:", "Ahmeda Nurudina", "Hamleta", "Leona Glembaja", "Sluge Muzafera", "Monolog iz romana Dervi?? i smrt"));
        Bosnian.add(new Pitanje("U \"Kanconijeru\" ljubav je izra??ena prema: ", "Lauri", "Juliji", "Penelopi", "Merimi", "Kanconijer je zbirka pjesama Fran??eska Petrarke"));
        Bosnian.add(new Pitanje("Zaokru??i ta??nu tvrdnju:", "Alber Kami je poginuo u automobilskoj nesre??i.", "Alber Kami je umro od pretjerane konzumacije alkohola.", "Alber Kami je poginuo u avionskoj nesre??i.", "Alber Kami je umro od starosti.", "Alber Kami je poginuo u saobra??ajnoj nesre??i 1960. nadomak Pariza"));
        Bosnian.add(new Pitanje("Zaokru??i ta??nu tvrdnju: ", "Me??a Selimovi?? je ro??en u Tuzli, a umro u Beogradu.", "Me??a Selimovi?? je ro??en u Tuzli, a umro u Sarajevu.", "Me??a Selimovi?? je ro??en i umro u Tuzli.", "Me??a Selimovi?? je ro??en u Tuzli, a umro u Mostaru.", ""));
        Bosnian.add(new Pitanje("Zaokru??i ta??nu tvrdnju:", "Mak Dizdar je ro??en u Stocu a umro u Sarajevu.", "Mak Dizdar je ro??en i umro u Stocu.", "Mak Dizdar je ro??en u Konjicu a umro u Sarajevu.", "Mak Dizdar je ro??en i umro u Sarajevu.", ""));
        Bosnian.add(new Pitanje("Zaokru??i ta??nu tvrdnju:", "Pjesmu \"Sumatra\" napisao je Milo?? Crnjanski.", "Pjesmu \"Sumatra\" napisao je Tin Ujevi??.", "Pjesmu \"Sumatra\" napisao je Antun Branko ??imi??.", "Pjesmu \"Sumatra\" napisao je\" Aleksa ??anti??.", ""));
        Bosnian.add(new Pitanje("Koju zbirku pjesama nije napisao Mak Dizdar:", "Lelek sebra", "Kameni spava??", "Okrutnost kruga", "Koljena za madonu", "Lelek Sebra je djelo Tina Ujevi??a"));
        Bosnian.add(new Pitanje("Junakinja romana Ne??ista krv zove se:", "Sofka", "Refka", "??tefka", "Ko??tana", "Rije?? je o djelu Bore Stankovi??a"));
        Bosnian.add(new Pitanje("Djelo Danila Ki??a ??as anatomije je:", "polemi??ki pamflet", "roman", "pripovijetka", "drama", "??as anatomije je veliki polemi??ki spis u kome ovaj pisac govori o knji??evnosti, svojim delima, ali i o politici i dru??tvu."));
        Bosnian.add(new Pitanje("Junak romana Stranac, na pitanje zbog ??ega je ubio, odgovara:", "zbog sunca", "zbog snijega", "zbog ki??e", "zbog magle", "Junak romana Stranac, Merso, je ubio jer mu je smetao odsjaj koji se odbijao od no??"));
        Bosnian.add(new Pitanje("Zaokru??i slovo pod kojim se nalazi dio koji ne pripada  zbirci pjesama Maka Dizdara Kameni spava??:", "Slovo o vodi", "Slovo o ??ovjeku", "Slovo o nebu", "Slovo o slovu", "Slovo o vodi ne postoji"));
        Bosnian.add(new Pitanje("Junaci Krle??inih djela Gospoda Glembajevi i Povratak Filipa Latinovicza su:", "Filip i Leon", "Lion i Filip", "Leon i Sizif", "Sizif i Filip", ""));
        Bosnian.add(new Pitanje("Zaokru??i pravilno napisane oblike!", "Sjedinjene Ameri??ke Dr??ave, Obala Slonove Kosti", "sjedinjene Ameri??ke dr??ave, Obala slonove kosti", "Sjedinjene ameri??ke dr??ave, Obala Slonove kosti", "Sjedinjene Ameri??ke dr??ave, obala Slonove Kosti", "Velikim po??etnim slovom se pi??u svi ??lanovi naziva dr??ava, izuzev prijedloga i veznika\n" +
                "npr Bosna i Hercegovina"));
        Bosnian.add(new Pitanje("Bosanski/hrvatski/srpski jezik spadaju u grupu:", "slavenskih jezika", "ruskih jezika", "germanskih jezika", "zasebnih jezika", "Bosanski, hrvatski i srpski spadaju u ju??noslavenske jezike"));
        Bosnian.add(new Pitanje("U na??em jeziku postoji:", "30 glasova", "40 glasova", "26 glasova", "29 glasova", "A,B,C,??,??,D,D??,??,E,F,G,H,I,J,K,L,LJ,M,N,NJ,O,P,R,S,??,T,U,V,Z,??"));
        Bosnian.add(new Pitanje("U vokativu jednine imenice VOJNIK (VOJNI??E) izvre??na je slijede??a glasovna promjena:", "I palatalizacija", "II palatalizacija", "III palatalizacija", "a??enje suglasnika po zvu??nosti", "Prva palatalizacija: k,g,h prelazi u ??,??,?? \nvojnik->vojnike->vojni??e"));
        Bosnian.add(new Pitanje("U komparativu pridjeva MLAD (MLA??I) izvr??ena je slijede??a glasovna promjena:", "Jotovanje", "Nepostojano A", "Jedna??enje suglasnika po na??inu tvorbe", "Gubljenje suglasnika", "Jotovanje: mlad+ji->mladji->mla??i"));
        Bosnian.add(new Pitanje("U na??em jeziku sonanata ima:", "osam", "deset", "dvanaest", "sedam", "Sonanti su j,v,r,l,lj,m,n,nj"));
        Bosnian.add(new Pitanje("Pravilno je napisano:", "ku??a, kre??, no??", "ku??a, kre??, no??", "ku??a, kre??, no??", "ku??a, kre??, no??", ""));
        Bosnian.add(new Pitanje("U na??em jeziku postoji", "7 pade??a", "6 pade??a", "8 pade??a", "5 pade??a", "Nominativ, genitiv, dativ, akuzativ, vokativ, instrumental, lokativ"));
        Bosnian.add(new Pitanje("Prilo??kim odredbama se obilje??ava", "mjesto, vrijeme, na??in, uzrok i namjera", "vr??ilac radnje", "predmet radnje", "sama radnja", ""));
        Bosnian.add(new Pitanje("Sevdalinka je", "tip usmene lirske pjesme", "tip usmene epske pjesme", "tip usmene epsko-lirske pjesme", "tip usmene lirsko-epske pjesme", ""));
        Bosnian.add(new Pitanje("Drugi naziv za figure dikcije je", "glasovne figure", "figure rije??i", "figure konstrukcije", "figure misli", ""));
        Bosnian.add(new Pitanje("Najve??e djelo asirsko-babilonske knji??evnosti je", "Ep o Gilgame??u", "Ilijada", "Odiseja", "??ahnama", ""));
        Bosnian.add(new Pitanje("Samo jedan pisac pripada renesansi", "Viljem ??ekspir", "Valter Skot", "??an ??ak Ruso", "Molijer", "Valter Skot je predstavnik realizma, Ruso prosvetiteljstva, a Molijer klasicizma"));
        Bosnian.add(new Pitanje("Koji od ovih pisaca je predstavnik hrvatske renesanse", "Marin Dr??i??", "Ivan Gunduli??", "August ??enoa", "Ante Kova??i??", "Marin Dr??i??, najve??e ime hrvatske renesanse"));
        Bosnian.add(new Pitanje("Ono ??to je pisano na bosanskom jeziku arapskim pismom naziva se", "alhamijado knji??evnost", "epsitolarna knji??evnost", "knji??evnost na orijentalnim jezicima", "srednjovjekovna knji??evnost", ""));
        Bosnian.add(new Pitanje("Koji je hronolo??ki slijed knji??evnih epoha i pravaca ispravan?", "antika, srednji vijek, renesansa, klasicizam, romantizam", "antika, srednji vijek, renesansa, romantizam, klasicizam", "antika, srednji vijek, klasicizam, renesansa, romantizam", "antika, renesansa, srednji vijek, klasicizam, romantizam", "Antika (od 6.st pne do 5. st nove) \n" +
                "Srednji vijek (od 6. do 13 st.)\n" +
                "Renesansa (13. do 16. st)\n" +
                "Klasicizam(druga polovina 17.st i prva polovina 18.st)\n" +
                "Romantizam(kraj 18. st do polovine 19.st)"));
        Bosnian.add(new Pitanje("Andri?? je naro??ito volio da razgovara sa jednim slikarom", "sa Gojom", "sa Gogenom", "sa Pikasom", "sa Rembrantom", ""));
        Bosnian.add(new Pitanje("Ko Kosari ??na putevima Gospodnjim?? poru??uje da je voli", "Gor??in", "Semorad", "Gurba??", "Mak", "Pjesma Maka Dizdara, Gor??in"));
        Bosnian.add(new Pitanje("Imenice, glagoli, pridjevi, brojevi, zamjenice i prilozi ubrajaju se u", "punozna??ne rije??i", "sintakseme", "nepunozna??ne rije??i", "morfeme", ""));
        Bosnian.add(new Pitanje("Prvo slavensko pismo je", "glagoljica", "??irilica", "bosan??ica", "latinica", "Glagoljica je staroslavensko pismo nastalo sredinom 9. vijeka. Autorima ovog pisma smatraju se bra??a ??iril i Metodije"));
        Bosnian.add(new Pitanje("Dio gramatike koji se bavi oblicima i tvorbom rije??i naziva se", "morfologija", "fonetika", "sintaksa", "leksikologija", ""));
        Bosnian.add(new Pitanje("Glagolski vid izra??ava", "(ne)ograni??enost glagolske radnje", "na??in glagolske radnje", "preciznost glagolske radnje", "validnost glagolske radnje", "Glagolski vid mo??e biti svr??eni i nesvr??eni"));
        Bosnian.add(new Pitanje("Ispravno je napisano", "??evabd??inica", "??evapd??inica", "??evap??inica", "??evap??inica", "U rije??i ??evabd??inica dolazi do jedna??enja suglasnika po zvu??nosti; p postaje b"));
        Bosnian.add(new Pitanje("Antigona zastupa", "bo??ansku pravdu", "volju brata", "kralja", "dru??tvene zakone", ""));
        Bosnian.add(new Pitanje("Najve??i pjesnik srednjega vijeka bio je", "Fran??esko Petrarka", "Dante Aligijeri", "Viljem ??ekspir", "??ovani Boka??o", "Petrarka je poznat po zbirci Kanconijer"));
        Bosnian.add(new Pitanje("Iz koje pjesme su sljede??i stihovi: Pu??ina plava spava   prohladni pada mrak  vrh hridi crne trne  zadnji rumeni zrak", "Ve??e na ??kolju", "Sumatra", "Zapis o zemlji", "Pjesma jednom brijegu", "Rije?? je o pjesmi Alekse ??anti??a"));
        Bosnian.add(new Pitanje("Doga??aji opisani u noveli Miroslava Krle??e Baraka 5 be vezani su za", "Prvi svjetski rat", "Drugi svjetski rat", "Balkanske ratove", "Zalivski rat", ""));
        Bosnian.add(new Pitanje("Koje djelo ne pripada Lavu Tolstoju", "Bra??a Karamazovi", "Rat i mir", "Ana Karenjina", "Had??i Murat", "Bra??a Karamazovi je djelo Fjodora Dostojevskog"));
        Bosnian.add(new Pitanje("U baladi Hasanaginica imotski kadija je Hasanagini??in", "prosac", "mu??", "brat", "otac", ""));
        Bosnian.add(new Pitanje("Ivo Andri?? je napisao sljede??a djela", "Na Drini ??uprija, Travni??ka hronika, Gospo??ica", "Na Drini ??uprija, Travni??ka hronika, Hasanaginica", "Na Drini ??uprija, Travni??ka hronika, Tvr??ava", "Na Drini ??uprija, Travni??ka hronika, Pobune", "Hasanaginica je narodna balada, Tvr??ava je djelo Me??e Selimovi??a, Pobune je djelo Dervi??a Su??i??a"));
        Bosnian.add(new Pitanje("Roman U registraturi je napisao", "Ante Kova??i??", "August ??enoa", "Ivica Ki??manovi??", "K??aver ??andor ??alski", ""));
        Bosnian.add(new Pitanje("Pravilno je napisano:", "Narod vjeruje u jednog Boga i naziva Ga razli??itim imenima", "Narod vjeruje u jednog Boga i naziva ga razli??itim imenima", "Narod vjeruje u jednog boga i naziva ga razli??itim imenima", "Narod vjeruje u Jednog boga i naziva ga razli??itim imenima", "Velikim po??etnim slovom se pi??e Bog, pridjev Bo??iji, kao i svi zamjeni??ki oblici koji se odnose na Boga (On, Njega, Ga, Mu,...)"));
        Bosnian.add(new Pitanje("Pravilno je napisano:", "Smje??teni smo u hotelu ??Tuzla??", "Smje??teni smo u Hotelu ??Tuzla??", "Smje??teni smo u hotelu Tuzla", "Smje??teni smo u Hotelu tuzla", ""));
        Bosnian.add(new Pitanje("U imenici BUREGD??INICA izvr??ena je glasovna promjena", "jedna??enje suglasnika po zvu??nosti", "palatalizacija", "jotovanje", "jedna??enje suglasnika po mjestu tvorbe", "U rije??i ??evabd??inica dolazi do jedna??enja suglasnika po zvu??nosti; p postaje b"));
        Bosnian.add(new Pitanje("Silazni akcenti nalaze se isklju??ivo na:", "jednoslo??noj rije??i", "prvom slogu", "posljednjem slogu", "srednjem slogu", ""));
        Bosnian.add(new Pitanje("Infinitiv je", "osnovni bezli??ni glagolski oblik", "osnovni li??ni glagolski oblik", "izvedeni bezli??ni glagolski oblik", "izvedeni li??ni glagolski oblik", ""));
        Bosnian.add(new Pitanje("U pravilu, pridjevi se sla??u s imenicom uz koju dolaze i to se naziva", "kongruencija", "konjugacija", "konkurencija", "deklinacija", ""));
        Bosnian.add(new Pitanje("Kako se zove Antigonin brat?", "Polinik", "Kreont", "Laj", "Edip", "Rije?? je o istoimenoj drami, Antigona"));
        Bosnian.add(new Pitanje("Doga??aji opisani u noveli Hasana Kiki??a K. und K. goveda vezani su za", "Prvi svjetski rat", "Otad??binski rat", "Balkanske ratove", "Drugi svjetski rat", "K und K je skra??enica za kaiserlich und k??niglich , odnosi se na austro-ugarsku vojsku"));
        Bosnian.add(new Pitanje("Koje djelo pripada Lavu Tolstoju", "Bra??a Karamazovi", "Zlo??in i kazna", "Mrtve du??e", "Had??i Murat", "Zlo??in i kazna te Bra??a Karamazovi su djela Fjodora Dostojevskog, a Mrtve du??e Gogolja"));
        Bosnian.add(new Pitanje("Ivo Andri?? nije napisao", "Nevakat", "Ex Ponto", "Asku i vuka", "Travni??ku hroniku", "Nevakat je napisao Dervi?? Su??i??"));
        Bosnian.add(new Pitanje("Pravilno je napisano", "Nekada je na Balkanu vladala Austro-Ugarska", "Nekada je na Balkanu vladala austro-ugarska", "Nekada je na balkanu vladala Austro-ugarska", "Nekada je na Balkanu vladala austro-ugarska", "Balkan kao regija se pi??e velikim slovom, dok se svi ??lanovi imena dr??ava pi??u velikim slovom"));
        Bosnian.add(new Pitanje("Pravilno je napisano:", "Najmla??i se obraduju dolasku Djeda Mraza", "Najmla??i se obraduju dolasku djeda mraza", "Najmla??i se obraduju dolasku Djeda mraza", "Najmla??i se obraduju dolasku djeda Mraza", "Djeda Mraz se tretira kao ime i prezime; sli??no je i sa Snje??kom Bijeli??em"));
        Bosnian.add(new Pitanje("U instrumentalu jednine imenice KRV (krvlju) izvr??ena je glasovna promjena", "jotovanje", "prelazak o>e", "prelazak l>o", "nepostojano a", ""));
        Bosnian.add(new Pitanje("Jednoslo??ne rije??i uvijek imaju", "silazne akcente", "uzlazne akcente", "duge akcente", "kratke akcente", ""));
        Bosnian.add(new Pitanje("Epski ??anrovi u stihu su", "epska pjesma i ep", "lirska pjesma i poema", "komedija i tragedija", "novela i pripovijetka", ""));
        Bosnian.add(new Pitanje("Aristofan i Plaut su bili", "najve??i komediografi anti??ke knji??evnosti", "najve??i pjesnici anti??ke knji??evnosti", "najve??i pisci tragedija u anti??koj knji??evnosti", "najve??i prozni pisci anti??ke knji??evnosti", "Aristofan je anti??ki gr??ki komediograf, a Plaut rimski"));
        Bosnian.add(new Pitanje("Tri pisca pripadaju istome knji??evnom pravcu, jedan ne. Ko je ovdje uljez?", "Miguel de Servantes", "Viktor Igo", "J. V. Gete", "A. S. Pu??kin", "Servantes pripada renesansi dok ostali pripadaju romantizmu"));
        Bosnian.add(new Pitanje("Kanconijer je napisao:", "Fran??esko Petrarka", "Dante Aligijeri", "??ovani Boka??o", "Ludoviko Ariosto", "Kanconijer je zbirka soneta"));
        Bosnian.add(new Pitanje("U komediji Marina Dr??i??a Dundo Maroje", "Pera je bila vjerenica a Laura ljubavnica Marova", "i Pera i Laura su bile vjerenice Marove", "i Pera i Laura su bile ljubavnice Marove", "Pera je bila ljubavnica a Laura vjerenica Marova", ""));
        Bosnian.add(new Pitanje("Koji je hronolo??ki slijed knji??evnih epoha i pravaca ispravan?", "klasicizam, romantizam, realizam, simbolizam", "klasicizam, romantizam, simbolizam, realizam", "klasicizam, realizam, romantizam, simbolizam", "klasicizam, realizam, simbolizam, romantizam", "Klasicizam(druga polovina 17.st i prva polovina 18.st)\nRomantizam(kraj 18.st do polovine 19.st)\nRealizam(tridesete godine do sedamdesetih 19.st)\nSimbolizam(dio Moderne, koja traje od sredine 19.st do 1914.)"));
        Bosnian.add(new Pitanje("Ako .................... sretnete \n" +
                "Na putevima  Gospodnjim \n" +
                "Molju Ska??ite\n" +
                "Za vjernost Moju\n", "Kosara", "Laura", "Lota", "Dora", "Posljednji stihovi pjesme Gor??in (Mak Dizdar)"));
        Bosnian.add(new Pitanje("Latinica je", "fonetsko-fonolosko pismo", "fonolosko pismo", "morfonolosko pismo", "fonetsko pismo", ""));
        Bosnian.add(new Pitanje("Fonologija prou??ava", "glasovni sastav rije??i", "glasove s njihove fiziolo??ko-akusticne strane", "glasove kao razlikovne jedinice", "vrste, oblike i tvorbu rije??i", "Fonologija je nauka koja prou??ava kako jezik iskori??tava razlikovnu funkciju fonema radi komunikacije"));
        Bosnian.add(new Pitanje("Rod je gramati??ka kategorija", "koja se ogleda u slaganju imenica s pridjevskim rije??ima i, ??esto, glagolima", "po kojoj se razlikuje jedinka onoga sto imenica ozna??ava", "Koja ovisi o suglasnicima na kraju osnove", "kojom se izra??avaju razli??iti odnosi onoga ??to rije?? zna??i prema ostalim rije??ima u sintagmi i re??enici", ""));
        Bosnian.add(new Pitanje("Imenice otac, kroja??, ??ena, lisac, ovca, sestra imaju", "prirodni rod", "gramati??ki rod", "neprirodni rod", "opisni rod", "Prirodni rod imaju imenice koje ozna??avaju bi??a i njihovu razliku u polu. Prirodni rod mo??e biti samo mu??ki ili ??enski jer u prirodi ne postoje bi??a srednjeg pola. Me??utim, imenice koje ozna??avaju mlada lica, kod kojih jo?? nisu jasno izra??ene karakteristike pola, su imenice srednjeg roda."));
        Bosnian.add(new Pitanje("Koliko veznika ima u sljede??oj re??enici: Srela sam drugaricu i njezinu sestru pa dogovorila s njima odlazak  u kino.", "dva", "nijedan", "jedan", "tri", " Veznici u ovoj re??enici su *i* i *pa*"));
        Bosnian.add(new Pitanje("Jedan od ponu??enih naslova nije ta??an", "Vitomir Luki??: Hodnici svijetloga straha", "Mirko Kova??: Ruganje s du??om", "An??elko Vuleti??: Deveto ??udo na istoku", "Vesna Parun: Ti koja ima?? nevinije ruke", "Pravilan naslov je Hodnici svijetloga praha"));
        Bosnian.add(new Pitanje("Jedan autor nije ???vlasnik??? svoga djela:", "Oskar Davi??o: Krov", "Ranko Marinkovi??: Ruke", "Mirko Kova??: Ruganje s du??om", "Vladan Desnica: Prolje??a Ivana Galeba", ""));
        Bosnian.add(new Pitanje("Hamza Humo je 1919. godine objavio zbirku pjesama nagla??ene ekspresionisti??ke stilizacije, koja nosi naslov:", "Nutarnji ??ivot", "Haremska lirika", "Hercegova??ki pejza??i", "Lelek sebra", ""));
        Bosnian.add(new Pitanje("Kojem knji??evnom rodu pripadaju djela Teubei-nesuh, Gor??in, Emina?", "lirskom", "epskom", "dramskom", "lirsko-epskom", "Rije?? je o pjesmama"));
        Bosnian.add(new Pitanje("Kako se zove bjegunac koji je potra??io spas u tekiji u romanu Dervi?? i smrt?", "Ishak", "Hasan", "Mula Jusuf", "Harun", ""));
        Bosnian.add(new Pitanje("Onjegin, Pe??orin i Oblomov su tipolo??ki izdvojena skupina likova u ruskoj knji??evnosti poznata kao:", "tip suvi??nog ??ovjeka", "tip malog ??ovjeka", "tip velikog ??ovjeka", "tip dosadnog ??ovjeka", "Rije?? je o glavnim junacima djela iz romantizma"));
        Bosnian.add(new Pitanje("U zbirci pjesama Kanconijer Fran??eska Petrarke, neta??no je", "nekoliko pjesama ispjevano je u formi poeme", "najve??i broj pjesama ispjevan je u formi soneta", "nekoliko pjesama ispjevano je u formi madrigala", "nekoliko pjesama ispjevano je u formi kancone", ""));
        Bosnian.add(new Pitanje("U epskoj pjesmi Budalina Tale dolazi u Liku junak Tale", "odlazi u Kotare do kule Smiljani??a da otme Smiljani??a seju An??eliju", "odlazi u Kotare do kule Smiljani??a da se priklju??i slavlju", "odlazi u Kotare do kule Smiljani??a da mu preda knjigu od Mustaj-bega Li??kog", "odlazi u Kotare do kule Smiljani??a da ga izazove na mejdan", ""));
        Bosnian.add(new Pitanje("Jedan od navedenih pisaca je uljez", "Aristofan", "Eshil", "Euripid", "Sofokle", "Aristofan je pisao komedije, a ostala trojica tragedije"));
        Bosnian.add(new Pitanje("U jednoj ljubavnoj pjesmi Maka Dizdara pojavljuju se", "Gor??in i Kosara", "Stjepan i Katarina", "Med??nun i Lejla", "Gor??in i Teodora", "Rije?? je o pjesmi Gor??in"));
        Bosnian.add(new Pitanje("Prozni epski ??anrovi su", "novela i pripovijetka", "komedija i tragedija", "lirska pjesma i poema", "epska pjesma i ep", ""));
        Bosnian.add(new Pitanje("Jedan od navedenih pisaca ne pripada renesansi", "??an Rasin", "Fransoa Rable", "Miguel de Servantes", "Viljem ??ekspir", ""));
        Bosnian.add(new Pitanje("Kako se zove mladi?? kojega je Ahmed Nurudin jo?? kao dje??aka doveo u tekiju?", "Mula Jusuf", "Hafiz Muhamed", "Hasan", "Ishak", "Pitanje se odnosi na roman Dervi?? i Smrt"));
        Bosnian.add(new Pitanje("Holden, lik iz romana Lovac u ??itu , kao uspomenu na mrtvog brata Elija ??uva", "rukavicu za bejzbol", "prsten", "dnevnik", "sat", ""));
        Bosnian.add(new Pitanje("Koja se stilska figura nalazi u sljede??im stihovima Alekse ??anti??a:  Ko li mi te ??tedi, ko li mi te brani\nod gladnih ptica, muko moja tvrda?", "retori??ko pitanje", "metafora", "alegorija", "paradoks", "Retori??ko pitanje stilska je figura u kojoj se na postavljeno pitanje ne o??ekuje odgovor."));
        Bosnian.add(new Pitanje("Kojom je vrstom stiha napisana Ilijada?", "heksametrom", "dvostruko rimovanim dvanaestercem", "aleksandrincem", "epskim desetercem", "Heksametar je stih od ??est metri??kih jedinica. Najpoznatiji i najva??niji je daktilski heksametar"));
        Bosnian.add(new Pitanje("Najve??i dramski pisac renesanse bio je", "??ekspir", "Kornej", "Molijer", "Rasin", ""));
        Bosnian.add(new Pitanje("Koja se re??enica ne odnosi na barok", "Knji??evnost toga razdoblja obilje??ava te??nja za rasko??nosti i gomilanjem stilskih sredstava", "Knji??evnost toga razdoblja njeguje religioznu poemu i melodramu, a dominiraju ljubavna i rodoljubiva tematika", "Knji??evnici toga doba nisu ??eljeli podra??avati Prirodu, i te??e ka neo??ekivanom, bizarnom (neobi??nom i ??udnom) i opskurnom", "Za knji??evnost toga razdoblja tipi??ne su teme dru??tvena stvarnost i ??ovjekov psihi??ki ??ivot", ""));
        Bosnian.add(new Pitanje("Zaokru??i pravilno izvedenu komparaciju", "visok ??? vi??i ??? najvi??i", "visok ??? vi??lji ??? najvi??lji", "visok ??? viso??iji ??? najviso??iji", "visok ??? visokiji ??? najvisokiji", "Pridjev visok gubi sufiks -ok i dodaje se nastavak -ji. Tom prilikom dolazi do glasovne promjene jotovanja (s + j = ??) te potom komparativ pridjeva visok glasi vi??i."));
        Bosnian.add(new Pitanje("Skra??eni (enkliti??ki) oblici prezenta pomo??nog glagola biti, oblika jesam, glase:", "sam, si, je, smo, ste, su", "jesam, jesi, jest, jesmo, jeste, jesu", "budem, bude??, bude, budemo, budete, budu", "ne postoje skra??eni oblici", ""));
        Bosnian.add(new Pitanje("U re??enici Zaista mi se svidio sestrin prsten, rije?? sestrin je", "prisvojni pridjev", "opisni pridjev", "gradivni pridjev", "imenica", ""));
        Bosnian.add(new Pitanje("Re??enica \"Zamandalih vrata i krenuh od ku??e\" ubraja se u", "sastavne re??enice", "suprotne re??enice", "rastavne re??enice", "mjesne re??enice", "Prisustvo veznika *i* nas upu??uje da je rije?? o sastavnoj re??enici"));
        Bosnian.add(new Pitanje("Kada je nastala Povelja Kulina bana?", "1189. godine", "1172. godine", "1192. godine", "1202. godine", "Povelja Kulina bana je nastala 29.08.1189."));
        Bosnian.add(new Pitanje("Zaokru??i slovo ispred pravilno napisanog primjera", "Modra??ko jezero", "Modra??ko Jezero", "modra??ko Jezero", "modra??ko jezero", "Kod geografskih imena velikim po??etnim slovom se pi??e samo prvi ??lan, osim ako se ostali ??lanovi sami po sebi ne pi??u velikim slovom. Ovo se odnosi na jezera"));
        Bosnian.add(new Pitanje("Interpunkcijski znak ???ta??ka-zarez??? ; koristi se kada se", "ozna??ava re??eni??na pauza du??a od zareza a kra??a od ta??ke", "zavr??ava re??enica s nepreciznom informacijom", "isti??e nedovr??enost re??enice", "nagla??ava izostavljenost dijela re??enice", "Ta??ka zarez se obi??no stavlja izme??u jedinica koje bi ta??ka razdvojila preo??tro, a zarez nedovoljno uo??ljivo"));
        Bosnian.add(new Pitanje("Zaokru??i slovo ispred ta??no napisanog glagolskog pridjeva radnog glagola ??eljeti", "??elio", "??eljeo", "??elijo", "??ele??i", "Glagolski pridjev radni tvori se od infinitivne osnove i nastavaka: -o (nastao vokalizacijom od -l), -la, -lo; -li, -le, -la; -ao (ako osnova zavr??ava suglasnikom i u glagola s nastavkom -??i), -la, -lo; -li, -le, -la."));
        Bosnian.add(new Pitanje("U promjeni hljeb > hljep??i?? vr??i se", "jedna??enje suglasnika po zvu??nosti", "druga palatalizacija", "jedna??enje suglasnika po mjestu tvorbe", "asimilacija samoglasnika", "B prelazi u svoj bezvu??ni parnjak p ispred c, ??, ??, f, h, k, s, ??, t"));
        Bosnian.add(new Pitanje("Zaokru??i slovo ispred pravilno napisanih skra??enica za: kilometar, Televiziju Tuzlanskog kantona i Bosnu i Hercegovinu", "km, TVTK, BiH", "KM, TV TK, BIH", "Km, TVTK, BiH", "KM, TVTK, BiH", "Veznik *i* se pi??e malim slovom u slo??enim skra??enicama, a ostala slova su velika"));
        Bosnian.add(new Pitanje("Izaberi pravilno napisane oblike jednina/mno??ina/genitiv jednine", "ru??ilac  ru??ioci  ru??ioca", "ru??ioc  ru??ilci  ru??ioca", "ru??ioc  ru??ioci  ru??ioca", "ru??ilac  ru??ilci  ru??ioca", "Kod imenica koje zavr??avaju na -lac dolazi do zamjene l/o i nepostojanog a"));
        Bosnian.add(new Pitanje("Pravilno je napisano", "U??enica sam Gimnazije ???Me??a Selimovi?????", "U??enica sam gimnazije Me??a Selimovi??", "U??enica sam ???gimnazije Me??a Selimovi??", "U??enica sam ???gimnazije 'Me??a Selimovi??'???", "Ukoliko se ??eli naglasiti zvani??ni naziv pojmova koji imaju ??ire i u??e ime, me??u navodnicima se pi??e i??e ime:\nGimnazija ???Me??a Selimovi?????"));
        Bosnian.add(new Pitanje("Dante je najpoznatiji kao autor ??uvene Bo??anstvene komedije . Kojeg pisca dovodimo u vezu s Ljudskom komedijom", "Balzaka (Honore de Balzac)", "Borisava Stankovi??a", "??ekspira (W. Shakespeare)", "Edhema Mulabdi??a", "Ljudska komedija (franc. La Com??die humaine) zajedni??ki je naziv za romane Onore de Balzaka, me??usobno povezane, u kojima nastoji da pru??i sliku o svom vremenu"));
        Bosnian.add(new Pitanje("Gilgame??, junak Epa o Gilgame??u , traga za besmrtno????u i vje??nim ??ivotom. U tome, na??alost, ne uspijeva. Kako se zavr??ava njegov ??ivot?", "Smrt ga je ugrabila dok je spavao", "Pojeo je otrovnu travu", "Usmrtila ga je sve??tenica", "Umire od gladi", ""));
        Bosnian.add(new Pitanje("Saputnik Don Kihota iz Servantesovog romana Don Kihot ja??e svog magarca i hrabro prati svoga gospodara u borbi protiv nepravde. Ovaj simpati??ni debeljko zove se:", "San??o Pansa", "Viktor", "raul", "Pan??o Vilja", ""));
        Bosnian.add(new Pitanje("??ta je uzrok dramskoga sukoba izme??u Antigone i Kreonta u Sofokleovoj tragediji Antigona ?", "sestrinska ljubav prema bra??i", "Antigonino ovladavanje magijom", "Antigonina ljubav prema mu??u", "Kreontova strast prema Antigoni", ""));
        Bosnian.add(new Pitanje("Roman Zeleno busenje Edhema Mulabdi??a obra??uje temu", "austro-ugarske okupacije Bosne i  Hercegovine", "osmanske okupacije Bosne i Hercegovine", "pada srednjovjekovnog bosanskog kraljevstva", "moderne historije Bosne i Hercegovine", ""));
        Bosnian.add(new Pitanje("Kojoj vrsti romana pripada Geteov roman Jadi mladog Vertera?", "epistolarnog romana", "pustolovnog romana", "nau??no-fantasti??nog romana", "romana u stihovima", "Epistolarni roman je roman koji je sastavljen od serije nekih dokumenata, naj??e????e pisama, pa se ta vrsta romana jo?? naziva i romanom u pismima."));
        Bosnian.add(new Pitanje("Ozna??eni dio re??enice: Me??a Selimovi??,poznati bo??nja??ki pisac, ro??en je u Tuzli. ??? je", "apozicija", "objekat", "atribut", "prilo??ka odredba za vrijeme", "Apozicija je re??eni??ni dio, imenica koja pobli??e ozna??ava drugu imenicu i s njom se sla??e u rodu, broju i pade??u."));
        Bosnian.add(new Pitanje("Ozna??ena zavisna re??enica: Nisam ti se javio iako sam to obe??ao. ??? je", "dopusna", "vremenska", "uzro??na", "namjerna", "Veznici dopusnih re??enica su: iako, premda i makar"));
        Bosnian.add(new Pitanje("Imenice tipa vojvoda, had??ija, aga i sl. mjenjaju se", "po  e-vrsti imeni??ke promjene", " po  a-vrsti imeni??ke promjene", "po  i-vrsti imeni??ke promjene", "u perfektu", "Vrsta imeni??ke promjene se mo??e odrediti po zadnjem slovu date imenice u genitivu jednine, u ovom slu??aju aga->age"));
        Bosnian.add(new Pitanje("Zaokru??i pravilno napisanu rije??", "ne??ovjek", "neznam", "naj jasnije", "ne mam", "Negacija se uvijek pi??e odvojeno od glagola (ne znam), sa izuzetkom glagola kojima je negacija dio osnovice (nemam). Kod imenica se negacija uvijek pi??e sastavljeno (ne??ovjek). Superlativi se uvijek pi??u sastavljeno (najjasnije)"));
        Bosnian.add(new Pitanje("Koju dramu nije napisao Viljem ??ekspir", "Tartif", "Hamlet", "Kralj Lir", "Romeo i Julija", "Tartif (Tartuffe) je napisao Molier"));
        Bosnian.add(new Pitanje("Iz kojeg je romana navedeni odlomak:\nOdlu??eno je, Lota, ja ho??u da umrem i pi??em ti ovo bez romanti??ne pretjeranosti, spokojno, u jutro dana kada ??u te posljednji put vidjeti", "J.V. Gete ??Jadi mladog Vertera??", "Viktor Igo ??Jadnici??", "Gistav Flober ??Gospo??a Bovari??", "A.S. Pu??kin ??Evgenije Onjegin??", ""));
        Bosnian.add(new Pitanje("Tip suvi??nog ??ovjeka je", "junak romana romantizma", "junak renesansnog romana", "junak baroknog romana", "junak romana realizma", "Poznati ???suvi??ni ljudi???: Jevgenij Onjegin, Verter"));
        Bosnian.add(new Pitanje("Ferkonja je lik u romanu", "U registraturi", "Ne??ista krv", "Grozdanin kikot", "Ponornica", "Ferkonja je sporedni lik u romanu Ante Kova??i??a, U registraturi"));
        Bosnian.add(new Pitanje("Ko je sli??an albatrosu u Bodlerovoj pjesmi ??Albatros??", "pjesnik", "kapetan broda u buri", "brodski mornar", "malogra??anin", ""));
        Bosnian.add(new Pitanje("Pjesma Tina Ujevi??a ??Svakida??nja jadikovka?? pripada zbirci", "Lelek sebra", "Kolajna", "??edan kamen na studencu", "Auto na korzu", ""));
        Bosnian.add(new Pitanje(" Koji od navedenih likova nije iz romana Me??e Selimovi??a", "Tahir Talha", "Ahmed Nurudin", "Ahmet ??abo", "Mula Ibrahim", "Ahmed Nurudin je lik iz romana Dervi?? i smrt, dok su Ahmet ??abo i Mula Ibrahim likovi iz romana Tvr??ava"));
        return Bosnian;
    }

    private ArrayList<Pitanje> getEnglish() {
        ArrayList<Pitanje> English = new ArrayList<>();
        English.add(new Pitanje("A burglar .......when I was away on vacation and stole of my electronic goods.", "broke in", "broke off", "broke open", "broke up", "Break open zna??i naglo otvoriti; break off zna??i otkinuti (ili prekinuti razgovor broke off the conversation); break up zna??i prekinuti s nekim"));
        English.add(new Pitanje("I have never been .......more beautiful than Thailand.", "anywhere", "nowhere", "somewhere", "everywhere", "U engleskom jeziku nije dozvoljena dvostruka negacija; zbog toga nowhere ne mo??e biti ta??an odgovor"));
        English.add(new Pitanje("I've just .......that the price has gone up again.", "been told", "am told", "have told", "was told", "Po prilo??koj odredbi ???just??? vidimo da treba upotrijebiti present perfect. Tako??er, rije?? je o pasivnoj re??enici. "));
        English.add(new Pitanje("If you were stopped by the police for speeding, what .......you do? ", "would", "do", "will", "shall", "Drugi kondicional: if + past simple, ...would + infinitive; koristi se kada govorimo o nerealnim scenarijima"));
        English.add(new Pitanje("How many bottles of water did you bring for the trip? ??? I just have ....... bottles.", "a few", "much", "any", "a little", "A few zna??i nekoliko/par. A little ne mo??e biti ta??an odgovor jer se koristi uz zbirne i nebrojive imenice"));
        English.add(new Pitanje("Will you come to dinner with us if we .......a babysitter for you?", "find", "had found", "will find", "would found", "Prvi kondicional: if + present simple, ... will + infinitive\nKoristi se za radnje koje bi se realno mogle desiti u budu??nosti"));
        English.add(new Pitanje("If you want to .......that book remember to bring it back.", "borrow", "lend", "loan", "owe", "Borrow i lend su rije??i koje se na bosanski jezik oboje prevode kao ???posuditi???, ali je njihovo zna??enje razli??ito. Borrow zna??i posuditi od nekog ne??to, dok lend zna??i posuditi nekome ne??to. Loan ima sli??no zna??enje kao lend"));
        English.add(new Pitanje("I honestly couldn't follow a word you ........", "were saying", "are saying", "will say", "did say", ""));
        English.add(new Pitanje("The chairman of the board has been employed in the finance industry .......1984.", "since", "in", "on", "at", "Zbog prisustva present perfecta (has been employed), akcenat je na trajanju radnje. Uz present perfect koristimo for i since, a po??to se govori o radnji koja traje od x-trenutka, uzimamo since."));
        English.add(new Pitanje("Rick's father and mother didn't .......with his grandparents and were always having disagreements.", "get along", "get about", "get off", "get at", "Get along je frazalni glagol za dobro slaganje"));
        English.add(new Pitanje("He was quite definite about it and assured me he .......come.", "would", "will", "shall", "should", ""));
        English.add(new Pitanje("I .......complete silence now while I try this experiment", "want", "am wanting", "did want", "have wanted", "Now nam govori da je radnja smje??tena u sada??njosti"));
        English.add(new Pitanje("She told me .......carefully on the icy roads.", "to drive", "to be driven", "to have driven", "to be drive", ""));
        English.add(new Pitanje("The castle .......built in the 15th century.", "was", "is", "has been", "will be", "Rije?? je o pasivnoj re??enici"));
        English.add(new Pitanje("Sharon ______________ to travel. She goes abroad almost every summer.", "loves", "love", "loved", "has loved", ""));
        English.add(new Pitanje("You look really great! __________________ at the fitness centre?", "Have you been exercising", "Are you exercising", "Had you exercised", "Did you exercise", ""));
        English.add(new Pitanje("When Carol called last night, I ______________ my favourite show on television.", "was watching", "has been watching", "had been watching", "is watching", "Kra??a radnja (poziv) je prekinula du??u (gledanje emisije)"));
        English.add(new Pitanje("The man ______________wife I met at the conference phoned earlier to ask us to dinner.", "whose", "which", "whom", "who", ""));
        English.add(new Pitanje("The car _____________ yesterday.", "was repaired", "is repaired", "has repaired", "had repaired", "Rije?? je o pasivnoj re??enici (???yesterday??? nas upu??uje na past simple)"));
        English.add(new Pitanje("Could you just stand there quietly without ____________________ a sound?", "making", "creating", "doing", "causing", "Make a sound je frazalni glagol"));
        English.add(new Pitanje("I can???t afford this car. If I earned more, I _______________ it for you.", "would buy", "bought", "am buying", "buy", "Drugi kondicional: if + past simple, ...would + infinitive\nKoristi se kada govorimo o nerealnim scenarijima"));
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
        English.add(new Pitanje("Would you mind waiting ________ minutes?", "a few", "a little", "much", "little", "A few i a little oboje zna??i nekoliko. Minutes je brojiva imenica u mno??ini u engleskom, prema tome, uz minutes ??emo re??i a few."));
        English.add(new Pitanje("Nancy isn't very well. Oh, I'm sorry to hear ________.", "that", "this", "it", "she", "I'm sorry to hear that je fraza, ??est na??in izra??avanja ??ala"));
        English.add(new Pitanje("I _________ missed the bus. I was only just in time to catch it.", "nearly", "mostly", "near", "nearest", ""));
        English.add(new Pitanje("Yes, I have got the report. ________ it.", "I'm just reading", "I just am reading", "I'm reading just", "I  just  reading", "Radnja se odvija u trenutku govora, dakle potreban je present continuous. Just u ovom slu??aju ide prije glavnog glagola"));
        English.add(new Pitanje("We're really sorry. We regret what happened ________.", "very much", "very many", "a bit", "much", ""));
        English.add(new Pitanje("I've read this paragraph three times, and I ________ understand it.", "still can't", "can't still", "can't yet", "yet can't", ""));
        English.add(new Pitanje("Because of their expertise the two young engineers have been ____ the opportunity to join our staff", "offered", "offer", "offering", "offers", "Rije?? je o pasivnom obliku present perfecta"));
        English.add(new Pitanje("One of the indicators of success in any business is how ____ types of communication channels they use", "many", "much", "lot", "lots", "Types je brojiva imenica, prema tome, uz types koristimo many"));
        English.add(new Pitanje("Carol ________ you with your homework. It???s important that you do it yourself", "shouldn???t help", "can???t help", "mustn???t help", "wouldn???t help", ""));
        English.add(new Pitanje("Anti-lock brakes (ABS) help you to maintain steering control of your car even while braking on ____ roads", "slippery", "lonesome", "fast", "reckless", "Reckless zna??i nesmotren, nemaran; Lonesome zna??i samotan; Fast zna??i brz. Kada prevedemo rije??i, jasno je da samo slippery(klizav) ima smisla ubaciti."));
        English.add(new Pitanje("What's the name of the man  ________ gave us a lift?", "who", "what", "he", "which", ""));
        English.add(new Pitanje("When we_____at the airport we ____ that we_____our passports at the office", "arrived / noticed / had left", "arrived / had noticed / had left", "have arrived / noticed / left", "had arrived / have noticed / have left", "Radnja zaboravljanja paso??a u kancelariji je ???najstarija??? (desila se prva od navedenih) i zato mora biti u past perfectu."));
        English.add(new Pitanje("If someone _______________ you a helicopter, what would you do with it?", "gave", "will give", "gives", "give", "Drugi kondicional: if + past simple, ...would + infinitive\nKoristi se kada govorimo o nerealnim scenarijima"));
        English.add(new Pitanje("On the third day of the shipwreck they gave up all hope of finding any ____", "survivors", "deserters", "conclusions", "suppliers", ""));
        English.add(new Pitanje("I didn???t see _________________.", "anybody anywhere", "nobody nowhere", "anybody nowhere", "nobody anywhere", "Engleski ne dozvoljava duplu (pa tako ni trostruku) negaciju u re??enici. Zbog toga ne mo??emo upotrijebiti ni nowhere ni nobody"));
        English.add(new Pitanje("If I had realized that the traffic lights were red, I ________________.", "would have stopped", "will stop", "would stop", "stop", "Tre??i kondicional: if + past perfect, ...would + have + past participle\nKoristi se za situacije koje se nisu desile, da se ??pekuli??e o ishodu tih situacija"));
        English.add(new Pitanje("I was watching TV at home when suddenly ________ rang.", "the doorbell", "doorbell", "an doorbell", "a doorbell", ""));
        English.add(new Pitanje("If ________ my passport, I'll be in trouble", "I lose", "I'll lose", "I lost", "I would lose", "Prvi kondicional: if + present simple, ... will + infinitive\nKoristi se za radnje koje bi se realno mogle desiti u budu??nosti"));
        English.add(new Pitanje("A company's success will largely depend _____ how far ahead into the future it can forecast", "on", "of", "at", "in", "Depends on je fraza koja zna??i ovisi o"));
        English.add(new Pitanje("Up to now, the equipment _____ regularly, but from now on, we ______ it before every outing", " hasn???t been checked / are going to check", "hasn???t checked / will be checking", "isn???t being checked / should be checked", "wasn???t checked / are checking", "Going to se koristi za budu??e namjere koje su ve?? odlu??ene."));
        English.add(new Pitanje("After 11 days in ?????? prison they were released", "/", "the", "a", "an", "Uz prison ne ide nikakav ??lan. Isto va??i i za jail"));
        English.add(new Pitanje("Don???t wait for us, help ??????to some food", "yourself", "you", "them", "on your own", "Help yourself/yourselves zna??i poslu??ite se"));
        English.add(new Pitanje("The works of Picasso were quite ??????during various periods of his artistic life", "different", "differ", "different from", "different than", ""));
        English.add(new Pitanje("He?????? be in a meeting. I am not certain", "may", "ought", "needs", "shouldn't", "Druga re??enica (I am not certain) nam govori da je rije?? o naga??anju"));
        English.add(new Pitanje("Oh, I???m sorry, I???ve spilt some tea.   Where ??????the paper towels?", "do you keep", "are you keeping", "did you keep", "have you kept", ""));
        English.add(new Pitanje("Bob ??????a lot of help since we arrived", "has given", "gave", "was giving", "had given", ""));
        English.add(new Pitanje("??????a fierce competition between Tuzla University and the University of Sarajevo for the Big Ten Championships.", "There???s", "theirs", "Its", "It has", "There's ili u punom obliku there is"));
        English.add(new Pitanje("The weather ??????to be changing", "appears", "was appeared", "is appeared", "their appeared", ""));
        English.add(new Pitanje("The train ??????passengers", "is packed with", "packs with", "has packed by", "is packing with", "Is packed with zna??i prepun, krcat"));
        English.add(new Pitanje("Oh! Something is strange here! Someone ____ a bunch which was here", "has taken", "took", "is taking", "takes", ""));
        English.add(new Pitanje("We ___ practise so hard next month. The tests are over", "don't need to", "mustn't", "will have to", "hasn't to", ""));
        English.add(new Pitanje("He was listening to a radio while his cat ____ in his arms", "was sleeping", "is sleeping", "slept", "has slept", "Rije?? je o dvije radnje u pro??losti koje se de??avaju istovremeno. Zbog toga, obje su u past continuousu."));
        English.add(new Pitanje("English and French ____ all over the world.", "are spoken", "is spoken", "have spoken", "has spoken", ""));
        English.add(new Pitanje("The Berlin wall ___ down in 1989.", "was knocked", "is knocked", "were knocked", "knocked", ""));
        English.add(new Pitanje("Plenty of evidence has come to light to prove that he has been involved ____ smuggling", "in", "at", "through", "by", "Involved in je fraza koja u ovom slu??aju konkretno zna??i biti upetljan u ne??to"));
        English.add(new Pitanje("The newspaper doesn't state why they have chosen to play the next national game in Bursa,__?", "does it", "haven't they", "don't they", "do they", ""));
        English.add(new Pitanje("You _______ your own canoe in order to join the canoe club. They cost a lot of money. You    _________ mine whenever you want to go canoeing", "needn???t buy / can borrow", "mustn???t buy / had borrowed", "won???t have bought / should borrow", "might not buy / would borrow", ""));
        English.add(new Pitanje("If Columbus__ money from Queen Isabella, he ______ across the Atlantic", "had not received / might not have sailed", "do not receive / could not sail", "did not receive / might not have sailed", "would not receive / might not sail", "Tre??i kondicional: if + past perfect, ...would + have + past participle. Koristi se za situacije koje se nisu desile, da se ??pekuli??e o ishodu tih situacija"));
        English.add(new Pitanje("We all wondered how Jack's wife ___ when she ____ about his new job in Outer-Mongolia", "would react / heard", "reacts / has heard", "had reacted / would hear", "has been reacting / hears", ""));
        English.add(new Pitanje("Someone ________ the tickets are free", "told me", "said me", "said me that", "told to me", "Said i told se ??esto mije??aju jer imaju sli??no zna??enje i obje rije??i se na na?? jezik prevode kao rekao. Razlika je u tome ??to say predstavlja izraziti ne??to svojim glasom, svojim rije??ima; dok tell zna??i nekome ne??to re??i (bilo usmeno ili pismeno)"));
        English.add(new Pitanje("The story I've just read _____________ Zej??ir Hasi??", "was written by", "was written", "was written from", "wrote", "Rije?? je o pasivnoj re??enici. Kada je naveden vr??ioc radnje u pasivnoj re??enici, uz njega stoji rije?? by"));
        English.add(new Pitanje("Agatha Christie didn't tell ....... why she disappeared in December 1926", "anyone", "no one", "nobody", "somebody", "Engleski jezik ne dozvoljava dvostruku negaciju, zbog ??ega ni no one ni nobody ne mogu biti ta??an odgovor"));
        English.add(new Pitanje("Agatha Christie wrote her first detective story in 1920 and became very ........ ", "successful", "success", "successive", "successor", ""));
        English.add(new Pitanje("We've run ....... of sugar. Could you please buy some more?", "out", "away from", "down on", "on with", "To run out of something zna??i potro??iti ne??to"));
        English.add(new Pitanje(". ....... of the names did you choose for the puppy?", "Which", "Who", "What", "Whom", ""));
        English.add(new Pitanje("After two rings of the bell she suddenly ....... in the doorway", "appeared", "seemed", "looked", "viewed", ""));
        English.add(new Pitanje("My father asked me if I_____ an increase in salary the following month", "was getting", "am getting", "am going to get", "will get", ""));
        English.add(new Pitanje("Adrian should have never ....... home. If he hadn't, he'd be in a better situation right now", "left", "leave", "leaved", "leaving", ""));
        English.add(new Pitanje("Perhaps she would have been ....... by that dog if its owner hadn't been faster and caught him right on time", "bitten", "bit", "bite", "bitted", ""));
        English.add(new Pitanje("I would have ....... pictures from my trip, if I had a camera", "taken", "had took", "took", "take", "Drugi kondicional: if + past simple, ...would + infinitive\nKoristi se kada govorimo o nerealnim scenarijima"));
        English.add(new Pitanje("I ....... some great books from the library this past weekend.", "borrowed", "lent", "had a loan of", "loaned", "Borrow i lend su rije??i koje se na bosanski jezik oboje prevode kao ???posuditi???, ali je njihovo zna??enje razli??ito. Borrow zna??i posuditi od nekog ne??to, dok lend zna??i posuditi nekome ne??to. Loan ima sli??no zna??enje kao lend"));
        English.add(new Pitanje("Her mother ....... when she was just a little girl", "died", "is dead", "dead", "was dead", ""));
        English.add(new Pitanje("I ....... forgotten to set my alarm clock, so I was late for my train", "had", "was", "were", "did", "Radnja zaboravljanja alarma se desila u daljoj pro??losti, nego ka??njenje na voz. Zbog zoga zaboravljanje alarma izra??avamo past perfectom"));
        English.add(new Pitanje("After looking for him all day, Jeremy finally found his dog ....... under a cave", "hidden", "hid", "hide", "hit", ""));
        English.add(new Pitanje("______ people are choosing to buy music online", "More and more", "The most", "many and many", "a lot", "More and more zna??i sve vi??e"));
        English.add(new Pitanje("The flowers need _________ once a day", "to be watered", "being watered", "been watered", "watered", ""));
        English.add(new Pitanje("Brian said he ____________ ill the previous week", "had been", "would be", "will be", "has been", "Rije?? je o neupravnom govoru. Aktivna re??enica bi glasila ???Brian: I was sick last week???"));
        English.add(new Pitanje("I ___________ come to the cinema because I had so much homework to do.", "couldn't", "mustn't", "shouldn't", "may not", ""));
        English.add(new Pitanje("Sarah __________ her hair cut at the moment", "is having", "has", "had", "was having", "Radnja se de??ava u trenutku govora, dakle treba nam present continuous"));
        English.add(new Pitanje("It would have been better if you ____________ the truth.", "had told", "told", "tell", "are telling", "Tre??i kondicional: if + past perfect, ...would + have + past participle\nKoristi se za situacije koje se nisu desile, da se ??pekuli??e o ishodu tih situacija"));
        English.add(new Pitanje("Frank has taken ________ jogging to keep fit", "up", "over", "on", "in", "Take up je fraza koja zna??i po??eti se baviti ne??im"));
        English.add(new Pitanje("They _____________ Paris twice this week", "have been to", "have gone in", "had gone to", "had been in", ""));
        English.add(new Pitanje("Peter, __________________ father is a politician, works for the times", "whose", "which", "who's", "who", ""));
        English.add(new Pitanje("_______ Panama Canal divides North and South America", "the", "a", "/", "an", "Ispred kanala, kao ??to su Suecki i Panamski, ide ??lan the"));
        English.add(new Pitanje("I'm going to buy _________ tomatoes at the supermarket.", "a few", "a couple", "a little", "lots", " A few zna??i nekoliko/par. A little ne mo??e biti ta??an odgovor jer se koristi uz zbirne i nebrojive imenice. A couple i lots bi oboje bili validni odgovori da ispred tomatoes stoji ???of???"));
        English.add(new Pitanje("When I got home, I saw that someone __________ one of my windows", "had broken", "was breaking", "broke", "has broken", "Radnja provaljivanja u ku??u se desila u daljoj pro??losti nego dolazak ku??i, pa je zato potreban past perfect"));
        English.add(new Pitanje("If I had the chance to live abroad, I _________.", "would go", "would be gone", "would have gone", "ll go", "Drugi kondicional: if + past simple, ...would + infinitive\nKoristi se kada govorimo o nerealnim scenarijima"));
        English.add(new Pitanje("The police ________ about the bank robbery", "are asking", "is asking", "asks", "has asked", "Imenica police se tretira kao mno??ina, i kao takva zahtjeva glagole u mno??ini"));
        English.add(new Pitanje("She is the film star ___________ husband is a famous writer", "whose", "which", "that", "who???s", ""));
        English.add(new Pitanje("I???m going now ________ you want me to stay", "unless", "if", "as long as", "provided", ""));
        English.add(new Pitanje("The judge sent the murderer to ___________ for 40 years.", "prison", "the prison", "a prison", "an prison", "Uz prison ne ide nikakav ??lan. Isto va??i i za jail"));
        English.add(new Pitanje("Jack???s party was boring. I didn???t meet _________ I knew there.", "anyone", "someone", "no one", "somebody", "Engleski jezik ne dozvoljava dvostruku negaciju"));
        English.add(new Pitanje("Did you see a bird in the tree???? Nick wonders ____________ a bird in the tree", "if I had seen", "whether I saw", "if I saw", "if I have seen", "Kad re??enica prelazi iz upravnog u neupravni govor, past simple prelazi u past perfect"));
        English.add(new Pitanje("In my experience ________ are always friendly.", "the Chinese", "Chinese", "a Chinese", "this Chinese", "Kada govorimo uop??teno o nekom narodu, ispred naroda ide ??lan the"));
        English.add(new Pitanje("I can't wait for my next holiday. I am really __________.", "excited", "excitement", "excite", "exciting", ""));
        English.add(new Pitanje("Nobody believed Paul at first but he ____________ to be right", "turned out", "came out", "worked out", "carried out", "Turned out zna??i ispostavilo se"));
        English.add(new Pitanje("I can't get a car because I am not ________ to drive", "old enough", "quite old", "so old", "enough old", ""));
        English.add(new Pitanje("You'll _________ tell the police that your house was broken into", "have to", "had to", "must", "should", ""));
        English.add(new Pitanje("The accident happened last night. It __________ that the accident was caused by engine problems.", "is said", "say", "saying", "would say", ""));
        English.add(new Pitanje("Michelle is quite ___________ in London and misses her friends in Manchester.", "lonely", "only", "alone", "single", ""));
        English.add(new Pitanje("My sister isn???t ________________ me", "as tall as", "as tall than", "tall enough than", "taller as", ""));
        English.add(new Pitanje("__________ his bad health, he is very active", "Despite", "In spite", "However", "although", "Despite zna??i uprkos. In spite ima isto zna??enje, ali zahtijeva ???of??? ispred uslova"));
        English.add(new Pitanje("J. K. Rowling, __________ first name is actually Joanne, is one of the world's most successful writers.", "whose", "who", "that", "which", ""));
        English.add(new Pitanje("Reports are coming in of a major oil spill in ______ Mediterranean", "the", "a", "some", "/", "Ispred imena mora se nalazi ??lan the (the Mediterranean, the Adriatic Sea, the North Sea)"));
        English.add(new Pitanje("I'd like ________ sugar with that, please", "a little", "a bit", "a few", "few", " A little zna??i malo i koristi se uz zbirne i nebrojive imenice"));
        English.add(new Pitanje("'How many brothers do you have?' 'Two, and ______ of them are older than me.'", "both", "none", "they all", "all", ""));
        English.add(new Pitanje("Living in _____ European city can be expensive", "a", "an", "some", "/", "Nije odre??eno na koji grad se misli, mo??e biti bilo koji europski grad. Zbog toga nam treba neodre??eni ??lan, odnosno u ovom slu??aju \"a\""));
        English.add(new Pitanje("The results showed that ______ the candidates were of a very high standard", "most of", "a little of", "few", "many", ""));
        English.add(new Pitanje("Mozart died in Vienna in 1791, _____ the age of 35", "at", "of", "on", "in", ""));
        English.add(new Pitanje("The model planes can ________ varnish or paint", "be painted with", "paint with", "have painted with", "be painting with", "Re??enica je u pasivu"));
        English.add(new Pitanje("Boston is _____ the east coast of the United States.", "on", "in", "at", "away", "Kada govorimo da se ne??to nalazi na zapadnoj/isto??noj/sjevernoj/ju??noj obali, uz coast ide on"));
        English.add(new Pitanje("Mark ________ the drama club if he had more free time", "would join", "will join", "is joining", "joins", "Drugi kondicional: if + past simple, ...would + infinitive\nKoristi se kada govorimo o nerealnim scenarijima"));
        English.add(new Pitanje("You __________ take the files home. It's against the company rules", "can't", "don't have to", "can", "must", ""));
        English.add(new Pitanje("You look worried. What _____ about?", "are you thinking", "you are thinking", "you think", "were you thinking", "Radnja se odvija u trenutku govora i zato nam treba present continuous"));
        English.add(new Pitanje("How long _______ English?", "have you been learning", "do you learn", "are you learning", "have you learnt", "Proces u??enja engleskog je idalje u toku"));
        English.add(new Pitanje("Mr. Williams ________ here a minute ago. He's just left", "was", "has been", "had been", "were", "Ago je prilo??ka odredba koja nas upu??uje na past simple"));
        English.add(new Pitanje("The phone is ringing. Don't get up, I ______it", "will answer", "am answering", "am going to answer", "answer", "will se koristi za spontane odluke"));
        English.add(new Pitanje("I've bought the plane tickets to Paris. Alex and I ______ tomorrow", "are leaving", "to leave", "is leaving", "left", "Present Continuous se mo??e koristiti za budu??nost kada govorimo o nekim budu??im aran??manima"));
        English.add(new Pitanje("That _______ be Alex over there. He called me from Japan twenty minutes ago", "can't", "isn't able to", "shouldn't", "won't", "That/it can't be u su??tini zna??i nemogu??e je"));
        English.add(new Pitanje("The article won't be finished unless I _______ late tonight", "work", "worked", "will work", "had worked", ""));
        English.add(new Pitanje("The film ________ at the moment. You'll have your photos in a minute", "is being developed", "is developed", "has been developed", "was being developed", "Radnja se odvija u trenutku govora i zato nam treba present continuous"));
        English.add(new Pitanje("His first film was ________ than the second one", "much better", "very good", "more better", "as good", ""));
        English.add(new Pitanje("They wanted to know ________ going to stay in Wales", "how  long we were", "if were we", "were we", "how long were we", "Rije?? je o upitnoj re??enici u neupravnom govoru. Uptine neupravne re??enice nemaju isti redoslijed rije??i kao obi??ne upitne re??enice"));
        English.add(new Pitanje("Ken Sheldon, ____ film have won awards, is one of the most famous directors in Britain", "whose", "who", "whom", "which", ""));
        English.add(new Pitanje("Did you like _______ ring he gave you for your birthday?", "the", "a", "an", "/", "Po??to se ta??no zna o kojem prstenu je rije??, koristimo odre??eni ??lan, the"));
        English.add(new Pitanje("Can you give us the description _____ the robbers?", "of", "at", "about", "off", ""));
        English.add(new Pitanje("That was a great offer. You shouldn't have ________ it down", "turned", "put", "let", "pulled", "Turn down zna??i odbiti ne??to"));
        return English;
    }

    private ArrayList<Pitanje> getGerman() {
        ArrayList<Pitanje> German = new ArrayList<>();
        German.add(new Pitanje("Welches Land grenzt nicht an Deutschland:", "Italien", "D??nemark", "??sterreich", "Belgien", "Koja se dr??ava ne grani??i s Njema??kom? Odgovor: Italija"));
        German.add(new Pitanje("Was ist richtig?", "sehen - sah - hat gesehen", "sehen - sehte - gesehen", "sehen - sehte - ist gesehen", "sehen - sah ??? ist gesehen", "Sehen je nepravilni glagol"));
        German.add(new Pitanje("Was ist ???die Zugspitze????", "ein Berg", "ein Fluss", "ein See", "eine Stadt", "Zugspitze je sa 2.962 m nadmorske visine najvi??a planina Njema??ke. "));
        German.add(new Pitanje("Mit welchen Zeitformen (Tempora) bezeichnet man die Vergangenheit:", "Pr??teritum, Perfekt, Plusquamperfekt", "Futur I, Futur II", "Pr??sens", "Pr??teritum, Pr??sens", "Njema??ki jezik ima tri pro??la vremena: preterit, perfekt i pluskvamperfekt"));
        German.add(new Pitanje("Welche deutsche Stadt ist ber??hmt f??r ihre ???Stadtmusikanten???:", "Bremen", "Berlin", "Wien", "Z??rich", "Bremenski gradski svira??i (njem. Die Bremer Stadtmusikanten) su jedna od bajki bra??e Grimm"));
        German.add(new Pitanje("Welche Stadt bezeichnen wir in unserer Sprache als ???Be??????", "Wien", "Berlin", "Br??ssel", "Salzburg", "Ime Be?? je u na?? jezik do??lo iz ma??arskog (ma??. Becs)"));
        German.add(new Pitanje("Was bezeichnet man in der deutschen Sprache als ???Verben????", "glagoli", "imenice", "pridjevi", "prilozi", ""));
        German.add(new Pitanje("Welcher Fluss flie??t durch Deutschland:", "die Donau", "die Save", "die Drau/Drave", "die Drina", "Koja rijeka te??e kroz Njema??ku? Odgovor: Dunav"));
        German.add(new Pitanje("Was bezeichnet man mit ???Goldener B??r????", "Auszeichnung f??r Filme", "Auszeichnung f??r Musik", "Auszeichnung f??r Sport", "einen Zoo", "Za ??ta se dodjeljuje nagrada Zlatni medvjed? Odgovor: Za filmove"));
        German.add(new Pitanje("Ich freue mich ________ den n??chsten Monat, dann habe ich n??mlich Geburtstag. ", "auf", "an", "??ber", "f??r", ""));
        German.add(new Pitanje("Im Satz ist ein Fehler unterstrichen. Unterstreiche die richtige Form! Ich fahre am Wochenende oft mit meine kleine Schwester zu den Gro??eltern.", "meiner kleinen Schwester", "mein kleiner Schwester", "meiner kleiner Schwester", "meines kleinen Schwester", ""));
        German.add(new Pitanje("Ich w??rde mir ein neues Fahrrad kaufen, _______ ich das Geld daf??r h??tte.", "wenn", "weil", "dass", "aber", ""));
        German.add(new Pitanje("Welche dieser St??dte sind in ??sterreich?", "Graz, Salzburg, Wien", "Frankfurt, M??nchen, Heidelberg", "Z??rich, Genf, Basel", "Hamburg, Hannover, K??ln", "Koji od ovih gradova se nalaze u Austriji? Odgovor: Graz, Salzburg i Be??"));
        German.add(new Pitanje("Ich rufe dich morgen an, ich muss ??? etwas besprechen.", "mit dir", "mit dich", "mit du", "mit deinem", "Mit uz sebe zahtijeva dativ"));
        German.add(new Pitanje("Welcher weltber??hmte Schriftsteller hat das Werk ???Steppenwolf??? geschrieben?", "Hermann Hesse", "Thomas Mann", "Johann Wolfgang von Goethe", "Franz Kafka", "Koji svjetski poznati pisac je napisao Stepski vuk? Odgovor: Hermann Hesse"));
        German.add(new Pitanje("Welches dieser L??nder grenzt nicht an Deutschland?", "Ungarn", "Polen", "??sterreich", "Niederlande", "Koja se dr??ava ne grani??i s Njema??kom? Odgovor: Ma??arska"));
        German.add(new Pitanje("Wie viele Bundesl??nder gibt es in Deutschland?", "16", "12", "14", "10", "Njema??ka u svom sastaavu ima 16 saveznih dr??ava ili pokrajina. Postoji 14 pokrajina(njem:L??nder) i 2 dr??ave (Freistaat), pri ??emu je razlika samo u nazivu koji je zadr??an iz tradicionalnih razloga."));
        German.add(new Pitanje("Wie hei??t die Hauptstadt von Bayern?", "M??nchen", "Berlin", "Freiburg", "Hannover", "Glavni grad Bavarske je Minhen"));
        German.add(new Pitanje("In welchem dieser L??nder wird Deutsch gesprochen?", "Die Schweiz", "Frankreich", "Niederlande", "Belgien", "U kojoj od ovih zemalja se govori njema??ki? Odgovor: u ??vicarskoj"));
        German.add(new Pitanje("Wen haben die Nationalsozialisten im Zweiten Weltkrieg (1939-1945) vor allem verfolgt,  vertrieben und ermordet?", "die Juden", "die Moslems", "die Ausl??nder", "die Franzosen", ""));
        German.add(new Pitanje("Nach dem zweiten Weltkrieg wurde Deutschland in zwei Staaten geteilt (von 1949 bis 1990), wie hie??en diese?", "DDR und BRD", "CDU und CSU", "DFB und DRD", "RBD und BBD", "DDR je Isto??na Njema??ka (Deutsche Demokratische Republik), a BRD je Zapadna Njema??ka (Bundesrepublik Deutschland)"));
        German.add(new Pitanje("Welcher dieser Fl??sse flie??t nicht durch Deutschland?", "Die Seine", "der Rhein", "die Isar", "Die Donau", "Koja od ovih rijeka ne te??e kroz Njema??ku? Odgovor: Sena"));
        German.add(new Pitanje("Thomas hat gestern der Meinung des Lehrers ... ", "widersprochen", "gew??hlt", "ge??u??ert", "zugegeben", ""));
        German.add(new Pitanje("N??chste Woche habe ich Geburtstag. Ich freue mich jetzt schon ... ", "darauf", "dar??ber", "dazu", "danach", ""));
        German.add(new Pitanje("Welche der folgenden Bezeichnungen bezieht sich auf den gr????ten See in Deutschland?", "der Bodensee", "der Chiemsee", "der Starnberger See", "der Bergsee", "Koji od sljede??ih naziva se odnosi na najve??e jezero u Njema??koj? Odgovor: Bodensee"));
        German.add(new Pitanje("In welchem Jahr wurde die Berliner Mauer gebaut?", "1949", "1989", "1961", "1945", "Koje godine je sagra??en Berlinski zid? Odgovor: 1949"));
        German.add(new Pitanje("Die Hauptstadt von ??stereich ist ... ", "Wien", "Bern", "Berlin", "Graz", "Glavni grad Austrije je Be??"));
        German.add(new Pitanje("Die Berliner Mauer trennte", "den Osten vom Westen", "eine Insel", "das Stadtzentrum", "die Bundesl??nder", "Berlinski zid je razdvajao istok od zapada"));
        German.add(new Pitanje("Wie hei??t der weibliche Artikel?", "die", "der", "das", "ein", ""));
        German.add(new Pitanje("Wie hei??en die F??lle im Deutschen?", "Nominativ, Genitiv, Dativ, Akkusativ", "Nominativ, Genitiv, Dativ, Vokativ", "Nominativ, Dativ, Akkusativ, Instrumental", "Femininum, Maskulinum, Neutrum, Plural", "Njema??ki jezik ima 4 pade??a: Nominativ, genitiv, dativ i akuzativ"));
        German.add(new Pitanje("Wie hei??t das Meer in Deutschland", "Die Nordsee", "Die Adria", "Das Mittelmeer", "Die Donau", "Njema??ka izlazi na Sjeverno ledeno more"));
        German.add(new Pitanje("Futur bezeichnet ...", "die Zukunft", "die Gegenwart", "die Vergangenheit", "das Geschlecht", ""));
        German.add(new Pitanje("Der Superlativ von ???hoch???  lautet:", "am h??chsten", "am h??hsten", "am h??her", "am h??hersten", ""));
        German.add(new Pitanje("Welcher Satz ist richtig?", "Sie ging ins Kino, ohne auf mich zu warten", "Sie ging ins Kino, ohne auf mich warten", "Sie ging ins Kino, ohne auf mich zu wartet", "Sie ging ins Kino, ohne auf mich wartet", ""));
        German.add(new Pitanje("???Der Prozess??? ist ein Roman von", "Franz Kafka", "Thomas Mann", "Hermann Hesse", "Heinrich B??ll", ""));
        German.add(new Pitanje("Koje je staro njema??ko pismo?", "gotica", "latinica", "??irilica", "arebica", ""));
        German.add(new Pitanje("Kakve ??lanove ima njema??ki jezik i koliko?", "Njema??ki jezik ima odre??eni i neodre??eni ??lan", "Njema??ki jezik ima 1 ??lan", "Njema??ki jezik ima 3 ??lana", "Njema??ki jezik nema ??lanova", ""));
        German.add(new Pitanje("Ima li neodre??eni ??lan mno??inu?", "Neodre??eni ??lan nema mno??ine", "Neodre??eni ??lan ima mno??inu", "Neodre??eni ??lan ima dvojinu", "Neodre??eni ??lan nema zna??enje", ""));
        German.add(new Pitanje("Da li je der odre??eni ili neodre??eni ??lan i za koji rod?", "Der je odre??eni ??lan za mu??ki rod.", "Der je odre??eni ??lan za ??enski rod", "Der je neodre??eni ??lan za mu??ki rod", "Der je neodre??eni ??lan za ??enski rod", ""));
        German.add(new Pitanje("Mogu li modalni glagoli stajati samostalno i kakvu dopunu zahtijevaju?", "zahtjevaju dopunu sa drugim glagolom u infinitvu bez zu", "mogu stajati samostalno", "ne zahtijevaju dopunu sa nekim drugim glagolom", "se dopunjavaju sa pomo??nim glagolima", ""));
        German.add(new Pitanje("In der Schweiz werden __________ gesprochen", "Deutsch, Italienisch, Franz??sisch und R??toromanisch", "Deutsch, Italienisch, Franz??sisch und Englisch", "Deutsch, Englisch, Franz??sisch und R??toromanisch", "Deutsch, Italienisch, Englisch und R??toromanisch", "U ??vicarskoj se govore njema??ki, italijanski, francuski i retoromanski jezik"));
        German.add(new Pitanje("Johann Wolfgang Goethe wurde in __________ geboren", "Frankfurt am Main", "M??nchen", "Leipzig", "Berlin", "Goethe se rodio u Frankfurtu"));
        German.add(new Pitanje("auf / bei / mit / nach / von / zu / mit / in  sind", "Pr??positionen", "substantive", "Verben", "Zahlen", ""));
        German.add(new Pitanje("Wer wagt,__________", "gewinnt", "das verschiebe nicht auf morgen", "dem ist nicht zu helfen", "soll auch nicht essen", "Ko se usudi, pobijedi"));
        German.add(new Pitanje("wollen / sollen / d??rfen / k??nnen / m??gen / m??ssen     sind", "Modalverben", "starke Verben", "Hilfsverben", "gro??e Verben", ""));
        German.add(new Pitanje("Was ist richtig?", "Deutsch spricht man in Deutschland, ??sterreich und in der Schweiz", "Deutsch spricht man nur in Deutschland", "Deutsch spricht man in Deutschland und ??sterreich", "In der Schweiz spricht man kein Deutsch", "Njema??ki se tako??er govori u Lihten??tajnu i Luksemburgu, te kao manjinski jezik u Belgiji"));
        return German;
    }

    private ArrayList<Pitanje> getLatin() {
        ArrayList<Pitanje> Latin = new ArrayList<>();
        Latin.add(new Pitanje("Gloria discipuli, gloria magistri.", "Slava u??enikova je slava u??iteljeva.", "U??enici su slavni zahvaljuju??i u??itelju.", "Slava u??enika je radost u??itelja.", "Slavni u??enici zahvaljuju u??itelju.", ""));
        Latin.add(new Pitanje("Quidquid agis, prudenter agas et respice finem. ", "Sve ??to radi??, radi pa??ljivo i misli na kraj. ", "Pazi ??ta radi??", "Radi kako misli?? da je najbolje", "Strpljenjem i radom sve mo??e?? posti??i", ""));
        Latin.add(new Pitanje("Nulla regula sine exceptione", "Nijedno pravilo bez izuzetka", "Djela, ne rije??i", "Jedna lasta ne ??ini prolje??e", "Sve ??to je previ??e, ??kodi", ""));
        Latin.add(new Pitanje("Timeo Danaos et dona ferentes", "Bojim se Danajaca (Grka) i kad darove donose", "Zla koko??, zlo jaje", "Jedan je bio svijet", "Rad sve pobje??uje", ""));
        Latin.add(new Pitanje("Quot linguas cales, tot homines vales zna??i:", "Koliko jezika zna??, toliko ljudi vrijedi??", "Rad sve pobje??uje", "??krtost je uzrok svih mana.", "Sve ??to je previ??e, ??kodi.", ""));
        Latin.add(new Pitanje("Non scholae, sed vitae discimus  zna??i:", "Ne u??imo za ??kolu, nego za ??ivot", "Ponavljanje je majka znanja.", "Prijatelj je polovica du??e.", "O ukusima se ne raspravlja.", ""));
        Latin.add(new Pitanje("Amor omnia vincit", "Ljubav sve pobje??uje", "Ljubav i ljubomora su isto", "Ljubi i ??ini ??to ho??e??", "Va??no je sudjelovati", ""));
        Latin.add(new Pitanje("Non progredi est regredi", "Ne napredovati zna??i nazadovati", "U progresu je spas", "Jednoga dobitnik, drugoga gubitnik", "Samo hrabri napreduju", ""));
        Latin.add(new Pitanje("Historia est magistra vitae", "Historija  je u??iteljica ??ivota", "Svatko je kova?? svoje sre??e", "Brada ne ??ini filozofa", "??ist ra??un, duga ljubav", ""));
        Latin.add(new Pitanje("Omnia mea mecum porto zna??i", "Sve svoje nosim sa sobom", "Povijest je u??iteljica ??ivota", "Brada ne ??ini filozofa", "??ist ra??un, duga ljubav", ""));
        Latin.add(new Pitanje("Domus propria domus optima", "Vlastita je ku??a najbolja ku??a", "Spas naroda neka bude najvi??i zakon", "Vremena se mijenjaju i mi se mijenjamo u njima", "O ukusima se ne raspravlja", ""));
        Latin.add(new Pitanje("Aetate reddimur prudentiores", "S vremenom postajemo pametniji", "Povijest je u??iteljica ??ivota", "??ist ra??un, duga ljubav", "Sve svoje nosim sa sobom", ""));
        Latin.add(new Pitanje("Verus amicus est tamquam alter idem", "Pravi je prijatelj kao drugo ja", "Jedan za sve i svi za jednoga", "Tko nije samnom, protiv mene je", "Ispravno je i od neprijatelja u??iti", ""));
        Latin.add(new Pitanje("Beneficium accipere est libertatem vendere", "Uslugu primiti, zna??i prodati svoju slobodu", "Kad se dobar ??ovjek pokvari, postaje najgori", "Slu??aj, gledaj, ??uti, ako ??eli?? ??ivjeti u miru", "Najgora je zloupotreba najboljeg", ""));
        Latin.add(new Pitanje("Gloriam invidia sequitur", "Slavu zavist prati", "Tuga je pratilac veselja", "U ratu ??ute zakoni", "Sinovi heroja su slabi??i", ""));
        Latin.add(new Pitanje("Ab alio exspectes alteri quod feceris", "Od drugog o??ekuj ono ??to bude?? drugome u??inio", "Kome zlo??in koristi, on ga je u??inio", "Za dobar ??ivot kratko vreme je dovoljno dugo", "Primiti dobro??instvo zna??i prodati slobodu", ""));
        Latin.add(new Pitanje("Dominium generosa recusat", "Vlast plemeniti odbijaju", "Plemeniti dr??e vlast", "Generali dobijaju revoluciju", "Ne u??imo za ??kolu, nego za ??ivot", ""));
        Latin.add(new Pitanje("De mortius nihil nisi bene", "o mrtvima treba govoriti samo dobro", "budale dok se klone gre??aka padaju u jo?? ve??e", "svjetlo dolazi sa istoka", "du??evni bol je te??i od tjelesnog", ""));
        Latin.add(new Pitanje("Cornix cornici oculos non effodiet:", "vrana vrani o??i ne kopa", "dok di??em nadam se", "vje??banje je najbolji u??itelj", "lopov lopova poznaje", ""));
        return Latin;
    }

    private ArrayList<Pitanje> getMath() {
        ArrayList<Pitanje> Math = new ArrayList<>();
        Math.add(new Pitanje("Ako je A={x|x??N ?? x???6}\nB={x|x ?? Z ??|x|??? 2}\nC={x|x ?? Z  ??-2<x???2}.\nIzra??unati (B U C)???A ", "{1,2}", "B", "{0,1,2}", "??", "drawable_math_1"));
        Math.add(new Pitanje("Knjiga je poskupila 20%, a zatim je pojeftinila 20%. Koliko sad ko??ta ako je prvobitna cijena bila 60KM?", "57,6KM", "60KM", "62,6KM", "58KM", "drawable_math_2"));
        Math.add(new Pitanje("Rastavi na proste faktore (4x??-36).", "4(x - 3)(x + 3)", "(2x ??? 9)??", "(2x ??? 4)(2x + 9)", "4(x???9)", "drawable_math_3"));
        Math.add(new Pitanje("Nakon obavljenog kvadriranja (2-???3)?? dobijemo:", "7 - 4???3", "7 + 2???3", "7 - 2???3", "7 + 4???3", "drawable_math_4"));
        Math.add(new Pitanje("Povr??ina pravouglog trougla ??ija je hipotenuza c=10 a visina na hipotenuzi hc=6 je:", "30", "60", "40", "80", "drawable_math_5"));
        Math.add(new Pitanje("3^(2/x) = 1/9", "-1", "1", "1/2", "-1/2", "drawable_math_6"));
        Math.add(new Pitanje("Cipele su pojeftinile 10%, a zatim jo?? 20%. Koliko sad ko??taju ako je po??etna cijena bila 100KM", "72KM", "81KM", "70KM", "80KM", "drawable_math_7"));
        Math.add(new Pitanje("Izraz  5???8??????18??????50  ima vrijednost", "2???2", "3", "2", "3???2", "drawable_math_8"));
        Math.add(new Pitanje("Rastaviti na proste faktore  4x?? ???16", "4(x???2)(x+2)", "(2x???4)??", "4x(x-4)", "(2x-8)(2x+2)", "drawable_math_9"));
        Math.add(new Pitanje("Druga kateta pravouglog trougla, ??ija je jedna kateta 7, a povr??ina 14, je:", "4", "2", "8", "6", "drawable_math_10"));
        Math.add(new Pitanje("Rje??enja jedna??ine 2x??- 32 = 0 su:", "??4", "??9", "??3", "??6", "drawable_math_11"));
        Math.add(new Pitanje("Oblast vrijednosti funkcije y = 2sinx-3  je", "-5???y???-1", "-1???y???5", "0???y???4", "1???y???5", "drawable_math_12"));
        Math.add(new Pitanje("Vrijednost izraza sin(??/2)-cos(??/3) je", "1/2", "0", "1", "3/2", "drawable_math_13"));
        Math.add(new Pitanje("Dva brata zajedno su skupila 120KM. Koliko je imao svaki od njih ako 2/3 sume prvog iznosi sumu drugog?", "72 i 48", "74 i 46", "90 i 30", "85 i 35", "drawable_math_14"));
        Math.add(new Pitanje("Na po??etku sezonskog sni??enja proizvod je pojeftinio 10%, a zatim jo?? jednom 10%. Koliko trenutno ko??ta ako je prvobitna cijena proizvoda bila 80 KM?", "64,8 KM", "64 KM", "65 KM", "68,2 KM", "drawable_math_15"));
        Math.add(new Pitanje("Nakon obavljenog kvadriranja (1-???5)??  dobijemo", "2(3-???5)", "6+???5", "6+2???5", "6-???5", "drawable_math_16"));
        Math.add(new Pitanje("Povr??ina pravouglog trougla ??ija je hipotenuza c=12 i visina na hipotenuzu h=5 iznosi:", "30", "60", "40", "80", "drawable_math_17"));
        Math.add(new Pitanje("Koja od vrijednosti X = cos0; Y = cos30 ; Z = cos45 ; W = cos60 je najve??a", "X", "Y", "Z", "W", "drawable_math_18"));
        Math.add(new Pitanje("Ako se isti broj doda brojniku, a oduzme od nazivnika razlomka x=7/11 dobije se rezultat 2. Koji je to broj?", "5", "4", "7", "6", "drawable_math_19"));
        Math.add(new Pitanje("Knjiga je pojeftinila za  10%, a onda jo?? jednom za 10%. Koliko sada ko??ta ako joj je prvobitna cijena bila 200KM?", "162KM", "175KM", "180KM", "150KM", "drawable_math_20"));
        Math.add(new Pitanje("Rastavi na proste faktore izraz: 8x?? + 1", "(2x+1)(4x??-2x+1)", "(2x+1)??", "(2x+1)(2x+1)??", "(2x+1)(2x-1)??", "drawable_math_21"));
        Math.add(new Pitanje("Kvadriranjem binoma (3???2 - 1)?? ??? dobijamo:", "19-6???2", "19+6???2", "6-19???2", "6+28???2", "drawable_math_22"));
        Math.add(new Pitanje("Povr??ina kruga polupre??nika r=5cm je", "25?? cm2", "10?? cm2", "5?? cm2", "50?? cm2", "drawable_math_23"));
        Math.add(new Pitanje("Izra??unaj (3??*2??)??", "5184", "4096", "6400", "6561", "drawable_math_24"));
        Math.add(new Pitanje("Koji je broj najve??i\nA=sin0,   B=sin30,   C=sin45,   D=sin60,   E=sin90", "E", "d", "A", "b", "drawable_math_25"));
        Math.add(new Pitanje("Izra??unaj sin60+cos30", "???3", "2", "0.5", "1", "drawable_math_26"));
        Math.add(new Pitanje("Dva druga su zajedno imala 120 KM. Koliko je imao svaki od njih ako 1/3 sume prvoga iznosi koliko i suma drugoga?", "90 i 30", "80 i 40", "70 i 50", "100 i 20", "drawable_math_27"));
        Math.add(new Pitanje("Ako obim kruga iznosi 12?? , kolika je njegova povr??ina?", "36??", "12??", "24??", "18??", "drawable_math_28"));
        Math.add(new Pitanje("Rje??enja jedna??ine 2x??-18=0 su", "x=??3", "x=??6", "x=??3/2", "x=??9", "drawable_math_29"));
        Math.add(new Pitanje("Vrijednost izraza (???3 * ???5)??? je", "675", "655", "225", "275", "drawable_math_30"));
        Math.add(new Pitanje("Odredi x iz jedna??ine cosx= -???2/2\n??<x<3??/2", "5??/4", "9??/4", "7??/4", "3??/4", ""));
        Math.add(new Pitanje("Zapremina valjka polupre??nika baze r=2cm i visine H=10cm je:", "40?? cm3", "20?? cm3", "30?? cm3", "50?? cm3", "drawable_math_32"));
        Math.add(new Pitanje("Izra??unati: (???3 *???2)???", "216", "6???6", "36", "36???6", "drawable_math_33"));
        Math.add(new Pitanje("Odrediti vrijednost nepoznate x u relaciji\nlog???/???x=-4", "81", "-81", "1/81", "-1/81", "drawable_math_34"));
        Math.add(new Pitanje("Koji je broj najmanji", "sin30", "sin45", "sin60", "sin90", "drawable_math_35"));
        Math.add(new Pitanje("Koji dvocifren broj ima osobinu da mu je zbir cifara 10 i da je 16 puta ve??i od cifre jedinica?", "64", "82", "56", "46", "drawable_math_36"));
        Math.add(new Pitanje("Ako je sinx=4/5 i 0<x<90, odrediti sin2x", "8/5", "2/5", "24/25", "12/25", ""));
        Math.add(new Pitanje("Rastavi na proste faktore izraz:\nx???-1", "(x-1)(x+1)(x??-x+1)(x??+x+1)", "(x-1)??(x??+x+1)??", "(x+1)2(x??-x+1)??", "(x-1)??(x+1)??", "drawable_math_38"));
        Math.add(new Pitanje("Rastavi na proste faktore izraz: 3x??-27", "3(x+3)(x-3)", "(3x-3)(3x+3)", "3(x-3)", "(3x-3)2", "drawable_math_39"));
        Math.add(new Pitanje("Koji dvocifren broj ima osobinu da mu je zbir cifara 6 i da je 6 puta ve??i od cifre jedinica?", "24", "33", "42", "51", "drawable_math_40"));
        return Math;
    }

    private ArrayList<Pitanje> getPhysics() {
        ArrayList<Pitanje> Physics = new ArrayList<>();
        Physics.add(new Pitanje("Tijelo mase 2 kg po??ne slobodno da pada sa visine 100 m. Poslije 2s padanja njegova kineti??ka energija je:", "400 J", "2000 J", "200 J", "100 J", ""));
        Physics.add(new Pitanje("Koliko km/h je 36 m/s ?", "130 km/h ", "10 km/h ", "20 km/h ", "36 km/h ", ""));
        Physics.add(new Pitanje("U zatvorenoj posudi nalazi se gas na temperaturi 200C.  Da bi mu se pritisak smanjio dva puta gas treba ohladiti do", "10??C", "-20??C", "-126.5??C", "-196.5??C", ""));
        Physics.add(new Pitanje("Ekvivalentni kapacitet dva jednaka kondenzatora, vezana paralelno, iznosi 12 ??F.  Kapacitet jednog kondenzatora, izra??en u mikrofaradima, je: ", "6 ??F", "3 ??F", "9 ??F", "12 ??F", ""));
        Physics.add(new Pitanje("Kolika je energija fotona ??ija je talasna du??ina 620 nm?", "2,0 eV", "0,8 eV", "1,2 eV", "1,6 eV", ""));
        Physics.add(new Pitanje("Alfa ??estica je", "jezgra helija", "jezgra vodika", "proton", "elektron", ""));
        Physics.add(new Pitanje("Veli??ina jezgre atoma vodika je pribli??no", "10????????m", "10???????m ", "10??????m", "10????????m", ""));
        Physics.add(new Pitanje("Brzina svjetlosti u vakuumu je:", "3??10^8 m/s", "3??10?? m/s", "3??10??? m/s", "300 000 m/s", ""));
        Physics.add(new Pitanje("Jedinica za magnetsku indukciju je", "tesla", "veber", "bor", "gaus", ""));
        Physics.add(new Pitanje("Na elektri??noj sijalici stoji oznaka 220 V/100 W. Njen elekrtri??ni otpor izra??en  u  omima, kada se priklju??i na gradsku mre??u, je:", "484", "2,2", "22", "0.45", ""));
        Physics.add(new Pitanje("Zna??ajan dio tamne materije ??ine:", "neutrini", "neutroni", "protoni", "elektroni", ""));
        Physics.add(new Pitanje("Na horizontalnoj podlozi miruje tijelo mase 600 g. Sila reakcije podloge je", "6 N", "600 N", "0.6 N", "60 N", ""));
        Physics.add(new Pitanje("??ovjek stoji i dr??i kofer mase 10 kg, na visini 1m. Rad koji izvr??i u toku 5 s je", "0 J", "5 J", "50 J", "500 J", ""));
        Physics.add(new Pitanje("SI jedinica za osvijetljenost je:", "luks", "fluks", "lumen", "kandela", ""));
        Physics.add(new Pitanje("h/mv  je matemati??ki izraz za", "talasnu du??inu fotona", "impuls fotona", "energiju fotona", "1. Bohrov postulat", ""));
        Physics.add(new Pitanje("Prvi laser je konstruisan", "1960.", "1940.", "1950.", "1970.", ""));
        Physics.add(new Pitanje("Tijelo mase 300 g kre??e se brzinom 72 km/h. Njegova kineti??ka energija je", "60 J", "108 J", "10,8 J", "6 kJ", ""));
        Physics.add(new Pitanje("SI jedinica za te??inu je", "njutn", "gram", "kilogram", "kilopond", ""));
        Physics.add(new Pitanje("Voda prilikom hladjenja od 4??C do 0??C:", "pove??ava zapreminu", "smanjuje zapreminu", "pove??ava gustinu", "ne mijenja gustinu", ""));
        Physics.add(new Pitanje("Niels Bohr je objavio svoj model atoma:", "u pvoj polovini 20. stolje??a", "u pvoj polovini 19. stolje??a", "u drugoj polovini 19. stolje??a", "u drugoj polovini 20. stolje??a ", ""));
        Physics.add(new Pitanje("mvr je matemati??ki izraz za:", "moment koli??ine kretanja", "koli??inu kretanja", "impuls", "intenzitet", ""));
        Physics.add(new Pitanje("Automobil se kre??e brzinom 54 km/h. Za 6 minuta predje put od", "5,4 km", "32,4 km", "3,24 km", "10,8 km", ""));
        Physics.add(new Pitanje("SI jedinica za elektromotornu silu izvora struje je", "volt", "njutn", "kilopond", "d??ul", ""));
        Physics.add(new Pitanje("Newton je formulisao zakone mehanike", "krajem 17 stolje??a", "po??etkom 16. stolje??a", "krajem 16. stolje??a", "po??etkom 17. stolje??a", ""));
        Physics.add(new Pitanje("Vrsta atoma zavisi od", "broja neutrona u atomu", "broja elektrona u atomu", "broja protona u atomu", "zbira protona i elektrona u atomu", ""));
        Physics.add(new Pitanje("Prema Teoriji velikog praska Svemir je nastao prije", "13 milijardi godina", "13 miliona godina", "130 miliona godina", "1,3 milijarde godina", ""));
        Physics.add(new Pitanje("Automobil se kre??e brzinom 72 km/h. Za 6 minuta predje put od", "7,2 km", "12 km", "1,2 km", "43,2 km", ""));
        Physics.add(new Pitanje("Fizika, kao posebna nau??na disciplina, nastala je u:", "17. stolje??u", "13. stolje??u", "2. stolje??u", "7. stolje??u", ""));
        Physics.add(new Pitanje("Ako se brzina tijela pove??a 3 puta,  koji od odgovora vezanih za kineti??ku energiju je ta??an?", "pove??a se 9 puta", "pove??a se 3 puta", "smanji se 3 puta", "smanji se 9 puta", ""));
        Physics.add(new Pitanje("Promjena odre??ene koli??ine idealnog gasa pri konstantnoj temperaturi naziva se", "izotermna promjena", "izobarna promjena", "izohorna promjena", "adijabatska promjena", ""));
        Physics.add(new Pitanje("Koji od parova atoma predstavljaju izotope?", "(12/6)C (14/6)C", "(16/8)O (14/7)N", "(16/8)O (23/11)Na", "(14/7)N (14/6)C", ""));
        Physics.add(new Pitanje("Koji od ponu??enih odgovora predstavlja SI jedinicu  za ja??inu elektri??ne struje:", "C/s  (C -Kulon, s- sekunda)", "Cs", "V*??  (Volt x Om)", "???/V", ""));
        Physics.add(new Pitanje("Totalna unutra??nja refleksija svjetlosti  mogu??a je", "pri prelasku svjetlosti  iz opti??ki gu????e u opti??ki rje??u sredinu", "pri prelasku svjetlosti  iz opti??ki rje??e u opti??ki gu????u sredinu", "samo pri postiranju svjetlosti  kroz vodu", "uvijek kada svjetlost pada na granicu izme??u dvije razli??ite opti??ke sredine", ""));
        Physics.add(new Pitanje("Koja od pojava dokazuje da elektron ima valna svojstva?", "difrakcija elektrona na kristalnoj re??etki", "fotoelektri??ni efekt", "zra??enje crnog tijela", "niti jedna od navedenih", ""));
        Physics.add(new Pitanje("Tijelo mase 2,0 kg miruje na horizontalnoj podlozi. Koeficijent trenja izmedju tijela i podloge je 0,3. Najmanja sila koja ga mo??e pokrenuti je", "6,0 N", "60 N", "0,6 N", "0,06 N", ""));
        Physics.add(new Pitanje("U hladnom jutru, na temperaturi 70C, pritisak u automobilskoj gumi je 200 kPa. U toku dana temperatura u gumama se podigne na 37oC. Pritisak u gumama se pove??a za:", "214 kPa", "21,48 kPa", "1,07 kPa", "10,7 kPa", ""));
        Physics.add(new Pitanje("U otporniku od 20 ??, pri prolasku elektri??ne struje, oslobodi se 1 kWh toplote za 30 minuta. Kolika ja??ina struje prolazi kroz otpornik?", "10A", "20A", "18A", "22A", ""));
        Physics.add(new Pitanje("Toplotna ma??ina ima stepen iskori??tenja 34 %. Koliki ??e izvr??iti rad, ako primi 5 MJ toplote?", "1,70 MJ", "0,17 MJ", "1,70 kJ", "17 kJ", ""));
        Physics.add(new Pitanje("Kolika je energija fotona ??ija je talasna du??ina 500 nm?", "2,48 eV", "0,248 eV", "24,8 eV", "248 eV", ""));
        Physics.add(new Pitanje("Kolikom po??etnom brzinom treba baciti tijelo vertikalno nani??e sa visine h = 60 m da bi ono palo na povr??inu Zemlje za 3 s?", "5,285 m/s", "10,193 m/s", "15,192 m/s", "20,193 m/s", ""));
        Physics.add(new Pitanje("Korito rijeke ima oblik pravougaonika stranica a = 18 m i b = 2 m. Brzina rijeke je 7,2 km/h. Koliki je zapreminski protok vode?", "72 m3/s", "5 m3/s", "62 m3/s", "259,2 m3/s", ""));
        Physics.add(new Pitanje("Elasti??na opruga se stisne za 25 cm pod djelovanjem sile od 12,5 N. Koliki je izvr??eni rad pri sabijanju opruge?", "1,5625 J", "0,2431 J", "0,6326 J", "6,342 J", ""));
        Physics.add(new Pitanje("Dva jednaka ta??kasta naboja od 4??C, u petroleju, (??r = 2,5), me??usobno se odbijaju silom  od 20 mN. Koliko je rastojanje izme??u njih?", "1,7 m", "15 cm", "27 mm", "1,7 mm", ""));
        Physics.add(new Pitanje("Na kolikom rastojanju od beskona??no dugog pravolinijskog provodnika u vazduhu,  kroz kojeg ide struja ja??ine 2 A, magnetna indukcija iznosi 4??T?", "10 cm", "1 cm", "1 m", "10 m", ""));
        Physics.add(new Pitanje("Kolika je energija fotona ??ija je talasna du??ina 400 nm?", "3,1 eV", "2,48 eV", "0,248 eV", "4,23 eV", ""));
        Physics.add(new Pitanje("Izvjesna koli??ina gasa zauzima zapreminu V1= 3 litra kod pritiska 1 bar. Koliki je pritisak gasa ako se on sabije na V2 = 500 cm3? Temperatura gasa se ne mijenja", "6 bara", "4 bara", "5 bara", "3 bara", ""));
        Physics.add(new Pitanje("Kada se u kolo naizmjeni??ne elektri??ne struje priklju??i kondenzator kapaciteta 2 ??F njegov otpor iznosi 2 k??. Kolika je frekvencija naizmjeni??ne elektri??ne struje?", "39,8 Hz", "20,5 Hz", "25,6 Hz", "42,5 Hz", ""));
        Physics.add(new Pitanje("Naelektrisana kapljica ulja mase 10^-4kg miruje u homogenom elektri??nom polju ja??ine 98,1N/C. Koliki je naboj naelektrisane kapljice?", "10 ??C", "0,1 ??C", "1 ??C", "100 ??C", ""));
        Physics.add(new Pitanje("Automobil se kre??e brzinom 20 m/s,a zatim brzinom 72 km/h", "Automobil nije promijenio brzinu", "Automobil je ubrzao", "Automobil je usporio", "Automobil se kretao stalnim usporenjem", ""));
        Physics.add(new Pitanje("??vrsto tijelo, gustine 8 g/cm3, uroni se u vodu gustine 1 g/cm3. Uronjeno tijelo  ??e u vodi da", "tone", "Lebdi", "Pliva", "bude djelomi??no iznad vode", ""));
        Physics.add(new Pitanje("Apsolutni indeks prelamanja neke sredine je", "odnos brzine svjetlosti u vakuumu i toj sredini", "odnos brzine svjetlosti u toj sredini i vazduhu", "odnos brzine svjetlosti u vazduhu i toj sredini", " odnos brzine svjetlosti u vakuumu i vazduhu", ""));
        Physics.add(new Pitanje("Relacija I = ??T^4 je matemiti??ki izraz za", "Stefan-Boltzmanov zakon zra??enja", "Wienov zakon pomjeranja", "Planckov zakon zra??enja", "Prvi Bohrov postulat", ""));
        return Physics;
    }

    private ArrayList<Pitanje> getChemistry() {
        ArrayList<Pitanje> Chemistry = new ArrayList<>();
        Chemistry.add(new Pitanje("Zapremina jednog mola gasa pri STP je:", "22,4 dm3", "11,2 dm3", "5,6 dm3", "33,6 dm3", ""));
        Chemistry.add(new Pitanje("Relativna molekulska masa H2SO4 iznosi:", "98", "141", "107", "106", "Mr(H2SO4)=2*Ar(H)+Ar(S)+4*Ar(O)\nMr(H2S04)=2*1+32+4*16\nMr(H2SO4)=98"));
        Chemistry.add(new Pitanje("Heksoza je: ", "glukoza ", "maltoza ", "riboza ", "2-deoksiriboza", "Heksoze su monosaharidi sa ??est ugljikovih atoma, sa hemijskom formulom C6H12O6."));
        Chemistry.add(new Pitanje("R-COOH predstavlja op??u formulu:", "organskih kiselina", "estera", "etera", "anhidrida", ""));
        Chemistry.add(new Pitanje("Jedinica za masenu koncentraciju je:", "g/dm3", "mol/dm3", "mol/kg", "mol/mol", ""));
        Chemistry.add(new Pitanje("Heterocikli??na baza nukleinskih kiselina je:", "adenin", "anilin", "aldehid", "alanin", ""));
        Chemistry.add(new Pitanje("Maseni broj atoma ozna??ava", "zbir protona i neutrona u jezgri atoma", "broj protona u jezgru", "broj elektrona u omota??u", "zbir protona i elektrona", ""));
        Chemistry.add(new Pitanje("Na katodi u procesu elektrolize odvija se:", "redukcija", "oksidacija", "jonizacija", "polimerizacija", ""));
        Chemistry.add(new Pitanje("Peptidna veza obrazuje se izme??u: ", "karboksilne grupe i amino grupe", "amino grupe i hidroksidne grupe", "karbonilne i hidroksidne grupe", "keto i amino grupe", ""));
        Chemistry.add(new Pitanje("Brzina hemijske reakcije: ", "je promjena koncentracije reaktanata u jedinici vremena", "je pre??eni put u jedinici vremena", "ne zavisi od temperature", "je brzina preraspodjele atoma", ""));
        Chemistry.add(new Pitanje("Elementi IA grupe su:", "jaki reducenti", "jaki oksidansi", "lahko se redukuju", "te??ko se oksidiraju", "To su vodik, litijum, natrij, kalij, rubidij, cezij i francij"));
        Chemistry.add(new Pitanje("Primarni amin je", "amonijak", "dietilamin", "anilin", "amid", ""));
        Chemistry.add(new Pitanje("U alkenima, dvostruka veza sastoji se od", "jedne ?? i jedne ?? veze", "dvije ?? veze", "dvije ?? veze", "dvije kovalentne veze", ""));
        Chemistry.add(new Pitanje("Baze su spojevi koji u vodenom rastvoru:", "disociraju na jone metala i hidroksidne jone", "disociraju na jone metala i jone kiselinskog ostatka", "ne disociraju", "disociraju na hidrogenove jone i hidroksidne jone", ""));
        Chemistry.add(new Pitanje("Masti se rastvaraju u: ", "nepolarnim organskim rastvara??ima", "polarnim organskim rastvara??ima", "vodi", "kiselinama", ""));
        Chemistry.add(new Pitanje("Elementi u PSE su poredani: ", "po porastu atomskog broja", "po broju elektrona u K-ljusci", "po abecednom redu", "po broju orbitala", ""));
        Chemistry.add(new Pitanje("Atom karbona ima ukupno", "6 elektrona", "12 elektrona", "8 elektrona", "4 elektrona", ""));
        Chemistry.add(new Pitanje("Elektronska konfiguracija 1s2 2s2 2p6 3s1 je konfiguracija atoma", "natrijuma", "hlora", "neon", "cinka", ""));
        Chemistry.add(new Pitanje("Dijamant i grafit su", "alotropske modifikacije karbona", "alotropske modifikacije sumpora", "provodnici elektriciteta", "izolatori", ""));
        Chemistry.add(new Pitanje("Od navedenih spojeva po jonskom tipu veze gra??en je", "CaCl2", "H2O", "HCl", "CH4", ""));
        Chemistry.add(new Pitanje("Koji od navedenih spojeva nije so", "NH3", "NH4Cl", "NH4NO3", "(NH4)2S", ""));
        Chemistry.add(new Pitanje("Alanil-glicin je", "dipeptid", "aminokiselina", "protein", "aldehid", ""));
        Chemistry.add(new Pitanje("Esteri nastaju reakcijom", "kiselina i alkohola", "aldehida i alkohola", "ketona i kiselina", "baza i kiselina", ""));
        Chemistry.add(new Pitanje("Atomska masa nitrogena je:", "14", "28", "28 g/mol", "14 g/mol", ""));
        Chemistry.add(new Pitanje("Oksidacioni broj oksigena u spojevima je", "-2", "+2", "1", "0", ""));
        Chemistry.add(new Pitanje("Kiseline", "jonizacijom daju H3O+ jone", "ne joniziraju", "jonizacijom daju OH- jone", "su samo anorganske", ""));
        Chemistry.add(new Pitanje("Zasi??eni karbohidrogen je", "metan", "benzen", "cikloheksen", "eten", ""));
        Chemistry.add(new Pitanje("U disaharide spada", "Maltoza", "glukoza", "skrob", "celuloza", ""));
        Chemistry.add(new Pitanje("Kationi su", "pozitivno naelektrisani joni", "neutralni atomi", "negativni joni", "pozitivni atomi metala", ""));
        Chemistry.add(new Pitanje("CH3CH2OH predstavlja formulu", "etanola", "etanala", "metanola", "ketona", ""));
        return Chemistry;
    }

    private ArrayList<Pitanje> getBiology() {
        ArrayList<Pitanje> Biology = new ArrayList<>();
        Biology.add(new Pitanje("Najuo??ljiviji hromosomi su u:", "metafazi", "telofazi", "profazi", "interfazi", ""));
        Biology.add(new Pitanje("Glatke mi??i??ne stanice izgra??uju:", "krvne sudove", "srce", "jezik", "mi??i??e ruku", "Nalaze se u gra??i krvnih i limfnih ??ila, crijeva, du??nika, mokra??nog mjehura, maternice, ko??e, unutra??njih mi??i??a oka itd"));
        Biology.add(new Pitanje("Nosioci imuniteta u organizmu su", "T-limfociti", "eritrociti", "trombociti", "neuroni", ""));
        Biology.add(new Pitanje("Srce riba je gra??eno iz:", "1 komore i 1 pretkomore", "2 komore i 2 pretkomore", "2 pretkomore i 1 komore", "1 pretkomore i 2 komore", ""));
        Biology.add(new Pitanje("Redukciona dioba je", "mejoza", "partenokarpija", "mitoza", "partenogeneza", "S obzirom da se broj hromosoma u k??erkama ??elijama u odnosu na majku ??eliju smanjuje na pola, ova dioba se naziva i redukciona (lat. reductio = smanjenje)"));
        Biology.add(new Pitanje("Somatotropni hormon izlu??uje: ", "hipofiza", "gu??tera??a", "??titna ??lijezda", "timus", "Somatotropni hormon ili hormon rasta"));
        Biology.add(new Pitanje("Uloga leukocita je u: ", "odbrani organizma od stranih ??estica", "dijeljenju ??elije", "prenosu kiseonika", "zaustavljanju krvarenja", "Prenos kisika je zadatak eritrocita, a zaustavljanje krvarenja trombocita"));
        Biology.add(new Pitanje("??krge su organi za disanje kod:", "riba", "insekata", "sisara", "ptica", ""));
        Biology.add(new Pitanje("??elijski ciklus obuhvata:", "interfazu i mitozu", "interfazu i amitozu", "profazu i mitozu", "interfazu i telofazu", "Interfaza je faza izme??u dvije uzastopne diobe i najdu??i je dio ??elijskog ciklusa"));
        Biology.add(new Pitanje("U usnoj ??upljini ??ovjeka se nalazi enzim", "amilaza", "himotripsin", "tripsin", "pepsin", "Amilaza je enzim koji katalizira hidrolizu ??kroba u ??e??ere"));
        Biology.add(new Pitanje("Srce ??ovjeka je gra??eno od:", "dvije komore i dvije pretkomore", "dvije komore i pretkomore", "komore i pretkomore", "komore i dvije predkomore", ""));
        Biology.add(new Pitanje("Nauka koja prou??ava gra??u i funkciju ??elije je:", "citologija", "histologija", "zoologija", "antropologija", ""));
        Biology.add(new Pitanje("Nefron je", "osnovna jedinica bubrega", "osnovna jedinica nervnog sistema", "veza izme??u nervnih ??elija", "organ za izlu??ivanje kod rakova", ""));
        Biology.add(new Pitanje("Normalan puls kod ??ovjeka iznosi:", "od 60 do 80 otkucaja u minuti", "od 10 do 15 otkucaja u minuti", "od 50 do 60 otkucaja u minuti", "od 100 do 150 otkucaja u minuti", ""));
        Biology.add(new Pitanje("Povi??ena vrijednost krvnog pritiska ozna??ava se kao", "hipertenzija", "hipotenzija", "izotenzija", "sistola", "Hipotenzija je nizak pritisak"));
        Biology.add(new Pitanje("Geneti??ka informacija je zapisana", "jedru", "citoplazmi", "lizozomima", "ribosomima", ""));
        Biology.add(new Pitanje("Uloga ribozoma je u", "biosintezi  bjelan??evina", "odbrani organizma", "transportu kroz membranu", "razgradnji glukoze", ""));
        Biology.add(new Pitanje("Enzim koji razla??e masti je", "lipaza", "nukleaza", "saharaza", "maltaza", "Masti se zovu jo?? i lipidi, a imena enzma se izvode od imena materije na koju djeluju i nastavka -aza"));
        Biology.add(new Pitanje("Citoplazmatske organele koje u??estvuju u proizvodnji energije su:", "mitohondrije", "lizosomi", "endoplazmatski retikulum", "plazmalema", ""));
        Biology.add(new Pitanje("Informaciju o sintezi proteina iz jedra prenosi", "iRNK", "DNK", "tRNK", "rRNK", ""));
        Biology.add(new Pitanje("Izbaci uljeza", "bubreg", "prazno crijevo (jejunum)", "??eludac", "jednjak", "Svi ostali odgovori se odnose na probavni sistem, osim bubrega koji je dio ekskretornog sistema"));
        Biology.add(new Pitanje("Uloga eritrocita je u:", "prijenos oksigena", "odbrani organizma od stranih ??estica", "zgru??avanju krvi", "termoregulaciji", "Za??tita organizma je zadatak leukocita, a zaustavljanje krvarenja trombocita"));
        Biology.add(new Pitanje("Spolni hormoni su", "estrogen", "adrenalin", "tiroksin", "somatotropni hormona", "??enski spolni hormoni su estrogen i progesteron, a mu??ki testosteron"));
        Biology.add(new Pitanje("??elijsko disanje kod biljaka odvija se:", "no??u", "i danju i no??u", "danju", "samo zimi", "Biljke danju vr??e proces fotosinteze, a no??u disanja"));
        Biology.add(new Pitanje("Spolne ??elije imaju hromosomsku garnituru koja se ozna??ava sa", "n", "2n", "3n", "4n", ""));
        Biology.add(new Pitanje("Estrogen je hormon", "jajnika", "gu??tera??e", "hipofize", "??titne ??lijezde", "Estrogen je ??enski spolni hormon"));
        Biology.add(new Pitanje("Organela koje ne pripada ??ivotinjskoj ??eliji je", "??elijski zid", "gol??ijev aparat", "endoplazmatski retikulum", "plazmalema", "??elijski zid je karakteristi??an za biljne ??elije"));
        Biology.add(new Pitanje("U mi??i??noj kontrakciji va??nu ulogu imaju bjelan??evine", "aktin i miozin", "valin i glicin", "tripsin i pepsin", "leucin i izoleucin", "Sposobnost kontrakcije se zasniva na prisustvu kontraktilnih vlakana, miofibrila, koja su izgra??ena od proteina aktina i miozina"));
        Biology.add(new Pitanje("Nedostatak somatotropnog hormona dovodi do", "patuljastog rasta", "gu??avosti", "rahitisa", "??e??erne bolesti", "Somatotropni hormon je hormon rasta"));
        Biology.add(new Pitanje("Mejozom nastaju", "gameti", "somatske ??elije", "tjelesne ??elije", "krvne ??elije", "Gameti su polne ??elije koje se stvaraju putem mejoze te sadr??e haploidan broj hromozoma"));
        Biology.add(new Pitanje("??ivotinjske ??elije ne sadr??e", "hloroplaste", "membranu", "jedro", "mitohondrije", "Hloroplasti su organele koje se nalaze u biljnim ??elijama i drugim eukariotskim organizmima koji vr??e proces fotosinteze"));
        Biology.add(new Pitanje("Receptori su", "prijemnici podra??aja", "veze izme??u ??elija", "transmiteri", "sinapse", ""));
        Biology.add(new Pitanje("Leukociti sintetiziraju", "antitijela", "hormone", "kisik", "lipide", ""));
        Biology.add(new Pitanje("Hromosom je gra??en od dvije", "hromatide", "hromoneme", "hromomere", "centromere", "Hromatida je uzdu??na polovina metafaznog hromozoma."));
        Biology.add(new Pitanje("Kortikosteroide izlu??uju", "nadbubre??ne ??lijezde", "jajnici", "testisi", "para??titne ??lijezde", ""));
        Biology.add(new Pitanje("??ivotinjske ??elije ne sadr??e", "celulozu", "glikogen", "lipide", "proteine", "Celuloza nastaje u prirodi fotosintezom i ??ini gotovo polovinu tvari od koje su gra??ene stijene ??elija u drve??u i jednogodi??njim biljkama"));
        Biology.add(new Pitanje("Cjevasti nervni sistem se javlja kod", "??ovjeka", "glista", "insekata", "dupljara", "U najrazvijenijem obliku javlja se kod ??ovjeka."));
        Biology.add(new Pitanje("Hromosomska garnitura tjelesnih ??elija ??ovjeka je", "diploidna", "haploidna", "poliploidna", "aneuploidna", "Diploidna(2n) hromozomska garnitura, 46 hromozoma"));
        Biology.add(new Pitanje("Skrob se u ustima razla??e pod dejstvom", "ptijalina", "tripsina", "pepsina", "tiroksina", ""));
        Biology.add(new Pitanje("Lizozomi su odgovorni za", "varenje u ??eliji", "sintezu energije", "sintezu proteina", "sintezu masti", ""));
        Biology.add(new Pitanje("Hormon rasta izlu??uje:", "hipofiza", "jajnik", "gu??tera??a", "bubreg", "Hormon rasta ili somatotropni hormon"));
        Biology.add(new Pitanje("Razvi??e bez oplodnje je", "partenogeneza", "mitoza", "mejoza", "amitoza", ""));
        Biology.add(new Pitanje("Neurotransmiter je", "acetilholin", "progesteron", "estrogen", "testosteron", "Svi ostali odgovori su spolni hormoni"));
        Biology.add(new Pitanje("U zgru??avanju krvi u??estvuju", "trombociti", "monociti", "leukociti", "eritrociti", ""));
        Biology.add(new Pitanje("Somatske ??elije nastaju:", "mitozom", "amitozom", "mejozom", "partenogenezom", "Somatske ??elije su ustvari tjelesne ??elije, a one nastaju mitozom"));
        Biology.add(new Pitanje("Srce vodozemaca je gra??eno iz", "2 pretkomore i 1 komore", "2 komore i 2 pretkomore", "1 pretkomore i 2 komore", "1 komore i 1 pretkomore", ""));
        Biology.add(new Pitanje("Tiroksin izlu??uje:", "??titna ??lijezda", "testis", "jajnik", "nadbubre??na ??lijezda", "??titna ??lijezda se jo?? zove i tiroidna"));
        Biology.add(new Pitanje("Kontraktilnost mi??i??noj ??eliji daju", "Miofibrili", "neurofibrili", "cilije", "fibrinogeni", "Sposobnost kontrakcije se zasniva na prisustvu kontraktilnih vlakana, miofibrila, koja su izgra??ena od proteina aktina i miozina"));
        Biology.add(new Pitanje("Nadbubre??ne ??lijezde stvaraju:", "adrenalin", "antitijela", "aglutinogen", "eritropoetin", ""));
        Biology.add(new Pitanje("Prvi znak trudno??e je", "izostanak menstruacije", "povra??anje", "promjena oblika stomaka", "nervoza, depresija", ""));
        Biology.add(new Pitanje("Uloga ??tapi??a u stvaranju slike predmeta je", "uo??avanje predmeta", "razlikovanje konture predmeta", "razlikovanje boja predmeta", "razlikovanje udaljenosti  predmeta", ""));
        Biology.add(new Pitanje("Difuzni nervni sistem se javlja kod", "dupljara", "??lankovitih glista", "pljosnatih glista", "hordata", "Difuzni nervni sistem sastavljen je od mre??asto povezanih nervnih ??elija, me??u kojima se izvorni nadra??aj ravnmjerno rasprostire u svim pravcima. U procesu koncentri??nog ??irenja, intenzitet nadra??aja postepeno opada i na izvjesnoj udaljenosti od podra??enog mjesta - potpuno se gubi. Nervni spletovi jedini su tip nervnog sistema dupljara"));
        Biology.add(new Pitanje("Ptijalin je enzim koji razla??e", "skrob u ustima", "bjelan??evine", "maltozu", "masti u ??eludcu", ""));
        Biology.add(new Pitanje("Hemolimfa je tjelesna te??nost:", "beski??menjaka", "ki??menjaka", "insekata", "??ovjeka", "Hemolimfa je tjelesna te??nost koja cirkuli??e kroz sudove i me??utkivne prostore u telu beski??menjaka (nekih crva, meku??aca, zglavkara, bodljoko??aca, pla??ta??a)."));
        return Biology;
    }

    private ArrayList<Pitanje> getGeo() {
        ArrayList<Pitanje> Geo = new ArrayList<>();
        Geo.add(new Pitanje("Zemlja obilazi (revoluira) oko Sunca od zapada prema istoku po putanji koja se naziva:", "ekliptika ??iji obim iznosi 940 miliona kilometara", "galaktika ??iji obim iznosi 970 miliona kilometara", "galaksija ??iji obim iznosi 720 miliona kilometara", "geoid ??iji obim iznosi 650 miliona kilometara", "drawable_geo_2"));
        Geo.add(new Pitanje("Zemljina Atmosfera se dijeli u pet glavnih slojeva, a to su:", "troposfera, stratosfera, mezosfera, termosfera i egzosfera", "troposfera, stratosfera, mezosfera, termosfera i geosfera", "troposfera, stratosfera, mezosfera, termosfera i astenosfera", "troposfera, stratosfera, mezosfera, termosfera i fotosfera", ""));
        Geo.add(new Pitanje("S obzirom na izgled oblaci se dijele na tri osnovne skupine: ", "gomilaste (kumuluse), slojevite (stratuse) i pramenaste (ciruse)", "gomilaste (ciruse), guste (stratuse) i slojevite (kumuluse)", "slojevite (kumuluse), gomilaste (stratuse) i tamne (ciruse) ", "guste (kumuluse), slojevite (ciruse) i pramenaste (stratuse)", ""));
        Geo.add(new Pitanje("Bosna i Hercegovina je zemlja:", "jugoisto??ne Europe, smje??tena na zapadnom dijelu Balkanskog poluotoka", "srednje Europe, smje??tena na zapadnom dijelu Balkanskog poluotoka", "zapadne Europe, smje??tena na sjevernom dijelu Balkanskog poluotoka", "jugozapadne Europe, smje??tena na isto??nom dijelu Balkanskog poluotoka", ""));
        Geo.add(new Pitanje("Geolo??ki najstariji dio Sjeverne Amerike je: ", "Kanadski ??tit", "Apala??ko gorje", "Kordiljeri", "Sredi??nja nizija", "Kanadski ??tit je formiran prije oko 3 milijarde godina i dobio je ime po tvrdom gnajsu i granitu koji le??e ispod njegove povr??ine i spadaju me??u najstarije stijene na Zemlji."));
        Geo.add(new Pitanje("Europska unija danas broji:", "28 zemalja ??lanica", "15 zemalja ??lanica", "20 zemalja ??lanica", "22 zemlje ??lanice", "Od 31.1.2020. EU ima 27 ??lanova, nakon izlaska Velike Britanije"));
        Geo.add(new Pitanje("Povr??inski oblik kra??kog reljefa je :", "Vrta??e", "Cirkovi", "jame", "dine", "drawable_geo_7"));
        Geo.add(new Pitanje("U egzogene sile spada :", "Sun??eva energija", "vulkani", "regresija", "zemljotresi", "Egzogene sile, naziv za sile koje izvana uti??u na oblikovanje Zemljine kore (Sun??evo zra??enje, ledenjaci, vjetar, vode, hemijsko i biolo??ko tro??enje itd"));
        Geo.add(new Pitanje("Koju rijetku pojavu susre??emo u blizini vulkana :", "gejziri", "barhane", "vrulje", "vrela", "Gejzir je posebna vrsta geotermalnog izvora ??ija je karakteristika naglo i neo??ekivano izbacivanje tople ili vrele vode i vodene pare."));
        Geo.add(new Pitanje("Prirodni faktor razvoja privrede je:", "Tr??i??te", "Sirovine", "Kapital", "Saobra??aj", ""));
        Geo.add(new Pitanje("Posljedica Zemljine rotacije je", "Smjena dana i no??i", "smjena godi??njih doba", "toplotni pojasevi", "nejednaka du??ina dana i no??i", ""));
        Geo.add(new Pitanje("Sjeveroisto??na Bosna bogata je sa ", "ugljem", "??eljeznom rudom", "boksitom", "bakrom", ""));
        Geo.add(new Pitanje("Zemljina polulopta podijeljena je na", "24 satne  zone", "12 satnih zona", "48 satnih zona", "60 satnih zona", "Granice vremenskih zona u pravilu le??e na meridijanima geografske du??ine koji su vi??ekratnici 15??, pa razlika izme??u susjednih vremenskih zona iznosi jedan sat. Ipak, ponegdje je razlika i druga??ija. Osim toga, vremenske zone mogu imati prili??no nepravilne oblike jer obi??no prate granice dr??ava ili drugih administrativnih podru??ja."));
        Geo.add(new Pitanje("Najmanju geografsku ??irinu imaju ta??ke na ekvatoru, a najve??u na polovima", "0?? na ekvatoru i 90?? na polovima", "0?? na ekvatoru i 180?? na polovima", " 90?? na ekvatoru i 90?? na polovima", "90?? na ekvatoru i 180?? na polovima", "Geografska ??irina je udaljenost nekog mjesta od ekvatora prema sjevernom i ju??nom geografskom polu"));
        Geo.add(new Pitanje("Kra??ki proces je", "hemijsko razaranje kre??njaka vodom", "biolo??ko razaranje stijena", "mehani??ko razaranje stijena", "djelovanje vjetra", ""));
        Geo.add(new Pitanje("Vodene povr??ine na planeti Zemlji zauzimaju povr??inu od", "361 000 000 km2 ili 71% od ukupne povr??ine planete", "362 000 000 km2 ili 72% od ukupne povr??ine planete", "382 000 000 km2 ili 75% od ukupne povr??ine planete", "392 000 000 km2 ili 79% od ukupne povr??ine planete", ""));
        Geo.add(new Pitanje("Na??a zemlja Bosna i Hercegovina zauzima povr??inu od", "51 129 km2", "41 129 km2", "51 120 km2", "38 219 km2 ", ""));
        Geo.add(new Pitanje("Lisabon je glavni grad", "Portugala", "??panije", "Andore", "Malte", ""));
        Geo.add(new Pitanje("Kra??ki proces je", "hemijsko razaranje kre??njaka vodom", "biolo??ko razaranje stijena", "mehani??ko razaranje stijena", "djelovanje vjetra", ""));
        Geo.add(new Pitanje("Reljefne cjeline Angloamerike su:", "Kanadski ??tit, Apala??i, Kordiljeri i Sredi??nja nizija", "Balti??ki ??tit, Apala??i, Kordiljeri i Sredi??nja nizija", "Kanadski ??tit, Apenini, Kordiljeri i Velika nizija", "Apala??i, Apenini, Pirineji i i Sredi??nja nizija", "Apenini(Italija),Pirineji(??panija) i balti??ki ??tit(Skandinavija) su svi u Europi"));
        Geo.add(new Pitanje("Brisel je glavni grad:", "Belgije", "Luksemburga", "Holandije", "Farskih Ostrva", ""));
        Geo.add(new Pitanje("Gr??ki nau??nik (poznat kao \"otac geografije\") koji je u III stolje??u p.n.e. prvi upotrijebio rije?? geografija je", "Eratosten", "Aristotel", "Al-Biruni", "Humboldt", ""));
        Geo.add(new Pitanje("Planeta Zemlja u toku jednog sata okrene se oko svoje ose za", "15??", "5??", "10??", "20??", "Zapamtite: krug ima 360 stepeni, dan 24 sata. 360/24=15"));
        Geo.add(new Pitanje("Najvi??a ta??ka na Zemlji je na Mount Everestu i njena nadmorska visina iznosi", "8848m", "7748m", "8223m", "9010m", ""));
        Geo.add(new Pitanje("U BiH su zastupljeni sljede??i tipovi klime", "mediteranska, umjereno ??? kontinentalna i planinska", "planinska, polupustinjska i suptropska", "ekvatorijalna, atlantska i polarna", "atlantska, mediteranska i kontinentalna", ""));
        Geo.add(new Pitanje("Kanbera je glavni grad", "Australije", "Novog Zelanda", "Kanade", "Bahama", "Nije Sidnej :D"));
        Geo.add(new Pitanje("Najzastupljeniji tip klimata u na??oj zemlji je", "Cfb umjereno topli vla??ni klimat sa toplim ljetom", "Cfa umjereno topli vla??ni klimat sa ??arkim ljetom", "Cfc umjereno topli vla??ni klimat sa svje??im ljetom", "Csa mediteranski klimatski tip", ""));
        Geo.add(new Pitanje("Geografska ??irina mo??e biti:", "sjeverna i ju??na. Najmanju geografsku ??irinu imaju ta??ke koje le??e na ekvatoru(0), dok polovi imaju najve??u geografsku ??irinu(90)", "isto??na i zapadna. Najmanju geografsku ??irinu imaju ta??ke koje le??e na ekvatoru(0), dok polovi imaju najve??u geografsku ??irinu(180)", "isto??na, zapadna, sjeverna i ju??na. Najmanju geografsku ??irinu imaju ta??ke koje le??e na ekvatoru(0), dok polovi imaju najve??u geografsku ??irinu(360)", "sjeverna i ju??na. Najmanju geografsku ??irinu imaju ta??ke koje le??e na po??etnom meridijanu(0),dok polovi imaju najve??u geografsku ??irinu(270)", ""));
        Geo.add(new Pitanje("Monsuni su", "vjetrovi koji pu??u s kopna na more i obrnuto, a mijenjaju smjer dva puta godi??nje", "vjetrovi koji pu??u okeanskim prostorima, a dijele se na tople i hladne", "periodi??ni vjetrovi koji se javljaju na svim dijelovima Zemlje, a dijele se na slabe i jake", "jaki vjetrovi koji pu??u iz prostora sjeverne Afrike, a mogu biti vla??ni i suhi", ""));
        Geo.add(new Pitanje("Dinaridi u Bosni i Hercegovini imaju pravac pru??anja", "sjeverozapad - jugoistok", "sjever - jug", "jugozapad - sjeveroistok", "zapad - istok", ""));
        Geo.add(new Pitanje("U (- 4) vremenskoj zoni (zapadno od Greenwich-a) je 12 sati zonskog vremena.   Koliko je sati u Bosni i Hercegovini (1. zona isto??no od Greenwich-a)?", "17 sati", "18 sati", "10 sati", "9 sati", "Ako je u -4 zoni 12 sati, u Greenwichu je 16:00. BiH je sat vremena ispred Greenwicha, prema tome 17:00"));
        Geo.add(new Pitanje("Na horizontu Sydneja, 22.06. nastupa:", "zima", "jesen", "ljeto", "prolje??e", "Na ju??noj hemisferi su godi??nja doba obrnuta od sjeverne, kad je na sjevernoj ljeto, na ju??noj je zima"));
        Geo.add(new Pitanje("Na horizontu Sydneja, 21.03. nastupa", "jesen", "prolje??e", "Ljeto", "zima", "Na ju??noj hemisferi su godi??nja doba obrnuta od sjeverne, kad je na sjevernoj prolje??e, na ju??noj je jesen"));
        Geo.add(new Pitanje("Na karti razmjere 1:100 000 izmjerena je du??ina od 5cm. Kolika je njezina du??ina u prirodi?", "5 000 m", "500 000 m", "50 000 m", "nemogu??e je ovo izra??unati", "Razmjera 1:100000 zna??i da su predmeti na slici 100 hiljada puta manji nego u stvarnosti. 500 000 centimetara je 5000 metara"));
        Geo.add(new Pitanje("Travna oblast na Zemlji je", "prerije", "selvasi", "ergovi", "hamade", "Selvasi su vla??ne ekvatorijalne ??ume, ergovi su ravna podru??ja u pustinjama prekrivena pje????anim dinama, a hamade su kamenite pustinje"));
        Geo.add(new Pitanje("Mineralna sirovina je ", "bakar", "pamuk", "vuna", "drvo", ""));
        Geo.add(new Pitanje("Rudnik ??eljezne rude u BiH nalazi se u", "Ljubija", "Breza", "Vlasenica", "Banovi??i", "U Brezi i Banovi??ima je rudnik mrkog uglja, a u Vlasenici je rudnik boksita"));
        Geo.add(new Pitanje("Slivu Atlantskog okeana pripada", "Rajna", "Volga", "Rona", "Po", "Rona se ulijeva u Sredozemno more, Po u Jadransko more, a Volga u Kaspijsko jezero"));
        return Geo;
    }

    private ArrayList<Pitanje> getInf() {
        ArrayList<Pitanje> Inf = new ArrayList<>();
        Inf.add(new Pitanje("Koji je od navedenih zadataka funkcija operacijskoga sistema?", "Upravljanje datotekama", "Dodavanje podataka u tabelarni kalkulator", "Kreiranje izve??taja iz baze podataka", "Stvaranje prezentacije", "Ostalim navedenim operacijama se bavi aplikativni softver"));
        Inf.add(new Pitanje("Cache memorija je ", "skrivena memorija znatno manjeg kapaciteta od kapaciteta radne memorije", "skrivena memorija malog kapaciteta na strani radne memorije", "softverska tehnika za ubrzavanje pristupa radnoj memoriji", "programeru dostupna memorija manjeg kapaciteta", "U cache memoriju se ??uvaju podaci koji se ??esto koriste tako da se budu??i zahtjevi za tim podacima izvr??avaju br??e"));
        Inf.add(new Pitanje("Binarni zapis decimalnog broja 13 je:", "1101", "1011", "1003", "1111", "drawable_inf_1"));
        Inf.add(new Pitanje("Koliko n??jm??nje (umre??enih) r????un??r?? ??ini r????un??rsku mre??u?", "dva", "pet", "od pet do petnaest", "preko petnaest", ""));
        Inf.add(new Pitanje("U centralnu memoriju kompjutera ne spada: ", "PROMOTZ", "RAM", "ROM", "PROM", "RAM ??? random access memory, ROM ??? read only memory, PROM ??? programmable read only memory, PROMOTZ ne postoji \uF04A"));
        Inf.add(new Pitanje("Koliko bajta sadr??i jedan kilobajt:", "1024 bajta", "Hiljadu bajta ", "Milion bajta", "512 bajta", ""));
        Inf.add(new Pitanje("Kada na kompjuteru vidim fajl koji ima nastavak .jpg znam da se radi o", "O slici", "Dokumentu ra??enom u Wordu", "Dokumentu ra??enom u MS Access-u", "O pjesmi", "Neki od nastavaka za slikovne fajlove: png, jpg, jpeg, bmp, tif"));
        Inf.add(new Pitanje("\"Calculator??? je program iz Windows-a koji slu??i za", "Ra??unanje", "Pisanje", "Crtanje", "Tabelarne prora??une", "Calculator zna??i digitron"));
        Inf.add(new Pitanje("Microsoft Word je", "Program za obradu teksta", "Program za prora??unske tablice", "Program za grafi??ki dizajn", "Program za kreiranje i prikaz prezentacija", ""));
        Inf.add(new Pitanje("Kompjuter u osnovi radi na slijede??em brojnom sistemu", "binarnom", "ma??inskom", "oktalnom", "heksadekadnom", ""));
        Inf.add(new Pitanje("U kojim se jedinicama mjeri koli??ina memorije", "Bajtima", "Pikselima", "bitima", "Vektorima", ""));
        Inf.add(new Pitanje("Kada na kompjuteru vidim fajl koji ima nastavak .mp3 znam da se radi o:", "pjesmi", "slici", "filmu", "Word dokumentu", ""));
        Inf.add(new Pitanje("?? -  Kada vidite  ovakav znak i da pored njega pi??e Copyright, onda znate da   se to  odnosi na", "Za??titu autorskih prava", "Za??titni znak neke kompanije", "Poznatu svjetsku marku", "Web adresu", ""));
        Inf.add(new Pitanje("Corel je", "Program za grafi??ki dizajn", "Program za prora??unske tablice", "Program za kreiranje i prikaz prezentacija", "Program za pregled web stranica", ""));
        Inf.add(new Pitanje("Zaokru??iti ??ta ne spada u osobine kompjutera", "Pouzdanost", "Brzina", "Inteligencija", "Ta??nost", ""));
        Inf.add(new Pitanje("U izlaznu jedinicu kompjutera ne spada jedan od slijede??ih dijelova. Koji?", "Mikrofon", "Monitor", "??tampa??", "Ploter", "Mikrofon je ulazna jedinica"));
        Inf.add(new Pitanje("Zaokru??iti ??ta ne spada u osobine kompjutera", "Repetitivnost - ponavljanje", "Brzina", "Inteligencija", "Ta??nost", ""));
        Inf.add(new Pitanje("Osnovna jedinica za memoriju kompjutera je", "Bit", "Pixel", "Hard Disk", "Zip disk", ""));
        Inf.add(new Pitanje("Koji od ovih brojeva je najve??i?", "121(10)", "1111000(2)", "167(8)", "76(16)", "Najbolji pristup ovom zadatku je da sve brojeve pretvorimo u dekadni sistem. \n" +
                "76(16)= 6*160+7*161=6+112= 118\n" +
                "111000(2)=0*20+0*21+0*22+1*23+1*24+1*25+1*26=0+0+0+8+16+32+64= 120\n" +
                "167(8)=7*80+6*81+1*82=7+48+64= 119\n" +
                "121 je ve??  u dekadnom sistemu i on je najve??i broj\n"));
        Inf.add(new Pitanje("Kolika mora biti najve??a vrijednost varijable Y u dijelu programa da bi se rije?? MATURA ispisala na ekranu ta??no 5 puta? While y<=10 Do \n{izlaz (???MATURA???); \ny=y+3}", "-2", "-5", "0", "1", "Po??etna vrijednost: y=-2 => ispisuje se MATURA\n" +
                "Poslije prvog kruga: y=1 => ispisuje se MATURA\n" +
                "Poslije drugog kruga: y=4 => ispisuje se MATURA\n" +
                "Poslije tre??eg kruga: y=7 => ispisuje se MATURA\n" +
                "Poslije ??etvrtog kruga: y=10 => ispisuje se MATURA\n" +
                "Poslije petog kruga: y=13; petlja se zavr??ava\n"));
        Inf.add(new Pitanje("Baze oktalnog i heksadecimalnog brojnog sistema su", "8 i 16", "8 i 2", "2 i 10", "8 i 10", ""));
        Inf.add(new Pitanje("Kojem broju decimalnog brojnog sistema odgovara broj 3E(16) ?", "62", "58", "36", "57", "E u heksadekadnom sistemu predstavlja broj 14.\nPrema tome: 15*160+3*161=14+48=63"));
        Inf.add(new Pitanje("Ispis ???sloj po sloj??? karakteristika je", "ink jet pisa??a/ printera", "matri??nog pisa??a/ printera", "laserskog pisa??a/ printera", "3D pisa??a/ printera", ""));
        Inf.add(new Pitanje("Koja od sljede??ih jednakosti je istinita?", "1AF(16)=657(8)", "1AF(16)=110100111(2)", "1AF(16)=430(10)", "1AF(16)=431(8)", ""));
        Inf.add(new Pitanje("Koje vrijednosti ??e sadr??avati varijable a i b nakon izvo??enja algoritma\na=7,b=10\na=a+b\nb=a-b\na=a-b", "a = 10; b = 7", "a = 17; b = 7", "a = 10; b = 17", "a = 7;  b = 10", "a=7+10 = 17\n" +
                "b=17-10 = 7\n" +
                "a=17-7 = 10\n" +
                "a= 10, b=7 (ovo je algoritam za zamjenu varijabli)\n"));
        Inf.add(new Pitanje("Koja od navedenih jedinica jeste glavna ili interna memorija  ra??unara", "RAM", "Disketa", "Tvrdi disk", "Opti??ki disk", ""));
        Inf.add(new Pitanje("??tampa?? ili pisa?? je vrsta koje jedinice ra??unara", "Izlazna jedinica", "Ulazna jedinica", "upravlja??ka jedinica", "memorijska jedinica", ""));
        Inf.add(new Pitanje("U MS Word programu opcije <<Save, Save As>>  se nalaze  u meniju", "File", "Edit", "tools", "format", ""));
        Inf.add(new Pitanje("Program Power Point kao dio MS Office programa je po svojoj namjeni", "Program za kreiranje prezentacija", "Program za tabli??ne prora??une", "sistemski softver", "Program za obradu teksta", ""));
        return Inf;
    }

    private ArrayList<Pitanje> getHistory() {
        ArrayList<Pitanje> History = new ArrayList<>();
        History.add(new Pitanje("Kojoj grupi plemena pripadaju Desidijati, Autarijati, Daorsi, Japodi :", "Iliri", "Germani", "Slaveni", "Kelti", ""));
        History.add(new Pitanje("Reformator crkve u Njema??koj bio je", "Martin Luter", "Cvingli", "Toma Akvinski", "??an Kalvin", "Martin Luter je bio osniva?? hri????anske protestantske (luteranske) crkve u Nema??koj i jedan od vo??a reformacije"));
        History.add(new Pitanje("Teoriju relativiteta razvio je: ", "Albert Ajn??tajn", "Nikola Tesla", "Tomas Edison", "Stiv D??obs", ""));
        History.add(new Pitanje("Kako se zvala vladarska dinastija u srednjovjekovnoj Bosni:", "Kotromani??i", "Izetbegovi??i", "Kosa??e", "Nemanji??i", "Dinastiju je osnovao ban Prijezda"));
        History.add(new Pitanje("Atlansku povelju potpisali su Ruzvelt i ??er??il na brodu Princ od Velsa", "1941", "1940", "1939", "1942", "Atlantska povelja je sadr??avala ??etiri, takozvana, Rooseveltova pravila koja je iste godine objavio u Povelji o ??etiri slobode: misli, vjere, od bijede i od straha. S Churchillom je potpisao i Zakon o zajmu i najmu kojim je omogu??io ameri??ku pomo?? u borbi protiv Sila Osovine. Atlanska povelja zna??ila je za??etak Ujedinjenih naroda."));
        History.add(new Pitanje("Dan dr??avnosti u Bosni i Hercegovini obilje??ava se:", "25. novembar", "1. mart", "9. maj", "2. oktobar", ""));
        History.add(new Pitanje("U toku Narodnooslobodila??ke borbe 1941-1945 godine pisali su i knji??evnici  iz Bosne i Hercegovine. Jedan od njih je:", "Skender Kulenovi??", "Miroslav Krle??a", "Franc Pre??ern", "Vladimir Nazor", "Kulenovi?? u ratu pi??e poeme i ure??uje listove (Bosanski udarnik, Glas, Oslobo??enje)"));
        History.add(new Pitanje("Jedna od osniva??a Pokreta nesvrstanih bila je:", "Jugoslavija", "Njema??ka", "Argentina", "Italija", "???Zemlje osniva??i??? su bili Jugoslavija, Indija i Egipat"));
        History.add(new Pitanje("Drugi svjetski rat zavr??en je:", "1945.", "1946.", "1944.", "1943.", "Drugi svjetski rat je zavr??en kapitulacijom Japana 1945. godine"));
        History.add(new Pitanje("Tre??e zasjedanje ZAVNOBiH-a odr??ano je:", "6. aprila 1945. u Sarajevu", "5-26. novembra 1943. u Varcar Vakufu", "30. juna-2. jula 1944. u Sanskom Mostu", "29. novembra 1943. godine u Jajcu", ""));
        History.add(new Pitanje("Dejtonski mirovni sporazum za Bosnu i Hercegovinu, ratificiran je u Parizu", "14. decembra 1995. godine", "01. marta, 1995. godine", "06. aprila, 1995. godine", "25. novembra, 1945. godine", ""));
        History.add(new Pitanje("Prvi svjetski rat zavr??en je", "1918.", "1917.", "1919.", "1915.", "Prvi svjetski rat je zavr??en 11.11.1918. porazom Njema??ke"));
        History.add(new Pitanje("Drugo zasijedanje AVNOJ-a odr??ano je u", "Jajcu", "Biha??u", "Sarajevu", "Mrkonji?? Gradu", ""));
        History.add(new Pitanje("Referendum za suverenu i nezavisnu Bosnu i Hercegovinu odr??an je", "29. februara i 1. marta 1992. god.", "1. maja 1991. god.", "22. maja 1994. god.", "2.maja 1995. god.", ""));
        History.add(new Pitanje("Drugi svjetski rat po??eo je napadom Njema??ke na Poljsku", "1. septembra 1939. god.", "1. oktobra 1939. god.", "6. aprila 1941. god.", "6. aprila 1940. god.", ""));
        History.add(new Pitanje("Kolijevkom nacizma smatra se", "Njema??ka", "Austro-Ugarska", "Japan", "Italija", ""));
        History.add(new Pitanje("Prvo zasijedanje ZAVNOBiH-a odr??ano je", "25. novembra 1943. god.", "29. novembra 1943  god.", "25. novembra 1942 god.", "25. oktobra 1943. god.", ""));
        History.add(new Pitanje("Dan nezavisnosti Bosne i Hercegovine obilje??ava se", "1. marta", "29. novembra", "25 novembra", "1. aprila", "Dan nezavisnosti se obilje??ava na dan odr??avanja referenduma za nezavisnost BiH od Jugoslavije"));
        History.add(new Pitanje("Grad Rim su osnovali", "Romul i Rem", "Etru????ani", "Gali", "latini", "Prema legendi, grad Rim su 756. pne osnovali Romul i Rem"));
        History.add(new Pitanje("Najstariji  poznati stanovnici dana??nje Bosne i Hercegovine", "Iliri", "Gali", "Goti", "Slaveni", "Iliri su naseljavali prostor dana??nje BiH sve do dolaska Slavena"));
        History.add(new Pitanje("Povelja bana Kulina izdata je", "1189.", "1203.", "1180.", "1199.", "Ta??an datum 29.08.1189."));
        History.add(new Pitanje("Martin Luter je bio inicijator reforme crkve u", "njema??koj", "holandiji", "Engleskoj", "Belgiji", ""));
        History.add(new Pitanje("Prve Olimpijske igre odr??ane su", "776. pne", "779. pne", "777. pne", "771. pne", "Anti??ke olimpijske igre su se odr??avale u Olimpiji, a prve su odr??ane 776. pne"));
        History.add(new Pitanje("Osmanlije su dovr??ile osvajanje Hercegovine godine", "1482.", "1493.", "1463.", "1459.", "Bosansko kraljevstvo je palo 1463. ali je Osmanlijama trebalo jo?? 19 godina da dovr??e osvajanje Hercegovine"));
        History.add(new Pitanje("Najpoznatiji ustanak Ilira protiv rimske vladavine bio je Batonov ustanak, koji je trajao:", "od 6. do 9.  n.e", "od 6. do 10. n.e", "od 5. do 10. n.e", "od 2. do 10. n.e.", "Batonov ustanak (Bellum Batonianum) ili Veliki ilirski ustanak, je bio najve??i vojni sukob izme??u nekoliko ilirskih plemena i anti??kog Rima koji je trajao ??etiri godine"));
        History.add(new Pitanje("Najpoznatija ilirska kraljica zvala se", "Teuta", "jelena", "silvana", "dijana", "Teuta je bila ilirska kraljica koja je vladala od 231. p. n. e. do 228. p. n. e."));
        History.add(new Pitanje("Osnovni oblik zemlji??nog posjeda u srednjovjekovnoj Bosni je:", "ba??tina", "pronija", "beneficij", "leno", ""));
        History.add(new Pitanje("Habsbur??ka vojska pod vo??stvom Eugena Savojskog prodrla je do Sarajeva i zapalila ga godine:", "1697.", "1683.", "1684.", "1699.", ""));
        History.add(new Pitanje("Aneksija BiH je izvr??ena", "1908.", "1910.", "1906.", "1878.", "Austro-Ugarska je 1878. okupirala Bosnu i Hercegovinu a 1908. je izvr??ila aneksiju"));
        History.add(new Pitanje("Danas se u svijetu, kao Dan pobjede nad fa??izmom,obilje??ava", "9. maj", "15. maj", "6. april", "2. septembar", "Za dan pobjede nad fa??izmom se uzima datum kapitulacije Njema??ke u Drugom svjetskom ratu"));
        History.add(new Pitanje("Deklaracija o pravima gra??ana BiH done??ena je na", "Drugom zasijedanju ZAVNOBiH-a", "Prvom zasijedanju ZAVNOBiH -a", "Tre??em zasijedanju ZAVNOBiH-a", "Drugom zasjedanju AVNOJ-a", ""));
        History.add(new Pitanje("Bosna i Hercegovina je svoju prvu Narodnu vladu dobila 1945. godine, a njen prvi predsjednik je bio:", "Rodoljub ??olakovi??", "Zaim ??arac", "Ivan Ribar", "Josip Broz Tito", ""));
        return History;
    }

    private ArrayList<Pitanje> getPhilosophy() {
        ArrayList<Pitanje> Philosophy = new ArrayList<>();
        Philosophy.add(new Pitanje("Kako se naziva krajnje empiristi??ko gledi??te koje smatra da je izvor svih na??ih spoznaja isklju??ivo osjetilno iskustvo?", "senzualizam", "iracionalizam", "misticizam", "empirizam", ""));
        Philosophy.add(new Pitanje("Izvorno zna??enje rije??i filozofija je", "ljubav spram mudrosti", "nauka", "mudrost", "istra??ivanje", "Rije?? je nastala od gr??kih rije??i phylos, ??to zna??i voljeti i sophia, ??to zna??i mudrost"));
        Philosophy.add(new Pitanje("Kako glasi poznata Marksova \"11 teza o Fojerbahu\" ?", "\"Filozofi su razli??ito tuma??ili svijet, a radi se o tome da se svijet promjeni\"", "\"Filozofi su razli??ito tuma??ili svijet, a radi se o tome da se svijet  spozna\"", "\"Filozofi su sli??no tuma??ili svijet, a radi se o tome da se svijet promijeni\"", "\"Filozofi su samo tuma??ili svijet, a radi se o tome da se svijet prilagodi ??ovjeku\"", ""));
        Philosophy.add(new Pitanje("Empirizam u??i da je", "bezumna volja iznad razuma", "razum izvor svih na??ih znanja", "sumnja put do istine", "ideja izvor na??e spoznaje", "Empirizam zastupa stav da je iskustvo osnovni izvor spoznaje i da joj ono odre??uje domet, mogu??nosti i granice"));
        Philosophy.add(new Pitanje("Osnovna metoda koju Bejkn zagovara u svom u??enju je metoda:", "Indukcije", "generalizacija", "sinteze", "analize", ""));
        Philosophy.add(new Pitanje("U Platonovoj teoriji o dr??avi, ??ta je temelj svakog dru??tva?", "pravi??nost", "iskrenost", "poslu??nost", "dobrota", ""));
        Philosophy.add(new Pitanje("Prakti??nim filozofskim disciplinama pripada", "Etika", "Gnoseologija", "Ontologija", "Metafizika", ""));
        Philosophy.add(new Pitanje("Fridrih Ni??e je svojim u??enjem izricao kritiku prema", "Zapadno-evropskoj kulturi", "Umjetnosti tragedije", "Iracionalisti??koj filozofiji", "Svjetskoj politici", ""));
        Philosophy.add(new Pitanje("Hegel je u povijesti filozofije slavna li??nost. Spo??itano mu je da se njegov filozofski sistem ne podudara sa ??injenicama. ??ta je Hegel na to odgovorio?", "Utoliko gore po ??injenice", "Ovdje se ne govori o ??injenicama", "??injenice nisu bitne", "??in prethodi ??injenici", ""));
        Philosophy.add(new Pitanje("Materijalizam je ontolo??ka koncepcija koja u??i da je:", "materija primarna a svijest, ideja, duh su sekundarni, izvedeni", "materija duhovnog porijekla", "ideja primarna a materija izvedena, sekundarna", "bitak bi??a jedinstven u svojoj osnovi", ""));
        Philosophy.add(new Pitanje("Filozofija u Srednjem vijeku poprima karakter:", "slu??avke teologije", "istra??iva??ke djelatnosti", "prou??avanja ??ovjeka", "racionalisti??ke filozofije", ""));
        Philosophy.add(new Pitanje("Spoznajnu mo?? koja prekora??uje granice iskustva i zapada u antinomije Kant naziva", "razum", "percepcija", "mi??ljenje", "um", ""));
        Philosophy.add(new Pitanje("Ontologija ili op??a metafizika je", "Spoznajna teorija", "u??enje o porijeklu izvijesnosti i dosegu ljudske spoznaje", "Filozofija umjetnosti", "u??enje o bitku bi??a", ""));
        Philosophy.add(new Pitanje("Islamski mislilac koji je bio najve??i komentator Aristotelove filozofije zvao se", "Ibn Sina", "Ibn Ru??d", "Al-Gazali", "Al-Farabi", ""));
        Philosophy.add(new Pitanje("U Fihteovoj filozofiji apsolutnog idealizma gdje JA postavlja NE-JA, svijet je shva??en kao ??in", "svijesti", "savjesti", "prirode", "morala", ""));
        Philosophy.add(new Pitanje("Estetika je filozofska disciplina koja raspravlja o", "lijepom u umjetnosti i u prirodi", "dobru i zlu", "lijepom pona??anju", "vjerovanju kao putu do istine", ""));
        Philosophy.add(new Pitanje("U Dekartovoj ??? Raspravi o metodi???, navode se", "??etiri pravila metode", "dva pravila metode", "tri pravila metode", "??est pravila metode", ""));
        Philosophy.add(new Pitanje("Postoji samo jedna supstancija: Bog ili priroda. Supstancija i sama beskona??na, ima beskona??no mnogo atributa, a ??ovjek mo??e spoznati samo dva, prote??nost i mi??ljenje- mi??ljenje je novovjekovnog filozofa", "Spinoze", "Dekarta", "Lajbnica", "Loka", ""));
        Philosophy.add(new Pitanje("D??on Lok je utemeljio", "spoznajnu teoriju (gnoseologiju)", "ontologiju", "etiku", "novovjekovnu filozofiju", ""));
        Philosophy.add(new Pitanje("Dva osnovna problema srednjevjekovne filozofije su", "problem odnosa vjere i uma i problem univerzalija", "problem ??ovjeka i prirode", "problem odnosa vjere i uma i problem ??ovjeka", "problem univerzalija i problem apologije vjere", ""));
        Philosophy.add(new Pitanje("Temeljna te??nja Kozmolo??kog razdoblja gr??ke filozofije je da se ispita", "temeljni princip postojanja", "problem ljudske prakse", "problem moralnog djelovanja", "dru??tvo", ""));
        Philosophy.add(new Pitanje("Apriorni oblici razuma za Kanta su", "kategorije", "percepcije", "ideje", "antinomije", ""));
        Philosophy.add(new Pitanje("Ontolo??ka koncepcija monizam u??i", "jedan je temelj svijeta", "bitak je materijalan", "ideja je bitak bi??a", "monolog kao temeljni odnos svijesti i svijeta", ""));
        Philosophy.add(new Pitanje("Pored ??ordana Bruna, zagovornik panteizma u novovekovnoj filozofiji bio je", "Baruh de Spinoza", "Rene Dekart", "Imanuel Kant", "Frensis Bekon", ""));
        return Philosophy;
    }

    private ArrayList<Pitanje> getPsychology() {
        ArrayList<Pitanje> Psychology = new ArrayList<>();
        Psychology.add(new Pitanje("Veza izme??u dva neurona zove se", "sinapsa", "neuronska", "klavikula", "motorna", ""));
        Psychology.add(new Pitanje("Frojd tuma??i da se li??nost sastoji iz tri segmenta li??nosti, i to:", "Id, ego, superego", "Ego, id, ono", "Tanatos, eros, id", "Ma??ta, svijest, savjest", ""));
        Psychology.add(new Pitanje("Broj sadr??aja koje istovremeno mo??emo obuhvatiti odnose se na:", "Obim pa??nje", "Pokretljivost pa??nje", "Trajanje pa??nje", "Fluktuaciju pa??nje", ""));
        Psychology.add(new Pitanje("Pra??enje jedne lo??e navike kao (npr. prekomjerno tro??enje kredita) mo??emo pratiti sljede??om metodom:", "Ekstrospektivnom ili posmatranjem", "- Introspektivnom ili samoposmatranjem", "Eksperimentalnom", "Sociometrijskim postupkom", ""));
        Psychology.add(new Pitanje("Kada smo suo??eni sa doga??ajima koje ne mo??emo staviti pod kontrolu i koji ugro??avaju na?? integritet, tada govorimo o:", "frustraciji", "konfliktu", "stresu", "sukobu motiva", ""));
        Psychology.add(new Pitanje("Humor, fizi??ka relaksacija, upoznavanje vlastitih emocija poma??u nam u sopstvenoj:", "kontroli emocija", "bijegu od stvarnosti", "budu??nosti", "hedonizmu", ""));
        Psychology.add(new Pitanje("Ma??ta je naj??e????a u doba:", "Djetinjstva", "adolescencije", "Srednjeg doba", "Starosti", ""));
        Psychology.add(new Pitanje("Kada smo sretni, opu??teni, zadovoljni, ponosni, vedri tada govorimo o emociji", "Radosti", "Ljubomore", "Straha", "Zavisti", ""));
        Psychology.add(new Pitanje("Pojava kojom mi na temelju jedne osobine, koja nam se svi??a ili ne, stvaramo sud o ??itavu ??ovjeku naziva se:", "Halo Efekat", "Potkrepljenje", "Temperament", "Karakter", ""));
        Psychology.add(new Pitanje("Oblik interpersonalnog pona??anja kada pojedinac popu??ta pritisku grupe u su??enju ili akciji, ??to proizilazi iz sukoba vlastitog mi??ljenja i onoga koje zastupa grupa predstavlja:", "Konformizam", "Altruizam", "Stav", "Grupu", ""));
        Psychology.add(new Pitanje("Empatija je", "Suosje??anje, odnosno u??ivljavanje u psihi??ko stanje jedne osobe", "Sebi??na ljubav", "Zavist", "Stid", ""));
        Psychology.add(new Pitanje("Slo??eni psihi??ki procesi koji odra??avaju na?? odnos prema stvarima, ljudima, bi??ima, predmetima, pojavama, doga??ajima, prema nama samima, na??im aktivnostima i postupcima su:", "Emocije", "Predstave", "Iluzije", "Ma??ta", ""));
        Psychology.add(new Pitanje("U procesu mi??ljenja otkrivamo", "Veze i odnose", "predmete i pojave", "Su??tinska pitanja", "op??enitost", ""));
        Psychology.add(new Pitanje("??ta ozna??ava temperament?", "Ozna??ava na??in i karakteristiku emocionalnog reagovanja", "Ozna??ava moralne norme", "Pona??anje pojedinca", "Slobodno djelovanje", ""));
        Psychology.add(new Pitanje("??ta je osjet ?", "Zapa??anje pojedinih svojstava objekta", "Spoznaja cjelovitog objekta opa??anja", "Kvalitet dra??i", "Intelektualni proces", ""));
        Psychology.add(new Pitanje("Testovi inteligencije mogu biti", "Verbalni i neverbalni", "Kreativni", "Slikovni", "Motorni", ""));
        Psychology.add(new Pitanje("Sposobnost da se obnove sadr??aji koje smo ranije u??ili predstavlja", "Pam??enje", "U??enje", "Mi??ljenje", "Motivaciju", ""));
        Psychology.add(new Pitanje("Hijerarhiju motiva predstavio je piramidom potreba", "A.Maslow", "K.G.Jung", "J.Piaget", "S.Frojd", ""));
        Psychology.add(new Pitanje("Preduslovi za uspje??no obavljanje poslova i aktivnosti su", "Sposobnosti", "U??enje", "Navike", "Interesi", ""));
        Psychology.add(new Pitanje("Najpoznatija tipologija li??nosti je", "Jungova", "Pavlovljeva", "Gilfordova", "Frojdova", ""));
        Psychology.add(new Pitanje("Predstave su", "Reprodukcija ranijih opa??anja", "Stanje potpune koncentracije", "Polje iluzije", "Uro??eni refleks", ""));
        Psychology.add(new Pitanje("??ulni organi koji primaju podra??aj iz vanjske sredine ili samog organizma zovu se:", "Receptori", "Centri", "??ula", "Efektori", ""));
        Psychology.add(new Pitanje("Cilj, potreba, osje??aj, ??elja, aktivnost- navedeni  pojmovi govore nam o:", "Motivacionom ciklusu", "Osje??anjima", "Ravnote??i", "Vezi izme??u osje??anja i aktivnosti", ""));
        Psychology.add(new Pitanje("Transfer je jedna od najva??nijih pojava u psihologiji u??enja i mo??e biti", "Pozitivan i negativan", "Pozitivan i neutralan", "Aktivni i pasivni", "Negativan i trajan", ""));
        Psychology.add(new Pitanje("Vrste inteligencije su", "Apstraktna, socijalna, konkretna", "Apstraktna, primarna", "Fiziolo??ka, tjelesna, konkretna", "Emocionalna, sekundarna", ""));
        return Psychology;
    }

    private ArrayList<Pitanje> getLogic() {
        ArrayList<Pitanje> Logic = new ArrayList<>();
        Logic.add(new Pitanje("Zaokru??i ta??an odgovor: ", "Pojam je misao o biti onoga ??to mislimo ", "Pojam je zna??enje rije??i koju izgovaramo", "Pojam je zna??enje rije??i koju izgovaramo", "Pojam je bit o misli onoga ??to mislimo", ""));
        Logic.add(new Pitanje("Zaokru??i ta??an odgovor:", "Sud je skup pojmova kojima se ne??to tvrdi ili pori??e", "Sud je re??enica kojom se ne??to iskazuje", "Sud je re??enica kojom se ne??to izjavljuje", "Sud je pojam kojim se utvr??uje zna??enje", ""));
        Logic.add(new Pitanje("Zaokru??i ta??an odgovor:", "Definicija je sud kojim se nedvosmisleno utvr??uje sadr??aj nekog pojma", "Definicija je skup pojmova kojima se izra??ava zna??enje rije??i", "Definicija je skup pojmova kojima se nedvosmisleno utvr??uje opseg", "Definicija je skup pojmova kojima se utvr??uje zna??enje suda", ""));
        Logic.add(new Pitanje("Posredan zaklju??ak je zaklju??ak koji se sastoji od: ", "Najmanje tri ili vi??e drugih sudova", "Najmanje jednog ili vi??e drugih sudova", "Najmanje dva ili vi??e drugih sudova", "Najmanje ??etiri uli vi??e drugih sudova", ""));
        Logic.add(new Pitanje("Divizija je: ", "Logi??ki postupak kojim se utvr??uje opseg nekog pojma", "Sud kojim se nedvosmisleno odre??uje sadr??aj jednog pojma", "Logi??ki postupak kojim se utvr??uje opseg suda", "Sud kojim se iskazuje na??in formiranja pojmova", ""));
        Logic.add(new Pitanje("??ta su negativni pojmovi?", "To su pojmovi kojima se misli na odsustvo pozitivnih osobina", "To su pojmovi kojim se misli na negativne predmete", "To su pojmovi kojima se misli na negativan opseg i odsustvo negativnih  osobina", "To su pojmovi kojima nam nije poznat sadr??aj", ""));
        Logic.add(new Pitanje("??ta je teorija imanencije?", "Teorija po kojoj je bit svakog suda u imanentnosti sadr??aja predikata sadr??aju subjekta", "Teorija po kojoj je bit svakog suda u supsumiranju opsega subjekta pod opseg suda", "Teorija po kojoj je bit svakog suda u supsumiranju opsega subjekta pod opseg predikata", "Teorija suda koja ukazuje na to da se svaki sud nu??no sastoji od subjekta i predikata", ""));
        Logic.add(new Pitanje("Kakvi su to subkontrarni sudovi?", "Dva suda od kojih je jedan partikularno-afirmativan a drugi partikularnonegativan koji imaju isti subjekat i predikat isti kvantitet a raztli??it kvalitet", "Dva suda od kojih je jedan univerzalno-afirmativan a drugi partikularnonegativan koji imaju isti subjekat i predikat isti kvantitet a raztli??it kvalitet", "Dva suda koji imaju isti subjekat i predikat a razlukuju se i po kvantitetu i po kvalitetu", "To su sudovi do kojih se do??e postupkom zaklju??ivanja", ""));
        Logic.add(new Pitanje("Zaokru??i ta??an odgovor", "Deduktivan je zaklju??ak kojim se iz op??tih premisa izvodi posebna konkluzija", "Deduktivan je zaklju??ak kojim se iz op??tih premisa izvodi op??ta konkluzija", "Deduktivan je zaklju??ak kojim se iz posebnih premisa izvodi posebna konkluzij", "Deduktivan je zaklju??ak kojim se iz op??tih konkluzija izvodi posebna premisa", ""));
        Logic.add(new Pitanje("Zaokru??i ta??an odgovor", "Sudovi kojima tvrdimo da ne??to nu??no jeste onako kako jeste nazivamo apodikti??kim", "Sudovi kojima tvrdimo da ne??to nu??no jeste onako kako jeste nazivamo asertori??kim", "Sudovi kojima tvrdimo da ne??to nu??no jeste onako kako jeste nazivamo problemati??kim", "Sudovi kojima tvrdimo da ne??to nu??no jeste onako kako jeste nazivamo hipoteti??kim", ""));
        Logic.add(new Pitanje("Zaokru??i ta??an odgovor", "Sud ??ija se istinitost dokazom utvr??uje naziva se tvrdnja ili teza", "Sud ??ija se istinitost dokazom utvr??uje naziva se argument", "Sud ??ija se istinitost dokazom utvr??uje naziva se konkluzija", "Sud ??ija se istinitost dokazom utvr??uje naziva se premisa", ""));
        Logic.add(new Pitanje("Osniva??em logike u staroj Gr??koj smatra se", "Aristotel", "Platon", "Sokrat", "Heraklit", ""));
        Logic.add(new Pitanje("Zaokru??i ta??an odgovor", "Deduktivan zaklju??ak je kojim se iz op??ih premisa izvodi posebna konkluzija", "Deduktivan je zaklju??ak kojim se iz op??ih premisa izvodi op??a konkluzija", "Deduktivan zaklju??ak je u kojem se iz op??ih premisa izvodi posebna premisa", "Deduktivan zaklju??ak je u kojem se iz posebnih  premisa izvodi posebna konkluzija", ""));
        Logic.add(new Pitanje("Zaokru??i ta??an odgovor", "Identi??ni pojmovi su pojmovi koji imaju isti sadr??aj i isti opseg", "Identi??ni pojmovi su pojmovi koji imaju djelimi??no isti sadr??aj i opseg", "Identi??ni pojmovi su pojmovi koji imaju suprotan sadr??aj", "Identi??ni pojmovi su pojmovi koji imaju razli??it opseg a isti sadr??aj", ""));
        Logic.add(new Pitanje("Zaokru??i ta??an odgovor:", "Silogizam je posredni deduktivan zaklju??ak koji se sastoji od dvije premise", "Silogizam je posredni deduktivan zaklju??ak koji se sastoji od dvije ili vi??e premisa", "Silogizam je posredni deduktivan zaklju??ak koji se sastoji od tri ili vi??e premisa", "Silogizam je posredni deduktivan zaklju??ak koji se sastoji od jedne ili vi??e premisa", ""));
        Logic.add(new Pitanje("??ta je vulgarnomaterijalisti??ka teorija pojma?", "To je teorija po kojoj je pojam misaoni odraz bitnih svojstava materijalnih stvari", "To je teorija po kojoj je pojam veza me??u sudovima", "Teorija po kojoj je bit svakog suda u supsumiranju opsega subjekta pod opseg suda", "To je teorija po kojoj je pojam elemenat zaklju??ka", ""));
        Logic.add(new Pitanje("??ta su partikularni pojmovi?", "To su pojmovi kojima mislimo samo neke ??lanove klase o kojoj mislimo", "To je pojam ??iji nam je doseg nepoznat", "To su pojmovi kojima mislimo samo na odre??ene ??lanove klase, ??itavu klasu ali ne znamo koje", "To su pojmovi kojima mislimo na neodre??ene ??lanove klase.", ""));
        Logic.add(new Pitanje("Kakvi su to neposredni zaklju??ci?", "To su zaklju??ci koji se sastoje od samo dva suda", "To je zaklju??ak koji se sastoji od najmanje tri ili vi??e sudova", "To je zaklju??ak u kojem se iz op??enite premise izvodi op??enita konkluzija", "Premise su sudovi do kojih se do??e postupkom zaklju??ivanja", ""));
        Logic.add(new Pitanje("Kakvi su to hipoteti??ki sudovi?", "To su sudovi u kojima je odnos subjekta i predikata ne??im uvjetovan", "To su sudovi sa pozitivnim predikatom i  negativnim subjektom", "To su sudovi u kojima odnos subjekta i predikata nije ni??im uvjetovan", "To su sudovi kojima se misli samo na jednog ??lana opsega pojma", ""));
        return Logic;
    }

    private ArrayList<Pitanje> getSociology() {
        ArrayList<Pitanje> Sociology = new ArrayList<>();
        Sociology.add(new Pitanje("Tip/oblik porodice u kojoj se kao starije??ina javlja ??ena nazivamo:", "matrijarhalna porodica", "pro??irena porodica", "monogamna porodica", "patrijarhalna porodica", ""));
        Sociology.add(new Pitanje("Resocijalizacija je:", "u??enje novih obrazaca pona??anja, ponekad posve suprotnih od ranije nau??enih", "sticanje novih znanja, stavova i vrijednosti potrebnih za u??e????e u ??ivotu dru??tva", "norme i vrijednosti koje odre??uju kakvo se pona??anje o??ekuje od pojedinca u dru??tvu", "psihoterapeutski oporavak osoba", ""));
        Sociology.add(new Pitanje("Jedan medij ne pripada vrsti novih medija:", "printani", "teletekst", "videotekst", "internet", ""));
        Sociology.add(new Pitanje("Institucija koja slu??i reprodukciji, socijalizaciji i podizanju potomstva je:", "porodica", "bolnica", "??kola", "centar za socijalni rad", ""));
        Sociology.add(new Pitanje("Proces u??enja i usvajanja dru??tvenih uloga i vrijednosti putem odgoja naziva se: a) komunikacija", "socijalizacija", "devijantnost", "sekularizacija", "stratifikacija", ""));
        Sociology.add(new Pitanje("Komunikacija koja se temelji na jeziku naziva se: ", "verbalna", "slikovna", "posredna", "neverbalna", ""));
        Sociology.add(new Pitanje("Ogist Kont, jedan od osniva??a sociologije, dijeli sociologiju kao nauku na: ", "socijalnu statiku i socijalnu dinamiku", "socijalnu fiziku i antropologiju", "socijalni i organsku teoriju o dru??tvu", "sociologiju i filozofiju", ""));
        Sociology.add(new Pitanje("Socijalno i politi??ko u??enje stoi??ke ??kole je karakteristi??no po: ", "kozmopolitizmu", "aristokratizmu", "totalitarizmu", "idealnoj dr??avi", ""));
        Sociology.add(new Pitanje("Klasi??nu teoriju konflikta ??? marksizam, utemeljio je", "Karl Marks", "Talkot Parsons", "Maks Veber", "Herbert Spenser", ""));
        Sociology.add(new Pitanje("Prema u??enju Maksa Vebera, vlast koja se legitimira na nadnaravnim osobinama koje ljudi pripisuju jednom vo??i naziva se", "harizmatska vlast", "tradicionalna vlast", "racionalna vlast", "izvr??na vlast", ""));
        Sociology.add(new Pitanje("Socijalna mobilnost ili pokretljivost mo??e biti", "horizontalna i vertikalna", "tradicionalna i moderna", "unutra??nja i vanjska", "kulturna i subkulturna", ""));
        Sociology.add(new Pitanje("Proces u kojem se de??ava porast gradskog stanovni??tva uz istovremeno smanjenje seoskog naziva se", "urbanizacija", "migracija", "stratifikacija", "socijalizacija", ""));
        Sociology.add(new Pitanje("??ta je sociologija i ??ta je predmet njenog prou??avanja?", "Op??ta nauka o dru??tvu.Predmet njenog prou??avanja je dru??tvo u svom totalitetu", "Op??ta nauka o ??ovjeku.Predmet njenog prou??avanja je ??ovjek u svom totalitetu", "Op??ta nauka o lojepom.Predmet njenog prou??avanja jelijepo u svom totalitetu", "Nauka o biljkama", ""));
        Sociology.add(new Pitanje("Dru??tvo za Vebera je", "Pona??anje ljudi i njihova me??usobna interakcija", "Prost zbir pojedinaca", "Proces u??enja i usvajanja dru??tvenih normi", "Socijalna karika", ""));
        Sociology.add(new Pitanje("Kastama nazivamo?", "Izrazito zatvorene dru??tvene grupe nastale na odgovaraju??oj dru??tvenoj podjeli rada u  kojoj je dru??tveni polo??aj pojedinca ??vrsto odre??en", "Izrazito otvorene dru??tvene grupe nastale na odgovaraju??oj dru??tvenoj podjeli rada u kojoj je dru??tveni polo??aj pojedinca ??vrsto odre??en", "Grupe ljudi koje su usmjerene ka ostvarivanju vlastitih ciljeva", "Seosku zajednicu", ""));
        Sociology.add(new Pitanje("Kako defini??emo devijantnost?", "Svako odstupanje sa dru??tveno usvojenog puta, naru??avanje normi i o??ekivanja odre??ene dru??tvene grupe ili odre??enog dru??tva", "Svako normalno pona??anje odre??ene dru??tvene grupe ili odre??enog dru??tva", "Naru??avanje normi", "Po??tivanje uobi??ajenih pravila i normi", ""));
        Sociology.add(new Pitanje("??ta je ???javno mnjenje????", "mi??ljenje dru??tvene skupine i ??irokih masa o va??nim pojavama i pitanjima koja tu skupinu interesuje", "vrijednosni sud mo??nog pojedinca", "izbor pojedina??nih mi??ljenja o jednom fenomenu", "vo??enje javne debate", ""));
        Sociology.add(new Pitanje("Kada je sociologija nastala kao nauka?", "u 19. vijeku", "zahvaljuju??i protestantizmu", "u anti??koj (gr??koj) civilizaciji", "u srednjem vijeku", ""));
        Sociology.add(new Pitanje("Nacije su", "specifi??ne narodne zajednice nastale na osnovu podjele rada epohe kapitalizma, na kompaktnoj teritoriji u okviru zajedni??kog jezika i bliske etni??ke i kulturne srodnosti uop??te", "grupe ljudi koje govore zajedni??kim jezikom", "grupe ljudi koje ??ive u istoj dr??avi", "grupe ljudi koje nastoje da ostvare svoja nacionalna prava", ""));
        Sociology.add(new Pitanje("??ta zna??i pojam sekularizacije?", "prevladavanje svjetovne nad duhovnom misli, smanjenje dru??tvenog uticaja crkve i religije", "dominacija religije nad svjetovnom misli u dru??tvu", "zabrana religije u javnom ??ivotu", "zabrana rada svjetovnih i religijskih institucija", ""));
        Sociology.add(new Pitanje("??ta je umjetnost?", "specifi??an oblik dru??tvene svijesti kojim se na estetski na??in izra??ava ukupna objektivna stvarnost i iskazuje bogatsvo ??ivota u prirodi i dru??tvu", "ljudsko promi??ljanje o ljepoti prirodnog", "specifi??an oblik dru??tvene svijesti kojim se estetski izra??ava ukupna objektivna stvarnost i  radost do??ivljaja lijepog", "to je osobina ljudi da rade posebne vrste poslova", ""));
        Sociology.add(new Pitanje("Multikulturalizam podrazumijeva", "puno uva??avanje razli??itih kultura na jednom prostoru i njihovo pro??iravanje", "kulturne vrijednosti monoetni??kih zajednica", "izraz kulturnog pluralizma koji je stati??an i koji razdvaja kulture ??? zna??i i ??ivot jednih pored drugih, a ne jednih sa drugima", "postojanje vi??e kultura, koje se razvijaju neovisno jedna od druge", ""));
        Sociology.add(new Pitanje("Vrste politi??kih izbora su", "posredni i neposredni, op??i i lokalni, redovni i vanredni", "demokratski i nedemokratski", "dr??avni i op??inski", "javni i tajni", ""));
        Sociology.add(new Pitanje("Moral defini??emo kao", "vrijednosno procjenjivanje ljudskih postupaka i htijenja kao pozitivno ili negativno vrijednih pri ??emu se prvi odobravaju a drugi ne", "skup nepisanih pravila neke dru??tvene zajednice", "sposobnost uo??avanja devijantnog pona??anja kod drugih", "vrijednosno procjenjivanje ljudskih postupaka i pona??anja u okviru dru??tvenih grupa u   va??nim dru??tvenim odnosima i situacijama", ""));
        Sociology.add(new Pitanje("Ideologija predstavlja", "skup ideja o najboljim politi??kim ciljevima koje dru??tvo treba da ostvari", "pravac delovanja politi??kih subjekata", "sistem sudova ili normi o dru??tvenim vrijednostima", "sistem mera kojima se brane politi??ki interesi neke grupe", ""));
        Sociology.add(new Pitanje("??ta je masovna kultura?", "kultura modernih dru??tava koja se prenosi masama ljudi putem masovnih sredstava komunikacije", "kultura masa u urbanim sredinama", "kultura masa u ruralnim sredinama", "kultura koja se prenosi putem ??tampanih medija", ""));
        Sociology.add(new Pitanje("Ukupnost dru??tvenih normi koje propisuje i sankcioni??e dr??ava naziva se", "pravo", "ustav", "nauka", "moral", ""));
        Sociology.add(new Pitanje("Predstavnik teorije dru??tvenog ugovora u sociologiji je", "Tomas Hobs", "Nikolo Makijaveli", "Ibn Haldum", "Robert Merton", ""));
        Sociology.add(new Pitanje("U osnovne elemente morala spadaju", "norma, sud i sankcija", "Historija i prahistorija", "Ideja,misao i shvatanja", "Kultura i civilizacija", ""));
        Sociology.add(new Pitanje("Tolerancija je", "prihvatanje drugog i druga??ijeg bez predrasuda i diskriminacije", "ograni??avanje sloboda i prava drugih", "sportsko nadmetanje bez pravila", "dozvoljeno i slobodno kretanje u odre??enom vremenu i prostoru", ""));
        Sociology.add(new Pitanje("Pravo je", "skup pisanih pravila i normi pona??anja", "pravac i proces dru??tvenih promjena", "dr??avna mo?? pojedinaca", "??ovjekova vizija prirode i dru??tva", ""));
        return Sociology;
    }

    private ArrayList<Pitanje> getDemocracy() {
        ArrayList<Pitanje> Democracy = new ArrayList<>();
        Democracy.add(new Pitanje("Pravednost na??ina na koji se prikupljaju informacije u dono??enju odluka definira", "proceduralnu pravdu", "distributivnu pravdu", "korektivnu pravdu", "administrativnu pravdu", ""));
        Democracy.add(new Pitanje("Koja grana vlasti donosi zakone u dr??avi:", "zakonodavna", "sudska (pravosudna)", "izvr??na", "lokalna", ""));
        Democracy.add(new Pitanje("Na kojem nivou vlasti se vodi vanjska politika BiH?", "dr??avnom", "entitetskom", "lokalnom", "na nivou mjesne zajednice", "Vanjsku politiku Bosne i Hercegovine vodi tro??lano Predsjedni??tvo i Ministarstvo vanjskih poslova"));
        Democracy.add(new Pitanje("Predsjedni??tvo BiH vr??i sljede??u vlast?", "izvr??nu", "zakonodavnu", "sudsku", "lokalnu", ""));
        Democracy.add(new Pitanje("Magna Karta (Velika povelja) nastala je", "1215.", "1212.", "1216.", "1463.", "Magna Carta je predstavljala prvi pisani ustavni dokument u engleskoj historiji i presedan kojim je ustanovljen princip ljudskih i gra??anskih prava u anglosaksonskoj pravnoj tradiciji."));
        Democracy.add(new Pitanje("Bira??ko pravo (Pravo da bira i bude biran) spada u grupu", "Politi??kih prava", "gra??anskih prava", "ekonomskih prava", "kulturnih prava", ""));
        Democracy.add(new Pitanje("Ograni??ena vlast je", "Vladavina uspostavljena ograni??enjem svojih mo??i putem zakona i slobodnih izbora koje  po??tuju", "Vladavina uspostavljena od strane manjeg broja ljudi koji sami donose zakone", "Vladavina uspostavljena vladavinom bogatih ljudi koji o svemu odlu??uju", "Vladavina uspostavljena voljom pojedinca ili grupe i za vladavinu im nisu potrebni zakoni", ""));
        Democracy.add(new Pitanje("Referendum je", "Oblik neposrednog odlu??ivanja, izja??njavanje gra??ana o nekim naro??ito va??nim pitanjima. Izja??njava se samo sa ???da??? ili ???ne??? ili ???za??? ili ???protiv???", "Oblik posrednog odlu??ivanja u parlamentu o nekim naro??ito va??nim pitanjima. Izja??njava   se samo sa ???da??? ili ???ne??? ili ???za??? ili ???protiv???", "Oblik posebnog odlu??ivanja u sudovima u kojima se utvr??uje krivnja o nekim naro??ito va??nim pitanjima. Izja??njava se samo sa ???da??? ili ???ne??? ili ???za??? ili ???protiv???", "Oblik glasanja u parlamentu u kojem se parlamentarci izja??njavaju o nekim naro??ito va??nim     pitanjima. Izja??njava se samo sa ???da??? ili ???ne??? ili ???za??? ili ???protiv???", ""));
        Democracy.add(new Pitanje("Ustav je", "obi??no dokument ili skup dokumenata koji odre??uje osnovne zakone i principe ili ure??enje vlasti politi??kog sistema", "usmeni dogovor predstavnika svih nivoa vlasti", "zavr??na odredba mirovnih sporazuma u kojima je glavnu ulogu preuzela Generalna skup??tina UN", "normativ kojim se uskla??uju odnosi izme??u stranaka na vlasti i stranaka u opoziciji", ""));
        Democracy.add(new Pitanje("Br??ko je", "distrikt", "kanton", "Op??ina", "entitet", ""));
        Democracy.add(new Pitanje("Koja su prirodna prava ??ovjeka", "pravo na ??ivot, imovinu i slobodu", "pravo na obrazovanje, slobodu izra??avanja i zdravu hranu", "pravo na slobodu kretanja, prebivali??ta i zdravu ??ivotnu sredinu", "pravo na slobodu misli, savjesti i vjere", ""));
        Democracy.add(new Pitanje("Opozicija je", "manjinska politi??ka partija koja nije na vlasti", "stranka na vlasti", "politi??ka partija koja se takmi??i za vlast", "stranka koja nije parlamentarna", ""));
        Democracy.add(new Pitanje("Interesne grupe su", "Postdejtonske formalno organizirane skupine ljudi koje vr??e utjecaj na vr??enje zakonodavne, izvr??ne i sudske vlasti sa ciljem o??uvanja ustavnog ustrojstva dr??ave, njenog suvereniteta i teritorijalnog integriteta", "Formalne i neformalne skupine organizirane oko ostvarivanja zajedni??kih ciljeva u o??uvanju ??ivotne sredine i za??titi socijalne sigurnosti gra??ana", "Udru??enja gra??ana sastavljena od pojedinaca ili organizacija koje se okupljaju da unaprijede neka dobra ili beneficije za svoje ??lanove ili za javnost op??enito putem utjecaja na politiku vlasti", "Slobodno udru??ivanje gra??ana u dr??avi sa ciljem osnivanja politi??kih stranaka i uspostavom demokratskog sistema vladavine u oblasti ekonomije i privrede", ""));
        Democracy.add(new Pitanje("Jedna od navedenih osobina predstavlja karakteristiku nedemokratskoh sistema:", "Mo?? nije podijeljena", "Sloboda kretanja", "Vladavina prava", "Pravedan zakonski proces", ""));
        Democracy.add(new Pitanje("Monetarna politika spada u nadle??nost", "dr??ave", "kantona", "entiteta", "Br??ko Distrikta", "Monetarna politika Bosne i Hercegovine regulirana je Zakonom o Centralnoj banci Bosne i Hercegovine"));
        Democracy.add(new Pitanje("Koja je primarna funkcija vlasti u demokratskom dru??tvu?", "da ??titi prava i slobode svojih gra??ana", "da ??titi i upravlja slobodama gra??ana", "da kr??i prava i slobode svojih gra??ana", "da rukovodi njihovim pravima i slobodama", ""));
        Democracy.add(new Pitanje("Koliko ??lanova broji Predsjedni??tvo BiH?", "3", "4", "8", "10", ""));
        return Democracy;
    }

    private ArrayList<Pitanje> getMusic() {
        ArrayList<Pitanje> Music = new ArrayList<>();
        Music.add(new Pitanje("Verizam se javlja", "krajem 19 stolje??a u italijanskoj operi", "po??etkom 19 stolje??a u italijanskoj operi", "po??etkom 18 stolje??a u italijanskoj operi", "sredinom 19 stolje??a u italijanskoj operi", "Verizam se manifestirao u te??nji za nagla??eno realisti??kim prikazivanjem ljudskih sudbina, njihovih elementarnih strasti, mra??nih nagona i ??estokih sukoba."));
        Music.add(new Pitanje("Kompozitori klasike su:", "Hajdn, Mocart, Betoven", "Betoven, ??traus, Brams", "Brams, Mocart, ??uman", "Verdi, Mocart, Vagner", "Hajdn, Mocart i Betoven su poznati kao Be??ki klasici"));
        Music.add(new Pitanje("Oda radosti je dio Beethowenove", "devete simfonije", "tre??e simfonije", "osme simfonije", "pete simfonije", "Oda radosti se sada koristi kao himna Europske unije"));
        Music.add(new Pitanje("Franjo Bosanac", "je kompozitor renesanse", "je kompozitor klasike", "je kompozitor rokokoa", "je kompozitor baroka", "??ivio je od  1485 do 1535"));
        Music.add(new Pitanje("Asim Horozi??", "napisao je operu ???Hasanaginica??? ", "napisao je operu ???Jazavac pred sudom??? ", "napisao je simfonijski ples za orkestar ???Djeveru??a???", "napisao je solo pjesmu ???Azemina???", ""));
        Music.add(new Pitanje("Betoven uvodi hor u svojoj simfoniji", "petoj", "devetoj", "tre??oj", "prvoj", ""));
        Music.add(new Pitanje("Koja je Betoveniova simfonija vokalno-instrumentalna", "IX simfonija", "I simfonija", "III simfonija", "VI simfonija", ""));
        Music.add(new Pitanje("Violina spada u grupu", "Kordofonih guda??kih instrumenata", "Kordofonih trzanih instrumenata", "Kordofonih udarnih instrumenata", "Aerofonih drvenih instrumenata", ""));
        Music.add(new Pitanje("Impresionizam se javlja", "Na prelazu iz 19. u 20. stolje??e", "Krajem 18. stolje??a", "Sredinom 20. stolje??a", "Po??etkom 19. stolje??a", ""));
        Music.add(new Pitanje("Monodija je", "Jednoglasno pjevanje uz pratnju instrumenata", "Troglasno pjevanje uz klavirsku pratnju", "Dvoglasno pjevanje uz pratnju instrumenata", "Dvoglasno pjevanje A Capella", ""));
        Music.add(new Pitanje("Opera je", "najslo??enije muzi??ko-scensko djelo", "vi??eglasno pjevanje uz instrumentalnu pratnju", "orkestarsko djelo", "jednoglasno pjevanje uz klavirsku pratnju", ""));
        Music.add(new Pitanje("Igor Stravinski je", "ruski kompozitor", "italijanski kompozitor", "??e??ki kompozitor", "poljski kompozitor", ""));
        Music.add(new Pitanje("???Labudovo jezero??? napisao je", "Petar Ilji?? ??ajkovski", "Vatroslav Lisinski", "Mihail Ivanovi?? Glinka", "Nikolaj Rimski Korsakov", ""));
        Music.add(new Pitanje("Frederic Chopin je", "Poljski kompozitor iz perioda romantizma", "Austrijski kompozitor iz perioda klasike", "Njema??ki kompozitor iz perioda baroka", "??e??ki kompozitor iz perioda romantizma", ""));
        Music.add(new Pitanje("Harfa je", "kordofoni instrument", "guda??i instrument", "drveni duva??i instrument", "udaraljka", ""));
        Music.add(new Pitanje("Simfonija je", "orkestarsko djelo", "kompozicija za klavir", "kompozicija solo instrument", "kompozicija za hor", ""));
        Music.add(new Pitanje("Kordofoni instrumenti su", "??i??ani instrumenti", "udaraljke", "guda??ki instrumenti", "drveni druva??ki instrumenti", ""));
        return Music;
    }

    private ArrayList<Pitanje> getArt() {
        ArrayList<Pitanje> Art = new ArrayList<>();
        Art.add(new Pitanje("Bosanskohercegova??ki slikari su:", "Ismet Mujezinovi??, Safet Zec, Vojo Dimitrijevi??", "B. ??otra, B. Ku??anski, Me??trovi??", "??oto, Maza??o, Du??o", "Dante Aligijeri, Brankusi, Koko??ka", ""));
        Art.add(new Pitanje("Pablo Pikaso je .... ?", "??pansko-francuski slikar, kipar i grafi??ar", "francuski arhitekta i graver", "italijanski muzi??ar i kerami??ar", "??panski knji??evnik i zlatar", ""));
        Art.add(new Pitanje("Henri Matis je predstavnik .... ? ", "fovizma", "nadrealizma", "dadaizma", "pop arta", ""));
        Art.add(new Pitanje("Ste??ak ???Kula??? ukra??en je sa:", "figurativnim scenama", "apstraktnim dekoracijama", "lunarnim i biljnim ornamentima", "prahistorijskim reljefima", ""));
        Art.add(new Pitanje("Najpoznatiji umjetnici ekspresionizma", "Eduard Munk, V.V.Gogh", "Modiljani, S.Dali", "P.Gogen, Sera ", "Anri Matis, Vlamenk", " "));
        Art.add(new Pitanje("Svjetski vajari koji su najpoznatiji u Evropi:", "N. Firentinac, B. Jakac", ") I. Me??trovi??, Kova??i??", "Franjo, Dimitrijevi??", ") Henri Mur, Rodin, Ku??anski", ""));
        Art.add(new Pitanje("Mersad Berber, D??evad Hozo i Halil Tikve??a su bosanskohercegova??ki", "grafi??ari", "vajari", "slikari", "kipari", ""));
        Art.add(new Pitanje("Navedi najljep??i ste??ak u BiH!", "ste??ak Kule", "biljni ste??ak", "geometrijski ste??ak", "orijentalni", ""));
        Art.add(new Pitanje("Kipari Hrvatske su", "Ivan Me??trovi??, A. Augustin??i??, F. Kr??ini??", "Henri Mur i Branku??i Konstantin", "Vladimir Tatljin, Vlamenk, Difi", "Kosta Milovanovi??, Nade??da F. Mili??evi?? Kosta", ""));
        Art.add(new Pitanje("Gr??ki vajari su", "Miron, Lizip, Skopas, Fidija, Praksitel, Poliklet", "Aron, Fidel, Markus, Sirius, Oktonazis", "Rebus, Citrus, Kiprus, Kolos, Ramzes", "Posejdon, Herakle, Lizikrat, Epidaur, Panteon", ""));
        Art.add(new Pitanje("Stilovi gr??ke arhitekture su", "Korintski, dorski, jonski", "Dvodimenzionalni, tonski, koloristi??ki", "Trodimenzionalni, pastozni, lazurni", "Arhajski, crnogori??ki, ??etvrtasti", ""));
        Art.add(new Pitanje("Umjetnost ste??aka odvija se zajedno sa .........? ", "umjetno????u renesanse", "kanokr????anskom umjetno????u", "umjetno????u islama", "romanikom i gotikom", ""));
        Art.add(new Pitanje("Navedi tri osnovne struje svjetskog slikarstva XX vijeka!", "fantazija, ekspresija, apstrakcija", "simbolizam, realizam, klasicizam", "nadrealizam, naiva, optimizam", "pesimizam, manirizam, naturali", ""));
        Art.add(new Pitanje("Najpoznatiji vajari XX stolje??a u Bosni i Hercegovini su", "Mustafa Skopljak, Arfan Hozi??, Nikola Njiri??, Ku??ukali??", "Ismet Mujezinovi??, Dimitrijevi??, Be??i??", "Mica Todorovi??, Safet Zec, Tikve??a", "Paja Jovanovi??, S. Hasanefendi??, Ismar Mujezinovi??", ""));
        Art.add(new Pitanje("Najpoznatiji vajari XX stolje??a", "Moore, Brancusi, Picasso", "Pollock, Marc, Chagall", "Picasso, M. Selimovi??", "Maljevi??, Mujezinovi??", ""));
        Art.add(new Pitanje("Kipari u Bosni i Hercegovini", "Grgi??, A. Ku??ukali??, Hozi??, Skopljak, Njiri??", "Rizvi??, Majstorovi??, Hasanefendi??", "??iri??, Avdi??evi??, Ahmi??", "Begovi?? Vezirovi??, Osmanlija", ""));
        return Art;
    }

    private ArrayList<Pitanje> getTizo() {
        ArrayList<Pitanje> Tizo = new ArrayList<>();
        Tizo.add(new Pitanje("Olimpijada traje", "petnaest dana", "deset dana", "??etiri godine", "mjesec dana", ""));
        Tizo.add(new Pitanje("Koji od navedenih borila??kih sportova nije olimpijski?", "karate", "taekwondo", "boks", "d??udo", "Karate ??e po prvi put postati olimpijski sport na Ljetnim Olimpijskim igrama u Tokiju 2020"));
        Tizo.add(new Pitanje("Koje godine je ko??arka??ki klub Jedinstvo Aida osvojio titulu evropskog prvaka?", "1989", "1979", "1985", "1990", ""));
        Tizo.add(new Pitanje("U fudbalskoj ekipi desno krilo naj??e????e nosi broj", "7", "9", "10", "3", ""));
        Tizo.add(new Pitanje("Koji od navedenih pojmova ne spada u zimske sportove", "triatlon", "bob", "karling", "biatlon", "Naj??e????e se pod triatlonom podrazumijeva sportsko natjecanje u disciplinama: plivanje, biciklizam i tr??anje"));
        Tizo.add(new Pitanje("Koja od navednih gimnasti??kih disciplina nije u programu za ??ene", "vratilo", "greda", "preskok", "parter", ""));
        Tizo.add(new Pitanje("Sme??iranje je izraz vezan za", "odbojku", "boks", "rukomet", "plivanje", "U odbojci sme?? je potez postizanja poena agresivnim udaranjem lopte preko mre??e u teren protivni??ke ekipe"));
        Tizo.add(new Pitanje("Pivotmen je napada?? u", "rukometu", "fudbalu", "hokeju na ledu", "vaterpolu", "PIVOT-linijski ??ovjek na ??est metara , ??eka loptu od bekova"));
        Tizo.add(new Pitanje("Ko??arka??ka utakmica traje", "4x10 minuta", "2x20 minuta", "2x45 minuta", "4x5 minuta", "NBA utakmice traju 4*12 minuta"));
        Tizo.add(new Pitanje("???Prednji vezni??? je termin koji se koristi u", "Fudbalu", "Odbojci", "Ko??arci", "Rukometu", ""));
        Tizo.add(new Pitanje("Ko??arka??ki  klub ???BOSNA??? je bio prvak Evrope:", "1979", "1969", "1989", "2009", ""));
        Tizo.add(new Pitanje("???Cepelin??? je popularan naziv za napada??ku tehniku koja se koristi u", "Rukometu", "Vaterpolu", "Odbojci", "Ko??arci", ""));
        Tizo.add(new Pitanje("Kako se zove igra?? u odbojci, ozna??en drugom bojom dresa", "Libero", "korektor", "pivotmen", "centar", ""));
        Tizo.add(new Pitanje("Visina ko??a je", "3,05", "3,00", "2,80", "2,50", ""));
        Tizo.add(new Pitanje("Koji od navedenih pojmova ne spada u alpske discipline", "biatlon", "spust", "slalom", "veleslalom", ""));
        Tizo.add(new Pitanje("Najvi??e olimpijskih medalja osvojio/la je", "Michael Phelps", "Carl Lewis", "Larisa Latinjina", "Muhammed Ali", "Osvojio je ukupno 28 olimpijskih medalja, od ??ega su 23 zlatne "));
        Tizo.add(new Pitanje("Koji sport nije na programu 2012 u Londonu", "golf", "boks", "streli??arstvo", "stoni tenis", "Golf nije bio bio na programu ljetnih olimpijskih igara od 1904. sve do 2016. kad je vra??en"));
        Tizo.add(new Pitanje("Koliko se igra odbojka??ka utakmica:", "Igra se igra u tri dobivena seta", "Igra se 2 x 45 minuta", "Igra se u dva dobivena seta", "Igra se 4 x 10 minuta", ""));
        Tizo.add(new Pitanje("Kraljica sportova je", "atletika", "fudbal", "gimnastika", "plivanje", ""));
        Tizo.add(new Pitanje("Broj igra??a u ekipama (odbojka, ko??arka, fudbal)", "odbojka 6 igra??a, ko??arka 5 igra??a, fudbal 11 igra??a", "odbojka 7 igra??a, ko??arka 6 igra??a, fudbal 12 igra??a", "odbojka 5 igra??a, ko??arka 7 igra??a, fudbal 10 igra??a", "odbojka 8 igra??a, ko??arka 4 igra??a, fudbal  9 igra??a", ""));
        Tizo.add(new Pitanje("U bazi??ne sportove spadaju", "plivanje, atletika, gimnastika", "nogomet, rukomet, ko??arka", "skijanje, biciklizam, streli??arstvo", "aerobik, zumba, tabata", ""));
        Tizo.add(new Pitanje("Geslo olimpijskih igara glasi", "citius, altius, fortius", "momento mori", "per aspera ad astra", "veni, vidi, vici", "U prijevodu br??e, vi??e, sna??nije"));
        Tizo.add(new Pitanje("Moderni petoboj sastoji se iz", "ma??evanja, strelja??tva, jahanja, plivanja i tr??anja", "tr??anja, bacanja koplja, bacanja diska, skoka u dalj i hrvanja", "tr??anja, skoka u vis, dizanja tegova, plivanja i bacanja koplja", "tr??anja, plivanja, vo??nje bicikla, skakanja u vis i skakanja u dalj", ""));
        Tizo.add(new Pitanje("Maksimalan broj li??nih gre??aka u ko??arci za jednog igra??a je", "5", "4", "3", "2", ""));
        Tizo.add(new Pitanje("Tokom ko??arka??ke utakmice ekipa mo??e napraviti", "Neograni??en broj izmjena", "5 izmjena", "10 izmjena", "8 izmjena", ""));
        Tizo.add(new Pitanje("Duge staze su trka??ke discipline du??e od", "5000m", "400m", "1500m", "800m", ""));
        Tizo.add(new Pitanje("Ishrana mladih sportista treba da je", "Raznovrsna", "bogata kalorijama", "dijetalna", "masna", ""));
        Tizo.add(new Pitanje("Olimpijski grad u Bosni i Hercegovini je", "Sarajevo", "tuzla", "mostar", "banja luka", "U Sarajevu su odr??ane Zimske olimpijske igre 1984."));
        Tizo.add(new Pitanje("Brazil je svjetska velesila u", "fudbalu", "hokeju na travi", "rukometu", "skijanju", "Brazil ima najvi??e titula svjetskog prvaka u fudbalu (pet)"));
        return Tizo;
    }

    private ArrayList<LinijskiOdgovor> getHisLine() {
        ArrayList<LinijskiOdgovor> hisSQ = new ArrayList<>();
        hisSQ.add(new TekstualnoPitanje("Starje??ina Crkve bosanske zvao se djed (did) dok su se vi??i sve??tenici zvali________", "starci", "stsrci", "starci"));
        hisSQ.add(new TekstualnoPitanje("Otkri??e Kristofora Kolumba potvrdio je ___________________________. Po njemu je nova zemlja dobila ime Tera Amerika.", "Vespu??i", "Vespuci", "Vespu??i"));
        hisSQ.add(new TekstualnoPitanje("Osniva??ka skup??tina UN-a odr??ana je u ___________ od 25. aprila do 26. juna 1945", "New Yorku", "Nju Jorku", "Njujorku"));
        hisSQ.add(new TekstualnoPitanje("Dan dr??avnosti Bosne i Hercegovine je____________________", "25. novembar", "25 novembar", "25.11."));
        hisSQ.add(new TekstualnoPitanje("Grad Novi osnovao je bosanski kralj _____________________________", "Tvrtko I", "Tvrtko", "Tvrtko prvi"));
        hisSQ.add(new TekstualnoPitanje("Rodona??elnikom dinastije Kotromani??a smatra se ban ________________________.", "Prijezda", "Ban prijezda", "Prijezda I"));
        hisSQ.add(new TekstualnoPitanje("Aneksijom Bosne i Hercegovine Austro-Ugarska je jednostrano izmijenila _________________________ugovor i time izazvala veliku diplomatsku aktivnost", "berlinski", "berlinskog", "berlinski kongres"));
        hisSQ.add(new TekstualnoPitanje("Jugoslovenski odbor je predstavljao jugoslovenske zemlje unutar___________________________monarhije", "Austro-Ugarske", "austrougarske", "Austro Ugarske"));
        hisSQ.add(new TekstualnoPitanje("Na inicijativu SSSR osnovan je 1955.god.savez koji se zvao _____________________________________", "Var??avski pakt", "Varsavski pakt", "Var??avski pakt"));
        hisSQ.add(new DoubleQuestion("Rimski car _____________ je podjelio Carstvo na dva dijela________ godine n.e.", "Teodozije", "395."));
        hisSQ.add(new DoubleQuestion("Rodnim listom bosanske dr??avnosti smatra se Povelja bana_________ iz____ godine", "Kulina", "1189."));
        hisSQ.add(new DoubleQuestion("Srednjovjekovnu Bosnu osvojio je sultan _________________ godine __________ ", "Mehmed II", "1463."));
        hisSQ.add(new DoubleQuestion("Martin Luter je bio profesor na Univerzitetu u ________________.Svoje u??enje je obznanio u _______ teza", "Erfurtu", "95"));
        hisSQ.add(new DoubleQuestion("Aneksija Bosne i Hercegovine izvr??ena je_______ godine. Naredne godine sultan  je priznao aneksiju uz finansijsko obe??te??enje od 2,5 miliona funti, ali i obavezu da  povu??e svoje garnizone iz_______________________.", "1908.", "novopazarskog sand??aka"));
        hisSQ.add(new DoubleQuestion("Jugoslovenska muslimanska organizacija je osnovana _____ godine u __________ ", "1919.", "Sarajevu"));
        hisSQ.add(new DoubleQuestion("Sparta je predstavljala gr??ki polis sa________________________ dru??tvenim ure??enjem. Njen najvi??i organ vlasti bila je__________________________", "aristokratskim", "apela"));
        hisSQ.add(new DoubleQuestion("Prvi histori??ari javljaju se u  Staroj Gr??koj, a najzna??ajniji su bili_________________i (2) ________________________", "Herodot", "Tukidid"));
        hisSQ.add(new DoubleQuestion("Nakon zavr??etka Drugog svjetskog rata osnovana su dva vojnopoliti??ka saveza i to (2) _____________________________________ i___________________________________", "Nato", "Var??avski pakt"));
        hisSQ.add(new DoubleQuestion("Za postanak Rima ve??e se legenda o bra??i blizancima __________ i __________.", "Romulu", "Remu"));
        hisSQ.add(new DoubleQuestion("Latinsko carstvo je bila dr??ava koju su osnovali ____________________ nakon ??to su zauzeli Carigrad ___________ godine", "Krsta??i", "1204."));
        hisSQ.add(new DoubleQuestion("Kontinent Ameriku otkrio je moreplovac __________________ godine _________", "Kolumbo", "1492."));
        hisSQ.add(new DoubleQuestion("Odluka o okupaciji Bosne i Hercegovine od strane Austrougarske donijeta je na _________________________, godine_____________________", "Berlinskom kongresu", "1878."));
        hisSQ.add(new DoubleQuestion("Kulturno-umjetni??ka dru??tva u BiH formirana su na nacionalnoj osnovi. Jevreji su formirali svoje dru??tvo pod imenom ___________, a Bo??njaci pod imenom ____________.", "La Benevolentia", "Gajret"));
        hisSQ.add(new DoubleQuestion("Hercegovina je dobila ime po tituli_____________, koju je nosio bosanski velika??____________________.", "Herceg", "Stjepan vuk??i?? kosa??a"));
        hisSQ.add(new DoubleQuestion("Najpoznatija djela Leonarda da Vin??ija su:_______________i______________.", "Mona Lisa", "Posljednja ve??era"));
        hisSQ.add(new DoubleQuestion("Vojni??ka klasa u Osmanskom carstvu sastojala se od dva vojni??ka reda koji su bili_______________i_______________ ", "janji??ari", "spahije"));
        hisSQ.add(new DoubleQuestion("Vidovdanski ustav za Kraljevinu Srba, Hrvata i Slovenaca izglasan je_______ godine, a ??lanom 135 garantirana je cjelovitost __________________________", "1921.", "Bosne"));
        hisSQ.add(new DoubleQuestion("Pred Prvi svjetski rat velike imperijalisti??ke sile podijelile su se na dva saveza.To su: a)________________________________b)________________________________", "Antanta", "Centralne Sile"));
        hisSQ.add(new DoubleQuestion("Jugoslovenski odbor je formiran aprila____________godine u Parizu a za predsjednika je izabran___________________________________________.", "1914.", "Ante Trumbi??"));
        hisSQ.add(new DoubleQuestion("Navedi zemlje u kojima su se (po va??em mi??ljenju)izme??u dva svjetska rata uspostavili totalitarni re??imi:  a)_______________________________b)________________________________", "Njema??ka", "Italija"));
        hisSQ.add(new DoubleQuestion("Napoleon je uspje??nim ratovima ukinuo i dvije dr??ave-republike na Jadranu.Bile su to:  a)________________________________b)________________________________", "Venecija", "Dubrovnik"));
        return hisSQ;
    }

    private ArrayList<Pitanje> gethisIZB() {
        ArrayList<Pitanje> hisIZB = new ArrayList<>();
        hisIZB.add(new Pitanje("Gr??ko ??? perzijske ratove opisao je histori??ar", "Herodot", "Tukidid", "Demosten", "Aristotel", ""));
        hisIZB.add(new Pitanje("Religija stare Gr??ke bila je", "politeisti??ka", "judaizam", "Monoteisti??ka", "ateisti??ka", ""));
        hisIZB.add(new Pitanje("Du??ni??ko ropstvo u staroj Atini ukinuo je:", "Solon", "Drakon", "Pizistrat", "Klisten", ""));
        hisIZB.add(new Pitanje("Gr??ka je pala pod vlast Makedonije 338. godine st. e. nakon poraza u bici", "kod Heroneje", "na Maratonskom polju", "u Termopilskom klancu", "Kod plateje", ""));
        hisIZB.add(new Pitanje("Starosjedioci, odnosno potomci osniva??a grada Rima zvali su se", "patriciji", "plebejci", "eupatridi", "latini", ""));
        hisIZB.add(new Pitanje("Sukobi izme??u Rimljana i Karta??ana zapo??eli su na", "Siciliji", "Sardiniji", "Korzici", "Peloponezu", ""));
        hisIZB.add(new Pitanje("Vrhovnim bo??anstvom u starom Rimu smatran je Jupiter. On je bio", "bog neba i svjetla", "bog svakog po??etka", "bog lova, ??ume i prirode", "bog doma??eg ognji??ta", ""));
        hisIZB.add(new Pitanje("Prvi Ilirski odbrambeni rat protiv Rimljana 228. godine st. e. predvodila je kraljica", "Teuta", "Dijana", "Venera", "Julija", ""));
        hisIZB.add(new Pitanje("Najpoznatija Ilirska kraljica bila je", "Teuta", "Kleopatra", "junona", "atena", ""));
        hisIZB.add(new Pitanje("Rodona??elnik srednjovjekovne bosanske dinastije Kotromani??a je", "ban Prijezda", "ban Bori??", "Ban Kulin", "Kralj Tvrtko", ""));
        hisIZB.add(new Pitanje("Svoj najve??i uspon srednjovjekovna Bosna do??ivjela je za vrijeme vladavine", "kralja Tvrtka I", "kralja Tvrtka II", "Bana Stjepana II", "Bana Prijezde", ""));
        hisIZB.add(new Pitanje("Da bi Bosansko Kraljevstvo ekonomski osna??io kralj Tvrtko I. je 1382. godine  podigao grad na Jadranskom moru Bio je to grad:", "Novi", "Kotor", "Neum", "dubrovnik", ""));
        hisIZB.add(new Pitanje("Prva  ??ena na bosanskom prijestolju bila je:", "Jelena", "Katarina", "Jelisaveta", "Kleopatra", ""));
        hisIZB.add(new Pitanje("Bosanski biskup se iz srednjovjekovne Bosne preselio u ??akovo:", "1252.", "1249.", "1340.", "1377.", ""));
        hisIZB.add(new Pitanje("Na ??elu Crkve bosanske nalazio se:", "djed(did)", "patrijarh", "papa", "starci", ""));
        hisIZB.add(new Pitanje("Srednjovjekovnu  bosansku dr??avu osvojili su", "Osmansko Carstvo", "Ugarska", "venecija", "Srbija", ""));
        hisIZB.add(new Pitanje("Bosanski ejalet, osnovan 1580. godine, prvobitno je imao sjedi??te u", "Banja Luci", "Sarajevu", "Travniku", "Br??kom", ""));
        hisIZB.add(new Pitanje("Nakon ??to je do??ao do zakona o kretanju planeta, osniva??em moderne  astronomije i mehanike progla??en je", "Johan Kepler", "Galileo Galilej", "Isak Njutn", "Toskaneli", ""));
        hisIZB.add(new Pitanje("Martin Luter je inicijator refome crkve u:", "Njema??koj", "Holandiji", "Francuskoj", "Engleskoj", ""));
        hisIZB.add(new Pitanje("Po??etkom 16. stolje??a nastalo je djelo ''Utopija'' u kojem je dat nacrt idealne dr??ave organizirane prema na??elima pravde. Autor tog djela je", "Tomas Mor", "Fran??esko Petrarka", "Erazmo Roterdamski", "Lorenco Vala", ""));
        hisIZB.add(new Pitanje("Francuska gra??anska revolucija po??ela je 14. jula 1789. godine napadom na Bastilju koja je bila simbol", "apsolutizma", "komunizma", "demokratije", "kapitalizma", ""));
        hisIZB.add(new Pitanje("Progla??enje Njema??kog Carstva izvr??eno je 18. januara 1871. godine u", "Versaju", "Berlinu", "Bonu", "Frankfurtu", ""));
        hisIZB.add(new Pitanje("Berlinski kongres, na kome je Austro-Ugarska monarhija dobila mandat velikih sila da okupira Bosnu i Hercegovinu, odr??an je", "1878.", "1877.", "1879.", "1888.", ""));
        hisIZB.add(new Pitanje("Prvi svjetski rat po??eo je 28. jula 1914. godine napadom Austro-Ugarske na:", "Srbiju", "crnu goru", "Bosnu i Hercegovinu", "Osmansko Carstvo", ""));
        hisIZB.add(new Pitanje("Centralne sile su u Prvom svjetskom ratu bile pora??ene od sila Antante.  Rat je zavr??en kapitulacijom Njema??ke", "11. 11. 1918. godine", "29. 9. 1918. godine", "10. 11. 1918. godine", "3. 11. 1918. godine", ""));
        hisIZB.add(new Pitanje("Drugi svjetski rat po??eo je 1. septembra 1939. godine napadom", "Njema??ke na Poljsku", "NJema??ke na ??ehoslova??ku", "NJema??ke na Francusku", "Njema??ke na Jugoslaviju", ""));
        hisIZB.add(new Pitanje("BiH je u ??lanstvo UN primljena", "22.maja 1992.godine", "22.maja 1991.godine", "22.maja 1993.godine", "22.maja 1995.godine", ""));
        hisIZB.add(new Pitanje("Ilijada i Odiseja su najstariji gr??ki", "Epovi", "Mitovi", "romani", "polisi", ""));
        hisIZB.add(new Pitanje("Kr????anstvo je slobodnom i ravnopravnom religijom unutar Rimskog carstva proglasio car", "Konstantin", "teodosije", "Dioklecijan", "Trajan", ""));
        hisIZB.add(new Pitanje("Jedan od najve??ih robovskih ustanaka u starom Rimu po??eo je pod vodstvom", "Spartaka 74. g. s.e.", "Demofila 72. g. s.e.", "Livija Druza 74. g. s.e.", "Licinija Krasa 71. g. s.e.", ""));
        hisIZB.add(new Pitanje("Pismo u srednjovjekovnoj bosanskoj dr??avi bilo je", "Bosan??ica", "??irilica", "Arebica", "Latinica", ""));
        hisIZB.add(new Pitanje("Protjerav??i porodicu ??ubi??a 1322. godine vlast nad srednjovjekovnom Bosnom uspostavio je", "Stjepan II", "Stjepan I", "Prijezda", "Bori??", ""));
        hisIZB.add(new Pitanje("Bosanki vladar Tvrtko I Kotromani?? je vladao u periodu", "1353-1391", "1350-1390", "1353-1381", "1355-1391", ""));
        hisIZB.add(new Pitanje("Posljednji bosanski kralj kojeg su Osmanlije porazile bio je", "Stjepan Toma??evi??", "Sjepan Ostoji??", "Stjepan Dabi??a", "Stjepan Toma??", ""));
        hisIZB.add(new Pitanje("Prva uspje??no izvedena gra??anska revolucija bila je u:", "Engleskoj", "Rusiji", "Francuskoj", "Austriji", ""));
        hisIZB.add(new Pitanje("Kojem vladaru se pripisuju rije??i ???Poslije nas potop???", "Luj XIV", "Luj XV", "Luj XVI", "Henrik IV", ""));
        hisIZB.add(new Pitanje("Posljednji poraz Napoleon je do??ivio u bici kod", "Vaterloa", "Lajpciga", "Moskve", "Svete Helene", ""));
        hisIZB.add(new Pitanje("Mirovni kongres u Be??u odr??an je:", "1814/1815", "1814", "1815", "1813/1814", ""));
        hisIZB.add(new Pitanje("Akt kojim su Sjedinjene Ameri??ke Dr??ave proglasile nezavisnost 1776. godine naziva se", "Deklaracija o nezavisnosti", "Ustav SAD", "Povelja naroda", "Velika povelja sloboda", ""));
        hisIZB.add(new Pitanje("Kona??no ujedinjenje Italije zavr??eno je:", "1870.", "1871.", "1850.", "1866.", ""));
        hisIZB.add(new Pitanje("Njema??ka je ujedinjena:", "18. januara 1871.", "8. januara 1870.", "28.januara 1872.", "1. januara 1871.", ""));
        hisIZB.add(new Pitanje("Zemlje ??lanice Atante su", "Francuska, Engleska i Rusija", "Italija, Austro-Ugarska i Njema??ka", "Engleska, Italija i Francuska", "Rusija, Njema??ka, Italija", ""));
        hisIZB.add(new Pitanje("Atlansku povelju potpisali su Ruzvelt i ??er??il na brodu Princ od Velsa", "1941", "1940", "1939", "1942", ""));
        hisIZB.add(new Pitanje("Prvo zasijedanje ZAVNOBiH-a odr??ano je", "25. novembra 1943. godine u Mrkonji?? Gradu", "29. novembra 1943. godine u Jajcu", "25. oktobra u Biha??u", "30 juna ??? 2. jula 1944. u Sanskom Mostu", ""));
        hisIZB.add(new Pitanje("Referendum za suverenu i nezavisnu Bosnu i Hercegovinu odr??an je", "1992", "1991", "1993", "1995", ""));
        return hisIZB;
    }

    private ArrayList<TrueFalseQuestion> getHisTF() {
        ArrayList<TrueFalseQuestion> HisTF = new ArrayList<>();
        HisTF.add(new TrueFalseQuestion("Posljednji atinski kralj je bio Kodros", "true"));
        HisTF.add(new TrueFalseQuestion("Prvi rimski car bio je Gaj Julije Cezar", "false"));
        HisTF.add(new TrueFalseQuestion("Prvi bosanki vladar koji je kovao novac bio je ban Kulin", "false"));
        HisTF.add(new TrueFalseQuestion("Srednjovjekovnu bosansku dr??avu osvojio je Murat I", "false"));
        HisTF.add(new TrueFalseQuestion("Mehmed pa??a Sokolovi?? je osmanski sultan", "false"));
        HisTF.add(new TrueFalseQuestion("Zemaljski muzej u Sarajevu je osnovan je 1881. godine", "false"));
        HisTF.add(new TrueFalseQuestion("SAD su u??le u Prvi svjetski rat 1914. godine", "false"));
        HisTF.add(new TrueFalseQuestion("Tre??e zasijedanje ZAVNOBiH-a je odr??ano u Sarajevu 6.aprila 1945. godine", "false"));
        HisTF.add(new TrueFalseQuestion("Drugi svjetski rat je zavr??en kapitulacijom Japana 2. septembra 1945 godine", "true"));
        HisTF.add(new TrueFalseQuestion("Dan Dr??avnosti Bosne i Hercegovine je 1. mart", "false"));
        HisTF.add(new TrueFalseQuestion("Autor prvog bosansko???turskog rje??nika bio je Muhamed Hevai Uskufi", "true"));
        HisTF.add(new TrueFalseQuestion("BiH je u ??lanstvo UN primljena 6.aprila 1992. godine", "false"));
        HisTF.add(new TrueFalseQuestion("Sparta se nalazilana jugu Gr??ke, u oblasti Lakoniji", "true"));
        HisTF.add(new TrueFalseQuestion("Mezopotamija je nastala u dolini rijeke Nil", "false"));
        HisTF.add(new TrueFalseQuestion("Posljednji bosanski  kralj bio je Stjepan Toma??", "false"));
        HisTF.add(new TrueFalseQuestion("Iliri su prvi poznati stanovnici Bosne", "true"));
        HisTF.add(new TrueFalseQuestion("Mehmed pa??a Sokolovi?? je bio veliki vezir", "true"));
        return HisTF;
    }

    private ArrayList<Pitanje> getHemIZ() {
        ArrayList<Pitanje> HemClassic = new ArrayList<>();
        HemClassic.add(new Pitanje("Elementi u PSE su poredani", "po porastu atomskog broja", "po broju elektrona u K-ljusci", "po broju elektrona u posljednjem energetskom nivou", "ni??ta od navedenog", ""));
        HemClassic.add(new Pitanje("Zapremina 0,5 mola nekog gasa pri STP je:", "11,2 dm3", "5,6 dm3", "22,4 dm3", "33,6 dm3", ""));
        HemClassic.add(new Pitanje("Jedan mol helijuma, pri normalnim uslovima, ima", "Avogadrov broj atoma", "22,4 atoma", "Avogadrov broj molekula", "22,4 molekula", ""));
        HemClassic.add(new Pitanje("Relativna molekulska masa NaHCO3 iznosi (ArNa=23; ArC=12; ArO=16):", "84", "100", "107", "106", ""));
        HemClassic.add(new Pitanje("U kom omjeru masa se spajaju N i O u NO2 (ArN=14; ArO=16)", "7:16", "7:4", "8:4", "14:4", ""));
        HemClassic.add(new Pitanje("Koliku masu ima 3,05 x 1021 atoma zlata (ArAu=196,97)", "10?? mg", "10?? mg", "1 mg", "1", ""));
        HemClassic.add(new Pitanje("Orbitala mo??e da primi", "2 elektrona", "8 elektrona", "10 elektrona", "4 elektrona", ""));
        HemClassic.add(new Pitanje("Zasi??eni karbohidrogen je:", "ciklopentan", "benzen", "cikloheksen", "eten", ""));
        HemClassic.add(new Pitanje("Glukoza je", "aldoheksoza", "Ketoheksoza", "2-deoksiriboza", "maltoza", ""));
        HemClassic.add(new Pitanje("Masti i ulja su", "triacilgliceroli", "fenoli", "acetali", "enoli", ""));
        HemClassic.add(new Pitanje("Etan podlije??e reakcijama", "supstitucije", "adicije", "dekarboksilacije", "polimerizacije", ""));
        HemClassic.add(new Pitanje("Sapuni su", "povr??inski aktivne tvari", "soli aminokiselina", "alkoholi", "soli lizina", ""));
        HemClassic.add(new Pitanje("Prelazni elementi", "popunjvaju d-ljusku", "su svi nemetali", "su gasovi", "ni??ta od navedenog nije ta??no", ""));
        HemClassic.add(new Pitanje("Funkcionalna grupa koja sadr??i sp2 hibridizovani C atom je", "karboksilna", "amino", "hidroksilna", "nitro", ""));
        HemClassic.add(new Pitanje("Sulfatna kiselina", "je jaka dehidrataciona tvar", "je ??vrsta tvar", "ima formulu H2SO3", "ima formulu H2SO2", ""));
        HemClassic.add(new Pitanje("R-CH2OH predstavlja op??u formulu", "primarnih alkohola", "anhidrida", "etera", "estera", ""));
        return HemClassic;
    }

    private ArrayList<LinijskiOdgovor> getHemDQ() {
        ArrayList<LinijskiOdgovor> HemDQ = new ArrayList<>();
        HemDQ.add(new DoubleQuestion("Napisati simbole slijede??ih elemenata : \n" + "a)Hlor,litij,kalaj,olovo\n" + "b)Cink,bakar,ksenon,fluor\n", "Cl, Li, Sn, Pb", "Zn, CU, Xe, F"));
        HemDQ.add(new DoubleQuestion("Napisati simbole slijede??ih elemenata : \n" + "a)Sumpor,nitrogen,barij,fosfor\n" + "b)Kalcij,zlato,aluminij,antimon\n", "S, N, Ba, P", "Ca, Au, Al, Sb"));
        HemDQ.add(new DoubleQuestion("Metali i nemetali me??usobno grade ________ spojeve, a nemetali me??usobno __________spojeve", "jonske", "kovalentne"));
        HemDQ.add(new DoubleQuestion("Oksidi metala sa vodom grade _______ a oksidi nemetala sa vodom grade_______", "baze", "kiseline"));
        HemDQ.add(new TekstualnoPitanje("AgNO3 +       -> AgCl + KNO3", "KCl", "KCl", "KCL"));
        HemDQ.add(new TekstualnoPitanje("2NaOH + H2SO4 ->            ", "Na2SO4+2H2O", "Na2SO4 + 2H2O", "Na2SO4 + 2 H2O"));
        HemDQ.add(new TekstualnoPitanje("H2CO3 +       -> Na2CO3 + 2H2O", "2NaOH", "2 NaOH", "2NaoH"));
        HemDQ.add(new TekstualnoPitanje("      + 2HCl  ->CaCl2 + H2O + CO2", "CaCO3", "CaCO3", "CaCO3"));
        HemDQ.add(new TekstualnoPitanje("Imenovati spojeve po IUPAC nomenklaturi", "2-aminopropanska kiselina", "2 - aminopropanska kiselina", "2aminopropanska kiselina"));
        HemDQ.add(new TekstualnoPitanje("Imenovati spojeve po IUPAC nomenklaturi", "1,2-etandiol", "12etandiol", "1,2 - etandiol"));
        HemDQ.add(new TekstualnoPitanje("Imenovati spojeve po IUPAC nomenklaturi", "5-hlor-4-metil-2-heksin", "5 - hlor - 4 - metil - 2 - heksin", "5hlor 4metil 2heksin"));
        HemDQ.add(new TekstualnoPitanje("Spoj sastavljen od hidrogena i nitrogena sadr??i 82,4% nitrogena. Relativna molekulska masa spoja je 17. Odrediti formulu tog spoja. (ArN=14; ArH=1)", "NH3", "NH 3", "N H 3"));
        HemDQ.add(new TekstualnoPitanje("Koliko treba odvagati ??vrstog natrijevog hidroksida da se neutralizira 0,1mol hloridne kiseline? (ArNa=23;  ArH=1; ArO=16)", "4g", "4 g", "4 grama"));
        HemDQ.add(new TekstualnoPitanje("Izra??unaj maseni udio hloridne kiseline u rastvoru koli??inske koncentracije 12mol/dm3, gusto??e 1,18g/cm3! (ArH=1; ArCl=35,45)", "37,1%", "37.1%", "37,1 %"));
        HemDQ.add(new TekstualnoPitanje("Kolika ??e biti pH rastvora, ako u 100cm3 rastvora pomije??amo 20g NaOH i 20g HCl? (ArH=1; ArCl=35,45; ArNa=23; ArO=16)", "0,32", "0.32", "0.3"));
        return HemDQ;
    }

    private ArrayList<LinijskiOdgovor> getGeoDQ() {
        ArrayList<LinijskiOdgovor> geoDQ = new ArrayList<>();
        geoDQ.add(new DoubleQuestion("Navedi imena nau??nih disciplina koje prou??avaju pojedine strukturne dijelove prirodne sredine\na) reljef\nb) vrijeme i klima", "geomorfologija", "klimatologija"));
        geoDQ.add(new DoubleQuestion("Navedi imena nau??nih disciplina koje prou??avaju pojedine strukturne dijelove prirodne sredine\na) vode\nb) tlo", "hidrologija", "pedologija"));
        geoDQ.add(new DoubleQuestion("Organizacija UN-a nastala je Poveljom prihva??enom 24.oktobra 1945. godine. Njene specijalizirane organizacije su\na) ILO_______\nb) FAO_______", "International Labour Organisation", "Food and Agriculture Organisation"));
        geoDQ.add(new DoubleQuestion("Organizacija UN-a nastala je Poveljom prihva??enom 24.oktobra 1945. godine. Njene specijalizirane organizacije su\na) WHO_______\nb) UNESCO_______", "World Health organisation", "united nations educational scientific and cultural organisation"));
        geoDQ.add(new DoubleQuestion("Dopi??i ??emu slu??e navedeni instrumenti:\na) barometar\nb) termometar", "mjerenje atmosferskog pritiska", "Mjerenje temperature zraka"));
        geoDQ.add(new DoubleQuestion("Dopi??i ??emu slu??e navedeni instrumenti:\na) anemomoetar\nb) higrometar", "mjerenje ja??ine vjetra", "mjerenje vla??nosti zraka"));
        geoDQ.add(new DoubleQuestion("Navedi najvi??e planine na kontinentima\na) Azija\nb) Afrika", "Mount Everest", "Kilimand??aro"));
        geoDQ.add(new DoubleQuestion("Navedi najvi??e planine na kontinentima\na) Australija\nb) Europa", "Kosciuszko", "Mont Blanc"));
        geoDQ.add(new DoubleQuestion("Navedi najvi??e planine na kontinentima\na) Sjeverna Amerika\nb) Ju??na Amerika", "Denali", "Aconcagua"));
        return geoDQ;
    }

    private ArrayList<Pitanje> getGeoIZB() {
        ArrayList<Pitanje> geoIN = new ArrayList<>();
        geoIN.add(new Pitanje("Gr??ki nau??nik koji je u III stolje??u p.n.e. prvi upotrijebio rije?? geografija zvao se", "Eratosten", "Aristotel", "Al Biruni", "Humbolt", ""));
        geoIN.add(new Pitanje("Sinodi??ki i sideri??ki Mjesec u danima traju", "29,5 i 27,3 dana", "27,3 i 29,5 dana ", "30 i 29 dana ", "29 i 30 dana", ""));
        geoIN.add(new Pitanje("U (-5) vremenskoj zoni (zapadno od Greenwhic-a) je 12 sati zonskog vremena. Koliko je sati u Bosni i Hercegovini (1. zona isto??no od Greenwhic-a)?", "18 sati", "17 sati", "10 sati", "9 sati", ""));
        geoIN.add(new Pitanje("Mjese??eva (hid??retska) godina traje 365,25 dana dok Gregorijanska godina traje 355 dana", "nijedna tvrdnja nije ta??na", "ne", "da", "ne zanimaju me kalendari", ""));
        geoIN.add(new Pitanje("Na karti razmjere 1:100 000 izmjerena je du??ina od 5 cm. Kolika je njezina stvarna du??ina u prirodi?", "5 000 m", "50 000 m", "500 000 m", "nemogu??e je ovo izra??unati", ""));
        geoIN.add(new Pitanje("Obim Zemlje po ekvatoru je", "40.076,6 km ", "41.176,6 km", "43.276,6 km", "44.376,6 km", ""));
        geoIN.add(new Pitanje("Planeta Zemlja u toku jednog sata okrene se oko svoje ose za", "15 stepeni", "10 stepeni", "5 stepeni", "20 stepeni", ""));
        geoIN.add(new Pitanje("Skale za mjerenje snage potresa zovu se:", "Merkalijeva skala (MCS) i Rihterova skala", "Boforova skala i Kelvinova", "Kelvinova skala i Merkalijeva", "Celzijusova i Merkalijeva skala", ""));
        geoIN.add(new Pitanje("Zaokru??i ta??an odgovor: Hipotezu o horizontalnom pomicanju kontinenata iznio je", "Geofizi??ar A. Wegener", "Geomorfolog Jovan Cviji??", "Geomorfolog E. Sis", "Geolog F. Katzer", ""));
        geoIN.add(new Pitanje("Osniva??ima moderne geografije smatraju se", "A. Humboldt i K. Ritter", "Aristotel i Ptolomej", "Eratosten i Al Biruni", "G. Galilej i N. Kopernik", ""));
        geoIN.add(new Pitanje("Koja od navedenih zemalja nije ??lanica EU?", "??vicarska", "Bugarska", "Kipar", "Rumunija", ""));
        return geoIN;
    }

    private ArrayList<TrueFalseQuestion> getGeoTF() {
        ArrayList<TrueFalseQuestion> geoTF = new ArrayList<>();
        geoTF.add(new TrueFalseQuestion("Bosna i Hercegovina je zemlja sjeverne Europe", "false"));
        geoTF.add(new TrueFalseQuestion("Bosna i Hercegovina ima povr??inu od 51129 km2", "true"));
        geoTF.add(new TrueFalseQuestion("Bosna i Hercegovina grani??i sa pet susjednih zemalja", "false"));
        geoTF.add(new TrueFalseQuestion("Cunami su vjetrovi koji izazivaju podmorski zemljotres", "false"));
        geoTF.add(new TrueFalseQuestion("Izoseiste su linije koje spajaju mjesta sa istom snagom zemljotresa", "true"));
        geoTF.add(new TrueFalseQuestion("Rusija (Ruska federacija) je povr??inom najve??a dr??ava na svijetu", "true"));
        geoTF.add(new TrueFalseQuestion("Kozmopoliti naseljavaju samo odre??eni dio zemlje i nema ih nigdje vi??e", "false"));
        geoTF.add(new TrueFalseQuestion("Oslo je glavni grad Norve??ke", "true"));
        geoTF.add(new TrueFalseQuestion("Jablanica, Salakovac i Grabovica su hidroelektrane na Vrbasu", "false"));
        geoTF.add(new TrueFalseQuestion("Pe??ina Vjetrenica je u Popovu polju", "true"));
        return geoTF;
    }

    private ArrayList<Pitanje> getBioIZB() {
        ArrayList<Pitanje> bioIN = new ArrayList<>();
        bioIN.add(new Pitanje("Krajnji ishod u Krebsovom citratnom ciklusu u energetskom bilansu je:", "36 molekula ATP-a", "40 molekula ATP-a", "2 molekule ATP-a", "30 molekula ATP-a", ""));
        bioIN.add(new Pitanje("Svjetlosna faza fotosinteze odvija se u", "tilakoidima hloroplasta", "matriksu mitohondrija", "stromi hloroplasta", "jedru ??elije", ""));
        bioIN.add(new Pitanje("U bioti??ke ekolo??ke faktore spadaju", "fitogeni faktori", "klimatski faktori", "edafski faktori", "orografski faktori", ""));
        bioIN.add(new Pitanje("Parenhim je tkivo kod biljaka koje spada u :", "Osnovna tkivo", "Ko??no tkivo", "Mehani??ko tkivo", "Provodno tkivo", ""));
        bioIN.add(new Pitanje("Paralelna nervatura lista karakteristi??na je za", "jednosupnice", "dvosupnice", "borove", "sve skrivenosjemenja??e", ""));
        bioIN.add(new Pitanje("Kad je izvan??elijska teku??ina hipertoni??na u odnosu na sadr??aj ??elije tada:", "voda izlazi iz ??elije", "voda ulazi u ??eliju", "nema transporta vode", "samo ioni ulaze u stanicu", ""));
        bioIN.add(new Pitanje("Hromosom je gra??en od dvije:", "hromatide", "hromoneme", "hromomere", "centromere", ""));
        bioIN.add(new Pitanje("Za prokariote vrijedi tvrdnja: nasljedna uputa je na nivou:", "jedra", "nukleotida", "nukleoida", "nukleoproteida", ""));
        bioIN.add(new Pitanje("Mitohondriji", "sve navedene tvrdnje su ispravne", "su energetske centrale stanice", "su glavni proizvo??a??i ATP-a", "imaju dvostruku ovojnicu", ""));
        bioIN.add(new Pitanje("U inhibitorne neuromedijatore spadaju", "gama-aminobuterna kiselina", "noradrenalin", "acetilholin", "sve od navedenog", ""));
        bioIN.add(new Pitanje("Vrp??asti nervni sistem javlja se kod", "pljosnatih glista i ni??ih meku??aca", "??lankovitih glista i zglavkara", "hordata", "sisara", ""));
        bioIN.add(new Pitanje("Uloga tromocita je u:", "zgru??avanje krvi", "odbrani organizma od stranih ??estica", "prijenos oksigena", "prijenos CO2", ""));
        bioIN.add(new Pitanje("Stvaranje eritrocita (eritropoeza) obavlja se u", "ko??tanoj sr??i", "krvi", "jetri", "slezeni", ""));
        bioIN.add(new Pitanje("Homozigot je", "zigot koji ima oba gena ista", "je zigot koji nosi nejednake gene", "obje tvrdnje su ta??ne", "nijedna tvrdnja nije ta??na", ""));
        bioIN.add(new Pitanje("Somatske ??elije imaju", "diploidan broj hromosoma", "haploidan broj hromosoma", "tetraidan broj hormosoma", "nijedna tvrdnja nije ta??na", ""));
        bioIN.add(new Pitanje("Citoplazmatske organele koje imaju vlastitu DNK su", "mitohondrije", "Gol??ijev aparat", "Jedro", "Lizosomi", ""));
        bioIN.add(new Pitanje("Krupnije ??estice u ??eliju se unose procesima", "fagocitoze i pinocitoze", "osmoze i difuzije", "osmoze i difuzije", "Osmoze", ""));
        bioIN.add(new Pitanje("Protamini spadaju u", "Proste bjelan??evine", "Slo??ene bjelan??evine", "Proteide", "Steroidi", ""));
        bioIN.add(new Pitanje("??elijski zid imaju:", "biljne ??elije", "sve ??elije", "??ivotinjske ??elije", "mi??i??ne ??elije", ""));
        bioIN.add(new Pitanje("Organizmi koji proizvode organske materije iz neorganskih su", "autotrof", "heterotrofi", "komensali", "saprofiti", ""));
        bioIN.add(new Pitanje("Interakcija dva organizma u kojoj jedan organzam ima korist a drugi nema ni korist ni ??tetu naziva se:", "amensalizam", "kompeticija", "komensalizam", "simbioza", ""));
        bioIN.add(new Pitanje("Osniva?? evolucije je", "??arls Darvin", "Aristotel", "Tales", "Heraklit", ""));
        bioIN.add(new Pitanje("Mutacije su", "nenasljedne promjene", "nasljedne promjene", "promjene u citoplazmi ??elija", "nijedna tvrdnja nije ta??na", ""));
        bioIN.add(new Pitanje("Selekcija je", "prirodni odabir", "dokaz evolucije", "izolacioni mehanizam", "borba za opstanak", ""));
        bioIN.add(new Pitanje("Populacija je:", "skup jedinki iste vrste", "skup jedinki razli??ite vrste", "skup vrsta u jednoj biocenozi", "skup biljaka i ??ivotinja", ""));
        bioIN.add(new Pitanje("??u?? je proizvod funkcije ??elija:", "jetre", "gu??tera??e", "pankreasa", "??u??nog mjehura", ""));
        bioIN.add(new Pitanje("Enzim koji razla??e skrob do maltoze je", "amilaza", "fosforilaza", "maltaza", "saharaza", ""));
        bioIN.add(new Pitanje("U sastavu definitivne mokra??e zdravog ??ovjeka ne smije biti", "glukoza", "urea", "kreatinin", "voda", ""));
        bioIN.add(new Pitanje("Ki??ma je gra??ena od:", "33-34 ki??mena pr??ljena", "35-36 ki??mena pr??ljena", "43-44 ki??mena pr??ljena", "30 ki??menih pr??ljenova", ""));
        bioIN.add(new Pitanje("Kod vi??estani??nih organizama intracelularna te??nost nalazi se", "u ??elijama", "u me??u??elijskom prostoru", "u lakunama", "u crijevima", ""));
        bioIN.add(new Pitanje("Eferentna ili nishodna nervna vlakna provode nadra??aj od :", "nervnog centra ka perifernim organima", "centripetalno", "periferije organizma ka odgovoraju??im nervnim centrima", "nijedna tvrdnja nije ta??na", ""));
        bioIN.add(new Pitanje("Porfirinski skelet hlorofila sadr??i", "??etiri pirolova prstena", "tri pirolova prstena", "dva pirolova prstena", "jedan pirolov prsten", ""));
        bioIN.add(new Pitanje("Za vrh stabla i korjena karakteristi??an je", "apikalni rast", "bazalni rast", "interkalarni rast", "rast lisne dr??ke", ""));
        bioIN.add(new Pitanje("Antigen je:", "Strana supstanca, obi??no protein koji stimuli??e stvaranje antitijela", "Gen koji ko??i funkciju drugog gena", "Gen koji se izra??ava u fenotipu", "Protein koji inaktivi??e antitijelo", ""));
        return bioIN;
    }

    private ArrayList<LinijskiOdgovor> getBioDQ() {
        ArrayList<LinijskiOdgovor> bioDQ = new ArrayList<>();
        bioDQ.add(new DoubleQuestion("__________________________ faza fotosinteze odvija se u tilakoidima hloroplasta na svjetlosti, a\n__________________________ faza fotosinteze u stromi i ne zavisi direktno od svjetlosti.", "svijetla", "tamna"));
        bioDQ.add(new DoubleQuestion("Virusne ??estice ili partikule gra??ene su od dva osnovna dijela. To su______________ i _______________", "kapside", "nukleinske kiseline"));
        bioDQ.add(new DoubleQuestion("??elijske/stani??ne organele se nalaze u osnovnoj citoplazmatskoj masi koja se naziva\n___________ili______________", "matriks", "hijaloplazma"));
        bioDQ.add(new DoubleQuestion("Inzulin je hormon koji lu??i ________________, a njegova uloga je u", "gu??tera??a", "sni??avanju nivoa ??e??era u krvi"));
        bioDQ.add(new DoubleQuestion("Pljuva??ne ??lijezde lu??e ferment ____________ ili ___________", "Amilaza", "ptijalin"));
        bioDQ.add(new DoubleQuestion("Organizacija nervnog sistema javlja se u dva osnovna oblika\n_____________ i _____________ ", "centralni", "periferni"));
        bioDQ.add(new DoubleQuestion("U osnovi postoje dvije vrste fiksacije azota _______________ i ________________.", "biolo??ka", "abiolo??ka"));
        bioDQ.add(new DoubleQuestion("Virusne ??estice sastoje se iz dva dijela", "kapsomera", "nukleinska kiselina"));
        bioDQ.add(new DoubleQuestion("Plazmoliza je pojava odvajanja __________________________ od _____________________.", "??elijske membrane", "??elijskog zida"));
        bioDQ.add(new DoubleQuestion("Jedrov sok se ozna??ava i kao:\n ________________________ili________________________.", "nukleoplazma", "karioplazma"));
        bioDQ.add(new DoubleQuestion("Endoplazmatski retikulum se dijeli na\n __________________ i ______________________", "granulirani", "agranulirani"));
        bioDQ.add(new DoubleQuestion("Postoje kratki nervni nastavci ili ________________ i du??i nervni nastavci __________________.", "dendriti", "neuriti"));
        bioDQ.add(new DoubleQuestion("Protoplazma se sastoji od\n ______________ i________________.", "citoplazme", "jedra"));
        bioDQ.add(new DoubleQuestion("Nervna ??elija ili _____________ sastoji se od\n ________________________i nervnih nastavaka.", "neuron", "jedra"));
        return bioDQ;
    }

    private ArrayList<Pitanje> getFizIZB() {
        ArrayList<Pitanje> fizIN = new ArrayList<>();
        fizIN.add(new Pitanje("Sto mikrometara je", "0,1 mm", "10 mm", "1 mm", "0,01 mm", ""));
        fizIN.add(new Pitanje("Pretvoriti 15 m/s u km/h?", "54 km/h", "36 km/h", "72 km/h", "108 km/h", ""));
        fizIN.add(new Pitanje("Trgovac je izmjerio 1 kg sa gre??kom 5 g. Kolika je relativna gre??ka mjerenja?", "0,5%", "5%", "0,05%", "0,005%", ""));
        fizIN.add(new Pitanje("Tijelo se kre??e ravnomjerno ubrzano sa po??etnom brzinom 2 m/s. Nakon 3 s kretanja dostigne brzinu 6 m/s. Koliki je put tijelo pre??lo za vrijeme kretanja?", "12 m", "9 m", "16 m", "24 m", ""));
        fizIN.add(new Pitanje("Tijelo slobodno pada sa visine h = 30 m. Kolika je brzina tijela pri udaru u zemlju?", "24,26 m/s", "19,62 m/s", "18,65 m/s", "15,19 m/s", ""));
        fizIN.add(new Pitanje("Kolikom maksimalnom brzinom smije u??i automobil u krivinu polupre??nika 150 m?  Cesta je horizontalna, a koeficijent trenja 0,3.", "75,64 km/h", "61,76 km/h", "54,34 km/h", "38,18 km/s", ""));
        fizIN.add(new Pitanje("Na vrhu zgrade oka??eno je u??e na kojem visi tijelo koje osciluje sa periodom T = 6,28 s.  Kolika je du??ina u??eta?", "9,81 m", "19,62 m", "29,43 m", "39,24 m", ""));
        fizIN.add(new Pitanje("Dubina jezera je h = 15 m. Atmosferski pritisak iznosi 1,013 bara. Koliki je ukupni pritisak na dnu jezera?", "2,48 bara", "3, 48 bara", "1,47 bara", "1,013 bara", ""));
        fizIN.add(new Pitanje("Korito rijeke ima oblik pravougaonika stranica a = 12 m i b = 3 m. Brzina rijeke je 7,2 km/h.  Koliki je zapreminski protok vode?", "72 m3/s", "720 m3/s", "7,2 m3/s", "0,72 m3/s", ""));
        fizIN.add(new Pitanje("Elasti??na opruga se istegne za 20 cm pod djelovanjem sile od 10 N. Koliki rad izvr??i sila pri istezanju opruge?", "1 J", "10 J", "0,1 J", "0,01 J", ""));
        fizIN.add(new Pitanje("Pumpa podigne 1 m3 vode na visinu 15 m za 1 minutu. Kolika je snaga pumpe ako je njen koeficijent korisnog dejstva 80 %?", "3,066 kW", "2,84 kW", "1,38 kW", "0,84 kW", ""));
        fizIN.add(new Pitanje("U vodu mase m1 = 5 kg i temperature t1 = 20 ??C doda se m2 = 1 kg vode na temperaturi    t2 = 80 ??C. Kolika je temperatura smjese?", "30 ??C", "44 ??C", "58 ??C", "68 ??C", ""));
        fizIN.add(new Pitanje("Izvjesna koli??ina gasa zauzima zapreminu V1 = 3 litra kod pritiska 1 bar. Koliki je pritisak gasa ako se on sabije na V2 = 500 cm3? Temperatura gasa se ne mijenja", "6 bara", "5 bara", "3 bara", "2 bara", ""));
        fizIN.add(new Pitanje("Koliko ima molekula u 22,4 litra idealnog gasa na temperaturi od 0 ??C i pritisku 101 325 Pa?", "6,022??10??3", "6,022??10^-34", "6,022??10^-23", "6,022??10?????9", ""));
        fizIN.add(new Pitanje("Dva jednaka pozitivna ta??kasta naboja od 5??C, u vakuumu, nalaze se na rastojanju od 5 dm.  Koliko silom se oni odbijaju?", "900 mN", "90 mN", "0,9 mN", "0,9 kN", ""));
        fizIN.add(new Pitanje("Potencijal naelektrisane metalne lopte je 10 V, a ja??ina elektri??nog polja na njenoj povr??ini 100 N/C. Koliki je polupre??nik metalne lopte?", "10 cm", "0,1 cm", "1 cm", "1 m", ""));
        fizIN.add(new Pitanje("Kapacitet plo??astog kondenzatora iznosi 8,85 nF. Rastojanje izme??u plo??a iznosi 1 mm.  Izme??u plo??a je izolator, ??r = 5. Kolika je povr??ina kondenzatorskih plo??a?", "0,2 m2", "2 m2", "2 dm2", "2 cm2", ""));
        fizIN.add(new Pitanje("Za 4 s kroz provodnik presjeka S = 1,6 mm2 pro??e 4*10^19 elektrona. Kolika je gustina elektri??ne struje?", "I = 1 A/mm2", "I = 1 mA/m2", "I = 1 ??A/mm2", "I = 1kA/m2", ""));
        fizIN.add(new Pitanje("Za koje vrijeme grija?? bojlera snage 2 kW zagrije 50 litara vode od 17 ??C do 37 ??C?(c = 4 186 J/(kg??C))", "34,88 min", "45,13 min", "55,65 min", "65,83 min", ""));
        fizIN.add(new Pitanje("Kolika je magnetna indukcija na rastojanju 2 m od beskona??no dugog pravolinijskog provodnika u vazduhu, kroz kojeg te??e struja ja??ine 1 A?", "0,1 ??T", "1 mT", "0,1 mT", "1 ??T", ""));
        fizIN.add(new Pitanje("U solenoidu (kalemu) se promijeni ja??ina elektri??ne struje za 4 A  za vrijeme 10 ms. Pri tome nastaje ems samoindukcije od 12 V. Koliki je induktivitet solenoida?", "30 mH", "300 mH", "3 mH", "0,3 mH", ""));
        fizIN.add(new Pitanje("Zavojnica induktiviteta 200 mH i termogeni otpornik otpora R = 30?? priklju??eni su redno  u kolo naizmjeni??ne elektri??ne struje frekvencije 50 Hz. Koliko iznosi impedanca?", "69,6 ??", "72,4 ??", "84,7 ??", "101,2 ??", ""));
        fizIN.add(new Pitanje("Kolika je energija fotona ??ija je talasna du??ina 500 nm?", "2,48 eV", "3,98 eV", "6,36 eV", "0,44 eV", ""));
        fizIN.add(new Pitanje("Fotoni imaju energiju 3,0 eV i izbijaju elektrone iz osvijetljenog metala. Elektroni koji napu??taju metalnu povr??inu imaju maksimalnu kineti??ku energiju od 1,0 eV. Kolika je najmanja energija koju moraju imati fotoni da bi izazvali fotoefekat na tom metalu?", "2,0 eV", "1,0 eV", "3,0 eV", "4,0 eV", ""));
        fizIN.add(new Pitanje("Po??etna aktivnost radioaktivnog izvora je 5*10^18 Bq. Za ??etiri godine ona opadne na 2,5*10^18 Bq. Koliki je period poluraspada radioaktivnih elemenata?", "4 godine", "3 godine", "5 godine", "6 godina", ""));
        fizIN.add(new Pitanje("Sto nanometara je", "10?????? m", "10?????? m", "10?????? m", "10????? m", ""));
        fizIN.add(new Pitanje("Pretvoriti 13 m/s u km/h?", "46,8 km/h", "39,6 km/h", "54,3 km/h", "72,6 km/h", ""));
        fizIN.add(new Pitanje("Piljar je izmjerio 7 kg povr??a sa gre??kom 10 g. Kolika je relativna gre??ka mjerenja?", "0,14 %", "0,014 %", "0,0014 %", "1,4 %", ""));
        fizIN.add(new Pitanje("Tijelo se kre??e ravnomjerno ubrzano sa po??etnom brzinom 5 m/s. Nakon 5 s kretanja tijelo dostigne brzinu 15 m/s. Koliki je put tijelo pre??lo za vrijeme kretanja?", "50 m", "40 m", "25 m", "4 m", ""));
        fizIN.add(new Pitanje("Kolikom po??etnom brzinom treba baciti tijelo vertikalno uvis da bi ono palo na povr??inu Zemlje za 7 s?", "34,335 m/s", "29,432 m/s", "24,525 m/s", "19,810 m/s", ""));
        fizIN.add(new Pitanje("Maksimalna brzina je 72 km/h kojom smije u??i automobil u horizontalnu krivinu polupre??nika  80 m. Koliki je koeficijent trenja izme??u podloge i to??kova?", "0,51", "0,31", "0,11", "0,81", ""));
        fizIN.add(new Pitanje("Za vrh zgrade oka??eno je u??e du??ine 25 m. Za u??e je vezana cigla mase 2 kg, koja osciluje. Koliki je period oscilovanja cigle?", "10,02 s", "19,20 s", "28,97 s", "89,67 s", ""));
        fizIN.add(new Pitanje("Na dubini h = 10 m, u vodi, ukupni pritisak iznosi p = 1,99425 bara. Koliko bara iznosi  atmosferski pritisak?", "1,01325", "10,1325", "101,325", "0,101325", ""));
        fizIN.add(new Pitanje("Na stolu, visine H = 0,9 m, nalazi se posuda sa vodom. Na dnu posude, sa bo??ne strane, nalazi se otvor kroz koji isti??e mlaz vode u horizontalnom pravcu i pada na udaljenosti x = 1m od stola. Kolika je visina h vodenog stuba u posudi?", "27,8 cm", "54,3 cm", "187,3 cm", "21,5 cm", ""));
        fizIN.add(new Pitanje("Kolikom brzinom se kre??e automobil, mase 1,8 tona, ako ima istu kineti??ku energiju kao i projektil mase 18 kg,  koji se kre??e brzinom 500 m/s?", "180 km/h", "200 km/h", "150 km/h", "120 km/h", ""));
        fizIN.add(new Pitanje("Avion, mase 60 tona, uzleti brzinom 360 km/h na kraju horizontalne piste, du??ine 3 km. Kretanje aviona je jednakoubrzano. Kolika je snaga avionskog motora?", "5 MW", "5 kW", "10 MW", "15 MW", ""));
        fizIN.add(new Pitanje("Vagon mase m1 = 50 tona kre??e se brzinom v1=3 m/s po horizontalnoj pruzi. On stigne drugi vagon mase m2 = 30 tone,  koji se kre??e brzinom v2 = 1 m/s i udari u njega. Nakon sudara nastavljaju da se kre??u zajedno. Kolika je zajedni??ka brzina vagona nakon sudara?", "2,25 m/s", "2,50 m/s", "2,15 m/s", "1,15 m/s", ""));
        fizIN.add(new Pitanje("Koliki je pritisak 5 molova idealnog gasa u posudi, zapremine 5 dm3, na temperaturi od 227 ??C?", "4,155 MPa", "3,155 MPa", "2,155kPa", "1,155 Pa", ""));
        fizIN.add(new Pitanje("Stepen korisnog djelovanja toplotne ma??ine je 0,3. Temperatura hladnog rezervoara je 7??C. Kolika je temperatura toplog rezervoara?", "127 ??C", "139 ??C", "153 ??C", "400 ??C", ""));
        fizIN.add(new Pitanje("Ta??kasti naboj od q1 = + 8 mC i q2 = + 3??C me??usobno su udaljeni 30 cm u vazduhu. Odrediti elektrostati??ku silu izme??u naboja q1 i q2.", "2,4 kN", "24 kN", "240 N", "24 N", ""));
        fizIN.add(new Pitanje("Naelektrisana kapljica ulja, mase 1mg, miruje u homogenom elektri??nom polju ja??ine 98,1 N/C. Koliki je naboj  naelektrisane kapljice?", "0,1 ??C", "1 ??C", "10 ??C", "100 ??C", ""));
        fizIN.add(new Pitanje("Koliki rad izvr??i sila elektri??nog polja naboja q1 = + 5 mC pri premje??tanju naboja q2 = + 5??C sa rastojanja  r1 = 25 cm na rastojanje r2 = 50 cm?", "450 J", "350 J", "135 J", "135 mJ", ""));
        fizIN.add(new Pitanje("Na krajeve provodnika od volframa, specifi??nog elektri??nog otpora p = 53 n??m, pre??nika 0,8 mm i du??ine 50  m, uspostavi se razlika potencijala od 12 V. Kolika ja??ina elektri??ne struje ide kroz provodnik?", "2,275 A", "227,5 mA", "22,75 A", "227,5 A", ""));
        fizIN.add(new Pitanje("Elektromotor ima korisnu snagu Pk = 3,5 kW i priklju??en je napon od 220 V. Stepen korisnog dejstva motora je 70%. Kolika ja??ina elektri??ne struje ide kroz elektromotor?", "22,73 A", "227,27 A", "2,27 A", "227 mA", ""));
        fizIN.add(new Pitanje("Kolika je ja??ina magnetnog polja u kome se kre??e elektron po kru??nici, polupre??nika r = 10 cm, brzinom v = 1,6*10??? m/s, okomito na pravac silnica magnetnog polja ?", "72,45 A/m", "679 A/m", "7,79 A/m", "724,5 mA/m", ""));
        fizIN.add(new Pitanje("U solenoidu, koji ima 500 namotaja, magnetni fluks iznosi 1 mWb. Za koliko vremena treba da nestane taj fluks, da bi se u solenoidu indukovala elektromotorna sila od 5 V?", "0,1 ms", "10 s", "1 s", "0,01 s", ""));
        fizIN.add(new Pitanje("Kada se u kolo naizmjeni??ne elektri??ne struje priklju??i kalem induktiviteta 2 mH njegov otpor iznosi 12,56 ??. Kolika je frekvencija naizmjeni??ne elektri??ne struje?", "1 kHz", "500 Hz", "100 Hz", "50 Hz", ""));
        fizIN.add(new Pitanje("Kolika je energija fotona ??ija je talasna du??ina 500 nm?", "2,48  eV", "1,96 eV", "13,62  eV", "20,7  eV", ""));
        fizIN.add(new Pitanje("Na povr??inu te??nosti, iz vazduha, pada svjetlost pod uglom od 50?? i prelama se  pod uglom od 30??. Kolika je brzina svjetlosti u te??nosti?", "195 811 km/s", "1 958 km/s", "195,8 km/s", "1958 km/h", ""));
        fizIN.add(new Pitanje("Aktivnost radioaktivnog ugljika C u svakom ??ivom organizmu iznosi 250 Bq/kg. Koliko godina je star predmet, ??ija je aktivnost 50 Bq/kg? T = 5 600 godina", "13 005", "130", "1 300", "1 300 556", ""));
        return fizIN;
    }

    private ArrayList<Pitanje> getFilIZB() {
        ArrayList<Pitanje> Philosophy = new ArrayList<>();
        Philosophy.add(new Pitanje("Osnovna metoda koju Bejkn zagovara u svom u??enju je metoda:", "Indukcije", "analize", "sinteze", "dedukcije", ""));
        Philosophy.add(new Pitanje("Svrha Bejknovog u??enja o idolima je", "Osloba??anje od idola", "imenovanje idola", "Pronala??enje idola", "dedukcija idola", ""));
        Philosophy.add(new Pitanje("Koji idol(zablude, predrasude) po Bekonovoj teoriji ne pripada ovom nizu?", "idoli zavjere", "idoli plemen", "idoli spilje", "idoli trga", ""));
        Philosophy.add(new Pitanje("Dr??ava je stvar ugovora ljudi, druu??tvenog ugovora o ure??enju odnosa me??u ljudima a ne Boga ili drugih sila, smatrao je:", "Tomas Hobs", "Rene Dekart", "Dejvid Hjum", "D??ord?? Berkli", ""));
        Philosophy.add(new Pitanje("Tri stupnja spoznaje u Lokovoj filozofiji su", "senzitivna, demonstrativna i intuitivna", "idealna, prakti??na i afektivna", "??ulna, razumska i umna", "osjetilna, psihi??ka i mentalna", ""));
        Philosophy.add(new Pitanje("Lokov liberalizam polazi od stava", "da se svi ljudi ra??aju jednaki i slobodni", "da svi ljudi nisu po ro??enju jednaki u pitanju prava i sloboda", "temelj ljudskog djelovanja su dru??tveni odnosi", "temelj ljudskih odnosa su privilegije koje dolaze ro??enjem", ""));
        Philosophy.add(new Pitanje("Osniva?? liberalizma i jedan od prvih zastupnika vjerske tolerancije je", "D??on Lok", "Rene Dekart", "Tomas Hobs", "Dejvid Hjum", ""));
        Philosophy.add(new Pitanje("Za osjetilne stvari, postojati zna??i biti percipiran stav je filozofa", "D??. Berklija", "T. Hobsa", "D??. Loka", "D. Hjuma", ""));
        Philosophy.add(new Pitanje("Koje je osnovno na??elo zaklju??aka o ??injenicama vanjskog svijeta prema Hjumu", "kauzalitet", "mehanicizam", "interakcija", "dedukcija", ""));
        Philosophy.add(new Pitanje("Hjumov kona??ni spoznajno-teorijski stav je stav da nije mogu??a objektivna spoznaja a priori. Kako se to stajali??te naziva?", "empirizam", "skepticizam", "agnosticizam", "racionalizam", ""));
        Philosophy.add(new Pitanje("Kojem filozofu se pripisuje da je bio duhovni vo??a prosvetiteljstva?", "Volteru", "Rusou", "Holbahu", "Robespijeru", ""));
        Philosophy.add(new Pitanje("Kada je Volter pokliknuo 'Uni??tite bestidnicu' na koga je on tada mislio?", "Na crkvu", "na vlast", "na dr??avu", "na politiku", ""));
        Philosophy.add(new Pitanje("Izvorno zna??enje rije??i filozofija odre??uje filozofiju kao:", "istra??ivanje-traganje za smislom", "vjerovanje", "mudrovanje", "meditaciju", ""));
        Philosophy.add(new Pitanje("Izvorno zna??enjne rije??i filozofija je", "ljubav spram mudrosti", "nauka", "mudrost", "istra??ivanje", ""));
        Philosophy.add(new Pitanje("Teorijskim filozofskim disciplinama pripada:", "ontologija", "etika", "estetika", "filozofija politike", ""));
        Philosophy.add(new Pitanje("Idealizam se dijeli na", "subjektivni i objektivni", "primarni i sekundarni", "Platonov i Hegelov", "skepticizam i dogmatizam", ""));
        Philosophy.add(new Pitanje("Pitanjima o porijeklu na??ih spoznaja bavi se gnoseolo??ka koncepcija", "empirizam", "skepticizam", "materijalizam", "dogmatizam", ""));
        Philosophy.add(new Pitanje("Etika se bavi problemima", "morala", "lijepog u umjetnosti", "bitka bi??a", "postojanja", ""));
        Philosophy.add(new Pitanje("Ocem gr??ke filozofije se smatra", "Tales", "Aristotel", "Sokrat", "Heraklit", ""));
        Philosophy.add(new Pitanje("??etiri su temeljna principa bi??a, voda, vatra zrak i zemlja, tvrdio je", "Empedokle", "Tales", "Anaksagora", "Anaksimandar", ""));
        Philosophy.add(new Pitanje("Neki od temeljnih izvora filozofije su", "??udjenje, potresenost, sumnje", "vjera", "razmi??ljanje", "idealizam, naturalizam", ""));
        Philosophy.add(new Pitanje("Koja od navedenih filozofskih disciplina pripada teorijskim filozofskim disciplinama?", "ontologija", "etika", "estetika", "filozofija politike", ""));
        Philosophy.add(new Pitanje("Poeti??kim filozofskim disciplinama pripada:", "estetika", "etika", "filozofija politike", "gnoseologija", ""));
        Philosophy.add(new Pitanje("Ontologija ili op??a metafizika je", "u??enje o bitku bi??a", "spoznajna teorija", "u??enje o porijeklu izvijesnosti i dosegu ljudske spoznaje", "filozofija umjetnosti", ""));
        Philosophy.add(new Pitanje("Materijalizam je koncepcija", "ontologije", "etike", "gnoseologije", "estetike", ""));
        Philosophy.add(new Pitanje("Materijalizam u??i da je:", "materija primarna a svijest, ideja, duh su sekundarni, izvedeni", "materija duhovnog porijekla", "ideja primarna a materija izvedena, sekundarna", "bitak bi??a jedinstven u svojoj osnovi", ""));
        Philosophy.add(new Pitanje("D??on Lok je utemeljio", "spoznajnu teoriju (gnoseologiju)", "novovijekovnu filozofiju", "etiku", "ontologiju", ""));
        Philosophy.add(new Pitanje("D??on Lok je svoj zadatak odredio namjerom da istra??i:", "porijeklo, izvijesnost i doseg ljudske spoznaje", "zablude (idole) ukorijenjene u ljudskom razumu", "osnovu sveg ??to jeste", "solipsizam", ""));
        Philosophy.add(new Pitanje("Pitanjima o porijeklu na??ih spoznaja bavi se gnoseolo??ka koncepcija", "empirizam", "skepticizam", "materijalizam", "dogmatizam", ""));
        Philosophy.add(new Pitanje("Empirizam u??i da je", "iskustvo izvor svih na??ih znanja", "bezumna volja iznad razuma", "sumnja put do istine", "razum izvor svih na??ih znanja", ""));
        Philosophy.add(new Pitanje("Racionalizam u??i da", "do bitnih spoznaja dolazim umovanjem, ??istim mi??ljenjem", "je iskustvo izvor svih na??ih znanja", "je racio (razum) bitak bi??a", "umovanje za svoj predmet ima svijet ideja", ""));
        Philosophy.add(new Pitanje("??kola Kozmolo??kog razdoblja gr??ke filozofije je", "Elejska", "Stoi??ka", "Skepti??ka", "Kini??ka", ""));
        Philosophy.add(new Pitanje("Kao praelement, osnovu svega ??to jest, bitak bi??a, predstavnik Miletske ??kole Tales je odredio:", "voda", "vazduh", "apeiron", "vatra", ""));
        Philosophy.add(new Pitanje("Pitagorejci su odredili bitak bi??a kao", "broj", "neprekidnu promjenu", "pratvar", "vatru", ""));
        Philosophy.add(new Pitanje("Kojem filozofu se mo??e pripisati slijede??i citat?\n???Svijet, ovaj isti za sva bi??a, nije stvorio nikakav Bog i nikakav ??ovjek, nego je uvijek bio, jeste i bit ??e vje??no ??iva vatra koja se s mjerom pali i s mjerom gasi\".", "Heraklitu", "Hesiodu", "Hermodoru", "Empedoklu", ""));
        Philosophy.add(new Pitanje("Koje u??enje povezuje Heraklita, Platona i Hegela?", "dijalektika", "materijalizam", "kozmologija", "idealizam", ""));
        Philosophy.add(new Pitanje("Demokrit je predstavnik", "atomista", "apologeta", "Elejaca", "skepti??ke ??kole", ""));
        Philosophy.add(new Pitanje("Demokritovo filozofsko u??enje se karakteri??e kao", "materijalizam", "spiritualizam", "idealizam", "objektivni idealizam", ""));
        Philosophy.add(new Pitanje("Jedan od navedenih odgovora je ta??an. Prepoznajte koji?", "Agnosticizam je odricanje spoznaji sposobnosti da spozna svijet", "Agnosticizam je priznavanje spoznaji sposobnosti da spozna svijet", "Agnosticizam je i priznavanje i odricanje spoznaji sposobnosti da spozna svijet", "Agnosticizam je sposobnost spoznaje a priori", ""));
        Philosophy.add(new Pitanje("Filozof koji je izvr??io sintezu cjelokupnog znanstvenog iskustva gr??ke civilizacije, nakon kojeg otpo??inje proces osamostaljivanja samostalnih znanstvenih podru??ja kao podru??ja samostalnih traganja, naziva se:", "Aristotel", "Tales", "Platon", "Protagora", ""));
        Philosophy.add(new Pitanje("Filozofija na Zapadu po??inje", "u sedmom i ??estom vijeku p.n.", "u ??estom i sedmom vijeku vijeku n.e.", "u antropolo??kom periodu gr??ke filozofije", "u periodu srednjeg vijeka", ""));
        return Philosophy;

    }

}
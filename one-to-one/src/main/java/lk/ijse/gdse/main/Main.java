package lk.ijse.gdse.main;

import lk.ijse.gdse.main.config.FactoryConfiguration;
import org.hibernate.Session;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Session session = FactoryConfiguration.getInstance().getSession();
        session.close();


    }
}

/*
one kiyn ekkena hama welema eha paththe table eken foreign key ekak gnwa
map by karapu gaman ek paththaka foreign key ekaka ain wenwa


one to many ekedit one patte foreign key eka many patte hadanawa

many to many waladi mada aluth table ekak hadenwa.depattem primary key mada table ekt dagannwa
many kiyna kena gawunot eha patte table ek wenuwen madden table ekak hadanawa

eha patte table eket foreign key gahagnwa  mada ekt amatharawa

table wala hadena anawashya dewal ain karanne map by eken

<easy way>
one to many ekak hambunama one patte idan map by ekak ghnna one
one to one ekedi foreign key ek thiygnn on nathi patte  map by ekak ghnwa
many to many ekedi depatten ek paththak thoragena anika mapped by karanwa

many many ekedi mada aluth table ekak hadena nis mada aluth table dekak hadenwa
anith table ekatat foreign key arn ynwa (table 2ma)
mada tabe 2n ekak thoragena ekak mapped by karanawa


associate ekakata thiyenna puluwan foreignkeys 2 withri
associate ekakata custom fields add karagnn one nam relationship ek thawa duratat many to many thiygnn ba
ethokta relationship eka dekata kadann one
depatta one karala associate table ek many karagnwa

*/


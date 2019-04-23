package com.example.teste1.repository

import com.example.teste1.model.Movie
import com.example.teste1.util.DateUtil
import java.util.*

object MoviesRepository {

    val moviesList = ArrayList<Movie>()

    init {
        moviesList.add(
            Movie(
                id = 1L,
                name = "K19",
                releaseDate = DateUtil.convertToDate(year = 2002, month = 1, day = 12),
                overview = "Inspirado em fatos reais, em 1961 a União Soviética lança o seu primeiro " +
                        "submarino nuclear com mísseis balísticos, o submarino K-19, apelidado de fazedor de viúvas, " +
                        "devido as mortes ocorridas durante sua construção apressada. \n" +
                        "Sob o comando de Vostrikov e seu imediato Polenin, tem a missão de testar o submarino. " +
                        "Após o lançamento com sucesso do primeiro míssil teste, recebem a missão de se posicionar " +
                        "entre Nova Iorque e Washington, D.C.. \n" +
                        "No trajeto surge um problema no reator nuclear da embarcação, que é resfriado com água do " +
                        "lastro. As falhas graves de construção se revelam como a falta de roupa de proteção para radiação, " +
                        "defeito no rádio, assim como a contestação da autoridade de Vostrikov por Polinin. Mesmo evitando " +
                        "a explosão termonuclear, os membros da tribulação são julgados pelas autoridades soviéticas porém " +
                        "absolvidos. Os homens que consertaram o reator morreram por envenenamento radioativo logo depois e" +
                        " vários outros nos anos seguintes, totalizando 28."
            )
        )
        moviesList.add(
            Movie(
                id = 2L,
                name = "A Lagoa Azul",
                releaseDate = DateUtil.convertToDate(year = 2002, month = 1, day = 12),
                overview = " Lagoa Azul (do original em Inglês The Blue Lagoon) é um filme norte-americano de " +
                        "aventura e drama romântico lançado em 1980 dirigido por Randal Kleiser e distribuído pela " +
                        "Columbia Pictures. O roteiro escrito por Douglas Day Stewart foi baseado no romance The Blue " +
                        "Lagoon de Henry De Vere Stacpoole. O filme possui como protagonistas a atriz Brooke Shields e o " +
                        "ator Christopher Atkins. Sua trilha sonora foi composta por Basil Poledouris e a cinematografia " +
                        "foi realizada por Néstor Almendros. Trata-se um remake de um filme homônimo de 1949. "
            )
        )
        moviesList.add(
            Movie(
                id = 3L,
                name = "O Grande Dragão Branco",
                releaseDate = DateUtil.convertToDate(year = 2002, month = 1, day = 12),
                overview = "É um filme norte-americano de artes marciais de 1988, dirigido por Newt Arnold e " +
                        "estrelado por Jean-Claude Van Damme, Roy Chiao, Donald Gibb e Leah Ayres. O filme é parte " +
                        "ficção e parte com base em alegações feitas pelo artista marcial Frank Dux.[3][4][5] Ele vendeu " +
                        "bem na bilheteria, arrecadando \$11,806,119 internamente com um orçamento de \$1,500,000. " +
                        "Bloodsport era um dos primeiros filmes estrelados por Van Damme e mostrou suas habilidades " +
                        "atléticas. Ele realiza inúmeras proezas físicas, tais como estilo de helicóptero, salto com " +
                        "chutes giratórios, e uma completa espacate. "
            )
        )
        moviesList.add(
            Movie(
                id = 4L,
                name = "Coração de Dragão",
                releaseDate = DateUtil.convertToDate(year = 2002, month = 1, day = 12),
                overview = "Dragonheart (br/pt: Coração de Dragão) é um filme estadunidense de 1996, dos gêneros aventura " +
                        "e fantasia, dirigido por Rob Cohen. O roteiro foi escrito por Charles Edward Pogue, baseado" +
                        " em história sua e de Patrick Read Johnson. Foi distribuído pela Universal Pictures. \n" +
                        "O filme utiliza de avançadas técnicas de animação 3D em um visual realista e mistura com " +
                        "atores e cenários reais. O dragão Draco foi o primeiro personagem inteiramente computadorizado " +
                        "que conversa com outros personagens interpretados por atores de carne e osso. Os efeitos " +
                        "especiais ficaram a cargo de Perpetual Motion Pictures, Illusion Arts Inc., Industrial " +
                        "Light & Magic e Tippett Studio. "
            )
        )
        moviesList.add(
            Movie(
                id = 5L,
                name = "Professor Aloprado II",
                releaseDate = DateUtil.convertToDate(year = 2002, month = 1, day = 12),
                overview = "Nutty Professor II: The Klumps (O Professor Chanfrado 2POR ou O " +
                        "Professor Aloprado 2 - A família Klump BRA ) é um filme estadunidense do gênero " +
                        "comédia romântica e ficção científica, dirigido por Peter Segal e estrelado por Eddie " +
                        "Murphy e Janet Jackson. Diferente do primeiro filme, este dá um destaque maior as tramas " +
                        "da louca família do Professor Sherman, Os Klumps. \n" +
                        "O filme foi parodiado pelo comediante Jack Black no filme Tropic Thunder, em que o personagem " +
                        "de Black, Jeff Portnoy, interpreta vários membros de uma família comicamente obesa. Tropic " +
                        "Thunder foi lançado pela Paramount Pictures, que lançou a versão original do filme, com Jerry" +
                        " Lewis, em 1963. Tropic Thunder foi dirigido e estrelado por Ben Stiller, que mais tarde," +
                        " contracenou com Eddie Murphy em Tower Heist de 2011. "
            )
        )
    }

}
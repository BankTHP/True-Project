package com.example.last_mini_project.data


import android.util.Log
import android.util.Log.DEBUG
import com.example.last_mini_project.BuildConfig.DEBUG
import com.example.last_mini_project.R
import java.lang.Math.random
import java.util.*
import java.util.concurrent.ThreadLocalRandom

var movieList = mutableListOf<Movie>()
val MOVIE_EXTRA_ID = "MOVIE_EXTRA_ID"

class Movie(
    var cover: Int,
    var moviename: String,
    var genres: String,
    var description: String,
    val id: Int = movieList.size
)

fun addMovies() {

    val random = Random()

    val coverImage = arrayListOf(
        R.drawable.batman,
        R.drawable.batman_beyond,
        R.drawable.thebatman,
        R.drawable.batmanofshanghai,
        R.drawable.bewarethebatman,
        R.drawable.batmantheanimatedseries,
        R.drawable.thenewbatmanadventures,
        R.drawable.theflash,
        R.drawable.theflashchroniclesofcisco,
        R.drawable.theboys
    )
    val movieName = arrayListOf(
        "Batman",
        "Batman Beyond",
        "The Batman",
        "Batman of Shanghai",
        "Beware the Batman",
        "Batman: The Animated Series",
        "The New Batman Adventures",
        "The Flash",
        "The Flash: Chronicles of Cisco",
        "The Boys"

    )
    val genres = arrayListOf(
        "Action",
        "Science-Fiction",
        "Animation"
    )
    val description = arrayListOf(
        "Wealthy entrepreneur Bruce Wayne and his ward Dick Grayson lead a double life: they are actually crime fighting duo Batman and Robin. " +
                "A secret Batpole in the Wayne mansion leads to the Batcave, where Police Commissioner Gordon often calls with the latest emergency " +
                "threatening Gotham City. Racing to the scene of the crime in the Batmobile, " +
                "Batman and Robin must (with the help of their trusty Bat-utility-belt) thwart the efforts of a variety of master criminals, including Catwoman, Egghead, " +
                "The Joker, King Tut, The Penguin, and The Riddler",
        "Batman Beyond tells the story of Terry McGinnis was just an ordinary teenager...until his father was mysteriously murdered. Suspecting foul play at his father's company Wayne/Powers Corporation, " +
                "Terry meets Bruce Wayne and learns a secret identity hidden for decades. Now too old to battle injustice, " +
                "Wayne is a bitter shell of his former self and refuses to help. So Terry does what any brash young kid would do: " +
                "steal the Batsuit and take matters into his own hands! Vowing to avenge his father's death, Terry dons the high-tech suit - tricked out with jetpacks for flying, a supersensitive microphone " +
                "for eavesdropping and even camouflage capabilities - in search of his father's assassin.",
        "Hidden in the shadows, The Batman casts a protective eye while tracking the thugs, thieves and criminal masterminds that claim Gotham City's dark alleys each night. In one magnificent swoop, " +
                "he descends up on opponents and battles with a fierceness that seems almost inhuman. This is the young Bruce Wayne who assumes the role of Gotham's greatest defender in a fresh retelling of the Dark Knight's beginnings. " +
                "incredible gadgets, awesome animation and a cool new vibe, these 13 exciting episodes from the hit series showcase The Batman taking on your favourite villains – The Joker, The Penguin, Mr. Freeze, Catwoman, " +
                "Bane – and new crazies you'll love to hate!",
        "Batman of Shanghai is a series of animated shorts from the DC Nation block on Cartoon Network, presenting a unique re-imagining of the Batman universe in a heavily stylized form, set in a 1930's era Shanghai. " +
                "The shorts were animated by Wolf Smoke Studios.",
        "Beware the Batman! Gotham's vigilante hero is back in an action-packed animated series. Batman has a whole new rogue's gallery of villains to face, but he can't do it alone. " +
                "Aiding Batman in his fight against crime are retired MI-6 operative Alfred Pennyworth and former CIA agent Tatsu Katana Yamashiro.The show premiered on Cartoon Network in 2013, however due to declining ratings, " +
                "it was moved to the Toonami block of Adult Swim in 2014 to air the rest of the episodes.",
        "Experience the thrills of vigilante justice as millionaire playboy Bruce Wayne and alter-ego Batman protect the streets of Gotham City from a host of villains including archnemesis The Joker, " +
                "deadly-beautiful Poison Ivy and primitive Killer Croc in a fresh take on super hero storytelling. Intelligent, dramatic stories, " +
                "unique characters and sharp dialog shaped this edgy TV series into an Emmy®-winning powerhouse that brought the Caped Crusader out of the dark alleys of TV history and into the present for fans of all ages.",
        "The New Batman Adventures</b> comes from the creators of Batman and Superman. This series was created because Fox had not lived up to the contract that they had given Batman, " +
                "so the WB decided to give the show another chance. Bruce Timm then went back and decided to re-design all of the characters from Batman and ended up revamping the series all-together.",
        "After a particle accelerator causes a freak storm, CSI Investigator Barry Allen is struck by lightning and falls into a coma. Months later he awakens with the power of super speed, \" +\n" +
                " granting him the ability to move through Central City like an unseen guardian angel. Though initially excited by his newfound powers, Barry is shocked to discover he is not the only meta-human" +
                "who was created in the wake of the accelerator explosion -- and not everyone is using their new powers for good. Barry partners with S.T.A.R. Labs and dedicates his life to protect the innocent. For now, only a few close friends \" +\n" +
                "and associates know that Barry is literally the fastest man alive, but it won't be long before the world learns what Barry Allen has become...The Flash!\"",
        "he Flash: Chronicles of Cisco follows \"The Flash\" character Cisco Ramon as he works late at S.T.A.R. Labs making improvements to the Flash's suit.",
        "In a world where superheroes embrace the darker side of their massive celebrity and fame, The Boys centres on a group of vigilantes known informally as " +
                "\\\"The Boys,\\\" who set out to take down corrupt superheroes with no more than blue collar grit and a willingness to fight dirty.\n" +
                "\n"
    )
    repeat(movieName.size){
        val movie = Movie(
            coverImage[random.nextInt(coverImage.size)],
            movieName[random.nextInt(movieName.size)],
            genres[random.nextInt(genres.size)],
            description[random.nextInt(description.size)]
        )
        movieList.add(movie)
    }
}

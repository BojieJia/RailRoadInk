# Assignment Two Feedback

## Group  tue09k
## Group members: "u6359121","Tang","Chenxuan","","u6730978","Jia","Bojie","","u6698981","Phillips","Harriet"

## Tutor Comment

Hi Bojie and Harriet - thank you for submitting a wonderful 
and "finished" feeling assignment. I can tell you have put a lot
of work into this assignment in the last few weeks to get it working
to a nice standard. Your rules and splashscreen are a welcome addition
to the requirements and were a pleasant surprise. Your integration of the 
AI was good - however I did find the AI prone to making invalid placements. 
This might be an issue of our tests as much as your code. I also noticed 
that the AI gets different pieces - it is intended that both players play from 
the same dice roll each turn. I would also have liked a little more visual feedback 
from the GUI, though I understand the time constraints - something like an indicator 
suggesting that there are no more valid moves for the turn. You commented the code
excellently throughout - keep this up. The design could have been improved - for example
the single and multi player gui classes share a lot of code and concepts - this is the perfect
opportunity to make use of OO to remove repetition - you could have both extend some base GUI class
which provides methods, or you could have multiplayer completely integrated into the same class. 
In general, more time taken at the beginning of the assignment to generate a good overall
design would have been of benefit - thinking about including heirarchical OO design concepts
to create an intuitive and workable class structure which assists with the final difficult tasks. 
Regardless, I am very proud of your achievements in this assignment - thank you for being
engaged and hard working students during our labs and in this assignment. 
-- Peter.


## Mark

**9.25/11.0**

## Miscellaneous marks

| Level | Requirement | Result |
|:-:|---|:-:|
||All files correct                     | .25/.25 |
||Authorship clear for all classes      | .25/.25 |
||Appropriate use of Git                | .5/.5  |
||Program runs from JAR                 | .25/.25 |
|P|Appropriate use of OO features       | .25/.5  |
|P|Presentation PDF complete            | .5/.5  |
|CR|Program well designed               | .25/.5  |
|CR|Comments clear and sufficient       | .5/.5  |
|CR|Coding style good                   | .25/.25 |
|CR|Appropriate use of JUnit tests      | .5/.5  |
|D|Design and code of very high quality | .15/.25 |
|D|Demonstrates interesting extensions  | .15/.25 |
|D|Works well and easy to run           | .25/.25 |
|HD|Game is exceptional                 | 0/.5  |

**Total for miscellaneous marks:**  4.05/5.25

## Game marks (manual)

| Level | Requirement | Result |
|:-:|---|:-:|
|CR|Tiles snap into place            | .25/.25 |
|CR|Tiles can be rotated and flipped | .25/.25 |
|CR|Only valid placements allowed    | .25/.25 |
|CR|Basic score at game end          | .25/.25 |
|D |Basic computer opponent          | .25/.25 |
|HD|Advanced computer opponent       | 0/.5  |

**Total for manual marks:** 1.25/1.75

## Test results

| Task | Test | Result | Marks |
|:-:|---|:-:|:-:|
| |Compiled|.25/.25|.25|
|2|IsTilePlacementWellFormed|3/3|.5|
|3|IsBoardStringWellFormed|6/6|.5|
|5|AreConnectedNeighbours|5/5|.5|
|6|IsValidPlacementSequence|5/5|.5|
|7|GenerateDiceRoll|4/4|.25|
|8|GetBasicScore|3/4|.375|
|10|GenerateMove|5/5|.5|
|12|GetAdvancedScore|1/2|.250|

**Total for tests:** 3.62/4.0

## Originality statements

#### Originality statement G
We declare that the work we have submitted for Stage G of this assignment and all stages before it is entirely our own work, with the following documented exceptions:

How to launch an application from another application
https://stackoverflow.com/questions/25873769/launch-javafx-application-from-another-class
https://stackoverflow.com/questions/40265810/how-to-exit-primarystage-while-opening-a-new-stage-in-javafx

Title screen image from:
https://boardgamegeek.com/image/4465753/railroad-ink-deep-blue-edition

Signed: Harriet Phillips (u6698981)
        Bojie Jia (u6730978)

#### Originality statement F
We declare that the work we have submitted for Stage F of this assignment and all stages before it is entirely our own work, with the following documented exceptions:

The implementation of the drag feature was adapted from
<http://java-buddy.blogspot.com/2013/07/javafx-drag-and-move-something.html>

Signed: Harriet Phillips (u6698981)
        Bojie Jia(u6730978)

#### Originality statements E
I declare that the work I have submitted for Stage E of this assignment and all stages before it is entirely my own work, with the
following documented exceptions:

* The idea of <...> came from a discussion with <...>

* The code in class <...> uses an idea suggested by <...>

Signed: Mary Jones (u23445678)
I declare that the work I have submitted for Stage E of this assignment and all stages before it is entirely my own work, with the
following documented exceptions:

Signed: Harriet Phillips (u6698981)

I declare that the work I have submitted for Stage E of this assignment and all stages before it is entirely my own work, with the
following documented exceptions:

* The idea of <task6&task8> came from a discussion with <Si Xu(u6714758)>



Signed: Bojie Jia (u6730978)

#### Originality statements D
I declare that the work I have submitted for Stage D of this assignment and all stages before it is entirely my own work, with the following documented exceptions:

* The idea of <...> came from a discussion with <...>

* The code in class <...> uses an idea suggested by <...>

Signed: Mary Jones (u23445678)
I declare that the work I have submitted for Stage D of this assignment and all stages before it is entirely my own work, with the following documented exceptions:

Signed: Harriet Phillips (u6698981)
I declare that the work I have submitted for Stage D of this assignment and all stages before it is entirely my own work, with the following documented exceptions:



Signed: Bojie Jia (u6730978)

#### Originality statement C
We declare that the work we have submitted for Stage C of this assignment and all stages before it is entirely our own work, with the following documented exceptions:

The idea for how to load in an image (in viewer) came from:
https://stackoverflow.com/questions/37111582/simplest-way-to-add-an-image-in-javafx

The code for flipping a piece image (in viewer) came from:
https://stackoverflow.com/questions/28087776/mirror-effect-in-javafx

The idea for how to rotating a piece image (in viewer) came from:
https://stackoverflow.com/questions/40059836/rotating-image-in-javafx

Converting int to char (in dice roll):
https://www.javatpoint.com/java-int-to-char

Checking if an enum contains a certain value (used to find the features of each piece in task 5):
https://stackoverflow.com/questions/4936819/java-check-if-enum-contains-a-given-string/37240149

Signed: Harriet Phillips (u6698981)
        Bojie Jia(u6730978)

#### Originality statement B
We declare that the work we have submitted for Stage B of this assignment and all stages before it is entirely our own work, with the following documented exceptions:

Signed: Harriet Phillips (u6698981)
        Bojie Jia (u6730978)
        Chenxuan Tang (u6359121)
## Git Log
```
commit 1bfacd8133f478480bf249432106c8d838dc46b7
Author: jay <u6730978@anu.edu.au>
Date:   Thu May 23 23:11:34 2019 +1000

    add some tests

commit 75e4fc4e299db651f0b06270c4f3cecd7a51309f
Merge: 91c082e 4d92210
Author: jay <u6730978@anu.edu.au>
Date:   Thu May 23 22:18:52 2019 +1000

    Merge branch 'master' of https://gitlab.cecs.anu.edu.au/u6359121/comp1110-ass2-tue09k

commit 91c082e836d3cc6209c87e260eb06b5afab80ce1
Author: jay <u6730978@anu.edu.au>
Date:   Thu May 23 22:18:02 2019 +1000

    Add contribution and originality declaration

commit 4d9221018e3df6b138a81aa2f7f95721b5819033
Author: Harriet Phillips <u6698981@anu.edu.au>
Date:   Thu May 23 20:51:21 2019 +1000

    updated features and best

commit 3d4cc792c138e2f810059f564426ee3755da7a0f
Merge: 5bd8fbe 77f27e1
Author: Harriet Phillips <u6698981@anu.edu.au>
Date:   Thu May 23 20:15:29 2019 +1000

    Merge remote-tracking branch 'origin/master'
    
    # Conflicts:
    #       game.jar

commit 5bd8fbee6a9257ec5eb674e17db7e42a03675883
Author: Harriet Phillips <u6698981@anu.edu.au>
Date:   Thu May 23 20:14:45 2019 +1000

    added presentation.pdf and some comments

commit 77f27e103f63b2c206015e20b8c6aa8899bd34fe
Author: jay <u6730978@anu.edu.au>
Date:   Thu May 23 00:44:39 2019 +1000

    Add some comments

commit 59b8687a9ba2343c5240d22f3720f7707e7434ef
Author: Harriet Phillips <u6698981@anu.edu.au>
Date:   Wed May 22 21:09:30 2019 +1000

    fixed railroad ink

commit a46061371287b6035a20aca6e223f0043cce1778
Author: Harriet Phillips <u6698981@anu.edu.au>
Date:   Wed May 22 21:09:07 2019 +1000

    fixed railroad ink

commit 890228a6eac1a583170298a1ea1f1d21b470ea73
Author: jay <u6730978@anu.edu.au>
Date:   Wed May 22 21:06:22 2019 +1000

    Merge branch 'master' of https://gitlab.cecs.anu.edu.au/u6359121/comp1110-ass2-tue09k
    
    # Conflicts:
    #       src/comp1110/ass2/RailroadInk.java

commit 032fbf25689a0bf776738918bd9c7c510d9aade5
Merge: 521be27 4ac7c2e
Author: jay <u6730978@anu.edu.au>
Date:   Wed May 22 20:56:30 2019 +1000

    Merge branch 'master' of https://gitlab.cecs.anu.edu.au/u6359121/comp1110-ass2-tue09k
    
    # Conflicts:
    #       src/comp1110/ass2/RailroadInk.java

commit 521be27606cf22e810e45d1760d56184c6fb18b0
Author: jay <u6730978@anu.edu.au>
Date:   Wed May 22 20:35:56 2019 +1000

    Task 10 completed

commit 4ac7c2e0b770456fa96cd5399d5cacc2ca154bca
Author: Harriet Phillips <u6698981@anu.edu.au>
Date:   Wed May 22 19:15:24 2019 +1000

    added scores and menu buttons to multiplayer ending

commit 5fbdb727e1d6ddf6feb89ab42c2a126abab872a4
Author: Harriet Phillips <u6698981@anu.edu.au>
Date:   Tue May 21 15:31:20 2019 +1000

    added a rules page

commit 63c178aef4697fc850db8d82497b795ece1dbe2c
Author: Harriet Phillips <u6698981@anu.edu.au>
Date:   Tue May 21 15:27:58 2019 +1000

    added a rules page

commit 40c14d81902bcf93af48230b2ecc1cb8ea63b64d
Author: Harriet Phillips <u6698981@anu.edu.au>
Date:   Tue May 21 12:23:38 2019 +1000

    updated author statements

commit d6e7a66fe8a715d34c4179376a3dd4ed917574a3
Author: Harriet Phillips <u6698981@anu.edu.au>
Date:   Tue May 21 12:20:56 2019 +1000

    fixed so that the game ends when a tile cant be played

commit 6d6da364b76c6bf86714a305d6bf976b33bc3b9d
Merge: b18ebd1 fc47aac
Author: jay <u6730978@anu.edu.au>
Date:   Mon May 20 20:44:08 2019 +1000

    Merge remote-tracking branch 'origin/master'
    
    # Conflicts:
    #       game.jar
    #       src/comp1110/ass2/RailroadInk.java

commit b18ebd136027418184b1a86aa6bdc25a5cc7b85d
Author: jay <u6730978@anu.edu.au>
Date:   Mon May 20 20:38:11 2019 +1000

    Task 10 completed

commit fc47aac1bbc6ffbc4c61bd7ccaf9e58e64f1cd7a
Author: Harriet Phillips <u6698981@anu.edu.au>
Date:   Mon May 20 17:57:48 2019 +1000

    updated tasks

commit a31eb7a8cb74330412a1195cea7e42e83d5c06e9
Author: Harriet Phillips <u6698981@anu.edu.au>
Date:   Mon May 20 17:49:33 2019 +1000

    updated tasks

commit 4f5b33d9438f549e61b6939b65d90e95029ea489
Author: Harriet Phillips <u6698981@anu.edu.au>
Date:   Thu May 16 17:57:54 2019 +1000

    continued working on mulitplayer

commit a883ea9f030de5152c8679a30fe1b63767678be0
Author: Harriet Phillips <u6698981@anu.edu.au>
Date:   Thu May 16 12:32:38 2019 +1000

    continued working on mulitplayer

commit 111234962c013c21f330cf8dfbd594dbdd6b55ee
Author: Harriet Phillips <u6698981@anu.edu.au>
Date:   Thu May 16 12:15:14 2019 +1000

    updated game.jar

commit c66ed594478dd3d6dde13700f00c730388d56a20
Author: Harriet Phillips <u6698981@anu.edu.au>
Date:   Thu May 16 12:04:00 2019 +1000

    updated game.jar

commit 32e35f2d53f142bfaa7ef3865d228987607eaec0
Author: Harriet Phillips <u6698981@anu.edu.au>
Date:   Thu May 16 11:57:45 2019 +1000

    made start screen, continued working on multiplayer

commit d3271a3c18edc22b745803fe6b1265819a5c0891
Author: Harriet Phillips <u6698981@anu.edu.au>
Date:   Thu May 16 11:47:07 2019 +1000

    made start screen, continued working on multiplayer

commit e79675ae4d503bb425b4320e558735a3f6087472
Author: Harriet Phillips <u6698981@anu.edu.au>
Date:   Wed May 15 21:22:37 2019 +1000

    Fixed a bug with rotations and updated originality

commit 5e8b48a671914b32543ec310c71e39ba14659ea1
Author: Harriet Phillips <u6698981@anu.edu.au>
Date:   Wed May 15 20:19:13 2019 +1000

    started work on multiplayer

commit 4132808a19b1aab537ac7f9adba515d6c0c1f722
Author: Harriet Phillips <u6698981@anu.edu.au>
Date:   Tue May 14 09:50:24 2019 +1000

    updated originality

commit cdeb2b0c9d9e98f993abee2d2cae29cf65fccfc6
Merge: b83e562 092115a
Author: jay <u6730978@anu.edu.au>
Date:   Tue May 14 09:46:58 2019 +1000

    Merge branch 'master' of https://gitlab.cecs.anu.edu.au/u6359121/comp1110-ass2-tue09k

commit b83e562eafeac97ff9af489a7a2cca06c94a806f
Author: jay <u6730978@anu.edu.au>
Date:   Tue May 14 09:46:47 2019 +1000

    Task 12 work

commit 092115aeeabf2aaea41d9285af0f79ad286ecccd
Author: Harriet Phillips <u6698981@anu.edu.au>
Date:   Tue May 14 09:39:54 2019 +1000

    fixed

commit 2c711673bb4d6fa0286eddbab34e4e74e631f5ce
Author: jay <u6730978@anu.edu.au>
Date:   Tue May 14 09:39:17 2019 +1000

    Merge branch 'master' of https://gitlab.cecs.anu.edu.au/u6359121/comp1110-ass2-tue09k
    
    # Conflicts:
    #       src/comp1110/ass2/RailroadInk.java

commit 613d3db38ec278c7262afa66716208bd4aa68bcc
Merge: 110b597 e4da4fd
Author: jay <u6730978@anu.edu.au>
Date:   Tue May 14 09:35:39 2019 +1000

    Merge remote-tracking branch 'origin/master'
    
    # Conflicts:
    #       game.jar

commit 110b597d0286928649596c31f86dfc56d6c770ec
Merge: 2132525 f98890e
Author: jay <u6730978@anu.edu.au>
Date:   Tue May 14 09:34:47 2019 +1000

    Merge branch 'master' of https://gitlab.cecs.anu.edu.au/u6359121/comp1110-ass2-tue09k
    
    # Conflicts:
    #       src/comp1110/ass2/RailroadInk.java

commit e4da4fd1582f386141281f19513d6c5cfd426698
Author: Harriet Phillips <u6698981@anu.edu.au>
Date:   Tue May 14 09:16:14 2019 +1000

    push

commit f98890e16682907d539bfc0192ef2faed0b5ab21
Author: Harriet Phillips <u6698981@anu.edu.au>
Date:   Mon May 13 23:13:22 2019 +1000

    fixed the code bojie pushed over

commit 21325250ecf745b2c335055c9975cc8271314e11
Author: jay <u6730978@anu.edu.au>
Date:   Mon May 13 22:55:12 2019 +1000

    task 10 successful

commit 3bc7221a04bc8c86c7297e2c4f8ec097cb898dad
Merge: b959737 d5d160e
Author: jay <u6730978@anu.edu.au>
Date:   Mon May 13 21:38:15 2019 +1000

    Merge remote-tracking branch 'origin/master'
    
    # Conflicts:
    #       src/comp1110/ass2/RailroadInk.java

commit b95973749d012269174b7cd504884a6ef6498e95
Author: jay <u6730978@anu.edu.au>
Date:   Mon May 13 21:29:58 2019 +1000

    task 8 successful

commit d5d160e01a7103c10477c23f733840eb64ffa608
Author: Harriet Phillips <u6698981@anu.edu.au>
Date:   Mon May 13 20:14:31 2019 +1000

    wrote code review for bojie

commit 915aa0b65eccc10467e8dc5be0ca93488340055b
Author: Harriet Phillips <u6698981@anu.edu.au>
Date:   Mon May 13 18:14:27 2019 +1000

    started working on task 4

commit ade73fafe072c6626fdfbe7df2e94ccab850c42d
Author: Harriet Phillips <u6698981@anu.edu.au>
Date:   Mon May 13 18:13:10 2019 +1000

    started working on task 4

commit 601488a781e938ccd92b18e1d14cafaf6a7680e2
Author: Harriet Phillips <u6698981@anu.edu.au>
Date:   Mon May 13 18:05:48 2019 +1000

    started working on task 4

commit 82968a1970c4860f341388fbf25f5ea73a71d302
Author: Harriet Phillips <u6698981@anu.edu.au>
Date:   Mon May 13 13:58:57 2019 +1000

    updated contribution and originality

commit 96ba2d17a8b49fd333ad06aecbfbf5b700fe1190
Author: Harriet Phillips <u6698981@anu.edu.au>
Date:   Sun May 12 18:28:09 2019 +1000

    updated contribution and originality

commit c5108ca18b31155798d6a94a2f2c56efb54a54ca
Author: Harriet Phillips <u6698981@anu.edu.au>
Date:   Sun May 12 18:13:14 2019 +1000

    added S tiles and rotation and flipping for them

commit e598a8fab910cb3656f5adc5d33dda67075b9041
Author: Harriet Phillips <u6698981@anu.edu.au>
Date:   Sun May 12 00:10:39 2019 +1000

    added more to game file and created a game.jar

commit b12f5dc1a7f0c797334f2539d9c6126fd8769b8c
Author: Harriet Phillips <u6698981@anu.edu.au>
Date:   Sun May 12 00:10:14 2019 +1000

    added more to game file and created a game.jar

commit 0dd85462c25e2c369d1f6df7efef481e7b7dc885
Author: Harriet Phillips <u6698981@anu.edu.au>
Date:   Sat May 11 23:04:43 2019 +1000

    added flip buttons and more

commit 916e54dbbaf54958403c8a5dcb9d1aec52c087c5
Author: Harriet Phillips <u6698981@anu.edu.au>
Date:   Sat May 11 19:27:56 2019 +1000

    made it so tiles return to origin if invalid tile placement string

commit f4f9e988e832b78ab6b31f8ef4d0967404f5d365
Author: Harriet Phillips <u6698981@anu.edu.au>
Date:   Fri May 10 19:33:57 2019 +1000

    added some ToDos

commit 96604b0e2fc1c8b699e0d7abe242183bafa50407
Author: Harriet Phillips <u6698981@anu.edu.au>
Date:   Fri May 10 19:31:16 2019 +1000

    worked on rotation

commit 9febc2dabe1e2c5ea6577fafca119e76e15fdcc9
Author: Harriet Phillips <u6698981@anu.edu.au>
Date:   Fri May 10 19:05:04 2019 +1000

    added image rotation and a snap to grid function among more

commit 371464b28cd47f5cd4a6792d03935d80486ca8ad
Author: Harriet Phillips <u6698981@anu.edu.au>
Date:   Thu May 9 21:00:06 2019 +1000

    added more comments to the game code

commit b3652dcd010518f0afcce4a244ee2c0278766dc1
Merge: bd87a5a 5cc4487
Author: Harriet Phillips <u6698981@anu.edu.au>
Date:   Thu May 9 00:36:13 2019 +1000

    Merge branch 'master' of https://gitlab.cecs.anu.edu.au/comp1110/comp1110-ass2

commit 5cc448733278de86218c9944959e10b73d690ea9
Author: Josh Milthorpe <josh.milthorpe@anu.edu.au>
Date:   Thu May 9 00:26:38 2019 +1000

    fix chi-squared test values

commit bd87a5a0a271a359172284c288128b31c1adafd5
Author: Harriet Phillips <u6698981@anu.edu.au>
Date:   Wed May 8 22:45:08 2019 +1000

    added more comments to the game code

commit 86c83d69602eef6f634b4a7c0d99dff75612c9d1
Merge: deb20a4 8363816
Author: jay <u6730978@anu.edu.au>
Date:   Wed May 8 22:08:02 2019 +1000

    Merge branch 'master' of https://gitlab.cecs.anu.edu.au/comp1110/comp1110-ass2

commit 83638167f37ebcc8b4ba7857a67b38c1857f9d47
Author: Josh Milthorpe <josh.milthorpe@anu.edu.au>
Date:   Wed May 8 09:51:54 2019 +1000

    improve GenerateDiceRollTest to be statistically more rigorous
    
    added more tests for invalid placements due to duplicates

commit f6998e646dc7b8d48abb21808d8c2acdf7141aae
Author: Josh Milthorpe <josh.milthorpe@anu.edu.au>
Date:   Wed May 8 08:19:25 2019 +1000

    isValidPlacementSequenceTest: fix and add test for invalid connection
    
    add test for duplicate placements

commit deb20a4b45643f48bbe451cf62f53f50e791c681
Merge: 645a616 3770ddc
Author: Harriet Phillips <u6698981@anu.edu.au>
Date:   Tue May 7 09:06:55 2019 +1000

    Merge remote-tracking branch 'origin/master'

commit 645a616e0bcbee5d4a9feb584ac7d5bdda01ce87
Author: Harriet Phillips <u6698981@anu.edu.au>
Date:   Tue May 7 09:06:48 2019 +1000

    added more comments to the game code

commit 3770ddceb40b5a6532ce35df15cb1c312c62c06f
Author: jay <u6730978@anu.edu.au>
Date:   Tue May 7 01:25:58 2019 +1000

    test in task6

commit f189ec9e81fdc1a36b299ef51e8bf6e75d099fdf
Author: jay <u6730978@anu.edu.au>
Date:   Tue May 7 00:59:47 2019 +1000

    originality

commit 3b904421494257e23fd8dc93d9c52d23374e4507
Author: jay <u6730978@anu.edu.au>
Date:   Tue May 7 00:56:47 2019 +1000

    originality

commit ff132b6b3782b4c8602fd2a23db5ea3b8d91658b
Merge: df530ed 7bf9ec8
Author: jay <u6730978@anu.edu.au>
Date:   Tue May 7 00:49:23 2019 +1000

    Merge remote-tracking branch 'origin/master'

commit df530ed8e79c337805880dbc18bedcba16487ac5
Author: jay <u6730978@anu.edu.au>
Date:   Tue May 7 00:49:14 2019 +1000

    complete task6test

commit 7bf9ec875bbf1dabc587fb50645d7ef5dd783cee
Author: Harriet Phillips <u6698981@anu.edu.au>
Date:   Mon May 6 23:36:28 2019 +1000

    added more comments to the game code

commit 0647cf394f91ee93d328858d196bc4ad458ab616
Author: Harriet Phillips <u6698981@anu.edu.au>
Date:   Mon May 6 22:47:52 2019 +1000

    finished writing basic JUnit tests for StageE

commit 6a1781ac6a0a7d51f56380ff2eba6b8899687540
Author: Harriet Phillips <u6698981@anu.edu.au>
Date:   Mon May 6 21:23:32 2019 +1000

    continued work on JUnit tests

commit 37d88b347bb1702c1094411b5e03788ba26c0a8e
Merge: 26c7984 d2543c6
Author: jay <u6730978@anu.edu.au>
Date:   Mon May 6 20:03:36 2019 +1000

    Merge branch 'master' of https://gitlab.cecs.anu.edu.au/u6359121/comp1110-ass2-tue09k

commit d2543c67877461ac9777ec3afaac554b99e05300
Author: Harriet Phillips <u6698981@anu.edu.au>
Date:   Mon May 6 19:18:50 2019 +1000

    updated tasks folder

commit 19c299e91731597e4ef94a272db9209e5cc08a68
Author: Harriet Phillips <u6698981@anu.edu.au>
Date:   Mon May 6 19:14:19 2019 +1000

    continued making tests for my methods, made improvements to  methods, updated tasks

commit c331a1dae1d55897274af4400ae781cfda4cec84
Author: Harriet Phillips <u6698981@anu.edu.au>
Date:   Mon May 6 16:02:14 2019 +1000

    started making tests for my methods

commit 20f94fc800715ea7183ddbd6f90ebc0fd31459b0
Author: Josh Milthorpe <josh.milthorpe@anu.edu.au>
Date:   Mon May 6 10:50:23 2019 +1000

    remove unused code

commit b953060a4dd8bf37489323395d6cff489c72ced8
Author: Josh Milthorpe <josh.milthorpe@anu.edu.au>
Date:   Mon May 6 10:49:17 2019 +1000

    fix GenerateDiceRollTest.testDieFaces to correctly count dice rolls

commit 2f077784b576f12eb3957e5c1d1b0d0a43695cb3
Author: Harriet Phillips <u6698981@anu.edu.au>
Date:   Mon May 6 09:58:59 2019 +1000

    working on game

commit 0309694719eac0258a30476b2210bbe5bcad8987
Author: Harriet Phillips <u6698981@anu.edu.au>
Date:   Sun May 5 23:35:04 2019 +1000

    working on game

commit 95d6d79192d1a6f8fa024a2343db76a42b228c76
Author: Harriet Phillips <u6698981@anu.edu.au>
Date:   Sun May 5 22:54:49 2019 +1000

    working on game

commit 26c7984a003427a89f69651993b4f84f68a4fe9a
Author: jay <u6730978@anu.edu.au>
Date:   Sun May 5 21:05:48 2019 +1000

    almost complete task8 with several errors need to be fixed

commit c6bb00ed74ce9cbdcf69cbdfb7940784c355c189
Author: Harriet Phillips <u6698981@anu.edu.au>
Date:   Sun May 5 21:00:15 2019 +1000

    working on game

commit c39747d362564d946fd12912151e75ab14f47b85
Author: jay <u6730978@anu.edu.au>
Date:   Sun May 5 14:59:26 2019 +1000

    Merge branch 'master' of https://gitlab.cecs.anu.edu.au/u6359121/comp1110-ass2-tue09k
    
    have completed task6.
    u6730978
    # Conflicts:
    #       src/comp1110/ass2/RailroadInk.java

commit 4485fd1967e2cccf8282878aeb5d3952d37099c0
Merge: d6f3d16 20c2f0b
Author: jay <u6730978@anu.edu.au>
Date:   Sun May 5 14:52:53 2019 +1000

    Merge remote-tracking branch 'origin/master'
    
    # Conflicts:
    #       src/comp1110/ass2/RailroadInk.java

commit d6f3d167db2f36008db6e7676231bc9fff0a9f9d
Author: jay <u6730978@anu.edu.au>
Date:   Sun May 5 14:50:04 2019 +1000

    Merge branch 'master' of https://gitlab.cecs.anu.edu.au/u6359121/comp1110-ass2-tue09k
    
    have completed task6.
    u6730978
    # Conflicts:
    #       src/comp1110/ass2/RailroadInk.java

commit 20c2f0b59abc69bc1aa39fc901b0e4eab4eea0a0
Author: Harriet Phillips <u6698981@anu.edu.au>
Date:   Sun May 5 13:34:29 2019 +1000

    continued on making a working game
    -added dice rolling / tile generating
    -added a spot for generated tiles to go

commit 28eb2f898f4f9991e16bded36f136e8a69e59bd4
Author: Harriet Phillips <u6698981@anu.edu.au>
Date:   Sun May 5 13:07:55 2019 +1000

    continued on making a working game
    -added dice rolling / tile generating
    -added a spot for generated tiles to go

commit 2a0205b5117a9a0118b36e564bdf0a22bd1e67ef
Author: Harriet Phillips <u6698981@anu.edu.au>
Date:   Sun May 5 12:13:36 2019 +1000

    started on making a working game

commit 4036b32b78db97c0047e3549b34c1ee2388fe2a2
Merge: c4e4738 57e5b68
Author: Harriet Phillips <u6698981@anu.edu.au>
Date:   Sat May 4 22:00:49 2019 +1000

    Merge remote-tracking branch 'origin/master'

commit c4e4738a5f2dfd6b9ab05da55178b987775dd655
Author: Harriet Phillips <u6698981@anu.edu.au>
Date:   Sat May 4 22:00:40 2019 +1000

    worked on viewer

commit 57e5b68a99122550c7b42987dcaab91e21440eca
Author: jay <u6730978@anu.edu.au>
Date:   Thu May 2 02:30:21 2019 +1000

    Merge branch 'master' of https://gitlab.cecs.anu.edu.au/u6359121/comp1110-ass2-tue09k
    
    # Conflicts:
    #       src/comp1110/ass2/RailroadInk.java
    
    task6 draft. Almost completed with little errors

commit 85d1adce43fc8ae13515bb1ea3507f2468128740
Author: Harriet Phillips <u6698981@anu.edu.au>
Date:   Tue Apr 30 17:37:54 2019 +1000

    re wrote the code bojie deleted when pushing

commit a8997a7bad60e3712b4fc0fa808827c5c947ff8b
Author: jay <u6730978@anu.edu.au>
Date:   Tue Apr 30 10:36:48 2019 +1000

    Merge branch 'master' of https://gitlab.cecs.anu.edu.au/u6359121/comp1110-ass2-tue09k
    
    # Conflicts:
    #       src/comp1110/ass2/RailroadInk.java

commit 80e5f129a12c9bb1b34a048dd5c09013236dd627
Merge: ed941a5 2044b92
Author: jay <u6730978@anu.edu.au>
Date:   Tue Apr 30 09:02:55 2019 +1000

    Merge branch 'master' of https://gitlab.cecs.anu.edu.au/u6359121/comp1110-ass2-tue09k
    
    # Conflicts:
    #       src/comp1110/ass2/RailroadInk.java

commit ed941a5996f63de1bf449de40f5bc808d6a069c2
Author: jay <u6730978@anu.edu.au>
Date:   Tue Apr 30 09:00:14 2019 +1000

    Have done task3

commit 2044b923e9a36262df169e0e9370b37d0b2fcea3
Author: Harriet Phillips <u6698981@anu.edu.au>
Date:   Mon Apr 29 11:00:43 2019 +1000

    added who authored which piece of code

commit 654169f687d6768aff629d9d626408f20ec1d7c7
Author: Harriet Phillips <u6698981@anu.edu.au>
Date:   Wed Apr 3 11:05:35 2019 +1100

    added who authored which piece of code

commit 9cee2b5b00726f2f206ecd616012ddcc36018c90
Author: Josh Milthorpe <josh.milthorpe@anu.edu.au>
Date:   Tue Apr 2 09:12:01 2019 +1100

    AreConnectedNeighboursTest: more tests for mirror-asymmetric tiles

commit 2a71aa9760d6ff00eed0fc30c07290cb0879a6a4
Author: Bojie Jia <bojie.jia@anu.edu.au>
Date:   Mon Apr 1 22:46:22 2019 +1100

    Update C-originality.md

commit c3ceb2dbc8b59b581b877804be06bee0bd8f0360
Author: Bojie Jia <bojie.jia@anu.edu.au>
Date:   Mon Apr 1 22:45:50 2019 +1100

    Update C-contribution.md

commit fe08d267988ffbff95136b4eea300c7a978de81b
Author: Harriet Phillips <u6698981@anu.edu.au>
Date:   Mon Apr 1 22:38:26 2019 +1100

    signed contribution

commit 010997ea6d92083320fb53d20bcde89769b2c27c
Author: Harriet Phillips <u6698981@anu.edu.au>
Date:   Sun Mar 31 22:07:43 2019 +1100

    tidied up task 5 code

commit fac4f2d9d51f1562527090ea2063d38b48d5841f
Author: Harriet Phillips <u6698981@anu.edu.au>
Date:   Sun Mar 31 22:06:06 2019 +1100

    tidied up task 5 code

commit c2b093dc9ad72185492bda986620eb263e6a17dd
Author: Harriet Phillips <u6698981@anu.edu.au>
Date:   Sun Mar 31 18:49:19 2019 +1100

    fixed task 3, made some code bit neater

commit ebae8607ff8407e6599a55c7de205a8b700d55fd
Merge: 87a2664 c31ba1e
Author: Harriet Phillips <u6698981@anu.edu.au>
Date:   Sun Mar 31 18:15:36 2019 +1100

    Merge branch 'master' of https://gitlab.cecs.anu.edu.au/comp1110/comp1110-ass2

commit c31ba1ef10ecf073353dddfbfd2bb72343c6c495
Author: Josh Milthorpe <josh.milthorpe@anu.edu.au>
Date:   Sun Mar 31 08:54:35 2019 +1100

    T10 GenerateMoveTest

commit 87a2664980abd0f5458a8952e7db72bca14bf255
Author: jay <u6730978@anu.edu.au>
Date:   Sun Mar 31 02:54:41 2019 +1100

    Have done task3

commit 5a0302f1af1a21b7302a7be2b7061203f7531b48
Author: Josh Milthorpe <josh.milthorpe@anu.edu.au>
Date:   Sat Mar 30 22:39:34 2019 +1100

    T8 GetBasicScoreTest, T12 GetAdvancedScoreTest

commit 73db453aeb05813025001f718dcbc025ea625c20
Author: Harriet Phillips <u6698981@anu.edu.au>
Date:   Sat Mar 30 21:46:41 2019 +1100

    updated originality

commit 8175d34c4a889c671cc03015bf19eb6fab60ab7a
Author: Harriet Phillips <u6698981@anu.edu.au>
Date:   Sat Mar 30 21:22:18 2019 +1100

    added more comments

commit 08ad4bff259f71236a50a226e4ff142e4a66b5ae
Author: Harriet Phillips <u6698981@anu.edu.au>
Date:   Sat Mar 30 20:00:28 2019 +1100

    finished part 5, passed all tests

commit 8f68ed6547248f47fde6f5f20cba71958c068da4
Author: Harriet Phillips <u6698981@anu.edu.au>
Date:   Sat Mar 30 18:34:53 2019 +1100

    added all the pieces to enum Pieces, started on areConnectedNeighbours

commit 23d1e282060721ad9c6571226c8f6f8bde87fdaa
Author: Harriet Phillips <u6698981@anu.edu.au>
Date:   Sat Mar 30 17:55:52 2019 +1100

    updated originality statement

commit 5f22abc42bb3b662aa9aa9c4895fca63f209f3e3
Author: Harriet Phillips <u6698981@anu.edu.au>
Date:   Sat Mar 30 17:53:44 2019 +1100

    finished dice roll, passed all tests

commit f3b8bd60e216c7bcec78d8821cca9bd887c16aa0
Author: Harriet Phillips <u6698981@anu.edu.au>
Date:   Sat Mar 30 16:56:48 2019 +1100

    updated originality file

commit d61559a8eace9eb0de8948899ccf1a333a7a43eb
Author: Josh Milthorpe <josh.milthorpe@anu.edu.au>
Date:   Sat Mar 30 14:39:59 2019 +1100

    test more types of invalid piece placements

commit 85857532285c09737c52621ed7ab9bbcef1a83fd
Author: Harriet Phillips <u6698981@anu.edu.au>
Date:   Sat Mar 30 14:13:04 2019 +1100

    fixed orientation in viewer

commit 9f981de298733fa6b842e8e2ce115854061ca1b4
Author: Harriet Phillips <u6698981@anu.edu.au>
Date:   Sat Mar 30 11:54:19 2019 +1100

    continued working on viewer

commit 761253959788eb7d2a40dcf2836611ad6efa2fce
Author: Harriet Phillips <u6698981@anu.edu.au>
Date:   Wed Mar 27 00:08:30 2019 +1100

    added code to the viewer so that it displays an image, added to the board the x and y co-ordinates for each square for the board to be drawn

commit e35f30c93fe73b9039ce5e644a4f0d263f97575b
Author: Harriet Phillips <u6698981@anu.edu.au>
Date:   Tue Mar 26 23:01:57 2019 +1100

    moved board and pieces into own files

commit 07b6968bc9a8229c36f353978eb48ff0ca1595e5
Author: Harriet Phillips <u6698981@anu.edu.au>
Date:   Tue Mar 26 21:04:12 2019 +1100

    updated task allocations

commit e55e005e0ecec66563d116244d606f1977d959ca
Author: Harriet Phillips <u6698981@anu.edu.au>
Date:   Tue Mar 26 19:38:30 2019 +1100

    updated task allocations

commit b5c45bbc5912140ed10b2c12541cfefc0bebdd07
Author: Harriet Phillips <u6698981@anu.edu.au>
Date:   Tue Mar 26 19:36:02 2019 +1100

    finished part 2, passed all tests, added comments, added a function for part 3

commit 8c63c346cdbe8bc17aa838607c73ca7865e88cb0
Author: Harriet Phillips <u6698981@anu.edu.au>
Date:   Tue Mar 26 19:27:28 2019 +1100

    finished part 2, passed all tests

commit 6d12957b1f0eaea61e58191df431af884fe75abf
Author: Cindy <u6698981@anu.edu.au>
Date:   Tue Mar 26 10:06:33 2019 +1100

    added new A

commit 31070aed5d979918711f990fe575875d603a9ec6
Merge: 4b073e5 560c784
Author: jay <u6730978@anu.edu.au>
Date:   Tue Mar 26 10:04:20 2019 +1100

    Merge remote-tracking branch 'origin/master'
    
    # Conflicts:
    #       src/gittest/Main.java

commit 4b073e5348a4c4b823d10e0e19057d95ce8bc811
Author: jay <u6730978@anu.edu.au>
Date:   Tue Mar 26 10:03:35 2019 +1100

    Add'B b=new B();'

commit 560c784a8d99a4bc0810ad569b31a2b24f00398e
Author: Alice <u6698981@anu.edu.au>
Date:   Tue Mar 26 10:02:46 2019 +1100

    added new A

commit e36a1b5e9d9d53301eff687c8bdebdddfa3e2ec2
Merge: 6641063 767a6d4
Author: jay <u6730978@anu.edu.au>
Date:   Tue Mar 26 09:51:51 2019 +1100

    Merge remote-tracking branch 'origin/master'

commit 767a6d4b29b1796cebe609cdb4cc05cd7489dd83
Author: Cindy <u6698981@anu.edu.au>
Date:   Tue Mar 26 09:51:15 2019 +1100

    Added C

commit 0abd07962a01539b841b8018063a83c9e0bc050a
Author: u6698981 <Remember85>
Date:   Tue Mar 26 09:50:41 2019 +1100

    Added main class and A

commit 664106398b3a2fa869f12e97c53378a8f064b183
Author: Bob <bojie.jia@anu.edu.au>
Date:   Tue Mar 26 09:50:33 2019 +1100

    have done B part

commit f6a61d817cfa808ed8fdd7977e13525d6f92f948
Author: Alice <u6698981@anu.edu.au>
Date:   Tue Mar 26 09:47:08 2019 +1100

    Added main class and A

commit 60ee0f32d74eefe10d995f9beda2a9db0604d78b
Author: Harriet Phillips <u6698981@anu.edu.au>
Date:   Tue Mar 26 09:44:54 2019 +1100

    Added main class and A

commit 742ff87f7c45f279c1b0b589cc9e1bd0f77f1df4
Merge: 5a64ffb 87f0a67
Author: u6698981 <Remember85>
Date:   Tue Mar 26 09:13:28 2019 +1100

    Merge branch 'master' of https://gitlab.cecs.anu.edu.au/comp1110/comp1110-ass2

commit 5a64ffb6f507474d6d870ca61957530461bc43f3
Author: Harriet Phillips <u6698981@anu.edu.au>
Date:   Mon Mar 25 22:41:29 2019 +1100

    chenxuan's signature

commit 0358645954f367b9ceb1e2ebff2188b4032c2ebd
Author: Bojie Jia <bojie.jia@anu.edu.au>
Date:   Mon Mar 25 21:42:25 2019 +1100

    Update B-contribution.md

commit 5d804cd00c36db604e559f1995b3d92956ea6e63
Author: Bojie Jia <bojie.jia@anu.edu.au>
Date:   Mon Mar 25 21:41:26 2019 +1100

    Update B-originality.md

commit 19488cf08b82b141e15ef63d8aa0a2a6ebf80c5b
Author: Bojie Jia <bojie.jia@anu.edu.au>
Date:   Mon Mar 25 21:41:02 2019 +1100

    Update B-originality.md

commit 54f898b36867864d81fe21aaf71fef96c2d4c5f0
Author: Harriet Phillips <u6698981@anu.edu.au>
Date:   Mon Mar 25 20:24:04 2019 +1100

    added images if the physics planning of the skeleton

commit 60ce599c6d3cecaf7edabc56b61aeb8879781f35
Author: Harriet Phillips <u6698981@anu.edu.au>
Date:   Mon Mar 25 20:19:14 2019 +1100

    signed the originality file

commit c4734c2d13524dd5ccc7cca4b3911e6e9bdee8d4
Author: Harriet Phillips <u6698981@anu.edu.au>
Date:   Mon Mar 25 20:14:22 2019 +1100

    signed the originality file

commit 991973e3ae6c411b072ec27da99499760ed8bbce
Author: Harriet Phillips <u6698981@anu.edu.au>
Date:   Mon Mar 25 20:12:44 2019 +1100

    added my signiture to the contribution file

commit bdcd02b5d0fb83552c2af0ef9abd49f1346daa46
Author: Harriet Phillips <u6698981@anu.edu.au>
Date:   Mon Mar 25 19:00:04 2019 +1100

    fixed an error

commit 1a629b00cb74a4d897b76b591e0e9dddc5c987ce
Author: Harriet Phillips <u6698981@anu.edu.au>
Date:   Mon Mar 25 18:59:12 2019 +1100

    added functions for calculating the score, edited the pieces enum, added a function to fix orientation, relocated the random number generator for the dice roll

commit 423f51c8939946ebadf75916a9471f4f1e7d6e7c
Author: Harriet Phillips <u6698981@anu.edu.au>
Date:   Mon Mar 25 18:05:31 2019 +1100

    added template for enum for piece and board, and a template for a random number generator between 1 and 6 (dice roll).

commit 87f0a67a1ea2b01ea570f9cbe66f23eacfe13a1c
Author: Josh Milthorpe <josh.milthorpe@anu.edu.au>
Date:   Fri Mar 22 16:57:27 2019 +1100

    fix off-by-one errors in Javadoc spec

commit 6899cf1bfb33883edba7d29b261aa2e63950d6be
Author: Josh Milthorpe <josh.milthorpe@anu.edu.au>
Date:   Thu Mar 21 21:40:31 2019 +1100

    fix specification for dice roll - B can only roll 0-2
    
    fix IsTilePlacementWellFormedTest and GenerateDiceRollTest accordingly

commit 984e9fef1b9f26e2d4f38cf136ad5e85b4a9a6cd
Author: Josh Milthorpe <josh.milthorpe@anu.edu.au>
Date:   Tue Mar 19 02:08:41 2019 +1100

    assignment published
```
## Changes
``` diff
diff -ru -x .git ../master/comp1110-ass2/admin/B-contribution.md comp1110-ass2/admin/B-contribution.md
--- ../master/comp1110-ass2/admin/B-contribution.md	2019-05-24 13:59:03.704392235 +1000
+++ comp1110-ass2/admin/B-contribution.md	2019-05-24 14:38:24.866851522 +1000
@@ -1,7 +1,9 @@
 We declare that the work toward our submission of Stage B was distributed among the group members as follows:
 
-* u2345678 30
-* u3456789 40
-* u0234567 30
+* 10 - u6730978 - Bojie
+* 10 - u6359121 - Chenxuan
+* 80 - u6698981 - Harriet
 
-Signed: Mary Jones (u2345678), Bob Smith (u3456789), and Sue Black (u0234567)
+Signed: u6698981 Harriet Phillips
+        u6730978 Bojie Jia
+        u6359121 Chenxuan Tang
\ No newline at end of file
diff -ru -x .git ../master/comp1110-ass2/admin/B-originality.md comp1110-ass2/admin/B-originality.md
--- ../master/comp1110-ass2/admin/B-originality.md	2019-05-24 13:59:03.724392356 +1000
+++ comp1110-ass2/admin/B-originality.md	2019-05-24 14:38:24.882851620 +1000
@@ -1,9 +1,5 @@
 We declare that the work we have submitted for Stage B of this assignment and all stages before it is entirely our own work, with the following documented exceptions:
 
-* The idea of using <...> to make the game run faster came from a discussion with <...> (noted in source code comments)
-
-* The code in class <...> is based on a solution we found when researching the problem (URL provided in source code comments)
-
-*  ....
-
-Signed: Mary Jones (u2345678), Bob Smith (u3456789), and Sue Black (u0123456)
+Signed: Harriet Phillips (u6698981)
+        Bojie Jia (u6730978)
+        Chenxuan Tang (u6359121)
\ No newline at end of file
diff -ru -x .git ../master/comp1110-ass2/admin/C-contribution.md comp1110-ass2/admin/C-contribution.md
--- ../master/comp1110-ass2/admin/C-contribution.md	2019-05-24 13:59:03.740392452 +1000
+++ comp1110-ass2/admin/C-contribution.md	2019-05-24 14:38:24.902851741 +1000
@@ -1,7 +1,8 @@
 We declare that the work toward our submission of Stage C was distributed among the group members as follows:
 
-* u2345678 30
-* u3456789 40
-* u0234567 30
+75 Harriet Phillips (u6698981)
+25 Bojie Jia (u6730978)
+0 Chenxuan Tang (u6359121)
 
-Signed: Mary Jones (u2345678), Bob Smith (u3456789), and Sue Black (u0234567)
+Signed: Harriet Phillips (u6698981)
+        Bojie Jia(u6730978)
diff -ru -x .git ../master/comp1110-ass2/admin/C-originality.md comp1110-ass2/admin/C-originality.md
--- ../master/comp1110-ass2/admin/C-originality.md	2019-05-24 13:59:03.768392620 +1000
+++ comp1110-ass2/admin/C-originality.md	2019-05-24 14:38:24.926851889 +1000
@@ -1,9 +1,19 @@
 We declare that the work we have submitted for Stage C of this assignment and all stages before it is entirely our own work, with the following documented exceptions:
 
-* The idea of using <...> to make the game run faster came from a discussion with <...> (noted in source code comments)
+The idea for how to load in an image (in viewer) came from:
+https://stackoverflow.com/questions/37111582/simplest-way-to-add-an-image-in-javafx
 
-* The code in class <...> is based on a solution we found when researching the problem (URL provided in source code comments)
+The code for flipping a piece image (in viewer) came from:
+https://stackoverflow.com/questions/28087776/mirror-effect-in-javafx
 
-*  ....
+The idea for how to rotating a piece image (in viewer) came from:
+https://stackoverflow.com/questions/40059836/rotating-image-in-javafx
 
-Signed: Mary Jones (u2345678), Bob Smith (u3456789), and Sue Black (u0123456)
+Converting int to char (in dice roll):
+https://www.javatpoint.com/java-int-to-char
+
+Checking if an enum contains a certain value (used to find the features of each piece in task 5):
+https://stackoverflow.com/questions/4936819/java-check-if-enum-contains-a-given-string/37240149
+
+Signed: Harriet Phillips (u6698981)
+        Bojie Jia(u6730978)
Only in comp1110-ass2/admin: D-originality-u6698981.md
Only in comp1110-ass2/admin: D-originality-u6730978.md
Only in comp1110-ass2/admin: E-originality-u6698981.md
Only in comp1110-ass2/admin: E-originality-u6730978.md
diff -ru -x .git ../master/comp1110-ass2/admin/F-contribution.md comp1110-ass2/admin/F-contribution.md
--- ../master/comp1110-ass2/admin/F-contribution.md	2019-05-24 13:59:03.852393125 +1000
+++ comp1110-ass2/admin/F-contribution.md	2019-05-24 14:38:25.086852869 +1000
@@ -1,8 +1,7 @@
 We declare that the work toward our submission of Stage F was distributed among the group members as follows:
 
-* u2345678 30
-* u3456789 40
-* u0123456 30
-
-Signed: Mary Jones (u2345678), Bob Smith (u3456789), and Sue Black (u0123456)
+* 55 - u6698981
+* 45 - u6730978
 
+Signed: Harriet Phillips (u6698981)
+        Bojie Jia(u6730978)
diff -ru -x .git ../master/comp1110-ass2/admin/F-originality.md comp1110-ass2/admin/F-originality.md
--- ../master/comp1110-ass2/admin/F-originality.md	2019-05-24 13:59:03.884393317 +1000
+++ comp1110-ass2/admin/F-originality.md	2019-05-24 14:38:25.114853041 +1000
@@ -1,9 +1,7 @@
 We declare that the work we have submitted for Stage F of this assignment and all stages before it is entirely our own work, with the following documented exceptions:
 
-* The idea of using <...> to make the game run faster came from a discussion with <...> (noted in source code comments)
+The implementation of the drag feature was adapted from
+<http://java-buddy.blogspot.com/2013/07/javafx-drag-and-move-something.html>
 
-* The code in class <...> is based on a solution we found when researching the problem (URL provided in source code comments)
-
-* ....
-
-Signed: Mary Jones (u2345678), Bob Smith (u3456789), and Sue Black (u0123456)
+Signed: Harriet Phillips (u6698981)
+        Bojie Jia(u6730978)
Only in comp1110-ass2/admin: F-review-u6698981.md
Only in comp1110-ass2/admin: F-review-u6730978.md
Only in ../master/comp1110-ass2/admin: G-best-u1234567.md
Only in comp1110-ass2/admin: G-best-u6698981.md
Only in comp1110-ass2/admin: G-best-u6730978.md
diff -ru -x .git ../master/comp1110-ass2/admin/G-contribution.md comp1110-ass2/admin/G-contribution.md
--- ../master/comp1110-ass2/admin/G-contribution.md	2019-05-24 13:59:04.000394015 +1000
+++ comp1110-ass2/admin/G-contribution.md	2019-05-24 14:38:25.202853580 +1000
@@ -1,8 +1,7 @@
 We declare that the work toward our submission of Stage G was distributed among the group members as follows:
 
-* u2345678 30
-* u3456789 40
-* u0123456 30
-
-Signed: Mary Jones (u2345678), Bob Smith (u3456789), and Sue Black (u0123456)
+* 50 - u6698981
+* 50 - u6730978
 
+Signed: Harriet Phillips (u6698981)
+        Bojie Jia (u6730978)
diff -ru -x .git ../master/comp1110-ass2/admin/G-features.md comp1110-ass2/admin/G-features.md
--- ../master/comp1110-ass2/admin/G-features.md	2019-05-24 13:59:04.028394183 +1000
+++ comp1110-ass2/admin/G-features.md	2019-05-24 14:38:25.218853677 +1000
@@ -6,8 +6,11 @@
  - A simple placement viewer (Task 4)
  - A basic playable game
  - A basic playable game that snaps pieces to the board and checks for validity (Task 7)
- - Generates basic starting piece placements (Task 8)
- - Implements hints (Task 10)
- - Implements interesting starting placements (Task 11)
+
+ - Tasks up to and including task 12.
 
 additional features...
+
+- Draggable tiles
+- Start Screen
+- Rules Screen
\ No newline at end of file
diff -ru -x .git ../master/comp1110-ass2/admin/G-originality.md comp1110-ass2/admin/G-originality.md
--- ../master/comp1110-ass2/admin/G-originality.md	2019-05-24 13:59:04.048394304 +1000
+++ comp1110-ass2/admin/G-originality.md	2019-05-24 14:38:25.234853776 +1000
@@ -1,9 +1,11 @@
 We declare that the work we have submitted for Stage G of this assignment and all stages before it is entirely our own work, with the following documented exceptions:
 
-* The idea of using <...> to make the game run faster came from a discussion with <...> (noted in source code comments)
+How to launch an application from another application
+https://stackoverflow.com/questions/25873769/launch-javafx-application-from-another-class
+https://stackoverflow.com/questions/40265810/how-to-exit-primarystage-while-opening-a-new-stage-in-javafx
 
-* The code in class <...> is based on a solution we found when researching the problem (URL provided in source code comments)
+Title screen image from:
+https://boardgamegeek.com/image/4465753/railroad-ink-deep-blue-edition
 
-* ....
-
-Signed: Mary Jones (u2345678), Bob Smith (u3456789), and Sue Black (u0123456)
+Signed: Harriet Phillips (u6698981)
+        Bojie Jia (u6730978)
diff -ru -x .git ../master/comp1110-ass2/admin/tasks.md comp1110-ass2/admin/tasks.md
--- ../master/comp1110-ass2/admin/tasks.md	2019-05-24 13:59:04.120394737 +1000
+++ comp1110-ass2/admin/tasks.md	2019-05-24 14:38:25.274854020 +1000
@@ -5,28 +5,91 @@
 
 ## Week 4
 
-Everyone: create application skeleton - meeting 14:00 17 Aug
+Create application skeleton - Harriet
 
 ## Week 5
 
-Zhang San: Task 3 isPiecePlacementWellFormed - 21 Aug
+Tuesday meeting - 11am - 12pm
 
-Jane Bloggs: Task 4 getNeighbours - 23 Aug
+Attended by Harriet and Bojie.
 
-Erika Mustermann: Task 6 getViablePiecePlacements - 24 Aug (depends on Task 3)
+It was decided the tasks would be allocated as follows:
+Task 2 - Harriet
+Task 3 - Bojie
+Task 4 - Harriet
+Task 5 - If time allows
 
 ## Week 6
 
-...
+Tuesday meeting - 11am - 12pm
+Attended by Harriet and Bojie.
+
+It was decided the tasks would be allocated as follows:
+
+Task 6 - Bojie
+Task 7 - Harriet
+Task 8 - Bojie
+Task 9 - Harriet
+Task 10 - If time allows
+Task 11 - If time allows
 
 ## Mid-Semester Break
+It was decided that we continue working on assigned tasks.
+
+Completed:
+Task 7 - Harriet
+
+To Continue:
+Task 6 - Bojie
+Task 8 - Bojie
+Task 9 - Harriet
+Task 10 - If time allows
+Task 11 - If time allows
 
 ## Week 7
 
+Tuesday meeting - 11am - 12pm
+Attended by Harriet and Bojie.
+
+It was decided that we continue working on assigned tasks.
+
 ## Week 8
 
+Tuesday meeting - 11am - 12pm
+Attended by Harriet and Bojie.
+
+Completed:
+Task 6 - Bojie
+
+To Continue:
+Task 8 - Bojie
+Task 9 - Harriet
+Task 10 - If time allows
+Task 11 - If time allows
+
 ## Week 9
 
+Completed:
+Task 8 - Bojie
+Task 9 - Harriet
+
+To continue:
+Task 10 - Bojie and Harriet
+Task 11 - Harriet
+
 ## Week 10
 
+Completed:
+Task 12 Bojie
+
+To continue:
+Task 10 - Bojie and Harriet
+Task 11 - Harriet
+
 ## Week 11
+
+To continue:
+Task 10 - Bojie and Harriet
+Task 11 - Harriet
+
+Presentation: Bojie and Harriet
\ No newline at end of file
diff -ru -x .git ../master/comp1110-ass2/comp1110-ass2.iml comp1110-ass2/comp1110-ass2.iml
--- ../master/comp1110-ass2/comp1110-ass2.iml	2019-05-24 13:59:04.500397021 +1000
+++ comp1110-ass2/comp1110-ass2.iml	2019-05-24 14:38:25.578855883 +1000
@@ -18,6 +18,6 @@
         <SOURCES />
       </library>
     </orderEntry>
-    <orderEntry type="library" name="javafx" level="project" />
+    <orderEntry type="library" exported="" name="javafx" level="project" />
   </component>
 </module>
\ No newline at end of file
Only in comp1110-ass2: feedback.md
Only in comp1110-ass2: game.jar
Only in comp1110-ass2/.idea: artifacts
diff -ru -x .git ../master/comp1110-ass2/.idea/runConfigurations/T2_IsTilePlacementWellFormedTest.xml comp1110-ass2/.idea/runConfigurations/T2_IsTilePlacementWellFormedTest.xml
--- ../master/comp1110-ass2/.idea/runConfigurations/T2_IsTilePlacementWellFormedTest.xml	2019-05-24 13:59:03.500391008 +1000
+++ comp1110-ass2/.idea/runConfigurations/T2_IsTilePlacementWellFormedTest.xml	2019-05-24 14:38:24.722850640 +1000
@@ -3,7 +3,7 @@
     <module name="comp1110-ass2" />
     <extension name="coverage">
       <pattern>
-        <option name="PATTERN" value="comp1110.ass2.gui.*" />
+        <option name="PATTERN" value="comp1110.ass2.*" />
         <option name="ENABLED" value="true" />
       </pattern>
     </extension>
@@ -16,4 +16,4 @@
       <option name="Make" enabled="true" />
     </method>
   </configuration>
-</component>
+</component>
\ No newline at end of file
diff -ru -x .git ../master/comp1110-ass2/.idea/runConfigurations/Viewer.xml comp1110-ass2/.idea/runConfigurations/Viewer.xml
--- ../master/comp1110-ass2/.idea/runConfigurations/Viewer.xml	2019-05-24 13:59:03.664391995 +1000
+++ comp1110-ass2/.idea/runConfigurations/Viewer.xml	2019-05-24 14:38:24.818851228 +1000
@@ -5,7 +5,7 @@
     <option name="VM_PARAMETERS" value="-ea --module-path ${PATH_TO_FX} --add-modules=javafx.controls,javafx.fxml,javafx.media" />
     <extension name="coverage">
       <pattern>
-        <option name="PATTERN" value="comp1110.ass2.gui.*" />
+        <option name="PATTERN" value="comp1110.ass2.*" />
         <option name="ENABLED" value="true" />
       </pattern>
     </extension>
@@ -13,4 +13,4 @@
       <option name="Make" enabled="true" />
     </method>
   </configuration>
-</component>
+</component>
\ No newline at end of file
Only in comp1110-ass2: META-INF
Only in comp1110-ass2: presentation.pdf
Only in comp1110-ass2: skeleton_plan
Binary files ../master/comp1110-ass2/src/comp1110/ass2/gui/assets/A0.png and comp1110-ass2/src/comp1110/ass2/gui/assets/A0.png differ
Binary files ../master/comp1110-ass2/src/comp1110/ass2/gui/assets/A1.png and comp1110-ass2/src/comp1110/ass2/gui/assets/A1.png differ
Binary files ../master/comp1110-ass2/src/comp1110/ass2/gui/assets/A2.png and comp1110-ass2/src/comp1110/ass2/gui/assets/A2.png differ
Binary files ../master/comp1110-ass2/src/comp1110/ass2/gui/assets/A3.png and comp1110-ass2/src/comp1110/ass2/gui/assets/A3.png differ
Binary files ../master/comp1110-ass2/src/comp1110/ass2/gui/assets/A4.png and comp1110-ass2/src/comp1110/ass2/gui/assets/A4.png differ
Binary files ../master/comp1110-ass2/src/comp1110/ass2/gui/assets/A5.png and comp1110-ass2/src/comp1110/ass2/gui/assets/A5.png differ
Binary files ../master/comp1110-ass2/src/comp1110/ass2/gui/assets/B0.png and comp1110-ass2/src/comp1110/ass2/gui/assets/B0.png differ
Binary files ../master/comp1110-ass2/src/comp1110/ass2/gui/assets/B1.png and comp1110-ass2/src/comp1110/ass2/gui/assets/B1.png differ
Binary files ../master/comp1110-ass2/src/comp1110/ass2/gui/assets/B2.png and comp1110-ass2/src/comp1110/ass2/gui/assets/B2.png differ
Binary files ../master/comp1110-ass2/src/comp1110/ass2/gui/assets/HighExit.png and comp1110-ass2/src/comp1110/ass2/gui/assets/HighExit.png differ
Binary files ../master/comp1110-ass2/src/comp1110/ass2/gui/assets/RailExit.png and comp1110-ass2/src/comp1110/ass2/gui/assets/RailExit.png differ
Binary files ../master/comp1110-ass2/src/comp1110/ass2/gui/assets/S0.png and comp1110-ass2/src/comp1110/ass2/gui/assets/S0.png differ
Binary files ../master/comp1110-ass2/src/comp1110/ass2/gui/assets/S1.png and comp1110-ass2/src/comp1110/ass2/gui/assets/S1.png differ
Binary files ../master/comp1110-ass2/src/comp1110/ass2/gui/assets/S2.png and comp1110-ass2/src/comp1110/ass2/gui/assets/S2.png differ
Binary files ../master/comp1110-ass2/src/comp1110/ass2/gui/assets/S3.png and comp1110-ass2/src/comp1110/ass2/gui/assets/S3.png differ
Binary files ../master/comp1110-ass2/src/comp1110/ass2/gui/assets/S4.png and comp1110-ass2/src/comp1110/ass2/gui/assets/S4.png differ
Binary files ../master/comp1110-ass2/src/comp1110/ass2/gui/assets/S5.png and comp1110-ass2/src/comp1110/ass2/gui/assets/S5.png differ
Only in comp1110-ass2/src/comp1110/ass2/gui/assets: title1.jpg
Only in comp1110-ass2/src/comp1110/ass2/gui: Game.class
Only in comp1110-ass2/src/comp1110/ass2/gui: Game.java
Only in comp1110-ass2/src/comp1110/ass2/gui: MultiPlayer$10.class
Only in comp1110-ass2/src/comp1110/ass2/gui: MultiPlayer$11.class
Only in comp1110-ass2/src/comp1110/ass2/gui: MultiPlayer$12.class
Only in comp1110-ass2/src/comp1110/ass2/gui: MultiPlayer$1.class
Only in comp1110-ass2/src/comp1110/ass2/gui: MultiPlayer$2.class
Only in comp1110-ass2/src/comp1110/ass2/gui: MultiPlayer$3.class
Only in comp1110-ass2/src/comp1110/ass2/gui: MultiPlayer$4.class
Only in comp1110-ass2/src/comp1110/ass2/gui: MultiPlayer$5.class
Only in comp1110-ass2/src/comp1110/ass2/gui: MultiPlayer$6.class
Only in comp1110-ass2/src/comp1110/ass2/gui: MultiPlayer$7.class
Only in comp1110-ass2/src/comp1110/ass2/gui: MultiPlayer$8.class
Only in comp1110-ass2/src/comp1110/ass2/gui: MultiPlayer$9.class
Only in comp1110-ass2/src/comp1110/ass2/gui: MultiPlayer.class
Only in comp1110-ass2/src/comp1110/ass2/gui: MultiPlayer.java
Only in comp1110-ass2/src/comp1110/ass2/gui: Rules.class
Only in comp1110-ass2/src/comp1110/ass2/gui: Rules.java
Only in comp1110-ass2/src/comp1110/ass2/gui: SinglePlayer$10.class
Only in comp1110-ass2/src/comp1110/ass2/gui: SinglePlayer$11.class
Only in comp1110-ass2/src/comp1110/ass2/gui: SinglePlayer$12.class
Only in comp1110-ass2/src/comp1110/ass2/gui: SinglePlayer$1.class
Only in comp1110-ass2/src/comp1110/ass2/gui: SinglePlayer$2.class
Only in comp1110-ass2/src/comp1110/ass2/gui: SinglePlayer$3.class
Only in comp1110-ass2/src/comp1110/ass2/gui: SinglePlayer$4.class
Only in comp1110-ass2/src/comp1110/ass2/gui: SinglePlayer$5.class
Only in comp1110-ass2/src/comp1110/ass2/gui: SinglePlayer$6.class
Only in comp1110-ass2/src/comp1110/ass2/gui: SinglePlayer$7.class
Only in comp1110-ass2/src/comp1110/ass2/gui: SinglePlayer$8.class
Only in comp1110-ass2/src/comp1110/ass2/gui: SinglePlayer$9.class
Only in comp1110-ass2/src/comp1110/ass2/gui: SinglePlayer.class
Only in comp1110-ass2/src/comp1110/ass2/gui: SinglePlayer.java
Only in comp1110-ass2/src/comp1110/ass2/gui: TileImageView.class
Only in comp1110-ass2/src/comp1110/ass2/gui: TileImageView.java
Only in comp1110-ass2/src/comp1110/ass2/gui: Viewer.class
diff -ru -x .git ../master/comp1110-ass2/src/comp1110/ass2/gui/Viewer.java comp1110-ass2/src/comp1110/ass2/gui/Viewer.java
--- ../master/comp1110-ass2/src/comp1110/ass2/gui/Viewer.java	2019-05-24 13:59:04.616397720 +1000
+++ comp1110-ass2/src/comp1110/ass2/gui/Viewer.java	2019-05-24 14:38:28.562874158 +1000
@@ -6,20 +6,28 @@
 import javafx.scene.control.Button;
 import javafx.scene.control.Label;
 import javafx.scene.control.TextField;
+import javafx.scene.image.Image;
+import javafx.scene.image.ImageView;
 import javafx.scene.layout.HBox;
+import javafx.scene.shape.Line;
 import javafx.stage.Stage;
 
+
 /**
  * A very simple viewer for tile placements in the Railroad Ink game.
  * <p>
  * NOTE: This class is separate from your main game class.  This
  * class does not play a game, it just illustrates various tile placements.
  */
+
+//Authored by Harriet
 public class Viewer extends Application {
     /* board layout */
     private static final int VIEWER_WIDTH = 1024;
     private static final int VIEWER_HEIGHT = 768;
 
+    private static final int DIMENSIONS = 80;
+
     private static final String URI_BASE = "assets/";
 
     private final Group root = new Group();
@@ -31,8 +39,49 @@
      *
      * @param placement A valid placement string
      */
+
+    //Authored by Harriet
     void makePlacement(String placement) {
-        // FIXME Task 4: implement the simple placement viewer
+
+        char[] array = placement.toCharArray();
+
+        //create pieces until exhausted the list
+        for (int i = 0; i < placement.length(); i = i + 5) {
+
+            char[] arrayPieceName = {array[i], array[i+1]};
+
+            int y = (array[i + 2] - 'A') * DIMENSIONS;
+            int x = Character.getNumericValue(array[i + 3]) * DIMENSIONS;
+
+            String piece = new String(arrayPieceName);
+
+            //create a new image using current piece visual
+            Image image = new Image(Viewer.class.getResourceAsStream("assets/" + piece + ".png"));
+            ImageView imageView = new ImageView(image);
+
+            if (Character.getNumericValue(array[i + 4]) > 3) {
+                //set the image dimensions to 100
+                imageView.setFitHeight(DIMENSIONS);
+                imageView.setFitWidth(DIMENSIONS);
+                //flip the image
+                imageView.setScaleX(-1);
+                //rotate the image
+                imageView.setRotate(360.0 / 4 * ((double) Character.getNumericValue(array[4]) - 4));
+            } else {
+                //set the image dimensions
+                imageView.setFitHeight(DIMENSIONS);
+                imageView.setFitWidth(DIMENSIONS);
+                //rotate the image
+                imageView.setRotate(360.0 / 4 * (double) Character.getNumericValue(array[4]));
+            }
+
+            //set the image's location
+            imageView.setX(x + DIMENSIONS);
+            imageView.setY(y + DIMENSIONS);
+
+            //add the image to root
+            root.getChildren().add(imageView);
+        }
     }
 
     /**
@@ -44,27 +93,97 @@
         textField.setPrefWidth(300);
         Button button = new Button("Refresh");
         button.setOnAction(e -> {
+            //call makePlacement with given text
             makePlacement(textField.getText());
             textField.clear();
         });
         HBox hb = new HBox();
         hb.getChildren().addAll(label1, textField, button);
         hb.setSpacing(10);
-        hb.setLayoutX(130);
+        hb.setLayoutX(115);
         hb.setLayoutY(VIEWER_HEIGHT - 50);
         controls.getChildren().add(hb);
     }
 
+    //Authored by Harriet
+    void drawBoard() {
+
+        //Draw grid
+        for(int k = 0; k < 9; k++) {
+
+            Line line1 = new Line();
+            line1.setStartX(DIMENSIONS * k);
+            line1.setStartY(DIMENSIONS);
+            line1.setEndX(DIMENSIONS * k);
+            line1.setEndY(DIMENSIONS * 8);
+
+            root.getChildren().add(line1);
+
+            Line line2 = new Line();
+            line2.setStartX(DIMENSIONS);
+            line2.setStartY(DIMENSIONS * k);
+            line2.setEndX(DIMENSIONS * 8);
+            line2.setEndY(DIMENSIONS * k);
+
+            root.getChildren().add(line2);
+
+        }
+
+        //Draw exit tiles
+        //Arrays of exit locations and orientations
+        char[][] highwayExits = { {'A', '3', '0'}, {'A', '7', '0'}, {'E', '1', '3'}, {'E', '9', '1'}, {'I', '3', '2'}, {'I', '7', '2'}};
+        char[][] railroadExits = { {'A', '5', '0'}, {'C', '1', '3'}, {'C', '9', '1'}, {'G', '1', '3'}, {'G', '9', '1'}, {'I', '5', '2'}};
+
+        for(int i = 0; i < highwayExits.length; i++) {
+
+            int hy = ((highwayExits[i][0] - 'A')) * DIMENSIONS;
+            int hx = (Character.getNumericValue(highwayExits[i][1])) * DIMENSIONS;
+
+            Image image = new Image(Viewer.class.getResourceAsStream("assets/HighExit.png"));
+            ImageView imageView = new ImageView(image);
+
+            imageView.setRotate(360.0 / 4 * (int)highwayExits[i][2]);
+
+            imageView.setFitHeight(DIMENSIONS);
+            imageView.setFitWidth(DIMENSIONS);
+
+            imageView.setX(hx - DIMENSIONS);
+            imageView.setY(hy);
+
+
+            root.getChildren().add(imageView);
+
+            int ry = ((railroadExits[i][0] - 'A')) * DIMENSIONS;
+            int rx = (Character.getNumericValue(railroadExits[i][1])) * DIMENSIONS;
+
+            Image image2 = new Image(Viewer.class.getResourceAsStream("assets/RailExit.png"));
+            ImageView imageView2 = new ImageView(image2);
+
+            imageView2.setRotate(360.0 / 4 * (int)railroadExits[i][2]);
+
+            imageView2.setFitHeight(DIMENSIONS);
+            imageView2.setFitWidth(DIMENSIONS);
+
+            imageView2.setX(rx - DIMENSIONS);
+            imageView2.setY(ry);
+
+            root.getChildren().add(imageView2);
+        }
+    }
+
     @Override
     public void start(Stage primaryStage) throws Exception {
-        primaryStage.setTitle("StepsGame Viewer");
+
+        primaryStage.setTitle("Viewer");
         Scene scene = new Scene(root, VIEWER_WIDTH, VIEWER_HEIGHT);
 
         root.getChildren().add(controls);
 
         makeControls();
+        drawBoard();
 
         primaryStage.setScene(scene);
         primaryStage.show();
+
     }
 }
Only in comp1110-ass2/src/comp1110/ass2: Pieces.class
Only in comp1110-ass2/src/comp1110/ass2: Pieces.java
Only in comp1110-ass2/src/comp1110/ass2: RailroadInk.class
diff -ru -x .git ../master/comp1110-ass2/src/comp1110/ass2/RailroadInk.java comp1110-ass2/src/comp1110/ass2/RailroadInk.java
--- ../master/comp1110-ass2/src/comp1110/ass2/RailroadInk.java	2019-05-24 13:59:04.556397359 +1000
+++ comp1110-ass2/src/comp1110/ass2/RailroadInk.java	2019-05-24 14:38:28.406873203 +1000
@@ -1,6 +1,14 @@
 package comp1110.ass2;
 
+import java.sql.SQLOutput;
+import java.util.HashMap;
+import java.util.Random;
+
 public class RailroadInk {
+
+
+    public HashMap<String, String> board = new HashMap<>();
+
     /**
      * Determine whether a tile placement string is well-formed:
      * - it consists of exactly 5 characters;
@@ -13,9 +21,70 @@
      * @param tilePlacementString a candidate tile placement string
      * @return true if the tile placement is well formed
      */
+    //Authored by Harriet
     public static boolean isTilePlacementWellFormed(String tilePlacementString) {
-        // FIXME Task 2: determine whether a tile placement is well-formed
-        return false;
+        boolean firstSecond = false;
+        boolean third = false;
+        boolean fourth = false;
+        boolean fifth = false;
+
+        char[] array = tilePlacementString.toCharArray();
+
+        //check if string is the right length
+        if (tilePlacementString.length() == 5) {
+
+            if (array[0] == 'A' || array[0] == 'S') {
+                //If the first array element is A or S
+                if (array[1] <= '5') {
+                    //Check that the second element has a number 0 - 5
+                    //Set firstSecond to true
+                    firstSecond = true;
+                } else {
+                    //If not return false
+                    return false;
+                }
+            } else if (array[0] == 'B' && array[1] <= '2') {
+                //If first array element is B and the second element is 0-2
+                //Set firstSecond to be true
+                firstSecond = true;
+            } else {
+                //Otherwise return false
+                return false;
+            }
+
+            if (array[2] >= 'A' && array[2] <= 'G') {
+                //If 3rd array element is A-G then set third to true
+                third = true;
+            } else {
+                //Otherwise return false
+                return false;
+            }
+
+            if (array[3] <= '6') {
+                //If the fourth array element is 0-6 set fourth to true
+                fourth = true;
+            } else {
+                //Otherwise return false
+                return false;
+            }
+
+            if (array[4] <= '7') {
+                //If the fifth array element is 0-7 set fifth to true
+                fifth = true;
+            } else {
+                //Otherwise return false
+                return false;
+            }
+        }
+
+        //If all elements are true return
+        if (firstSecond && third && fourth && fifth) {
+            return true;
+        } else {
+            //Otherwise return false
+            return false;
+        }
+
     }
 
     /**
@@ -27,9 +96,38 @@
      * @param boardString a board string describing the placement of one or more pieces
      * @return true if the board string is well-formed
      */
+    //Authored by Bojie
     public static boolean isBoardStringWellFormed(String boardString) {
-        // FIXME Task 3: determine whether a board string is well-formed
+        if (boardString != null && !"".equals(boardString)) {
+
+            int x = boardString.length() % 5;
+            int N = boardString.length() / 5;
+            boolean wellFormed = true;
+
+            if (x == 0 && N > 0 && N < 32) {
+                //check the length of boardString
+                for (int k = 0; k < N; k++) {
+                    String St = boardString.substring(5 * k, 5 * k + 5);
+                    if (!isTilePlacementWellFormed(St)) {
+                        wellFormed = false;
+                    }
+                }
+                //make sure each piece placement is well- formed
+                int count = 0;
+                for (int j = 0; j < N; j++) {
+                    if (boardString.charAt(5 * j) == 'S') {
+                        count++;
+                    }
+                }
+                if (count <= 3 && wellFormed) {
+                    return true;
+                }
+                //check the amount of special tiles
+            }
+        }
+
         return false;
+
     }
 
 
@@ -44,9 +142,199 @@
      *
      * @return true if the placements are connected neighbours
      */
+
+    //Authored by Harriet
     public static boolean areConnectedNeighbours(String tilePlacementStringA, String tilePlacementStringB) {
-        // FIXME Task 5: determine whether neighbouring placements are connected
-        return false;
+
+        char[] array1 = fixOrientation(tilePlacementStringA);
+        char[] array2 = fixOrientation(tilePlacementStringB);
+
+
+        //initialize feature placements
+        //n = north
+        //e = east
+        //s = south
+        //w = west
+        char n1n = array1[0];
+        char n1e = array1[1];
+        char n1s = array1[2];
+        char n1w = array1[3];
+
+        char n2n = array2[0];
+        char n2e = array2[1];
+        char n2s = array2[2];
+        char n2w = array2[3];
+
+        //find the location of the connection of the pieces (if there is one)
+        char location = connectionLocation(tilePlacementStringA, tilePlacementStringB);
+
+        if (location == 'n') {
+            //if the connection is "North" (above piece 1)
+            if (n1n == n2s && n1n != 'n') {
+                //if the north feature of piece 1 matches the south feature
+                //of piece 2, then return true
+                return true;
+            } else {
+                return false;
+            }
+        } else if (location == 'e') {
+            //if the connection is "east" (right of piece 2)
+            if (n1e == n2w && n1e != 'n') {
+                //if the east feature of piece 1 matches the west feature
+                //of piece 2, then return true
+                return true;
+            } else {
+                return false;
+            }
+        } else if (location == 's') {
+            //if the connection is "south" (below piece 2)
+            if (n1s == n2n && n1s != 'n') {
+                //if the south feature of piece 1 matches the north feature
+                //of piece 2, then return true
+                return true;
+            } else {
+                return false;
+            }
+        } else if (location == 'w') {
+            //if the connection is "west" (left of piece 1)
+            if (n1w == n2e && n1w != 'n') {
+                //if the west feature of piece 1 matches the east feature
+                //of piece 2, then return true
+                return true;
+            } else {
+                return false;
+            }
+        } else {
+            return false;
+        }
+    }
+
+    //Authored by Harriet
+    public static char[] fixOrientation(String tilePlacementString) {
+
+        if (tilePlacementString.length() != 5) {
+            throw new IllegalArgumentException("Invalid placement String: String too long");
+        } else if (!isTilePlacementWellFormed(tilePlacementString)) {
+            throw new IllegalArgumentException("Invalid placement String");
+        }
+
+        char[] array = tilePlacementString.toCharArray();
+
+        char[] nameArray = {array[0], array[1]};
+
+        //find the name of the pieces
+        String name = new String(nameArray);
+
+        //initialize feature placements
+        //n = north
+        //e = east
+        //s = south
+        //w = west
+        char n = 'a';
+        char e = 'b';
+        char s = 'c';
+        char w = 'd';
+
+        for (Pieces p : Pieces.values()) {
+            //check for piece name in pieces enum
+            if (p.name().equals(name)) {
+                //set feature placement variables depending on piece's orientation
+                if (array[4] == '0') {
+                    n = p.north;
+                    e = p.east;
+                    s = p.south;
+                    w = p.west;
+                } else if (array[4] == '1') {
+                    e = p.north;
+                    s = p.east;
+                    w = p.south;
+                    n = p.west;
+                } else if (array[4] == '2') {
+                    s = p.north;
+                    w = p.east;
+                    n = p.south;
+                    e = p.west;
+                } else if (array[4] == '3') {
+                    w = p.north;
+                    n = p.east;
+                    e = p.south;
+                    s = p.west;
+                } else if (array[4] == '4') {
+                    n = p.north;
+                    e = p.west;
+                    s = p.south;
+                    w = p.east;
+                } else if (array[4] == '5') {
+                    e = p.north;
+                    s = p.west;
+                    w = p.south;
+                    n = p.east;
+                } else if (array[4] == '6') {
+                    s = p.north;
+                    w = p.west;
+                    n = p.south;
+                    e = p.east;
+                } else if (array[4] == '7') {
+                    w = p.north;
+                    n = p.west;
+                    e = p.south;
+                    s = p.east;
+                } else {
+                    throw new IndexOutOfBoundsException("Tried to pass an invalid orientation");
+                }
+            }
+        }
+
+        char[] features = {n, e, s, w};
+
+        return features;
+    }
+
+    //Authored by Harriet
+    public static char connectionLocation(String tilePlacementStringA, String tilePlacementStringB) {
+
+        if (!isTilePlacementWellFormed(tilePlacementStringA)) {
+            throw new IllegalArgumentException("Invalid placement String: tilePlacementStringA");
+        } else if (!isTilePlacementWellFormed(tilePlacementStringB)) {
+            throw new IllegalArgumentException("Invalid placement String: tilePlacementStringB");
+        }
+
+        char[] p1 = tilePlacementStringA.toCharArray();
+        char[] p2 = tilePlacementStringB.toCharArray();
+
+        char[] l1 = {p1[2], p1[3]};
+        char[] l2 = {p2[2], p2[3]};
+
+        if (l2[0] == l1[0]) {
+            //check same row
+            if (l2[1] == l1[1] + 1) {
+                //if l2 is to the right of l1
+                return 'e';
+            } else if (l2[1] == l1[1] - 1) {
+                //if l2 is to the left of l1
+                return 'w';
+            } else {
+                return 'f';
+            }
+        } else if (l2[0] == l1[0] + 1) {
+            //check below
+            if (l2[1] == l1[1]) {
+                //if l2 is the same as l1
+                return 's';
+            } else {
+                return 'f';
+            }
+        } else if (l2[0] == l1[0] - 1) {
+            //check above
+            if (l2[1] == l1[1]) {
+                //if l2 is the same as l1
+                return 'n';
+            } else {
+                return 'f';
+            }
+        } else {
+            return 'f';
+        }
     }
 
     /**
@@ -55,18 +343,214 @@
      * A board string is valid if each tile placement is legal with respect to all previous tile
      * placements in the string, according to the rules for legal placements:
      * - A tile must be placed such that at least one edge connects to either an exit or a pre-existing route.
-     *   Such a connection is called a valid connection.
+     * Such a connection is called a valid connection.
      * - Tiles may not be placed such that a highway edge connects to a railway edge;
-     *   this is referred to as an invalid connection.
-     *   Highways and railways may only join at station tiles.
+     * this is referred to as an invalid connection.
+     * Highways and railways may only join at station tiles.
      * - A tile may have one or more edges touching a blank edge of another tile;
-     *   this is referred to as disconnected, but the placement is still legal.
+     * this is referred to as disconnected, but the placement is still legal.
      *
      * @param boardString a board string representing some placement sequence
      * @return true if placement sequence is valid
      */
+
+
+    /**
+     * Given a well-formed board String representing an ordered list of placements,
+     * Traversing all the tiles which the length is 5, check whether all the tiles are not coincident.
+     *
+     * @param boardString a board string representing some placement sequence
+     * @return true if all the tiles are not coincident
+     */
+    //Authored by Bojie
+    public static boolean notCover(String boardString) {
+        for (int i = 0; i < boardString.length(); i += 5) {
+            for (int j = 0; j < boardString.length(); j += 5) {
+                String s1 = boardString.substring(i, i + 5);
+                String s2 = boardString.substring(j, j + 5);
+                // trasversing all the tiles
+                if (i != j && s1.charAt(2) == s2.charAt(2) && s1.charAt(3) == s2.charAt(3)) {
+                    return false;
+                }
+                //check if their 3rd and 4th characters are consistent
+            }
+        }
+        return true;
+    }
+
+    /**
+     * Given a well-formed board String representing an ordered list of placements
+     * Check  whether all the connections to exits are legal.
+     *
+     * @param boardString a board string representing some placement sequence
+     * @return true if all the connections to the exits are legal.
+     */
+
+    //Authored by Bojie
+    public static boolean isExit(String boardString) {
+
+        boolean haveExit = false;
+        // Set a 'flag' haveExit and and initialize it to false.
+        // In the following 'if' statements, if the connections to exits are legal, assign true to haveExit.
+        //If not, return false.
+        //If do not set haveExit as a flag, the methods would return true even if there is only one legal connections to exits and the others are illegal.
+        for (int i = 0; i < boardString.length(); i += 5) {
+            String s = boardString.substring(i, i + 5);
+            String t = s.substring(0, 2) + s.charAt(4);
+            Tile tile = Tile.valueOf(t);
+
+            if (s.charAt(2) == 'A' && (s.charAt(3) == '1' || s.charAt(3) == '5')) {
+                if (tile.north == 1) {
+                    haveExit = true;
+                } else if (tile.north == 2) {
+                    return false;
+                }
+            }
+            if (s.charAt(2) == 'A' && s.charAt(3) == '3') {
+                if (tile.north == 2) {
+                    haveExit = true;
+                } else if (tile.north == 1) {
+                    return false;
+                }
+            }
+            if (s.charAt(2) == 'B' && s.charAt(3) == '0') {
+                if (tile.west == 2) {
+                    haveExit = true;
+                } else if (tile.west == 1) {
+                    return false;
+                }
+            }
+            if (s.charAt(2) == 'B' && s.charAt(3) == '6') {
+                if (tile.east == 2) {
+                    haveExit = true;
+                } else if (tile.east == 1) {
+                    return false;
+                }
+            }
+            if (s.charAt(2) == 'D' && s.charAt(3) == '0') {
+                if (tile.west == 1) {
+                    haveExit = true;
+                } else if (tile.west == 2) {
+                    return false;
+                }
+            }
+            if (s.charAt(2) == 'D' && s.charAt(3) == '6') {
+                if (tile.east == 1) {
+                    haveExit = true;
+                } else if (tile.east == 2) {
+                    return false;
+                }
+            }
+            if (s.charAt(2) == 'F' && s.charAt(3) == '0') {
+                if (tile.west == 2) {
+                    haveExit = true;
+                } else if (tile.west == 1) {
+                    return false;
+                }
+            }
+            if (s.charAt(2) == 'F' && s.charAt(3) == '6') {
+                if (tile.east == 2) {
+                    haveExit = true;
+                } else if (tile.east == 1) {
+                    return false;
+                }
+            }
+            if (s.charAt(2) == 'G' && (s.charAt(3) == '1' || s.charAt(3) == '5')) {
+                if (tile.south == 1) {
+                    haveExit = true;
+                } else if (tile.south == 2) {
+                    return false;
+                }
+            }
+            if (s.charAt(2) == 'G' && s.charAt(3) == '3') {
+                if (tile.south == 2) {
+                    haveExit = true;
+                } else if (tile.south == 1) {
+                    return false;
+                }
+            }
+
+        }
+
+        return haveExit;
+    }
+
+    /**
+     * Given a well-formed board String representing an ordered list of placements
+     * Check whether the connections between adjacent tiles are legal.
+     *
+     * @param boardString a board string representing some placement sequence
+     * @return true if all the connections between adjacent tiles are legal.
+     */
+
+    //Authored by Bojie
+    public static boolean isNeighbor(String boardString) {
+
+        boolean connect[] = new boolean[boardString.length()];
+        //set flags.
+        for (int i = 0; i < boardString.length(); i += 5) {
+            for (int j = 0; j < boardString.length(); j += 5) {
+                String s1 = boardString.substring(i, i + 5);
+                String s2 = boardString.substring(j, j + 5);
+                String t1 = s1.substring(0, 2) + s1.charAt(4);
+                String t2 = s2.substring(0, 2) + s2.charAt(4);
+                Tile tile1 = Tile.valueOf(t1);
+                Tile tile2 = Tile.valueOf(t2);
+                char row1 = s1.charAt(2);
+                char row2 = s2.charAt(2);
+                char column1 = s1.charAt(3);
+                char column2 = s2.charAt(3);
+                if (row1 == row2 && (column1 - column2) == 1) {
+                    if (tile1.west != 0 && tile1.west == tile2.east) {
+                        connect[i] = true;
+                    }
+                    if (tile1.west != 0 && tile2.east != 0 && tile1.west != tile2.east) {
+                        return false;
+                    }
+                    //check if the tile types in the four directions ( northern, eastern, southern, western) match
+                } else if (row1 == row2 && (column2 - column1) == 1) {
+                    if (tile1.east != 0 && tile1.east == tile2.west) {
+                        connect[i] = true;
+                    }
+
+                    if (tile1.east != 0 && tile2.west != 0 && tile1.east != tile2.west) {
+                        return false;
+                    }
+                } else if (column1 == column2 && (row1 - row2) == 1) {
+                    if (tile1.north != 0 && tile1.north == tile2.south) {
+                        connect[i] = true;
+                    }
+                    if (tile1.north != 0 && tile2.south != 0 && tile1.north != tile2.south) {
+                        return false;
+                    }
+                } else if (column1 == column2 && (row2 - row1) == 1) {
+                    if (tile1.south != 0 && tile1.south == tile2.north) {
+                        connect[i] = true;
+                    }
+
+                    if (tile1.south != 0 && tile2.north != 0 && tile1.south != tile2.north) {
+                        return false;
+                    }
+                }
+            }
+        }//check weather the neighbors are valid
+
+        for (int i = 0; i < boardString.length(); i += 5) {
+            String s = boardString.substring(i, i + 5);
+
+            if (!connect[i] && !isExit(s)) {
+                return false;
+            }
+        }//check if any tile have neighbor
+        return true;
+
+    }
+
+    //Authored by Bojie
     public static boolean isValidPlacementSequence(String boardString) {
-        // FIXME Task 6: determine whether the given placement sequence is valid
+        if (notCover(boardString) && isExit(boardString) && isNeighbor(boardString)) {
+            return true;
+        }
         return false;
     }
 
@@ -80,9 +564,21 @@
      *
      * @return a String representing the die roll e.g. A0A4A3B2
      */
+
+    //Authored by Harriet
     public static String generateDiceRoll() {
-        // FIXME Task 7: generate a dice roll
-        return "";
+        //generate a number between 0-5 for A or 0-2 for B
+        //convert number to a char, return string.
+        return "A" + (char) (rollNumber(5, 0) + '0') + "A" + (char) (rollNumber(5, 0) + '0')
+                + "A" + (char) (rollNumber(5, 0) + '0') + "B" + (char) (rollNumber(2, 0) + '0');
+    }
+
+    //Authored by Harriet
+    public static int rollNumber(int max, int min) {
+        //generate a number from 0 to max - 1;
+        Random rand = new Random();
+        int value = rand.nextInt(max + 1 - min) + min;
+        return value;
     }
 
     /**
@@ -96,24 +592,421 @@
      * @param boardString a board string representing a completed game
      * @return integer (positive or negative) for score *not* considering longest rail/highway
      */
+
+    //Authored by Bojie
+    public static boolean touchExit[] = new boolean[12];
+    public static boolean touchPile[] = new boolean[50];
+    public static String exits[] = new String[]{"A1", "A3", "A5", "B6", "D6", "F6", "G5", "G3", "G1", "F0", "D0", "B0"};
+
+    //Authored by Bojie
     public static int getBasicScore(String boardString) {
-        // FIXME Task 8: compute the basic score
+
+        int num = boardString.length() / 5;
+        int score = 0;
+        int finalPoints[] = new int[]{0, 0, 4, 8, 12, 16, 20, 24, 28, 32, 36, 40, 45};
+
+
+        for (int i = 0; i < touchExit.length; i++) {
+            touchExit[i] = false;
+        }
+        for (int i = 0; i < touchPile.length; i++) {
+            touchPile[i] = false;
+        }
+
+        String exitP = "";
+        for (int i = 0; i < 12; i++) {
+            int exitNum = 1;
+            int k = -1;
+            for (int j = 0; j < boardString.length(); j += 5) {
+                String s = boardString.substring(j, j + 5);
+                String t = s.substring(2, 4);
+                if (t.equals(exits[i])) {
+                    exitP = s;
+                    k = j / 5;
+                }
+            }
+            //find tiles connected with exits
+            if (!touchExit[i]) {
+                touchExit[i] = true;
+                int direction[] = new int[]{0, 1, 2, 3};
+                for (int j = 0; j < 4; j++) {
+                    if (k >= 0) {
+                        exitNum += exitNumber(exitP, k, j, exits[i], boardString);
+                    }
+                }
+            }
+            //calculate the total number of exits
+            score += finalPoints[exitNum];
+        }
+        score = score + centreGridNum(boardString) - missEdges(boardString);
+        return score;
+    }
+
+    //Authored by Bojie
+
+    /**
+     * find the order of exit which piece located at
+     *
+     * @param piece a given piece which is located at one exit
+     * @return the order of exit
+     */
+    public static int whichExit(String piece) {
+        for (int i = 0; i < exits.length; i++) {
+            String location = piece.substring(2, 4);
+            if (exits[i].equals(location)) {
+                return i;
+            }
+        }
         return -1;
     }
 
+    //Authored by Bojie
+
+    /**
+     * check the validation of direction between two tiles
+     * if direction=0, string2 is to the north of string1
+     * if direction=1, string2 is to the east of string1.
+     * if direction=2, string2 is to the south of string1.
+     * if direction=3, string2 is to the west of string1.
+     *
+     * @param string1   a given tile string1
+     * @param string2   a given tile string2
+     * @param direction a given direction
+     * @return true if the direction is valid
+     */
+    public static boolean isValidDirection(String string1, String string2, int direction) {
+
+        char row1 = string1.charAt(2);
+        char row2 = string2.charAt(2);
+        char column1 = string1.charAt(3);
+        char column2 = string2.charAt(3);
+        if (direction == 0 && column1 == column2 && row1 - row2 == 1) {
+            return true;
+        }
+        if (direction == 1 && row1 == row2 && column2 - column1 == 1) {
+            return true;
+        }
+        if (direction == 2 && column1 == column2 && row2 - row1 == 1) {
+            return true;
+        }
+        if (direction == 3 && row1 == row2 && column1 - column2 == 1) {
+            return true;
+        } else
+            return false;
+        //if direction=0； s2在s1上面；
+        // if direction=1: s2 is on the east of s1
+        // if direction=2: s2 is on the south of s1
+        // if direction=3: s2 is on the west of s1.
+    }
+
+    //Authored by Bojie
+
+    /**
+     * Use depth-first-search to search the number of exits in the process of searching from the current tile
+     *
+     * @param pieces        the current tile
+     * @param orderOfPieces the order number of tile in the boardString
+     * @param direction     the direction of the next search
+     * @param firstexit     the firstexit in the route of searching
+     * @param boardString   a board string representing some placement sequence
+     * @return the number of exits in the process of searching from the current tile
+     */
+    public static int exitNumber(String pieces, int orderOfPieces, int direction, String firstexit, String boardString) {
+
+        String location = pieces.charAt(2) + "" + pieces.charAt(3);
+        if (!location.equals(firstexit)) {
+            int isAnExit = -1;
+            for (int i = 0; i < 12; i++) {
+                if (location.equals(exits[i])) {
+                    isAnExit = i;
+                }
+            }
+            if (isAnExit >= 0 && direction == isAnExit / 3) {
+                if (!touchExit[isAnExit]) {
+                    touchExit[isAnExit] = true;
+                    return 1;
+                }
+                return 0;
+            }
+        }//judge the number of exits on the edge
+        int total = 0;
+        for (int i = 0; i < boardString.length(); i += 5) {
+            String s = boardString.substring(i, i + 5);
+            if (areConnectedNeighbours(s, pieces) && isValidDirection(pieces, s, direction)) {
+                String next = s;
+                touchPile[orderOfPieces] = true;// assign true to the tiles which have been searched
+                if (s.substring(0, 2).equals("B2")) {
+                    total += exitNumber(next, i / 5, direction, firstexit, boardString);
+                } else if (!touchPile[i / 5]) {
+                    total += exitNumber(next, i / 5, 0, firstexit, boardString);
+                    total += exitNumber(next, i / 5, 1, firstexit, boardString);
+                    total += exitNumber(next, i / 5, 2, firstexit, boardString);
+                    total += exitNumber(next, i / 5, 3, firstexit, boardString);
+                }
+                touchPile[orderOfPieces] = false;
+            }
+        }
+        return total;
+    }
+
+    /**
+     * Find the number of tiles which located at the center grid
+     *
+     * @param boardString a board string representing some placement sequence
+     * @return the number of tiles which located at the center grid
+     */
+    //Authored by Bojie
+    public static int centreGridNum(String boardString) {
+        int num = 0;
+        for (int i = 0; i < boardString.length(); i += 5) {
+            String location = boardString.substring(i + 2, i + 4);
+            if (location.equals("C2") || location.equals("C3") || location.equals("C4") ||
+                    location.equals("D2") || location.equals("D3") || location.equals("D4") ||
+                    location.equals("E2") || location.equals("E3") || location.equals("E4")) {
+                num++;
+            }
+        }
+        return num;
+    }
+
+    /**
+     * Judge if the tile exists in the boardString
+     *
+     * @param boardString a board string representing some placement sequence
+     * @param piece       a given tile
+     * @return true if the tile exists in the boardString.
+     */
+    //Authored by Bojie
+    public static boolean isBoardExist(String boardString, String piece) {
+        for (int i = 0; i < boardString.length(); i += 5) {
+            String location = boardString.substring(i + 2, i + 4);
+            if (location.equals(piece)) {
+                return true;
+            }
+        }
+        return false;
+    }
+
+    /**
+     * search the string of the tile which located at the given location
+     *
+     * @param boardString a board string representing some placement sequence
+     * @param location    a given location
+     * @return the string of the tile which located at the given location
+     */
+    //Authored by Bojie
+    public static String searchTile(String boardString, String location) {
+        String output = "";
+        for (int i = 0; i < boardString.length(); i += 5) {
+            String s = boardString.substring(i + 2, i + 4);
+            if (s.equals(location)) {
+                output = boardString.charAt(i) + "" + boardString.charAt(i + 1) + boardString.charAt(i + 4);
+                return output;
+            }
+        }
+        return output;
+    }
+
+    /**
+     * search the unconnected edges in the boardString
+     *
+     * @param boardString a board string representing some placement sequence
+     * @return the number of unconnected edges.
+     */
+    //Authored by Bojie
+    public static int missEdges(String boardString) {
+        int num = 0;
+        for (int i = 0; i < boardString.length(); i += 5) {
+            String str1 = boardString.charAt(i) + "" + boardString.charAt(i + 1) + boardString.charAt(i + 4);
+            char row1 = boardString.charAt(i + 2);
+            char volumn1 = boardString.charAt(i + 3);
+            Tile tile1 = Tile.valueOf(str1);
+
+            if (tile1.north != 0 && row1 != 'A') {
+                char row2 = (char) (row1 - 1);
+                String N = row2 + "" + volumn1;
+
+                if (!isBoardExist(boardString, N)) {
+                    num++;
+                } else if (isBoardExist(boardString, N)) {
+                    Tile tile2 = Tile.valueOf(searchTile(boardString, N));
+                    if (tile2.south == 0) {
+                        num++;
+                    }
+                }
+            }
+            if (tile1.east != 0 && volumn1 != '6') {
+                String E = row1 + "" + (char) (volumn1 + 1);
+
+                if (!isBoardExist(boardString, E)) {
+                    num++;
+                } else if (isBoardExist(boardString, E)) {
+                    Tile tile2 = Tile.valueOf(searchTile(boardString, E));
+                    if (tile2.west == 0) {
+                        num++;
+                    }
+                }
+            }
+            if (tile1.south != 0 && row1 != 'G') {
+                String S = (char) (row1 + 1) + "" + volumn1;
+                if (!isBoardExist(boardString, S)) {
+                    num++;
+                } else if (isBoardExist(boardString, S)) {
+                    Tile tile2 = Tile.valueOf(searchTile(boardString, S));
+                    if (tile2.north == 0) {
+                        num++;
+                    }
+                }
+            }
+            if (tile1.west != 0 && volumn1 != '0') {
+                String W = row1 + "" + (char) (volumn1 - 1);
+                if (!isBoardExist(boardString, W)) {
+                    num++;
+                } else if (isBoardExist(boardString, W)) {
+
+                    Tile tile2 = Tile.valueOf(searchTile(boardString, W));
+                    if (tile2.east == 0) {
+                        num++;
+                    }
+                }
+            }
+        }
+        return num;
+    }
+
+
     /**
      * Given a valid boardString and a dice roll for the round,
      * return a String representing an ordered sequence of valid piece placements for the round.
+     *
      * @param boardString a board string representing the current state of the game as at the start of the round
-     * @param diceRoll a String representing a dice roll for the round
+     * @param diceRoll    a String representing a dice roll for the round
      * @return a String representing an ordered sequence of valid piece placements for the current round
      * @see RailroadInk#generateDiceRoll()
      */
+
+    //Authored by Bojie and Harriet
     public static String generateMove(String boardString, String diceRoll) {
-        // FIXME Task 10: generate a valid move
-        return null;
+        String tileString1 = diceRoll.toCharArray()[0] + "" + diceRoll.toCharArray()[1] + "A0" + "0";
+        String tileString2 = diceRoll.toCharArray()[2] + "" + diceRoll.toCharArray()[3] + "A0" + "0";
+        String tileString3 = diceRoll.toCharArray()[4] + "" + diceRoll.toCharArray()[5] + "A0" + "0";
+        String tileString4 = diceRoll.toCharArray()[6] + "" + diceRoll.toCharArray()[7] + "A0" + "0";
+
+        String placementSequence = "";
+
+        String[] tileStringArray = {tileString1, tileString2, tileString3, tileString4};
+
+        boolean[] tiles = new boolean[4];
+        boolean[] specialTile = new boolean[6];
+        boolean[] newTilesString = new boolean[5];
+        int specialNUmber = 0;
+        boolean haveAddedSpecial = false;
+        for (int i = 0; i < boardString.length(); i += 5) {
+            String speicalT = boardString.substring(i, i + 2);
+            if (speicalT.equals("S0")) {
+                specialTile[0] = true;
+                specialNUmber++;
+            }
+            if (speicalT.equals("S1")) {
+                specialTile[1] = true;
+                specialNUmber++;
+            }
+            if (speicalT.equals("S2")) {
+                specialTile[2] = true;
+                specialNUmber++;
+            }
+            if (speicalT.equals("S3")) {
+                specialTile[3] = true;
+                specialNUmber++;
+            }
+            if (speicalT.equals("S4")) {
+                specialTile[4] = true;
+                specialNUmber++;
+            }
+            if (speicalT.equals("S5")) {
+                specialTile[5] = true;
+                specialNUmber++;
+            }
+        }// check the number of special tile
+
+        for (int i = 0; i < 5; i++) {
+            for (int k = 0; k < 4; k++) {
+                if (tiles[k]) {
+                    continue;
+                }//whether the kth bit in diceroll has been used
+                char[] tile = tileStringArray[k].toCharArray();
+                for (char c = 'A'; c < 'H'; c++) {
+                    tile[2] = c;
+                    for (char j = '0'; j < '7'; j++) {
+                        tile[3] = j;
+                        for (char l = '0'; l < '8'; l++) {
+                            tile[4] = l;
+                            String tileString = "" + tile[0] + tile[1] + tile[2] + tile[3] + tile[4];
+                            if (isValidPlacementSequence(boardString + tileString) && !newTilesString[i]) {
+                                boardString = boardString + tileString;
+                                placementSequence = placementSequence + tileString;
+                                tiles[k] = true;
+                                newTilesString[i] = true;
+                            }
+                        }
+                    }
+                }
+            }
+            for (int s = 0; s < specialTile.length && specialNUmber < 3 && haveAddedSpecial; s++) {
+                if (!specialTile[s]) {
+                    if (specialTile[s]) {
+                        continue;
+                    }//whether the sth bit in specialTile has been used
+                    char t = '0';
+                    t += s;
+                    String specialType = "S" + t;
+
+                    for (char c = 'A'; c < 'H'; c++) {
+                        for (char j = '0'; j < '7'; j++) {
+                            for (char l = '0'; l < '8'; l++) {
+                                String tailString = specialType + c + "" + j + l;
+
+                                if (isValidPlacementSequence(boardString + tailString) && !newTilesString[i]) {
+                                    boardString = boardString + tailString;
+                                    placementSequence = placementSequence + tailString;
+                                    newTilesString[i] = true;//
+                                    specialTile[s] = true;
+                                    haveAddedSpecial = true;
+                                }
+
+                            }
+                        }
+                    }
+                }
+            }
+        }
+        return placementSequence;
     }
 
+
+    public static boolean findPlacementForTile(String boardString, String tileName) {
+        String tileString1 = tileName + "A0" + "0";
+        boolean found = false;
+
+        char[] tile = tileString1.toCharArray();
+        for (char c = 'A'; c < 'H' && !found; c++) {
+            tile[2] = c;
+            for (char j = '0'; j < '7' && !found; j++) {
+                tile[3] = j;
+                for (char i = '0'; i < '8' && !found; i++) {
+                    tile[4] = i;
+                    String tileString = "" + tile[0] + tile[1] + tile[2] + tile[3] + tile[4];
+                    if (isValidPlacementSequence(boardString + tileString)) {
+                        return true;
+                    }
+                }
+            }
+        }
+        return false;
+
+    }
+
+
     /**
      * Given the current state of a game board, output an integer representing the sum of all the factors contributing
      * to `getBasicScore`, as well as those attributed to:
@@ -124,9 +1017,113 @@
      * @param boardString a board string representing a completed game
      * @return integer (positive or negative) for final score (not counting expansion packs)
      */
+
+
+    /**
+     * use one Method "findMaxLength" (based on depth-first-search) to find the max length Railway and Highway
+     */
+
+    //Authored by Bojie
     public static int getAdvancedScore(String boardString) {
-        // FIXME Task 12: compute the total score including bonus points
-        return -1;
+        int maxRailWay = 0;
+        int maxHighWay = 0;
+
+        for (int i = 0; i < touchPile.length; i++) {
+            touchPile[i] = false;
+        }
+        //assign 'false' to each piles on the board, which means this pile haven't been searched
+
+        for (int i = 0; i < boardString.length(); i += 5) {
+            String piece = boardString.substring(i, i + 5);
+            String type = piece.charAt(0) + "" + piece.charAt(1) + piece.charAt(4);
+            Tile tile = Tile.valueOf(type);
+            //traverse each piece in the boardString, the type of piece depends on its 0,1,4 digits.
+
+            if (tile.north == 1) {
+                maxHighWay = Math.max(maxHighWay, findMaxLength(piece, i / 5, 0, tile.north, 1, boardString));
+            }
+            if (tile.east == 1) {
+                maxHighWay = Math.max(maxHighWay, findMaxLength(piece, i / 5, 1, tile.east, 1, boardString));
+            }
+            if (tile.south == 1) {
+                maxHighWay = Math.max(maxHighWay, findMaxLength(piece, i / 5, 2, tile.south, 1, boardString));
+            }
+            if (tile.west == 1) {
+                maxHighWay = Math.max(maxHighWay, findMaxLength(piece, i / 5, 3, tile.west, 1, boardString));
+            }
+            //calling the iterator function in for direction to calculate the maxHighway
+
+            if (tile.north == 2) {
+                maxRailWay = Math.max(maxRailWay, findMaxLength(piece, i / 5, 0, tile.north, 1, boardString));
+            }
+            if (tile.east == 2) {
+                maxRailWay = Math.max(maxRailWay, findMaxLength(piece, i / 5, 1, tile.east, 1, boardString));
+            }
+            if (tile.south == 2) {
+                maxRailWay = Math.max(maxRailWay, findMaxLength(piece, i / 5, 2, tile.south, 1, boardString));
+            }
+            if (tile.west == 2) {
+                maxRailWay = Math.max(maxRailWay, findMaxLength(piece, i / 5, 3, tile.west, 1, boardString));
+            }
+            //calling the iterator function in for direction to calculate the maxRailway
+
+
+        }
+        return maxHighWay + maxRailWay + getBasicScore(boardString);
+    }
+
+    /**
+     * Find the maximum length of the road from the current piece
+     *
+     * @param piece         a given current piece
+     * @param orderOfNumber the order of piece in the boardString
+     * @param direction     the direction of the next search.'0' means north, '1' means east, '2'means south, '3' means west
+     * @param type          the type of tile, '1' means highway, '2' means railway.
+     * @param deep          the depth of iterator function, the deep will be deep+1 after one iteration.
+     * @param boardString   a board string representing a completed game
+     * @return the maximun length of the road from the current piece
+     */
+
+    //Authored by Bojie
+    public static int findMaxLength(String piece, int orderOfNumber, int direction, int type, int deep, String
+            boardString) {
+        int length = deep;
+        for (int i = 0; i < boardString.length(); i += 5) {
+            String s = boardString.substring(i, i + 5);
+            if (!touchPile[i / 5] && areConnectedNeighbours(piece, s) && isValidDirection(piece, s, direction)) {
+                touchPile[orderOfNumber] = true;
+                String next = s;
+                String nextType = next.charAt(0) + "" + next.charAt(1) + next.charAt(4);
+                Tile nextTile = Tile.valueOf(nextType);
+                if (nextTile.north == type) {
+                    length = Math.max(length, findMaxLength(next, i / 5, 0, type, deep + 1, boardString));
+                }
+                if (nextTile.east == type) {
+                    length = Math.max(length, findMaxLength(next, i / 5, 1, type, deep + 1, boardString));
+                }
+                if (nextTile.south == type) {
+                    length = Math.max(length, findMaxLength(next, i / 5, 2, type, deep + 1, boardString));
+                }
+                if (nextTile.west == type) {
+                    length = Math.max(length, findMaxLength(next, i / 5, 3, type, deep + 1, boardString));
+                }
+                touchPile[orderOfNumber] = false;
+
+            }
+        }
+        return length;
+    }
+
+    //Authored by Harriet
+    public static String boardListToBoardString(HashMap<String, String> boardList) {
+        String boardString = "";
+        for (String str : boardList.keySet()) {
+            boardString = boardString + boardList.get(str);
+        }
+        return boardString;
     }
 }
 
+
+
+
Only in comp1110-ass2/src/comp1110/ass2: Test.class
Only in comp1110-ass2/src/comp1110/ass2: Test.java
Only in comp1110-ass2/src/comp1110/ass2: Tile.class
Only in comp1110-ass2/src/comp1110/ass2: Tile.java
Only in comp1110-ass2/src: gittest
Only in comp1110-ass2/src: META-INF
diff -ru -x .git ../master/comp1110-ass2/tests/comp1110/ass2/GenerateDiceRollTest.java comp1110-ass2/tests/comp1110/ass2/GenerateDiceRollTest.java
--- ../master/comp1110-ass2/tests/comp1110/ass2/GenerateDiceRollTest.java	2019-05-24 13:59:05.100400629 +1000
+++ comp1110-ass2/tests/comp1110/ass2/GenerateDiceRollTest.java	2019-05-24 14:38:29.234878272 +1000
@@ -46,7 +46,6 @@
             assertFalse("Expected dice B to be rolled once, but you rolled it " + b + " time/s: " + roll, b != 1);
             assertFalse("Expected dice A and B but you rolled a different die" + x + " time/s " + roll, x != 0);
         }
-
     }
 
     private char[][] validFace = {{'0', '1', '2', '3', '4', '5'}, {'0', '1', '2'}};
Only in comp1110-ass2/tests/comp1110/ass2: RailroadInkTests.java
Only in comp1110-ass2/tests/comp1110/ass2: task2Test.java
Only in comp1110-ass2/tests/comp1110/ass2: task3Test.java
Only in comp1110-ass2/tests/comp1110/ass2: task6Test.java
```
## Test log
```
--javac output--
----
JUnit version 4.12
...
Time: 0.056

OK (3 tests)

JUnit version 4.12
......
Time: 0.073

OK (6 tests)

JUnit version 4.12
.....
Time: 0.035

OK (5 tests)

JUnit version 4.12
.....
Time: 0.11

OK (5 tests)

JUnit version 4.12
....
Time: 0.122

OK (4 tests)

JUnit version 4.12
.Sample game A3D61A3D53B0C52A0B52A2B63A4D41B0E60A0F61A3D31A3D23A2G30B0F34A3E32A1B01B2B10A1B21A0A63A4D01A1G41B0G12S2D10A4C10B2A10A2B33A1A30S4E11A4E21A3C21A3C31S5F11
score 24
Sample game A3A10A3A52A3G10B2F10S1B50A2B61A0C60A1B41B1A35A4A41A2B31A1C30B0D32A2C50A4E10A3D12B2B10A2F01A0G00A4D01B1A27S3B20A4C10A1D50A0F23B2G25A3E30A4E41
score 18
Sample game A2A30A0A43A3A50B2B50A4C50A3D50A2B43B0G12B0A14A2B33A0B11A4E50A3D61A2B21A3G52B1G45A3F52B2F41A3F33A1E40A1D40A3E32A3E27B0F10S0E12B1D17A4D01A1B61A0C43
score 21
Sample game A4A50A1F61A0B61S5F50B1F46A1F01S1F12A2F23A1E20B2D21A3D03A1C20A0B22B1A61A4D11A4G10B1G44A2G30A3C01A3C12B0B31A1B01A4B50B0C50A2F32A0E32A0E40A4D31B1D47A1B11
score 15
Sample game A4A50A1A30B2B31A0C34A3B41B2C40A3B52A2B60A2C62S5C50B1D65A4B21A2A60A3B10A4A10A4C10B2G10B2F10A4E10A3D12A1F01S2D00A4C00B1B02A0F23A0G20A2F61B2F50A3G52A0G02
score 23
Sample game A4G10B2F10A4E10A0F20A3D17A0E22A2E31B1E44S0D42A3D23A4D31A2F30B1F42A1G30A0C42A0C57B0C22A2F03A1E02S5D01A0B22B0A50A4D51A3D61B2B53A0B30B2A31A4E60A3A41A0B03
score 23
Sample game A3A10B2A31A1B30A0F61A4A21B1B14A4A41A4D61S2A50A5A63A2B01A1C02B0G52S0B63A0E63A2E51A4D51B0C32A5D31A5C61A0E41S5D41B1D03A5B51A4G10A0C42B0G30A2F52A5F12B2F21A0F00
score 26
Sample game A0B06A5A50A5A42A3B44A3C42A3D44B2D35B2C37A0B33A2B27A2E35B2C27A4C13A5C05A1F01B2D21A1F15A5D04A4D11A2E20B1B10A4A10S4E44A3E55A2F25S3F40B2F30A3D50A4D67
score 17
E...
Time: 0.085
There was 1 failure:
1) testSampleGames(comp1110.ass2.GetBasicScoreTest)
java.lang.AssertionError: Sample game including networks connecting [4] exits covering 9 centre squares with 8 errors: expected total score 13 but RailroadInk.getBasicScore returned total score: 17
	at org.junit.Assert.fail(Assert.java:88)
	at org.junit.Assert.assertTrue(Assert.java:41)
	at comp1110.ass2.GetBasicScoreTest.testSampleGames(GetBasicScoreTest.java:67)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:566)
	at org.junit.runners.model.FrameworkMethod$1.runReflectiveCall(FrameworkMethod.java:50)
	at org.junit.internal.runners.model.ReflectiveCallable.run(ReflectiveCallable.java:12)
	at org.junit.runners.model.FrameworkMethod.invokeExplosively(FrameworkMethod.java:47)
	at org.junit.internal.runners.statements.InvokeMethod.evaluate(InvokeMethod.java:17)
	at org.junit.internal.runners.statements.FailOnTimeout$CallableStatement.call(FailOnTimeout.java:298)
	at org.junit.internal.runners.statements.FailOnTimeout$CallableStatement.call(FailOnTimeout.java:292)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at java.base/java.lang.Thread.run(Thread.java:834)

FAILURES!!!
Tests run: 4,  Failures: 1

JUnit version 4.12
.....
Time: 2.174

OK (5 tests)

JUnit version 4.12
.Sample game A3D61A3D53B0C52A0B52A2B63A4D41B0E60A0F61A3D31A3D23A2G30B0F34A3E32A1B01B2B10A1B21A0A63A4D01A1G41B0G12S2D10A4C10B2A10A2B33A1A30S4E11A4E21A3C21A3C31S5F11
score 41
Sample game A3A10A3A52A3G10B2F10S1B50A2B61A0C60A1B41B1A35A4A41A2B31A1C30B0D32A2C50A4E10A3D12B2B10A2F01A0G00A4D01B1A27S3B20A4C10A1D50A0F23B2G25A3E30A4E41
score 36
Sample game A2A30A0A43A3A50B2B50A4C50A3D50A2B43B0G12B0A14A2B33A0B11A4E50A3D61A2B21A3G52B1G45A3F52B2F41A3F33A1E40A1D40A3E32A3E27B0F10S0E12B1D17A4D01A1B61A0C43
score 42
Sample game A4A50A1F61A0B61S5F50B1F46A1F01S1F12A2F23A1E20B2D21A3D03A1C20A0B22B1A61A4D11A4G10B1G44A2G30A3C01A3C12B0B31A1B01A4B50B0C50A2F32A0E32A0E40A4D31B1D47A1B11
score 32
Sample game A4A50A1A30B2B31A0C34A3B41B2C40A3B52A2B60A2C62S5C50B1D65A4B21A2A60A3B10A4A10A4C10B2G10B2F10A4E10A3D12A1F01S2D00A4C00B1B02A0F23A0G20A2F61B2F50A3G52A0G02
score 42
Sample game A4G10B2F10A4E10A0F20A3D17A0E22A2E31B1E44S0D42A3D23A4D31A2F30B1F42A1G30A0C42A0C57B0C22A2F03A1E02S5D01A0B22B0A50A4D51A3D61B2B53A0B30B2A31A4E60A3A41A0B03
score 42
Sample game A3A10B2A31A1B30A0F61A4A21B1B14A4A41A4D61S2A50A5A63A2B01A1C02B0G52S0B63A0E63A2E51A4D51B0C32A5D31A5C61A0E41S5D41B1D03A5B51A4G10A0C42B0G30A2F52A5F12B2F21A0F00
score 41
Sample game A0B06A5A50A5A42A3B44A3C42A3D44B2D35B2C37A0B33A2B27A2E35B2C27A4C13A5C05A1F01B2D21A1F15A5D04A4D11A2E20B1B10A4A10S4E44A3E55A2F25S3F40B2F30A3D50A4D67
score 48
E.
Time: 0.236
There was 1 failure:
1) testSampleGames(comp1110.ass2.GetAdvancedScoreTest)
java.lang.AssertionError: Sample game including networks connecting [4] exits covering 9 centre squares with 8 errors longest railway 14 longest road 17: expected total score 44 but RailroadInk.getAdvancedScore returned total score: 48
	at org.junit.Assert.fail(Assert.java:88)
	at org.junit.Assert.assertTrue(Assert.java:41)
	at comp1110.ass2.GetAdvancedScoreTest.testSampleGames(GetAdvancedScoreTest.java:26)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:566)
	at org.junit.runners.model.FrameworkMethod$1.runReflectiveCall(FrameworkMethod.java:50)
	at org.junit.internal.runners.model.ReflectiveCallable.run(ReflectiveCallable.java:12)
	at org.junit.runners.model.FrameworkMethod.invokeExplosively(FrameworkMethod.java:47)
	at org.junit.internal.runners.statements.InvokeMethod.evaluate(InvokeMethod.java:17)
	at org.junit.internal.runners.statements.FailOnTimeout$CallableStatement.call(FailOnTimeout.java:298)
	at org.junit.internal.runners.statements.FailOnTimeout$CallableStatement.call(FailOnTimeout.java:292)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at java.base/java.lang.Thread.run(Thread.java:834)

FAILURES!!!
Tests run: 2,  Failures: 1

```

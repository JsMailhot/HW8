# HW8
#### A homework assignment we work on together!
## What problem does the Observer pattern help solve?
### A). This allows the subject and  observer to form a publish-subscribe relationship, so that if you had a problem where you need multiple objects updated in the same way then the Observer pattern would be able to solve this. It decouples the observer from the object, the subject doesn’t need to know anything special about its observers. When the subject does generate an event (this event being based on whatever the subject triggers even, odds, etc)  it will just pass it to each of the observers. 

## How would you describe the Observer pattern?
### A). Our Obsever pattern is based on an Array List which based on the Subjects (subscribers) if they generate an event then it will pass to the observers which will inform any updates or changes needed based on the event.

## Where is polymorphism used in this pattern?
### A). Polymorphism is when class objects inherit from the parent class and the class  has functions with the same name but with different behaviors. This polymorphism takes place as the subscribers all have their own implementation of an abstract method that would call the notifySubsrciber based on the event that is triggered. 

## Did the UML diagrams make the coding more straightforward?
### A). It did help with giving us a bit of a starting ground, it also helped with identifying the Observer Pattern with the arrows defining which is which. We still had to add some methods and variables but it did help give us an idea of the relationships.

## Link to GitHub Repository & Accounts.
### 1). https://github.com/JsMailhot/HW8
### 2). https://github.com/catbennett
### 3). https://github.com/GautreauJ
### 4). https://github.com/JsMailhot

## Output of a sample run.
Sequence Number: 0 eventDataValue: -215805293<br/>
Sequence Number: 1 eventDataValue: 748125249<br/>
SubscriberOdds: Event is odd: 748125249<br/>
SubscriberThrees: Event is divisible by 3: 748125249<br/>
Sequence Number: 2 eventDataValue: 1178836170<br/>
SubscriberEvens: Event is even: 1178836170<br/>
SubscriberThrees: Event is divisible by 3: 1178836170<br/>
Sequence Number: 3 eventDataValue: 1294545538<br/>
SubscriberEvens: Event is even: 1294545538<br/>
Sequence Number: 4 eventDataValue: 1135072751<br/>
SubscriberOdds: Event is odd: 1135072751<br/>
Sequence Number: 5 eventDataValue: -2038556725<br/>
Sequence Number: 6 eventDataValue: 814029625<br/>
SubscriberOdds: Event is odd: 814029625<br/>
Sequence Number: 7 eventDataValue: 2097217228<br/>
SubscriberEvens: Event is even: 2097217228<br/>
Sequence Number: 8 eventDataValue: 685038344<br/>
SubscriberEvens: Event is even: 685038344<br/>
Sequence Number: 9 eventDataValue: -1955369380<br/>
SubscriberEvens: Event is even: -1955369380<br/>
Sequence Number: 10 eventDataValue: 805346238<br/>
SubscriberEvens: Event is even: 805346238<br/>
SubscriberThrees: Event is divisible by 3: 805346238<br/>
Sequence Number: 11 eventDataValue: 2078561839<br/>
SubscriberOdds: Event is odd: 2078561839<br/>
Sequence Number: 12 eventDataValue: 831928526<br/>
SubscriberEvens: Event is even: 831928526<br/>
Sequence Number: 13 eventDataValue: -2064430583<br/>
Sequence Number: 14 eventDataValue: -52922573<br/>
Sequence Number: 15 eventDataValue: 61046690<br/>
SubscriberEvens: Event is even: 61046690<br/>
Sequence Number: 16 eventDataValue: -495607617<br/>
SubscriberThrees: Event is divisible by 3: -495607617<br/>
Sequence Number: 17 eventDataValue: 105674253<br/>
SubscriberOdds: Event is odd: 105674253<br/>
SubscriberThrees: Event is divisible by 3: 105674253<br/>
Sequence Number: 18 eventDataValue: -954013696<br/>
SubscriberEvens: Event is even: -954013696<br/>
Sequence Number: 19 eventDataValue: 482150391<br/>
SubscriberOdds: Event is odd: 482150391<br/>
SubscriberThrees: Event is divisible by 3: 482150391<br/>
Sequence Number: 20 eventDataValue: 1927421479<br/>
SubscriberOdds: Event is odd: 1927421479<br/>
Sequence Number: 21 eventDataValue: -102636184<br/>
SubscriberEvens: Event is even: -102636184<br/>
Sequence Number: 22 eventDataValue: -200742339<br/>
SubscriberThrees: Event is divisible by 3: -200742339<br/>
Sequence Number: 23 eventDataValue: -779319625<br/>
Sequence Number: 24 eventDataValue: 455636714<br/>
SubscriberEvens: Event is even: 455636714<br/>
Sequence Number: 25 eventDataValue: 1180043277<br/>
SubscriberOdds: Event is odd: 1180043277<br/>
SubscriberThrees: Event is divisible by 3: 1180043277<br/>
Sequence Number: 26 eventDataValue: -546433670<br/>
SubscriberEvens: Event is even: -546433670<br/>
Sequence Number: 27 eventDataValue: 1631599023<br/>
SubscriberOdds: Event is odd: 1631599023<br/>
SubscriberThrees: Event is divisible by 3: 1631599023<br/>
Sequence Number: 28 eventDataValue: -1234372047<br/>
SubscriberThrees: Event is divisible by 3: -1234372047<br/>
Sequence Number: 29 eventDataValue: -589179175<br/>
Sequence Number: 30 eventDataValue: -279997583<br/>
Sequence Number: 31 eventDataValue: -676166008<br/>
SubscriberEvens: Event is even: -676166008<br/>
Sequence Number: 32 eventDataValue: -1389913592<br/>
SubscriberEvens: Event is even: -1389913592<br/>
Sequence Number: 33 eventDataValue: -52452689<br/>
Sequence Number: 34 eventDataValue: 1759573975<br/>
SubscriberOdds: Event is odd: 1759573975<br/>
Sequence Number: 35 eventDataValue: -669266292<br/>
SubscriberEvens: Event is even: -669266292<br/>
Sequence Number: 36 eventDataValue: 1935861126<br/>
SubscriberEvens: Event is even: 1935861126<br/>
Sequence Number: 37 eventDataValue: -1657278421<br/>
Sequence Number: 38 eventDataValue: -2097940224<br/>
SubscriberEvens: Event is even: -2097940224<br/>
Sequence Number: 39 eventDataValue: -191416995<br/>
Sequence Number: 40 eventDataValue: 20526372<br/>
SubscriberEvens: Event is even: 20526372<br/>
Sequence Number: 41 eventDataValue: -1504804581<br/>
SubscriberThrees: Event is divisible by 3: -1504804581<br/>
Sequence Number: 42 eventDataValue: 671111784<br/>
SubscriberEvens: Event is even: 671111784<br/>
SubscriberThrees: Event is divisible by 3: 671111784<br/>
Sequence Number: 43 eventDataValue: 1116676000<br/>
SubscriberEvens: Event is even: 1116676000<br/>
Sequence Number: 44 eventDataValue: 209814594<br/>
SubscriberEvens: Event is even: 209814594<br/>
Sequence Number: 45 eventDataValue: 1759454561<br/>
SubscriberOdds: Event is odd: 1759454561<br/>
Sequence Number: 46 eventDataValue: 1177983318<br/>
SubscriberThrees: Event is divisible by 3: 1177983318<br/>
Sequence Number: 47 eventDataValue: 1996056997<br/>
SubscriberOdds: Event is odd: 1996056997<br/>
Sequence Number: 48 eventDataValue: 2024141844<br/>
SubscriberThrees: Event is divisible by 3: 2024141844<br/>
Sequence Number: 49 eventDataValue: 36635590<br/>
Sequence Number: 50 eventDataValue: -533887185<br/>
SubscriberThrees: Event is divisible by 3: -533887185<br/>
Sequence Number: 51 eventDataValue: -969725358<br/>
SubscriberThrees: Event is divisible by 3: -969725358<br/>
Sequence Number: 52 eventDataValue: 1270931714<br/>
Sequence Number: 53 eventDataValue: -548997312<br/>
SubscriberThrees: Event is divisible by 3: -548997312<br/>
Sequence Number: 54 eventDataValue: 1385781221<br/>
SubscriberOdds: Event is odd: 1385781221<br/>
Sequence Number: 55 eventDataValue: 1164168309<br/>
SubscriberOdds: Event is odd: 1164168309<br/>
Sequence Number: 56 eventDataValue: 1388208606<br/>
SubscriberThrees: Event is divisible by 3: 1388208606<br/>
Sequence Number: 57 eventDataValue: 315471400<br/>
Sequence Number: 58 eventDataValue: -2144836749<br/>
SubscriberThrees: Event is divisible by 3: -2144836749<br/>
Sequence Number: 59 eventDataValue: -846291195<br/>
SubscriberThrees: Event is divisible by 3: -846291195<br/>
Sequence Number: 60 eventDataValue: 1466690852<br/>
Sequence Number: 61 eventDataValue: 1810410741<br/>
Sequence Number: 62 eventDataValue: -1228154542<br/>
Sequence Number: 63 eventDataValue: 1979616525<br/>
Sequence Number: 64 eventDataValue: 12413400<br/>
Sequence Number: 65 eventDataValue: -1785930827<br/>
Sequence Number: 66 eventDataValue: 2078509209<br/>
Sequence Number: 67 eventDataValue: 1921290328<br/>
Sequence Number: 68 eventDataValue: 162611312<br/>
Sequence Number: 69 eventDataValue: 1224995128<br/>
Sequence Number: 70 eventDataValue: 529261657<br/>
Sequence Number: 71 eventDataValue: 546651422<br/>
Sequence Number: 72 eventDataValue: 1169283717<br/>
Sequence Number: 73 eventDataValue: -439734841<br/>
Sequence Number: 74 eventDataValue: -319754992<br/>
Sequence Number: 75 eventDataValue: 1345474805<br/>
Sequence Number: 76 eventDataValue: -1615075177<br/>
Sequence Number: 77 eventDataValue: -1406108917<br/>
Sequence Number: 78 eventDataValue: 1015151847<br/>
Sequence Number: 79 eventDataValue: -874886043<br/>
Sequence Number: 80 eventDataValue: -1757373610<br/>
Sequence Number: 81 eventDataValue: 1081542291<br/>
SubscriberOdds: Event is odd: 1081542291<br/>
SubscriberThrees: Event is divisible by 3: 1081542291<br/>
Sequence Number: 82 eventDataValue: -2107196395<br/>
Sequence Number: 83 eventDataValue: 1427426447<br/>
SubscriberOdds: Event is odd: 1427426447<br/>
Sequence Number: 84 eventDataValue: 1884635087<br/>
SubscriberOdds: Event is odd: 1884635087<br/>
Sequence Number: 85 eventDataValue: -717736055<br/>
Sequence Number: 86 eventDataValue: -1593620842<br/>
SubscriberEvens: Event is even: -1593620842<br/>
Sequence Number: 87 eventDataValue: 1186041501<br/>
SubscriberOdds: Event is odd: 1186041501<br/>
SubscriberThrees: Event is divisible by 3: 1186041501<br/>
Sequence Number: 88 eventDataValue: -1198640987<br/>
Sequence Number: 89 eventDataValue: -684023675<br/>
Sequence Number: 90 eventDataValue: -1115828216<br/>
SubscriberEvens: Event is even: -1115828216<br/>
Sequence Number: 91 eventDataValue: -52015087<br/>
Sequence Number: 92 eventDataValue: -63834035<br/>
Sequence Number: 93 eventDataValue: -163470631<br/>
Sequence Number: 94 eventDataValue: 1361849488<br/>
SubscriberEvens: Event is even: 1361849488<br/>
Sequence Number: 95 eventDataValue: -1495885452<br/>
SubscriberEvens: Event is even: -1495885452<br/>
SubscriberThrees: Event is divisible by 3: -1495885452<br/>
Sequence Number: 96 eventDataValue: 527269263<br/>
SubscriberOdds: Event is odd: 527269263<br/>
SubscriberThrees: Event is divisible by 3: 527269263<br/>
Sequence Number: 97 eventDataValue: -1961801288<br/>
SubscriberEvens: Event is even: -1961801288<br/>
Sequence Number: 98 eventDataValue: -372440142<br/>
SubscriberEvens: Event is even: -372440142<br/>
SubscriberThrees: Event is divisible by 3: -372440142<br/>
Sequence Number: 99 eventDataValue: 1065913349<br/>
SubscriberOdds: Event is odd: 1065913349<br/>
Sequence Number: 100 eventDataValue: -1202660155<br/>
Sequence Number: 101 eventDataValue: 509231108<br/>
SubscriberEvens: Event is even: 509231108<br/>
Sequence Number: 102 eventDataValue: -1853950487<br/>
Sequence Number: 103 eventDataValue: 262675307<br/>
SubscriberOdds: Event is odd: 262675307<br/>
Sequence Number: 104 eventDataValue: 1114931611<br/>
SubscriberOdds: Event is odd: 1114931611<br/>
Sequence Number: 105 eventDataValue: 307684823<br/>
SubscriberOdds: Event is odd: 307684823<br/>
Sequence Number: 106 eventDataValue: -402552888<br/>
SubscriberEvens: Event is even: -402552888<br/>
SubscriberThrees: Event is divisible by 3: -402552888<br/>
Sequence Number: 107 eventDataValue: 297979262<br/>
SubscriberEvens: Event is even: 297979262<br/>
Sequence Number: 108 eventDataValue: -2139960253<br/>
Sequence Number: 109 eventDataValue: 331136915<br/>
SubscriberOdds: Event is odd: 331136915<br/>
Sequence Number: 110 eventDataValue: 1543876106<br/>
SubscriberEvens: Event is even: 1543876106<br/>
Sequence Number: 111 eventDataValue: 811502602<br/>
SubscriberEvens: Event is even: 811502602<br/>
Sequence Number: 112 eventDataValue: 2065348545<br/>
SubscriberOdds: Event is odd: 2065348545<br/>
SubscriberThrees: Event is divisible by 3: 2065348545<br/>
Sequence Number: 113 eventDataValue: 589821854<br/>
SubscriberEvens: Event is even: 589821854<br/>
Sequence Number: 114 eventDataValue: 644380166<br/>
SubscriberEvens: Event is even: 644380166<br/>
Sequence Number: 115 eventDataValue: -1957155394<br/>
SubscriberEvens: Event is even: -1957155394<br/>
Sequence Number: 116 eventDataValue: -877807894<br/>
SubscriberEvens: Event is even: -877807894<br/>
Sequence Number: 117 eventDataValue: -1109621469<br/>
SubscriberThrees: Event is divisible by 3: -1109621469<br/>
Sequence Number: 118 eventDataValue: 415189674<br/>
SubscriberEvens: Event is even: 415189674<br/>
SubscriberThrees: Event is divisible by 3: 415189674<br/>
Sequence Number: 119 eventDataValue: -144540395<br/>
Sequence Number: 120 eventDataValue: -713433036<br/>
SubscriberEvens: Event is even: -713433036<br/>
SubscriberThrees: Event is divisible by 3: -713433036<br/>
Sequence Number: 121 eventDataValue: 912846028<br/>
SubscriberEvens: Event is even: 912846028<br/>
Sequence Number: 122 eventDataValue: -313140150<br/>
SubscriberEvens: Event is even: -313140150<br/>
SubscriberThrees: Event is divisible by 3: -313140150<br/>
Sequence Number: 123 eventDataValue: -658026738<br/>
SubscriberEvens: Event is even: -658026738<br/>
SubscriberThrees: Event is divisible by 3: -658026738<br/>
Sequence Number: 124 eventDataValue: -1406628863<br/>
Sequence Number: 125 eventDataValue: -701191236<br/>
SubscriberEvens: Event is even: -701191236<br/>
Sequence Number: 126 eventDataValue: -619260283<br/>
Sequence Number: 127 eventDataValue: -1362718959<br/>
SubscriberThrees: Event is divisible by 3: -1362718959<br/>
Sequence Number: 128 eventDataValue: 58453411<br/>
SubscriberOdds: Event is odd: 58453411<br/>
Sequence Number: 129 eventDataValue: 791760087<br/>
SubscriberOdds: Event is odd: 791760087<br/>
SubscriberThrees: Event is divisible by 3: 791760087<br/>
Sequence Number: 130 eventDataValue: -1325804288<br/>
Sequence Number: 131 eventDataValue: 725553300<br/>
SubscriberThrees: Event is divisible by 3: 725553300<br/>
Sequence Number: 132 eventDataValue: 1300687691<br/>
SubscriberOdds: Event is odd: 1300687691<br/>
Sequence Number: 133 eventDataValue: 1734075988<br/>
Sequence Number: 134 eventDataValue: 269697223<br/>
Sequence Number: 135 eventDataValue: -605540378<br/>
Sequence Number: 136 eventDataValue: 1537363739<br/>
Sequence Number: 137 eventDataValue: 531557256<br/>
SubscriberThrees: Event is divisible by 3: 531557256<br/>
Sequence Number: 138 eventDataValue: -899582829<br/>
SubscriberThrees: Event is divisible by 3: -899582829<br/>
Sequence Number: 139 eventDataValue: -56497754<br/>
Sequence Number: 140 eventDataValue: 1205088169<br/>
Sequence Number: 141 eventDataValue: -922605845<br/>
Sequence Number: 142 eventDataValue: 143292800<br/>
Sequence Number: 143 eventDataValue: 1481099271<br/>
SubscriberThrees: Event is divisible by 3: 1481099271<br/>
Sequence Number: 144 eventDataValue: 1710401112<br/>
SubscriberThrees: Event is divisible by 3: 1710401112<br/>
Sequence Number: 145 eventDataValue: 1092059069<br/>
Sequence Number: 146 eventDataValue: 938009997<br/>
SubscriberThrees: Event is divisible by 3: 938009997<br/>
Sequence Number: 147 eventDataValue: -268323075<br/>
Sequence Number: 148 eventDataValue: -1136628149<br/>
Sequence Number: 149 eventDataValue: -93411033<br/>
Sequence Number: 150 eventDataValue: -994018234<br/>
Sequence Number: 151 eventDataValue: 1713474827<br/>
Sequence Number: 152 eventDataValue: -1937512978<br/>
Sequence Number: 153 eventDataValue: 901276215<br/>
Sequence Number: 154 eventDataValue: -1104386082<br/>
Sequence Number: 155 eventDataValue: 1398480078<br/>
Sequence Number: 156 eventDataValue: 40691360<br/>
Sequence Number: 157 eventDataValue: 391872377<br/>
Sequence Number: 158 eventDataValue: 379519402<br/>
Sequence Number: 159 eventDataValue: -1099136520<br/>
Sequence Number: 160 eventDataValue: 1121658463<br/>
Sequence Number: 161 eventDataValue: 1726785708<br/>
SubscriberEvens: Event is even: 1726785708<br/>
SubscriberThrees: Event is divisible by 3: 1726785708<br/>
Sequence Number: 162 eventDataValue: -1980538872<br/>
SubscriberEvens: Event is even: -1980538872<br/>
SubscriberThrees: Event is divisible by 3: -1980538872<br/>
Sequence Number: 163 eventDataValue: 766930110<br/>
SubscriberEvens: Event is even: 766930110<br/>
SubscriberThrees: Event is divisible by 3: 766930110<br/>
Sequence Number: 164 eventDataValue: -124773557<br/>
Sequence Number: 165 eventDataValue: 1159100213<br/>
SubscriberOdds: Event is odd: 1159100213<br/>
Sequence Number: 166 eventDataValue: -2103815141<br/>
Sequence Number: 167 eventDataValue: 1218937099<br/>
SubscriberOdds: Event is odd: 1218937099<br/>
Sequence Number: 168 eventDataValue: -942228<br/>
SubscriberEvens: Event is even: -942228<br/>
SubscriberThrees: Event is divisible by 3: -942228<br/>
Sequence Number: 169 eventDataValue: 186691965<br/>
SubscriberOdds: Event is odd: 186691965<br/>
SubscriberThrees: Event is divisible by 3: 186691965<br/>
Sequence Number: 170 eventDataValue: 1146193840<br/>
SubscriberEvens: Event is even: 1146193840<br/>
Sequence Number: 171 eventDataValue: -1919543580<br/>
SubscriberEvens: Event is even: -1919543580<br/>
SubscriberThrees: Event is divisible by 3: -1919543580<br/>
Sequence Number: 172 eventDataValue: -1717899468<br/>
SubscriberEvens: Event is even: -1717899468<br/>
SubscriberThrees: Event is divisible by 3: -1717899468<br/>
Sequence Number: 173 eventDataValue: -826187086<br/>
SubscriberEvens: Event is even: -826187086<br/>
Sequence Number: 174 eventDataValue: 1945482575<br/>
SubscriberOdds: Event is odd: 1945482575<br/>
Sequence Number: 175 eventDataValue: 1274021084<br/>
SubscriberEvens: Event is even: 1274021084<br/>
Sequence Number: 176 eventDataValue: -2017382886<br/>
SubscriberEvens: Event is even: -2017382886<br/>
SubscriberThrees: Event is divisible by 3: -2017382886<br/>
Sequence Number: 177 eventDataValue: 130238516<br/>
SubscriberEvens: Event is even: 130238516<br/>
Sequence Number: 178 eventDataValue: 2143974489<br/>
SubscriberOdds: Event is odd: 2143974489<br/>
SubscriberThrees: Event is divisible by 3: 2143974489<br/>
Sequence Number: 179 eventDataValue: -876411279<br/>
SubscriberThrees: Event is divisible by 3: -876411279<br/>
Sequence Number: 180 eventDataValue: -1105730684<br/>
SubscriberEvens: Event is even: -1105730684<br/>
Sequence Number: 181 eventDataValue: 522654701<br/>
SubscriberOdds: Event is odd: 522654701<br/>
Sequence Number: 182 eventDataValue: -210341687<br/>
Sequence Number: 183 eventDataValue: -1960274134<br/>
SubscriberEvens: Event is even: -1960274134<br/>
Sequence Number: 184 eventDataValue: -1675303740<br/>
SubscriberEvens: Event is even: -1675303740<br/>
Sequence Number: 185 eventDataValue: -1327474605<br/>
Sequence Number: 186 eventDataValue: 1471220316<br/>
SubscriberEvens: Event is even: 1471220316<br/>
Sequence Number: 187 eventDataValue: 67960727<br/>
SubscriberOdds: Event is odd: 67960727<br/>
Sequence Number: 188 eventDataValue: -2013977323<br/>
Sequence Number: 189 eventDataValue: 792830605<br/>
SubscriberOdds: Event is odd: 792830605<br/>
Sequence Number: 190 eventDataValue: -1978447263<br/>
Sequence Number: 191 eventDataValue: -1815954947<br/>
Sequence Number: 192 eventDataValue: -170780342<br/>
SubscriberEvens: Event is even: -170780342<br/>
Sequence Number: 193 eventDataValue: -1094961331<br/>
Sequence Number: 194 eventDataValue: -1209384565<br/>
Sequence Number: 195 eventDataValue: 2087477988<br/>
SubscriberEvens: Event is even: 2087477988<br/>
Sequence Number: 196 eventDataValue: 1443879908<br/>
SubscriberEvens: Event is even: 1443879908<br/>
Sequence Number: 197 eventDataValue: -1431611365<br/>
Sequence Number: 198 eventDataValue: 1614716165<br/>
SubscriberOdds: Event is odd: 1614716165<br/>
Sequence Number: 199 eventDataValue: 896742225<br/>
SubscriberOdds: Event is odd: 896742225<br/>

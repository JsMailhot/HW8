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
`Registering SubscriberOddsImpl@4926097b
Registering SubscriberEvensImpl@39ed3c8d
Registering SubscriberThreesImpl@71dac704
Sequence Number: 0 eventDataValue: 312278248
SubscriberEvens: Event is even: 312278248
Sequence Number: 1 eventDataValue: -1539508945
Sequence Number: 2 eventDataValue: 402512297
SubscriberOdds: Event is odd: 402512297
Sequence Number: 3 eventDataValue: 1374084175
SubscriberOdds: Event is odd: 1374084175
Sequence Number: 4 eventDataValue: 1844696822
SubscriberEvens: Event is even: 1844696822
Sequence Number: 5 eventDataValue: -411707958
SubscriberEvens: Event is even: -411707958
SubscriberThrees: Event is divisible by 3: -411707958
Sequence Number: 6 eventDataValue: -959979065
Sequence Number: 7 eventDataValue: -1518097360
SubscriberEvens: Event is even: -1518097360
Sequence Number: 8 eventDataValue: 442972101
SubscriberOdds: Event is odd: 442972101
SubscriberThrees: Event is divisible by 3: 442972101
Sequence Number: 9 eventDataValue: 1777876886
SubscriberEvens: Event is even: 1777876886
Sequence Number: 10 eventDataValue: 2061527915
SubscriberOdds: Event is odd: 2061527915
Sequence Number: 11 eventDataValue: -1563731065
Sequence Number: 12 eventDataValue: -1532755146
SubscriberEvens: Event is even: -1532755146
SubscriberThrees: Event is divisible by 3: -1532755146
Sequence Number: 13 eventDataValue: 503920175
SubscriberOdds: Event is odd: 503920175
Sequence Number: 14 eventDataValue: 541496331
SubscriberOdds: Event is odd: 541496331
SubscriberThrees: Event is divisible by 3: 541496331
Sequence Number: 15 eventDataValue: 958904845
SubscriberOdds: Event is odd: 958904845
Sequence Number: 16 eventDataValue: 1918623202
SubscriberEvens: Event is even: 1918623202
Sequence Number: 17 eventDataValue: -825855230
SubscriberEvens: Event is even: -825855230
Sequence Number: 18 eventDataValue: 1883636975
SubscriberOdds: Event is odd: 1883636975
Sequence Number: 19 eventDataValue: -1850606273
Sequence Number: 20 eventDataValue: -232745512
SubscriberEvens: Event is even: -232745512
Sequence Number: 21 eventDataValue: -978424685
Sequence Number: 22 eventDataValue: 487773534
SubscriberEvens: Event is even: 487773534
SubscriberThrees: Event is divisible by 3: 487773534
Sequence Number: 23 eventDataValue: 814978428
SubscriberEvens: Event is even: 814978428
SubscriberThrees: Event is divisible by 3: 814978428
Sequence Number: 24 eventDataValue: 511627320
SubscriberEvens: Event is even: 511627320
SubscriberThrees: Event is divisible by 3: 511627320
Sequence Number: 25 eventDataValue: 2136620313
SubscriberOdds: Event is odd: 2136620313
SubscriberThrees: Event is divisible by 3: 2136620313
Sequence Number: 26 eventDataValue: 350017728
SubscriberEvens: Event is even: 350017728
SubscriberThrees: Event is divisible by 3: 350017728
Sequence Number: 27 eventDataValue: -1181953151
Sequence Number: 28 eventDataValue: 1299685181
SubscriberOdds: Event is odd: 1299685181
Sequence Number: 29 eventDataValue: -1272057788
SubscriberEvens: Event is even: -1272057788
Sequence Number: 30 eventDataValue: -1880333263
Sequence Number: 31 eventDataValue: 300419331
SubscriberOdds: Event is odd: 300419331
SubscriberThrees: Event is divisible by 3: 300419331
Unregistering SubscriberThreesImpl@71dac704
Sequence Number: 32 eventDataValue: -1645460278
SubscriberEvens: Event is even: -1645460278
Sequence Number: 33 eventDataValue: 2024456157
SubscriberOdds: Event is odd: 2024456157
Sequence Number: 34 eventDataValue: 269573705
SubscriberOdds: Event is odd: 269573705
Sequence Number: 35 eventDataValue: -527141864
SubscriberEvens: Event is even: -527141864
Sequence Number: 36 eventDataValue: -1985099666
SubscriberEvens: Event is even: -1985099666
Sequence Number: 37 eventDataValue: -1473358585
Sequence Number: 38 eventDataValue: 604587891
SubscriberOdds: Event is odd: 604587891
Unregistering SubscriberOddsImpl@4926097b
Sequence Number: 39 eventDataValue: 988637318
SubscriberEvens: Event is even: 988637318
Sequence Number: 40 eventDataValue: 1077817986
SubscriberEvens: Event is even: 1077817986
Unregistering SubscriberOddsImpl@4926097b
Registering SubscriberOddsImpl@4926097b
Unregistering SubscriberEvensImpl@39ed3c8d
Registering SubscriberEvensImpl@39ed3c8d
Unregistering SubscriberThreesImpl@71dac704
Registering SubscriberThreesImpl@71dac704
Sequence Number: 41 eventDataValue: -1879687006
SubscriberEvens: Event is even: -1879687006
Sequence Number: 42 eventDataValue: -643729200
SubscriberEvens: Event is even: -643729200
Unregistering SubscriberEvensImpl@39ed3c8d
Sequence Number: 43 eventDataValue: -1969393061
Sequence Number: 44 eventDataValue: -117354549
SubscriberThrees: Event is divisible by 3: -117354549
Sequence Number: 45 eventDataValue: 649551539
SubscriberOdds: Event is odd: 649551539
Sequence Number: 46 eventDataValue: 1461845659
SubscriberOdds: Event is odd: 1461845659
Sequence Number: 47 eventDataValue: -1088653092
SubscriberThrees: Event is divisible by 3: -1088653092
Sequence Number: 48 eventDataValue: -820218276
SubscriberThrees: Event is divisible by 3: -820218276
Sequence Number: 49 eventDataValue: 1324633906
Sequence Number: 50 eventDataValue: -903463970
Sequence Number: 51 eventDataValue: 2050927238
Sequence Number: 52 eventDataValue: 318659593
SubscriberOdds: Event is odd: 318659593
Sequence Number: 53 eventDataValue: -475055583
SubscriberThrees: Event is divisible by 3: -475055583
Sequence Number: 54 eventDataValue: 10584169
SubscriberOdds: Event is odd: 10584169
Sequence Number: 55 eventDataValue: -88944388
Sequence Number: 56 eventDataValue: -1933488468
SubscriberThrees: Event is divisible by 3: -1933488468
Sequence Number: 57 eventDataValue: -1485906200
Sequence Number: 58 eventDataValue: 1313122438
Sequence Number: 59 eventDataValue: -1207401099
SubscriberThrees: Event is divisible by 3: -1207401099
Sequence Number: 60 eventDataValue: 1955944262
Sequence Number: 61 eventDataValue: 978102422
Sequence Number: 62 eventDataValue: -858112468
Sequence Number: 63 eventDataValue: -450756673
Sequence Number: 64 eventDataValue: -1461503822
Sequence Number: 65 eventDataValue: -1708475314
Sequence Number: 66 eventDataValue: 703350988
Sequence Number: 67 eventDataValue: -49679309
Sequence Number: 68 eventDataValue: -554604838
Sequence Number: 69 eventDataValue: -1557839518
Sequence Number: 70 eventDataValue: -55335634
Sequence Number: 71 eventDataValue: -520889131
Sequence Number: 72 eventDataValue: 248417461
SubscriberOdds: Event is odd: 248417461
Sequence Number: 73 eventDataValue: 1977431890
Sequence Number: 74 eventDataValue: 702599152
Sequence Number: 75 eventDataValue: -1639138583
Sequence Number: 76 eventDataValue: -1752639681
SubscriberThrees: Event is divisible by 3: -1752639681
Sequence Number: 77 eventDataValue: -1772921147
Sequence Number: 78 eventDataValue: 398613014
Sequence Number: 79 eventDataValue: -386707760
Sequence Number: 80 eventDataValue: -1508727067
Unregistering SubscriberOddsImpl@4926097b
Registering SubscriberOddsImpl@4926097b
Unregistering SubscriberEvensImpl@39ed3c8d
Registering SubscriberEvensImpl@39ed3c8d
Unregistering SubscriberThreesImpl@71dac704
Registering SubscriberThreesImpl@71dac704
Sequence Number: 81 eventDataValue: -1159403956
SubscriberEvens: Event is even: -1159403956
Sequence Number: 82 eventDataValue: -1441118914
SubscriberEvens: Event is even: -1441118914
Sequence Number: 83 eventDataValue: -1627800078
SubscriberEvens: Event is even: -1627800078
SubscriberThrees: Event is divisible by 3: -1627800078
Sequence Number: 84 eventDataValue: 961587776
SubscriberEvens: Event is even: 961587776
Sequence Number: 85 eventDataValue: 1072501366
SubscriberEvens: Event is even: 1072501366
Sequence Number: 86 eventDataValue: -200874163
Sequence Number: 87 eventDataValue: 1771157259
SubscriberOdds: Event is odd: 1771157259
SubscriberThrees: Event is divisible by 3: 1771157259
Sequence Number: 88 eventDataValue: -1287908532
SubscriberEvens: Event is even: -1287908532
SubscriberThrees: Event is divisible by 3: -1287908532
Unregistering SubscriberThreesImpl@71dac704
Sequence Number: 89 eventDataValue: 420961639
SubscriberOdds: Event is odd: 420961639
Sequence Number: 90 eventDataValue: 1819509094
SubscriberEvens: Event is even: 1819509094
Sequence Number: 91 eventDataValue: 192895211
SubscriberOdds: Event is odd: 192895211
Sequence Number: 92 eventDataValue: -1468524533
Sequence Number: 93 eventDataValue: -989522807
Sequence Number: 94 eventDataValue: 1092963205
SubscriberOdds: Event is odd: 1092963205
Sequence Number: 95 eventDataValue: 1378554311
SubscriberOdds: Event is odd: 1378554311
Sequence Number: 96 eventDataValue: -315919731
Sequence Number: 97 eventDataValue: 1848160133
SubscriberOdds: Event is odd: 1848160133
Sequence Number: 98 eventDataValue: 746137817
SubscriberOdds: Event is odd: 746137817
Sequence Number: 99 eventDataValue: -1248973234
SubscriberEvens: Event is even: -1248973234
Sequence Number: 100 eventDataValue: -2032113676
SubscriberEvens: Event is even: -2032113676
Sequence Number: 101 eventDataValue: 1795573533
SubscriberOdds: Event is odd: 1795573533
Sequence Number: 102 eventDataValue: -239618046
SubscriberEvens: Event is even: -239618046
Sequence Number: 103 eventDataValue: 1262652148
SubscriberEvens: Event is even: 1262652148
Sequence Number: 104 eventDataValue: 1357213196
SubscriberEvens: Event is even: 1357213196
Sequence Number: 105 eventDataValue: -1720229759
Sequence Number: 106 eventDataValue: 145494088
SubscriberEvens: Event is even: 145494088
Sequence Number: 107 eventDataValue: -737489138
SubscriberEvens: Event is even: -737489138
Sequence Number: 108 eventDataValue: 1879607984
SubscriberEvens: Event is even: 1879607984
Sequence Number: 109 eventDataValue: 1742392914
SubscriberEvens: Event is even: 1742392914
Sequence Number: 110 eventDataValue: 723318364
SubscriberEvens: Event is even: 723318364
Sequence Number: 111 eventDataValue: -1399796351
Sequence Number: 112 eventDataValue: -1712963184
SubscriberEvens: Event is even: -1712963184
Sequence Number: 113 eventDataValue: 110004249
SubscriberOdds: Event is odd: 110004249
Unregistering SubscriberOddsImpl@4926097b
Sequence Number: 114 eventDataValue: 6070079
Sequence Number: 115 eventDataValue: -124752704
SubscriberEvens: Event is even: -124752704
Sequence Number: 116 eventDataValue: 947356580
SubscriberEvens: Event is even: 947356580
Sequence Number: 117 eventDataValue: -1856932030
SubscriberEvens: Event is even: -1856932030
Unregistering SubscriberEvensImpl@39ed3c8d
Sequence Number: 118 eventDataValue: 2008298034
Sequence Number: 119 eventDataValue: 377444879
Sequence Number: 120 eventDataValue: -1164404518
Unregistering SubscriberOddsImpl@4926097b
Registering SubscriberOddsImpl@4926097b
Unregistering SubscriberEvensImpl@39ed3c8d
Registering SubscriberEvensImpl@39ed3c8d
Unregistering SubscriberThreesImpl@71dac704
Registering SubscriberThreesImpl@71dac704
Sequence Number: 121 eventDataValue: 973913498
SubscriberEvens: Event is even: 973913498
Sequence Number: 122 eventDataValue: -37701102
SubscriberEvens: Event is even: -37701102
SubscriberThrees: Event is divisible by 3: -37701102
Sequence Number: 123 eventDataValue: 1920164710
SubscriberEvens: Event is even: 1920164710
Sequence Number: 124 eventDataValue: 646255189
SubscriberOdds: Event is odd: 646255189
Sequence Number: 125 eventDataValue: -589077793
Sequence Number: 126 eventDataValue: -657391520
SubscriberEvens: Event is even: -657391520
Sequence Number: 127 eventDataValue: 519853889
SubscriberOdds: Event is odd: 519853889
Sequence Number: 128 eventDataValue: -900519652
SubscriberEvens: Event is even: -900519652
Sequence Number: 129 eventDataValue: 2026284970
SubscriberEvens: Event is even: 2026284970
Sequence Number: 130 eventDataValue: 1776134473
SubscriberOdds: Event is odd: 1776134473
Sequence Number: 131 eventDataValue: -1261012018
SubscriberEvens: Event is even: -1261012018
Sequence Number: 132 eventDataValue: 532399423
SubscriberOdds: Event is odd: 532399423
Sequence Number: 133 eventDataValue: -917935941
SubscriberThrees: Event is divisible by 3: -917935941
Sequence Number: 134 eventDataValue: 460069885
SubscriberOdds: Event is odd: 460069885
Sequence Number: 135 eventDataValue: 389266391
SubscriberOdds: Event is odd: 389266391
Sequence Number: 136 eventDataValue: 1914273629
SubscriberOdds: Event is odd: 1914273629
Sequence Number: 137 eventDataValue: 679269691
SubscriberOdds: Event is odd: 679269691
Sequence Number: 138 eventDataValue: -806494254
SubscriberEvens: Event is even: -806494254
SubscriberThrees: Event is divisible by 3: -806494254
Sequence Number: 139 eventDataValue: -142639039
Sequence Number: 140 eventDataValue: 1610703939
SubscriberOdds: Event is odd: 1610703939
SubscriberThrees: Event is divisible by 3: 1610703939
Sequence Number: 141 eventDataValue: -292256482
SubscriberEvens: Event is even: -292256482
Sequence Number: 142 eventDataValue: -558254865
SubscriberThrees: Event is divisible by 3: -558254865
Sequence Number: 143 eventDataValue: -1302763086
SubscriberEvens: Event is even: -1302763086
SubscriberThrees: Event is divisible by 3: -1302763086
Sequence Number: 144 eventDataValue: -649305967
Sequence Number: 145 eventDataValue: 1971105773
SubscriberOdds: Event is odd: 1971105773
Sequence Number: 146 eventDataValue: 1326557131
SubscriberOdds: Event is odd: 1326557131
Sequence Number: 147 eventDataValue: -170358164
SubscriberEvens: Event is even: -170358164
Sequence Number: 148 eventDataValue: -1249252335
SubscriberThrees: Event is divisible by 3: -1249252335
Sequence Number: 149 eventDataValue: 553007435
SubscriberOdds: Event is odd: 553007435
Sequence Number: 150 eventDataValue: 1172844438
SubscriberEvens: Event is even: 1172844438
SubscriberThrees: Event is divisible by 3: 1172844438
Sequence Number: 151 eventDataValue: -1957846247
Sequence Number: 152 eventDataValue: 1670948793
SubscriberOdds: Event is odd: 1670948793
SubscriberThrees: Event is divisible by 3: 1670948793
Sequence Number: 153 eventDataValue: 195239843
SubscriberOdds: Event is odd: 195239843
Unregistering SubscriberOddsImpl@4926097b
Sequence Number: 154 eventDataValue: 198405435
SubscriberThrees: Event is divisible by 3: 198405435
Unregistering SubscriberThreesImpl@71dac704
Sequence Number: 155 eventDataValue: -850666099
Sequence Number: 156 eventDataValue: -1752062049
Sequence Number: 157 eventDataValue: -1283012381
Sequence Number: 158 eventDataValue: 323177237
Sequence Number: 159 eventDataValue: 590289746
SubscriberEvens: Event is even: 590289746
Sequence Number: 160 eventDataValue: -1690727480
SubscriberEvens: Event is even: -1690727480
Unregistering SubscriberOddsImpl@4926097b
Registering SubscriberOddsImpl@4926097b
Unregistering SubscriberEvensImpl@39ed3c8d
Registering SubscriberEvensImpl@39ed3c8d
Unregistering SubscriberThreesImpl@71dac704
Registering SubscriberThreesImpl@71dac704
Sequence Number: 161 eventDataValue: 1938967228
SubscriberEvens: Event is even: 1938967228
Sequence Number: 162 eventDataValue: 1305918051
SubscriberOdds: Event is odd: 1305918051
SubscriberThrees: Event is divisible by 3: 1305918051
Sequence Number: 163 eventDataValue: 823145128
SubscriberEvens: Event is even: 823145128
Sequence Number: 164 eventDataValue: -899567725
Sequence Number: 165 eventDataValue: 1526486910
SubscriberEvens: Event is even: 1526486910
SubscriberThrees: Event is divisible by 3: 1526486910
Sequence Number: 166 eventDataValue: -366792557
Sequence Number: 167 eventDataValue: -525062091
SubscriberThrees: Event is divisible by 3: -525062091
Sequence Number: 168 eventDataValue: 1207020908
SubscriberEvens: Event is even: 1207020908
Sequence Number: 169 eventDataValue: 2096713515
SubscriberOdds: Event is odd: 2096713515
SubscriberThrees: Event is divisible by 3: 2096713515
Sequence Number: 170 eventDataValue: 255948040
SubscriberEvens: Event is even: 255948040
Sequence Number: 171 eventDataValue: -1937985182
SubscriberEvens: Event is even: -1937985182
Sequence Number: 172 eventDataValue: -1547442296
SubscriberEvens: Event is even: -1547442296
Unregistering SubscriberEvensImpl@39ed3c8d
Sequence Number: 173 eventDataValue: 1809502694
Sequence Number: 174 eventDataValue: -695196072
SubscriberThrees: Event is divisible by 3: -695196072
Sequence Number: 175 eventDataValue: -926488129
Sequence Number: 176 eventDataValue: -275660301
SubscriberThrees: Event is divisible by 3: -275660301
Sequence Number: 177 eventDataValue: 1681950524
Sequence Number: 178 eventDataValue: 300284070
SubscriberThrees: Event is divisible by 3: 300284070
Sequence Number: 179 eventDataValue: -720894729
SubscriberThrees: Event is divisible by 3: -720894729
Sequence Number: 180 eventDataValue: -1176853664
Sequence Number: 181 eventDataValue: -964984710
SubscriberThrees: Event is divisible by 3: -964984710
Sequence Number: 182 eventDataValue: 374683042
Sequence Number: 183 eventDataValue: 1503221656
Sequence Number: 184 eventDataValue: 567397578
SubscriberThrees: Event is divisible by 3: 567397578
Unregistering SubscriberThreesImpl@71dac704
Sequence Number: 185 eventDataValue: -2045541482
Sequence Number: 186 eventDataValue: 397893373
SubscriberOdds: Event is odd: 397893373
Sequence Number: 187 eventDataValue: -1091883165
Sequence Number: 188 eventDataValue: -1141950438
Sequence Number: 189 eventDataValue: 558854204
Sequence Number: 190 eventDataValue: 1085585909
SubscriberOdds: Event is odd: 1085585909
Sequence Number: 191 eventDataValue: -658752527
Sequence Number: 192 eventDataValue: -245031893
Sequence Number: 193 eventDataValue: 1154684051
SubscriberOdds: Event is odd: 1154684051
Sequence Number: 194 eventDataValue: 82324236
Sequence Number: 195 eventDataValue: 1026585487
SubscriberOdds: Event is odd: 1026585487
Sequence Number: 196 eventDataValue: -1554127208
Sequence Number: 197 eventDataValue: -1070390553
Sequence Number: 198 eventDataValue: -847538897
Sequence Number: 199 eventDataValue: 366013278`

/*
 * Copyright 2016 Sam Sun <me@samczsun.com>
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package com.samczsun.skype4j.formatting.lang.en;

import com.samczsun.skype4j.formatting.IEmoticon;

import java.util.*;

public enum Emoticon implements IEmoticon {

    MUMHEART("mumheart","v11","Mum heart","(mumheart)","(Mumheart)","(momheart)","(Momheart)"),
    BOTTLEFEEDING("bottlefeeding","v8","Bottle feeding","(bottlefeeding)","(Bottlefeeding)"),
    WOMANHOLDINGBABY("womanholdingbaby","v9","Woman holding baby","(womanholdingbaby)","(Womanholdingbaby)"),
    BREASTFEEDING("breastfeeding","v7","Breastfeeding","(breastfeeding)","(Breastfeeding)"),
    MUMANDDAUGHTER("mumanddaughter","v6","Mum and daughter","(mumanddaughter)","(Mumanddaughter)","(womanandgirl)","(Womanandgirl)"),
    WOMANPREGNANT("womanpregnant","v5","Woman pregnant","(womanpregnant)","(Womanpregnant)"),
    GRANNYSCOOTER("grannyscooter","v8","Granny scooter","(grannyscooter)","(Grannyscooter)"),
    BREAKFASTINBED("breakfastinbed","v6","Breakfast in bed","(breakfastinbed)","(Breakfastinbed)"),
    WOMANMECHANIC("womanmechanic","v9","Woman mechanic","(womanmechanic)","(Womanmechanic)"),
    WOMANFARMER("womanfarmer","v7","Woman farmer","(womanfarmer)","(Womanfarmer)"),
    WOMANPILOT("womanpilot","v7","Woman pilot","(womanpilot)","(Womanpilot)"),
    WOMANVRPLAYER("womanvrplayer","v7","Woman VR player","(womanvrplayer)","(Womanvrplayer)"),
    WOMANWELDER("womanwelder","v7","Woman welder","(womanwelder)","(Womanwelder)"),
    WOMANARTIST("womanartist","v7","Woman artist","(womanartist)","(Womanartist)"),
    WOMANFIREFIGHTER("womanfirefighter","v6","Woman firefighter","(womanfirefighter)","(Womanfirefighter)"),
    WOMANHEALTHWORKER("womanhealthworker","v7","Woman health worker","(womanhealthworker)","(Womanhealthworker)"),
    WOMANGRADUATE("womangraduate","v8","Woman graduate","(womangraduate)","(Womangraduate)"),
    WOMANGAMER("womangamer","v8","Woman gamer","(womangamer)","(Womangamer)"),
    WOMANCHEF("womanchef","v7","Woman chef","(womanchef)","(Womanchef)"),
    WOMANTEACHER("womanteacher","v6","Woman teacher","(womanteacher)","(Womanteacher)"),
    WOMANPOLICEOFFICER("womanpoliceofficer","v6","Woman police officer","(womanpoliceofficer)","(Womanpoliceofficer)"),
    WOMANASTRONAUT("womanastronaut","v6","Woman astronaut","(womanastronaut)","(Womanastronaut)"),
    WOMANJUDGE("womanjudge","v7","Woman judge","(womanjudge)","(Womanjudge)"),
    PORGSURPRISED("porgsurprised","v9","Porg surprised","(porgsurprised)","(Porgsurprised)"),
    PORG("porg","v8","Porg","(porg)","(Porg)"),
    CHEWBACCA("chewbacca","v16","Chewbacca","(chewbacca)","(Chewbacca)"),
    BB8("bb8","v7","BB-8","(bb8)","(Bb8)"),
    BB9E("bb9e","v8","BB-9E","(bb9e)","(Bb9e)"),
    XWING("xwing","v29","X-wing","(xwing)","(Xwing)"),
    KYLOREN("kyloren","v8","Kylo Ren","(kyloren)","(Kyloren)"),
    STORMTROOPER("stormtrooper","v7","Storm trooper","(stormtrooper)","(Stormtrooper)"),
    CAPTAINPHASMA("captainphasma","v11","Captain Phasma","(captainphasma)","(Captainphasma)"),
    TIEFIGHTER("tiefighter","v14","TIE fighter","(tiefighter)","(Tiefighter)"),
    SMILE("smile","v4","Smile",":)",":-)",":=)","(smile)","(Smile)"),
    SAD("sad","v3","Sad",":(",":-(",":=(","(sad)","(Sad)",":<",":-<"),
    LAUGH("laugh","v7","Laugh",":D",":-D",":=D",":d",":-d",":=d","(laugh)","(Laugh)",":>",":->","(lol)","(LOL)","(Lol)"),
    COOL("cool","v4","Cool","(cool)","(Cool)","8-)","8=)","B-)","B=)"),
    HEARTEYES("hearteyes","v12","Heart eyes","(hearteyes)","(Hearteyes)"),
    STAREYES("stareyes","v16","Star eyes","(stareyes)","(Stareyes)"),
    LIKE("like","v8","Like","(like)","(Like)"),
    UNAMUSED("unamused","v11","Unamused","(unamused)","(Unamused)"),
    CWL("cwl","v7","Crying with laughter","(cwl)","(Cwl)","(cryingwithlaughter)","(Cryingwithlaughter)"),
    XD("xd","v5","XD smiley","(xd)","(Xd)"),
    SURPRISED("surprised","v6","Surprised",":O",":-O",":=O",":o",":-o",":=o","(surprised)","(Surprised)"),
    WINK("wink","v5","Wink",";)",";-)",";=)","(wink)","(Wink)"),
    CRY("cry","v6","Crying",";(",";-(",";=(","(cry)","(Cry)",":'("),
    SHIVERING("shivering","v9","Cold shivering","(shivering)","(Shivering)","(cold)","(Cold)","(freezing)","(Freezing)"),
    SWEAT("sweat","v6","Sweating","(:|","(sweat)","(Sweat)"),
    SPEECHLESS("speechless","v5","Speechless",":|",":-|",":=|","(speechless)","(Speechless)"),
    TONGUEOUT("tongueout","v5","Cheeky",":P",":-P",":=P",":p",":-p",":=p","(tongueout)","(Tongueout)"),
    BLUSH("blush","v6","Blushing",":$",":-$",":=$","(blush)","(Blush)"),
    INLOVE("inlove","v5","In love","(inlove)","(Inlove)","(love)","(Love)",":]",":-]"),
    KISS("kiss","v7","Kiss","(kiss)","(Kiss)",":*",":-*",":=*","(xo)"),
    WONDER("wonder","v5","Wondering",":^)","(wonder)","(Wonder)"),
    SLEEPY("sleepy","v5","Sleepy","|-)","I-)","I=)","(snooze)","(Snooze)","(sleepy)","(Sleepy)"),
    DULL("dull","v4","Dull","|-(","|(","|=(","(dull)","(Dull)"),
    YAWN("yawn","v5","Yawn","(yawn)","(Yawn)"),
    PUKE("puke","v7","Vomiting","(puke)","(Puke)",":&",":-&",":=&","+o("),
    DOH("doh","v6","Doh!","(doh)","(Doh)"),
    ANGRY("angry","v7","Angry","(angry)","(Angry)",":@",":-@",":=@","x(","x-(","X(","X-(","x=(","X=(",";@",";-@"),
    WASNTME("wasntme","v5","It wasn't me!","(wasntme)","(Wasntme)","(wm)","(Wm)"),
    WORRY("worry","v5","Worried","(worry)","(Worry)",":S",":s",":-s",":-S",":=s",":=S","(worried)","(Worried)"),
    MMM("mmm","v6","Mmmmm…","(mm)","(Mm)","(mmm)","(Mmm)","(mmmm)","(Mmmm)"),
    NERDY("nerdy","v6","Nerdy","(nerd)","(Nerd)","8-|","B-|","8|","B|","8=|","B=|","(nerdy)","(Nerdy)"),
    RAINBOWSMILE("rainbowsmile","v14","Rainbow smile","(rainbowsmile)","(Rainbowsmile)"),
    LIPSSEALED("lipssealed","v6","My lips are sealed",":x",":-x",":X",":-X",":#",":-#",":=x",":=X",":=#","(lipssealed)","(Lipssealed)"),
    DEVIL("devil","v3","Devil","(devil)","(Devil)"),
    ANGEL("angel","v4","Angel","(angel)","(Angel)"),
    ENVY("envy","v5","Envy","(envy)","(Envy)"),
    MAKEUP("makeup","v6","Make-up","(makeup)","(Makeup)","(kate)","(Kate)"),
    THINK("think","v5","Thinking","(think)","(Think)",":-?",":?",":=?","*-)"),
    ROFL("rofl","v5","Rolling on the floor laughing","(rofl)","(Rofl)","(rotfl)","(Rotfl)"),
    HAPPY("happy","v5","Happy","(happy)","(Happy)"),
    SMIRK("smirk","v4","Smirking","(smirk)","(Smirk)"),
    NOD("nod","v4","Nodding","(nod)","(Nod)"),
    SHAKE("shake","v3","Shake","(shake)","(Shake)"),
    WAITING("waiting","v5","Waiting","(waiting)","(Waiting)","(forever)","(Forever)","(impatience)","(Impatience)"),
    EMO("emo","v15","Emo","(emo)","(Emo)"),
    DONTTALKTOME("donttalktome","v5","Don't talk to me","(donttalk)","(Donttalk)","(donttalktome)","(Donttalktome)"),
    IDEA("idea","v6","Idea","(idea)","(Idea)",":i",":I","*-:)"),
    TALK("talk","v5","Talking","(talk)","(Talk)"),
    SWEAR("swear","v8","Swearing","(swear)","(Swear)"),
    EVILGRIN("evilgrin","v6","Evil grin","]:)",">:)","(evilgrin)","(Evilgrin)","(evil)","(Evil)","(grin)","(Grin)","(eg)","(Eg)"),
    HEADBANG("headbang","v6","Banging head on wall","(headbang)","(Headbang)","(banghead)","(Banghead)"),
    LEARN("learn","v8","Global Learning","(learn)","(Learn)"),
    HEADPHONES("headphones","v5","Listening to headphones","(headphones)","(Headphones)"),
    HUNGOVER("hungover","v5","Morning after party","(morningafter)","(Morningafter)","(hungover)","(Hungover)"),
    SELFIE("selfie","v8","Selfie","(selfie)","(Selfie)"),
    SHOCK("shock","v20","Spoiler alert","(shock)","(Shock)"),
    LLSSHOCK("llsshock","v23","Spoiler alert","(llsshock)","(Llsshock)"),
    TTM("ttm","v12","Talking too much","(ttm)","(Ttm)","(bla)","(Bla)"),
    DREAM("dream","v9","Dreaming","(dream)","(Dream)"),
    ILL("ill","v12","Ill","(ill)","(Ill)"),
    TIRED("tired","v11","Tired","(tired)","(Tired)"),
    PARTY("party","v7","Party","(party)","(Party)","<O)","<o)","<:o)"),
    BANDIT("bandit","v5","Bandit","(bandit)","(Bandit)"),
    TAURI("tauri","v8","Bald man with glasses","(tauri)","(Tauri)","(taur)","(Taur)"),
    NAZAR("nazar","v5","Blessing","(nazar)","(Nazar)"),
    MOVEMBER("movember","v15","Movember","(movember)","(Movember)","(mo)","(Mo)","(november)","(November)","(moustache)","(Moustache)","(mustache)","(Mustache)","(bowman)","(Bowman)",":{"),
    MYSTERYSKYPE("mysteryskype","v9","Mystery Skype","(mysteryskype)","(Mysteryskype)"),
    DOTDFEMALE("dotdfemale","v13","Day of the dead","(dotdfemale)","(Dotdfemale)","(dotdf)","(Dotdf)"),
    DOTDMALE("dotdmale","v10","Day of the dead","(dotdmale)","(Dotdmale)","(dotdm)","(Dotdm)"),
    FRANKENSTEIN("frankenstein","v27","Hammer Frankenstein","(frankenstein)","(Frankenstein)"),
    DRACULA("dracula","v14","Hammer Dracula","(dracula)","(Dracula)"),
    WEREWOLF("werewolf","v14","Hammer werewolf","(werewolf)","(Werewolf)"),
    JEKYLLANDHYDE("jekyllandhyde","v14","Hammer Jekyll and Hyde","(jekyllandhyde)","(Jekyllandhyde)"),
    ZOMBIEDROOL("zombiedrool","v12","Hammer zombie","(zombiedrool)","(Zombiedrool)"),
    MUMMY("mummy","v14","Hammer mummy","(mummy)","(Mummy)"),
    SELFIEDIWALI("selfiediwali","v7","Selfie Diwali","(selfiediwali)","(Selfiediwali)"),
    DIWALISELFIE("diwaliselfie","v14","Diwali selfie","(diwaliselfie)","(Diwaliselfie)"),
    STEVEAOKI("steveaoki","v11","Steve Aoki","(steveaoki)","(Steveaoki)"),
    AOKIJUMP("aokijump","v11","Aoki jump","(aokijump)","(Aokijump)"),
    CAKETHROW("cakethrow","v8","Cake throw","(cakethrow)","(Cakethrow)"),
    KOLONY("kolony","v7","Kolony","(kolony)","(Kolony)"),
    JOY("joy","v9","Joy","(joy)","(Joy)"),
    ANGER("anger","v7","Anger","(anger)","(Anger)"),
    SADNESS("sadness","v20","Sadness","(sadness)","(Sadness)"),
    DISGUST("disgust","v5","Disgust","(disgust)","(Disgust)"),
    FEAR("fear","v2","Fear","(fear)","(Fear)"),
    HESTONFACEPALM("hestonfacepalm","v17","Heston facepalm","(hestonfacepalm)","(Hestonfacepalm)"),
    HESTON("heston","v17","Heston Blumenthal","(heston)","(Heston)"),
    MALTHE("malthe","v5","Smiling man with glasses","(malthe)","(Malthe)","(mlt)","(Mlt)"),
    LADYVAMPIRE("ladyvampire","v8","Lady vampire","(ladyvamp)","(Ladyvamp)","(ladyvampire)","(Ladyvampire)"),
    VAMPIRE("vampire","v3","Vampire","(vampire)","(Vampire)"),
    GHOST("ghost","v5","Ghost","(ghost)","(Ghost)"),
    SKULL("skull","v7","Skull","(skull)","(Skull)"),
    PUMPKIN("pumpkin","v7","Pumpkin","(pumpkin)","(Pumpkin)","(halloween)","(Halloween)"),
    SANTA("santa","v7","Santa","(santa)","(Santa)","(xmas)","(Xmas)","(christmas)","(Christmas)"),
    XMASCWL("xmascwl","v11","Xmas crying with laughter","(xmascwl)","(Xmascwl)"),
    FESTIVEPARTY("festiveparty","v19","Festive party","(festiveparty)","(Festiveparty)","(partyxmas)","(Partyxmas)"),
    HOLIDAYSPIRIT("holidayspirit","v6","Holiday spirit","(holidayspirit)","(Holidayspirit)","(crazyxmas)","(Crazyxmas)","(crazychristmas)","(Crazychristmas)"),
    RUDOLFSURPRISE("rudolfsurprise","v10","Surprised Rudolf","(rudolfsurprise)","(Rudolfsurprise)","(rudolphsurprise)","(Rudolphsurprise)"),
    RUDOLFIDEA("rudolfidea","v7","Rudolf idea","(rudolfidea)","(Rudolfidea)","(rudolphidea)","(Rudolphidea)"),
    XMASCRY("xmascry","v9","Xmas cry","(xmascry)","(Xmascry)","(xmascrying)","(Xmascrying)"),
    XMASSARCASTIC("xmassarcastic","v12","Xmas sarcastic","(xmassarcastic)","(Xmassarcastic)"),
    HI("hi","v6","Hi","(wave)","(Wave)","(hi)","(Hi)","(HI)","(bye)","(Bye)","(BYE)"),
    HIGHFIVE("highfive","v8","High five","(highfive)","(Highfive)","(hifive)","(Hifive)","(h5)","(H5)"),
    CLAP("clap","v7","Clapping","(clap)","(Clap)"),
    SARCASTIC("sarcastic","v4","Sarcastic","(sarcastic)","(Sarcastic)","(sarcasm)","(Sarcasm)","(slowclap)","(Slowclap)"),
    GIGGLE("giggle","v5","Giggle","(chuckle)","(Chuckle)","(giggle)","(Giggle)"),
    FACEPALM("facepalm","v8","Facepalm","(facepalm)","(Facepalm)","(fail)","(Fail)"),
    ROCK("rock","v5","Rock","(rock)","(Rock)"),
    FINGERSCROSSED("fingerscrossed","v6","Fingers crossed","(yn)","(Yn)","(fingers)","(Fingers)","(fingerscrossed)","(Fingerscrossed)","(crossedfingers)","(Crossedfingers)"),
    LISTENING("listening","v5","Listening","(listening)","(Listening)"),
    WAIT("wait","v6","Wait","(wait)","(Wait)"),
    WHEW("whew","v5","Relieved","(whew)","(Whew)","(phew)","(Phew)"),
    TMI("tmi","v5","Too much information","(tmi)","(Tmi)"),
    CALL("call","v5","Call","(call)","(Call)"),
    PUNCH("punch","v6","Punch","(punch)","(Punch)","*|","*-|"),
    TALKTOTHEHAND("talktothehand","v5","Talk to the hand","(talktothehand)","(Talktothehand)"),
    WHISTLE("whistle","v5","Whistle","(whistle)","(Whistle)","(seeti)","(Seeti)"),
    SLAP("slap","v5","Slap","(slap)","(Slap)","(thappad)","(Thappad)"),
    LALALA("lalala","v5","Lalala","(lalala)","(Lalala)","(lalalala)","(Lalalala)","(lala)","(Lala)","(notlistening)","(Notlistening)"),
    YES("yes","v3","Yes","(y)","(Y)","(yes)","(Yes)"),
    NO("no","v3","No","(n)","(N)","(no)","(No)"),
    HANDSHAKE("handshake","v5","Handshake","(handshake)","(Handshake)"),
    FISTBUMP("fistbump","v5","Fist bump","(fistbump)","(Fistbump)","=ƎE=","p#d"),
    POKE("poke","v8","Poke","(poke)","(Poke)","(nudge)","(Nudge)"),
    HANDSINAIR("handsinair","v6","Hands celebrating","(celebrate)","(Celebrate)","(celebration)","(Celebration)","(handsinair)","(Handsinair)","(hia)","(Hia)"),
    HEARTHANDS("hearthands","v11","Heart hands","(hearthands)","(Hearthands)"),
    VICTORY("victory","v5","Victory sign","(victory)","(Victory)"),
    NOWORRIES("noworries","v7","No worries","(noworries)","(Noworries)"),
    OK("ok","v5","OK","(ok)","(OK)","(oK)","(Ok)","(okay)","(Okay)"),
    PRAYING("praying","v6","Praying","(pray)","(Pray)","(praying)","(Praying)","_/\\_","(namaste)","(Namaste)"),
    MUSCLE("muscle","v16","Muscle","(flex)","(Flex)","(muscle)","(Muscle)"),
    NATURESCALL("naturescall","v5","Nature's call","(ek)","(Ek)","(eK)","(EK)","(naturescall)","(Naturescall)"),
    WOTY("woty","v11","Woman of the year","(woty)","(Woty)"),
    GLASSCEILING("glassceiling","v14","Glass ceiling","(glassceiling)","(Glassceiling)"),
    DEADYES("deadyes","v10","Dead yes","(deadyes)","(Deadyes)"),
    XMASYES("xmasyes","v8","Xmas yes","(xmasyes)","(Xmasyes)"),
    DROPTHEMIC("dropthemic","v5","Drop the mic","(dropthemic)","(Dropthemic)"),
    PENGUIN("penguin","v9","Dancing penguin","(penguin)","(Penguin)","(dancingpenguin)","(Dancingpenguin)","(penguindance)","(Penguindance)","(linux)","(Linux)"),
    PENGUINKISS("penguinkiss","v13","Penguin kiss","(penguinkiss)","(Penguinkiss)"),
    HUG("hug","v7","Hug","(hug)","(Hug)","(bear)","(Bear)"),
    MONKEY("monkey","v7","Monkey","(monkey)","(Monkey)","(ape)","(Ape)",":(|)"),
    CAT("cat","v7","Cat","(cat)","(Cat)","(@)","(meow)","(Meow)","(kitty)","(Kitty)"),
    DOG("dog","v7","Dog","(dog)","(Dog)",":o3","(&)"),
    HEDGEHOGHUG("hedgehoghug","v8","Hedgehog hug","(hedgehoghug)","(Hedgehoghug)"),
    BUNNYHUG("bunnyhug","v6","Bunny hug","(bunnyhug)","(Bunnyhug)"),
    FOXHUG("foxhug","v6","Fox hug","(foxhug)","(Foxhug)"),
    UNICORN("unicorn","v9","Unicorn","(unicorn)","(Unicorn)"),
    STINGRAY("stingray","v9","Stingray","(stingray)","(Stingray)"),
    MONKEYGIGGLE("monkeygiggle","v16","Monkey giggle","(monkeygiggle)","(Monkeygiggle)"),
    GINGERKEEPFIT("gingerkeepfit","v6","Ginger keep fit","(gingerkeepfit)","(Gingerkeepfit)"),
    POLARBEAR("polarbear","v6","Polar bear","(polarbear)","(Polarbear)","(polarbearhug)","(Polarbearhug)"),
    LAMB("lamb","v10","Spring lamb","(lamb)","(Lamb)"),
    MOVINGHOME("movinghome","v12","Moving home","(movinghome)","(Movinghome)"),
    SLOTH("sloth","v18","Sloth","(sloth)","(Sloth)"),
    SNAIL("snail","v8","Snail","(snail)","(Snail)","(sn)","(SN)","(Sn)"),
    DONKEY("donkey","v5","Donkey","(donkey)","(Donkey)","(gadha)","(Gadha)"),
    LOVEBITES("lovebites","v9","Love bites","(lovebites)","(Lovebites)"),
    RED("red","v13","Angry Red","(red)","(Red)"),
    HEDGEHOG("hedgehog","v9","Hedgehog","(hedgehog)","(Hedgehog)"),
    NESTINGEGGS("nestingeggs","v12","Nesting eggs","(nestingeggs)","(Nestingeggs)"),
    CHICKSEGG("chicksegg","v15","Chicks’ egg","(chicksegg)","(Chicksegg)"),
    ROCKCHICK("rockchick","v14","Rock chick","(rockchick)","(Rockchick)"),
    HENDANCE("hendance","v20","Dancing hen","(hendance)","(Hendance)"),
    HEIDY("heidy","v3","Squirrel","(squirrel)","(Squirrel)","(heidy)","(Heidy)"),
    BUNNY("bunny","v11","Bunny","(bunny)","(Bunny)","(lovebunny)","(Lovebunny)","(rabbit)","(Rabbit)"),
    ACORN("acorn","v9","Acorn","(acorn)","(Acorn)"),
    HUNGRYCAT("hungrycat","v17","Hungry cat","(hungrycat)","(Hungrycat)"),
    GANESH("ganesh","v11","Ganesh","(ganesh)","(Ganesh)"),
    BATSMILE("batsmile","v13","Bat smile","(batsmile)","(Batsmile)","(bat)","(Bat)"),
    BATCRY("batcry","v12","Bat cry","(batcry)","(Batcry)"),
    WEREWOLFHOWL("werewolfhowl","v11","Werewolf howl","(werewolfhowl)","(Werewolfhowl)"),
    SNOWANGEL("snowangel","v12","Snow angel","(snowangel)","(Snowangel)"),
    REINDEER("reindeer","v7","Reindeer","(reindeer)","(Reindeer)"),
    YOTM("yotm","v15","Year of the monkey","(yotm)","(Yotm)","(monkeyyear)","(Monkeyyear)"),
    YOTFR("yotfr","v15","Year of the fire rooster","(yotfr)","(Yotfr)"),
    YOTD("yotd","v6","Year of the dog","(yotd)","(Yotd)"),
    WOMANSHRUG("womanshrug","v12","Woman shrug","(womanshrug)","(Womanshrug)","(wshrug)","(Wshrug)","(fshrug)","(Fshrug)"),
    MANSHRUG("manshrug","v13","Man shrug","(manshrug)","(Manshrug)","(mshrug)","(Mshrug)"),
    HERO("hero","v15","Super mum","(hero)","(Hero)"),
    BUSYDAY("busyday","v11","Busy day","(busyday)","(Busyday)"),
    WOMANBLOWKISS("womanblowkiss","v6","Woman blow kiss","(womanblowkiss)","(Womanblowkiss)"),
    WOMANSCIENTIST("womanscientist","v7","Woman scientist","(womanscientist)","(Womanscientist)"),
    WOMANDEVELOPER("womandeveloper","v7","Woman writing code","(womandeveloper)","(Womandeveloper)"),
    WOMANAWARD("womanaward","v8","Woman receiving award","(womanaward)","(Womanaward)"),
    MANSIGNLOVE("mansignlove","v5","Man sign love","(mansignlove)","(Mansignlove)"),
    WOMANHOLDINGCAT("womanholdingcat","v9","Love cat","(womanholdingcat)","(Womanholdingcat)"),
    MANHOLDINGDOG("manholdingdog","v8","Love dog","(manholdingdog)","(Manholdingdog)"),
    CHEERLEADER("cheerleader","v7","Cheerleader","(cheerleader)","(Cheerleader)"),
    SKIP("skip","v13","Keep fit","(skip)","(Skip)","(skippingrope)","(Skippingrope)"),
    POOLPARTY("poolparty","v15","Pool party","(poolparty)","(Poolparty)","(hrv)","(Hrv)"),
    SYNCHSWIM("synchswim","v18","Synchronized swimming","(synchswim)","(Synchswim)"),
    SURYANNAMASKAR("suryannamaskar","v6","Suryan Namaskar","(suryannamaskar)","(Suryannamaskar)"),
    YOGA("yoga","v3","Yoga","(yoga)","(Yoga)"),
    TRAMPOLINE("trampoline","v9","Trampoline","(trampoline)","(Trampoline)"),
    MUSCLEMAN("muscleman","v5","Muscle and fat guy","(muscleman)","(Muscleman)","(fatguy)","(Fatguy)"),
    WINNER("winner","v10","Podium","(winner)","(Winner)"),
    RUNNING("running","v14","Running","(running)","(Running)"),
    WOMANSLAMDUNK("womanslamdunk","v5","Woman playing basketball","(womanslamdunk)","(Womanslamdunk)"),
    WOMANFENCER("womanfencer","v12","Woman fencer","(womanfencer)","(Womanfencer)"),
    SLAMDUNK("slamdunk","v12","Basketball","(slamdunk)","(Slamdunk)"),
    WOMANRIDINGBIKE("womanridingbike","v13","Woman riding bike","(womanridingbike)","(Womanridingbike)"),
    BIKE("bike","v8","Bicycle","(bike)","(Bike)","(bicycle)","(Bicycle)","(sander)","(Sander)"),
    WOMANFOOTBALL("womanfootball","v7","Woman playing football","(womanfootball)","(Womanfootball)"),
    BARTLETT("bartlett","v7","Man playing football","(football)","(Football)","(bartlett)","(Bartlett)","(soccer)","(Soccer)","(so)","(So)"),
    PULLSHOT("pullshot","v6","Pull shot","(pullshot)","(Pullshot)","(shot)","(Shot)","(chauka)","(Chauka)"),
    BOWLED("bowled","v5","Bowled","(bowled)","(Bowled)","(out)","(Out)","(wicket)","(Wicket)"),
    FALLINLOVE("fallinlove","v13","Falling in love","(fallinlove)","(Fallinlove)"),
    TENNISFAIL("tennisfail","v13","Tennis fail","(tennisfail)","(Tennisfail)"),
    TARGET("target","v13","Archery","(target)","(Target)"),
    FOOTBALLFAIL("footballfail","v6","Football fail","(footballfail)","(Footballfail)"),
    SKATE("skate","v10","Skate","(skate)","(Skate)"),
    PRIIDU("priidu","v7","Man taking a photo","(zilmer)","(Zilmer)","(priidu)","(Priidu)"),
    TOIVO("toivo","v16","A man and his dog","(toivo)","(Toivo)"),
    FOREVERLOVE("foreverlove","v4","Forever love","(foreverlove)","(Foreverlove)"),
    GRAN("gran","v12","Dancing gran","(gran)","(Gran)"),
    DANCE("dance","v7","Dancing","(dance)","(Dance)","\\o/","\\:D/","\\:d/"),
    DISCODANCER("discodancer","v5","Disco dancer","(disco)","(Disco)","(discodancer)","(Discodancer)"),
    BHANGRA("bhangra","v7","Bhangra","(bhangra)","(Bhangra)"),
    MARIACHILOVE("mariachilove","v10","Mariachi love","(mariachilove)","(Mariachilove)"),
    SKIPPING("skipping","v4","Skipping","(skipping)","(Skipping)"),
    THANKS("thanks","v14","Thanks","(thanks)","(Thanks)"),
    BOW("bow","v6","Bowing","(bow)","(Bow)"),
    WOMAN("woman","v9","Woman","(woman)","(Woman)","(female)","(Female)","(girl)","(Girl)"),
    MAN("man","v3","Man","(man)","(Man)","(male)","(Male)","(boy)","(Boy)"),
    GOTTARUN("gottarun","v5","Got to run","(gottarun)","(Gottarun)","(gtr)","(GTR)","(Gtr)","(run)","(Run)"),
    COMPUTERRAGE("computerrage","v5","Computer rage","(computerrage)","(Computerrage)","(typingrage)","(Typingrage)"),
    TVBINGE("tvbinge","v13","TV binge zombie","(tvbinge)","(Tvbinge)"),
    ONTHELOO("ontheloo","v11","On the loo","(ontheloo)","(Ontheloo)","(onloo)","(Onloo)","(nr2)","(Nr2)","(twittering)","(Twittering)","(verybusy)","(Verybusy)"),
    BOLLYLOVE("bollylove","v6","In love pose","(bollylove)","(Bollylove)"),
    SHOPPING("shopping","v6","Girl shopping","(shopping)","(Shopping)","(shopper)","(Shopper)"),
    NAHI("nahi","v6","No!","(nahi)","(Nahi)","(naa)","(Naa)"),
    CHAPPAL("chappal","v5","Slipper","(chappal)","(Chappal)","(slipper)","(Slipper)"),
    PROMISE("promise","v5","Promise","(promise)","(Promise)","(kasamse)","(Kasamse)"),
    NINJA("ninja","v4","Ninja","(ninja)","(Ninja)"),
    KAANPAKADNA("kaanpakadna","v4","Sorry","(kaanpakadna)","(Kaanpakadna)","(sorry)","(Sorry)","(maafi)","(Maafi)"),
    OLIVER("oliver","v6","Man saying come on","(oliver)","(Oliver)"),
    WITCH("witch","v22","Witch","(witch)","(Witch)"),
    ZOMBIE("zombie","v11","Zombie","(zombie)","(Zombie)"),
    MUMMYWALK("mummywalk","v9","Mummy walk","(mummywalk)","(Mummywalk)"),
    ZOMBIEWAVE("zombiewave","v8","Zombie wave","(zombiewave)","(Zombiewave)"),
    STOP("stop","v12","Stop","(stop)","(Stop)"),
    MOONING("mooning","v7","Mooning","(mooning)","(Mooning)"),
    SANTAMOONING("santamooning","v7","Santa mooning","(santamooning)","(Santamooning)","(mooningsanta)","(Mooningsanta)"),
    FAMILY("family","v13","Family","(family)","(Family)"),
    FAMILYTIME("familytime","v14","Family time","(familytime)","(Familytime)"),
    DADTIME("dadtime","v10","Dad time","(dadtime)","(Dadtime)"),
    WOMANBATH("womanbath","v9","Woman bath","(womanbath)","(Womanbath)"),
    HOTCHOCOLATE("hotchocolate","v14","Mom-mello","(hotchocolate)","(Hotchocolate)"),
    CUPCAKE("cupcake","v22","Feeling sweet!","(cupcake)","(Cupcake)"),
    NEIL("neil","v3","Neil","(neil)","(Neil)","(feetontable)","(Feetontable)"),
    WTF("wtf","v9","WTF…","(wtf)","(Wtf)"),
    SMOKE("smoke","v7","Smoking","(smoking)","(Smoking)","(smoke)","(Smoke)","(ci)","(Ci)"),
    DRUNK("drunk","v7","Drunk","(drunk)","(Drunk)"),
    FINGER("finger","v7","Finger","(finger)","(Finger)"),
    LIPS("lips","v19","Kissing lips","(lips)","(Lips)"),
    SYNE("syne","v15","Auld Lang Syne","(syne)","(Syne)"),
    AULD("auld","v12","Auld Lang Syne","(auld)","(Auld)"),
    LANG("lang","v12","Auld Lang Syne","(lang)","(Lang)"),
    DEDMOROZ("dedmoroz","v8","Frost wizard","(dedmoroz)","(Dedmoroz)","(frostwizard)","(Frostwizard)"),
    MATRESHKA("matreshka","v5","Skiing toy","(matreshka)","(Matreshka)","(skiingtoy)","(Skiingtoy)"),
    SNEGOVIK("snegovik","v8","Snow buddie","(snegovik)","(Snegovik)","(snowbuddie)","(Snowbuddie)"),
    MISHKA("mishka","v10","Music bear","(mishka)","(Mishka)","(musicbear)","(Musicbear)"),
    XMASWOMAN("xmaswoman","v6","Xmas woman","(xmaswoman)","(Xmaswoman)"),
    XMASWOMAN1("xmaswoman1","v11","Xmas woman 1","(xmaswoman1)","(Xmaswoman1)"),
    XMASWOMAN2("xmaswoman2","v11","Xmas woman 2","(xmaswoman2)","(Xmaswoman2)"),
    XMASWOMAN3("xmaswoman3","v11","Xmas woman 3","(xmaswoman3)","(Xmaswoman3)"),
    XMASWOMAN4("xmaswoman4","v10","Xmas woman 4","(xmaswoman4)","(Xmaswoman4)"),
    XMASWOMAN5("xmaswoman5","v9","Xmas woman 5","(xmaswoman5)","(Xmaswoman5)"),
    XMASMAN("xmasman","v6","Xmas man","(xmasman)","(Xmasman)"),
    XMASMAN1("xmasman1","v10","Xmas man 1","(xmasman1)","(Xmasman1)"),
    XMASMAN2("xmasman2","v11","Xmas man 2","(xmasman2)","(Xmasman2)"),
    XMASMAN3("xmasman3","v9","Xmas man 3","(xmasman3)","(Xmasman3)"),
    XMASMAN4("xmasman4","v10","Xmas man 4","(xmasman4)","(Xmasman4)"),
    XMASMAN5("xmasman5","v10","Xmas man 5","(xmasman5)","(Xmasman5)"),
    SUN("sun","v14","Sun","(sun)","(Sun)"),
    SNOWFLAKE("snowflake","v13","Snowflake","(snowflake)","(Snowflake)"),
    RAIN("rain","v5","Raining","(rain)","(Rain)","(london)","(London)","(st)","(ST)","(St)"),
    RAINBOW("rainbow","v4","Rainbow","(rainbow)","(Rainbow)"),
    STAR("star","v7","Star","(star)","(Star)","(*)"),
    HEART("heart","v4","Heart","(heart)","(Heart)","<3"),
    BROKENHEART("brokenheart","v5","Broken heart","(brokenheart)","(Brokenheart)"),
    IHEARTU("iheartu","v10","I heart You","(iheartu)","(Iheartu)"),
    CACTUSLOVE("cactuslove","v12","Cactus love","(cactuslove)","(Cactuslove)"),
    AVOCADOLOVE("avocadolove","v15","Avocado love","(avocadolove)","(Avocadolove)"),
    GREATPEAR("greatpear","v7","Great pear","(greatpear)","(Greatpear)"),
    COFFEE("coffee","v10","Coffee","(coffee)","(Coffee)"),
    DRINK("drink","v10","Drink","(drink)","(Drink)"),
    BEER("beer","v7","Beer","(beer)","(Beer)","(bricklayers)","(Bricklayers)"),
    CHAMPAGNE("champagne","v6","Champagne","(champagne)","(Champagne)","(sparkling)","(Sparkling)"),
    CHEERS("cheers","v9","Cheers!","(cheers)","(Cheers)"),
    CHAI("chai","v5","Tea","(chai)","(Chai)","(tea)","(Tea)"),
    CAKE("cake","v12","Cake","(cake)","(Cake)"),
    PIZZA("pizza","v5","Pizza","(pi)","(Pi)","(pizza)","(Pizza)"),
    PIE("pie","v13","Pie","(pie)","(Pie)"),
    CHEESE("cheese","v8","Cheese","(cheese)","(Cheese)","(stink)","(Stink)"),
    LADDU("laddu","v8","Sweet","(laddu)","(Laddu)"),
    TANDOORICHICKEN("tandoorichicken","v11","Tandoori chicken","(tandoori)","(Tandoori)","(tandoorichicken)","(Tandoorichicken)"),
    TURKEY("turkey","v8","Dancing Thanksgiving turkey","(turkey)","(Turkey)","(turkeydance)","(Turkeydance)","(thanksgiving)","(Thanksgiving)"),
    CAR("car","v5","Car","(car)","(Car)","(au)","(Au)"),
    TAXI("taxi","v10","Taxi","(taxi)","(Taxi)"),
    POLICECAR("policecar","v5","Police car","(policecar)","(Policecar)"),
    RICKSHAW("rickshaw","v6","Rickshaw","(rickshaw)","(Rickshaw)","(rikshaw)","(Rikshaw)","(ricksha)","(Ricksha)"),
    LAUNCH("launch","v10","Rocket launch","(launch)","(Launch)","(rocket)","(Rocket)","(shuttle)","(Shuttle)"),
    PLANE("plane","v4","Plane","(plane)","(Plane)","(ap)","(Ap)","(airplane)","(Airplane)","(aeroplane)","(Aeroplane)","(aircraft)","(Aircraft)","(jet)","(Jet)"),
    ISLAND("island","v5","Island","(island)","(Island)","(ip)","(Ip)"),
    FLOWER("flower","v4","Flower","(flower)","(Flower)"),
    PARISLOVE("parislove","v4","Paris love","(parislove)","(Parislove)"),
    GIFT("gift","v4","Gift","(gift)","(Gift)"),
    LOVEGIFT("lovegift","v10","Love gift","(lovegift)","(Lovegift)"),
    RING("ring","v10","Engagement ring","(ring)","(Ring)"),
    TROPHY("trophy","v13","Trophy","(trophy)","(Trophy)"),
    GOLDMEDAL("goldmedal","v13","Gold medal","(goldmedal)","(Goldmedal)"),
    SILVERMEDAL("silvermedal","v11","Silver medal","(silvermedal)","(Silvermedal)"),
    BRONZEMEDAL("bronzemedal","v12","Bronze medal","(bronzemedal)","(Bronzemedal)"),
    BELL("bell","v2","Bell","(bell)","(Bell)","(ghanta)","(Ghanta)"),
    DHAKKAN("dhakkan","v4","Fool","(dhakkan)","(Dhakkan)","(fool)","(Fool)"),
    KEY("key","v13","Key","(key)","(Key)","(success)","(Success)"),
    WFH("wfh","v7","Working from home","(wfh)","(Wfh)","(@h)","(@H)"),
    LETSMEET("letsmeet","v5","Let's meet","(letsmeet)","(Letsmeet)","(s+)","(S+)","(calendar)","(Calendar)"),
    COMPUTER("computer","v4","Computer","(computer)","(Computer)","(co)","(Co)","(pc)","(Pc)"),
    PHONE("phone","v6","Phone","(mp)","(Mp)","(ph)","(Ph)","(phone)","(Phone)"),
    WHOSTHIS("whosthis","v9","Who’s this!?","(whosthis)","(Whosthis)"),
    UNSEE("unsee","v8","Can’t unsee that","(unsee)","(Unsee)"),
    BRB("brb","v11","Be right back","(brb)","(Brb)","(berightback)","(Berightback)"),
    HOLDON("holdon","v5","Hold on","(holdon)","(Holdon)","(w8)","(W8)"),
    CANYOUTALK("canyoutalk","v5","Can you talk?","(canyoutalk)","(Canyoutalk)","(!!)"),
    TIME("time","v5","Time","(time)","(Time)","(clock)","(Clock)"),
    GAMES("games","v3","Games","(games)","(Games)","(ply)","(PLY)","(Ply)","(play)","(Play)","(playbox)","(Playbox)"),
    MOVIE("movie","v9","Movie","(film)","(Film)","(movie)","(Movie)"),
    CAMERA("camera","v4","Camera","(camera)","(Camera)"),
    TUBELIGHT("tubelight","v6","Tubelight","(tubelight)","(Tubelight)"),
    AMERICANFOOTBALL("americanfootball","v11","American football","(americanfootball)","(Americanfootball)"),
    WEBHEART("webheart","v7","Web heart","(webheart)","(Webheart)"),
    MISTLETOE("mistletoe","v13","Mistletoe","(mistletoe)","(Mistletoe)"),
    GOODLUCK("goodluck","v8","Good luck","(goodluck)","(Goodluck)","(gl)","(GL)","(Gl)"),
    UMBRELLA("umbrella","v9","Umbrella","(umbrella)","(Umbrella)","(um)","(Um)"),
    TUMBLEWEED("tumbleweed","v7","Tumbleweed","(tumbleweed)","(Tumbleweed)"),
    GROUPME("groupme","v8","GroupMe","(groupme)","(Groupme)"),
    MAIL("mail","v6","You have mail","(mail)","(Mail)"),
    LOVELETTER("loveletter","v5","Love letter","(loveletter)","(Loveletter)"),
    CASH("cash","v6","Cash","(cash)","(Cash)","($)"),
    BOMB("bomb","v5","Bomb","(bomb)","(Bomb)","(explosion)","(Explosion)","(explode)","(Explode)","@="),
    MUSIC("music","v6","Music","(music)","(Music)"),
    WHATSGOINGON("whatsgoingon","v10","What's going on?","(whatsgoingon)","(Whatsgoingon)","(!!?)"),
    SKYPE("skype","v8","Skype","(skype)","(Skype)","(ss)","(Ss)"),
    GOLMAAL("golmaal","v24","Confusion","(golmaal)","(Golmaal)"),
    KYA("kya","v6","What!","(kya)","(Kya)"),
    OYE("oye","v6","Oye","(oye)","(Oye)"),
    ABE("abe","v2","Abe","(abe)","(Abe)","(abey)","(Abey)"),
    CONFIDENTIAL("confidential","v4","Confidential","(confidential)","(Confidential)","(qt)","(QT)","(Qt)"),
    BUG("bug","v7","Bug","(bug)","(Bug)"),
    SHEEP("sheep","v6","Sheep","(sheep)","(Sheep)","(bah)","(Bah)"),
    WIN10("win10","v3","Windows 10","(win10)","(Win10)","(ninjacat)","(Ninjacat)","(windows)","(Windows)","(trex)","(Trex)","(windows10)","(Windows10)"),
    ACCESS("access","v3","Access","(access)","(Access)"),
    BING("bing","v3","Bing","(bing)","(Bing)"),
    EXCEL("excel","v4","Excel","(excel)","(Excel)"),
    MICROSOFT("microsoft","v2","Microsoft","(microsoft)","(Microsoft)","(ms)","(Ms)","(MS)"),
    ONEDRIVE("onedrive","v2","OneDrive","(onedrive)","(Onedrive)"),
    ONENOTE("onenote","v3","OneNote","(onenote)","(Onenote)"),
    OUTLOOK("outlook","v4","Outlook","(outlook)","(Outlook)"),
    POWERPOINT("powerpoint","v2","PowerPoint","(powerpoint)","(Powerpoint)"),
    PUBLISHER("publisher","v3","Publisher","(publisher)","(Publisher)"),
    SHAREPOINT("sharepoint","v6","SharePoint","(sharepoint)","(Sharepoint)"),
    SKYPEBIZ("skypebiz","v4","Skype for Business","(skypebiz)","(Skypebiz)","(sforb)","(Sforb)"),
    WORD("word","v8","Word","(word)","(Word)"),
    XBOX("xbox","v3","Xbox","(xbox)","(Xbox)"),
    INTERNETEXPLORER("internetexplorer","v11","Internet Explorer","(internetexplorer)","(Internetexplorer)","(ie)","(Ie)","(IE)"),
    POOP("poop","v8","Pile of poo","(poop)","(Poop)","(poo)","(Poo)"),
    PIGGYBANK("piggybank","v20","Piggy bank","(piggybank)","(Piggybank)"),
    SPARKLER("sparkler","v7","Sparkler","(sparkler)","(Sparkler)"),
    FIREWORKS("fireworks","v6","Fireworks","(fireworks)","(Fireworks)"),
    HOLI("holi","v6","Holi","(holi)","(Holi)","(rang)","(Rang)"),
    EID("eid","v11","Eid","(eid)","(Eid)"),
    DIYA("diya","v7","Tealight","(diwali)","(Diwali)","(diya)","(Diya)"),
    DREIDEL("dreidel","v15","Dreidel","(dreidel)","(Dreidel)"),
    HANUKKAH("hanukkah","v12","Hanukkah","(hanukkah)","(Hanukkah)"),
    XMASTREE("xmastree","v7","Xmas tree","(xmastree)","(Xmastree)","(christmastree)","(Christmastree)"),
    XMASHEART("xmasheart","v9","Xmas heart","(xmasheart)","(Xmasheart)"),
    XMASCAR("xmascar","v8","Xmas car","(xmascar)","(Xmascar)"),
    NOVIYGOD("noviygod","v9","Red square","(noviygod)","(Noviygod)","(redsquare)","(Redsquare)");

    private final String id;
    private final String etag;
    private String desc;
    private List<String> shortcuts;

    Emoticon(String id, String etag, String desc, String... shortcuts) {
        this.id = id;
        this.etag = etag;
        this.desc = desc;
        this.shortcuts = Arrays.asList(shortcuts);
    }

    public String getId() {
        return this.id;
    }

    public List<String> getShortcuts() {
        return Collections.unmodifiableList(this.shortcuts);
    }

    public String getEtag() {
        return this.etag;
    }

    public String getDescription() {
        return this.desc;
    }

    private static Map<String, Emoticon> dictionary;
    private static int longestEmoji = -1;

    public static Map<String, Emoticon> getDictionary() {
        if (dictionary == null) { // This is for performance, trust me
            initDictionary();
}
        return dictionary;
    }

    public static int getLongestEmoji() {
        if (longestEmoji == -1) {
            for (String s : getDictionary().keySet()) {
                if (s.charAt(0) != '(') {
                    if (s.length() > longestEmoji) {
                        longestEmoji = s.length();
                    }
                }
            }
        }
        return longestEmoji;
    }

    private static void initDictionary() {
        if (dictionary == null) {
            dictionary = new HashMap<>();
            for (Emoticon emoticon : Emoticon.values()) {
                emoticon.getShortcuts().forEach(str -> {
                    dictionary.put(str, emoticon);
                    dictionary.put(str.replace("<", "&lt;").replace(">", "&gt;"), emoticon);
                });
            }
        }
    }
}

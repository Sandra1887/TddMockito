# Projektrapport TDDandMock 
by Sandra Jeppsson Kristiansson

## Uppgift:
+ Skapa tester av och skriv en testrapport om Weather-API med mockito och JUnit

## Arbetet och genomförande:
+ Min personliga upplevelse är att det kändes svårt att simulera kod utan att ha en vanlig produktionskod framför sig 
vilket är varför jag valde att skapa skisser av klasserna "WeatherKeyReader" och "WeatherService". Dessa är dock just 
"skisser" så är de har därför varken kontrollerats eller redigerats så att de faktiskt är körbara utan har bara varit 
ett hjälpmedel för mig när jag utvecklat testerna. (Men jag är väl medveten om hur TDD egentligen ska fungera - Tester 
först, produktioskod sen)...


+ Om man skulle vilja så har jag känslan av att denna uppgiften skulle kunna bli extremt omfattande om man vill gå in på 
detaljer och testa all information man eventuellt tar emot i JSON-filen men jag valde att testa de som känns mest 
logiska när det kommer till just en väderapp. Så som att man skriver in namnet på den stad man vill ha information om 
och att man får tillbaka sådan information som också är relevant för en vardaglig användare, t.ex. namn på staden, 
temperaturen och en väderbeskrivning.

## Vad har varit svårt, olika lösningar och krångel:
+ Att skapa relevanta tester då huvuduppgiften var att skriva en testrapport. 
+ Att visa sin kunskap. Har försökt att visa att jag förstår mig på de olika "assert"-metoderna genom att blanda in så 
många som möjligt trots att de olika metoderna kanske inte passar optimalt till de tester jag använt dem i. Men som 
som sagt, har det varit svårt att hitta balansen med hur mycket kod man bör ha med och hur mycket man bör testa.

## Vad för kunskaper jag fått:
+ Hur man skriver en testrapport
+ Hur Mockito(kodsimulering) fungerar

## Framtida möjligheter med kunskaperna
+ Kunna tyda och förstå en testrapport
+ Kunna simulera beroende och extern kod för att därefter kunna göra tester utan implementering av API med nyckel.

*2023-06-16*

***JAVA Version 8***

***MIT***

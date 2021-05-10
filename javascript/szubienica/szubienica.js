var hasla = ["Bez pracy nie ma kołaczy", 
"Ciągnie swój do swego", 
"dobra psu i mucha",
"ani kura za darmo nie gdacze", 
"apetyt rośnie w miarę jedzenia",
"broda mędrcem nie czyni",
"diabeł się w ornat ubrał i ogonem na mszę dzwoni",
"diabeł tkwi w szczegółach",
"dla chcącego nic trudnego",
"dla chleba, nie dla nieba chce być księdzem",
"dla dwóch kogutów za mało miejsca na jednym gnoju",
"dla każdej matki miłe jej dziatki",
"gdy bez wiatrów luty chodzi, w kwietniu wicher nie zawodzi",
"gdy chłop baby nie bije, to jej wątroba gnije",
"co mąż, to wąż, co żona, to męczeńska korona",
"co nagle, to po diable",
"co ptakiem z gęby wyleci, wołem nazad nie wciągniesz",
"co się stało, to się nie odstanie",
"co swój, to nie obcy",
"co wolno wojewodzie, to nie tobie, smrodzie",
"co z oczu, to z serca",
"córkę chromą do klasztoru",
"cudza praca nie wzbogaca",
"ćwiczenie czyni mistrza",
"czas leczy rany",
"czas to pieniądz",
"czasem luty ostro kuty, czasem w luty same pluty",
"czego Jaś się nie nauczy, tego Jan nie będzie umiał"];
var liczba = Math.floor(Math.random()*28);

var haslo = hasla[liczba];
haslo = haslo.toUpperCase();

var dlugosc = haslo.length;
var ileSkuch = 0;
var haslo1 = "";


var yes = new Audio("yes.wav");
var no = new Audio("no.wav");
var win = new Audio("win.mp3");
var lose = new Audio("lose.mp3");

for(i=0;i<dlugosc;i++)
{
	if (haslo.charAt(i)==" ") haslo1 = haslo1 + " ";
	else if(haslo.charAt(i)==",")haslo1 = haslo1 + ",";
	else haslo1 = haslo1 + "-"
}
function wypiszHaslo()
{
	document.getElementById("plate").innerHTML = haslo1;
}

window.onload = start;

var litery = new Array(35);
litery[0] = "A";
litery[1] = "Ą";
litery[2] = "B";
litery[3] = "C";
litery[4] = "Ć";
litery[5] = "D";
litery[6] = "E";
litery[7] = "Ę";
litery[8] = "F";
litery[9] = "G";
litery[10] = "H";
litery[11] = "I";
litery[12] = "J";
litery[13] = "K";
litery[14] = "L";
litery[15] = "Ł";
litery[16] = "M";
litery[17] = "N";
litery[18] = "Ń";
litery[19] = "O";
litery[20] = "Ó";
litery[21] = "P";
litery[22] = "Q";
litery[23] = "R";
litery[24] = "S";
litery[25] = "Ś";
litery[26] = "T";
litery[27] = "U";
litery[28] = "V";
litery[29] = "W";
litery[30] = "X";
litery[31] = "Y";
litery[32] = "Z";
litery[33] = "Ż";
litery[34] = "Ź";

function start()
{
	var trescDiva="";
	for(i=0;i<35;i++)
	{
		var element = "lit" + i;
		trescDiva = trescDiva + '<div class="letter" onclick="sprawdz('+i+')"id="'+element+'">'+litery[i]+'</div>';
		if((i+1)%7==0) trescDiva = trescDiva + '<div style="clear: both;"></div>';
	}
	trescDiva = trescDiva + '<div class="przycisk" onclick="location.reload()">RESET</div>';
	document.getElementById("alphabet").innerHTML = trescDiva;
	wypiszHaslo();
}

String.prototype.ustawZnak = function(miejsce, znak)
{
	if(miejsce>this.length - 1) return this.toString();
	else return this.substr(0, miejsce) + znak + this.substr(miejsce + 1); 	
}

function sprawdz(nr)
{
	var trafiona = false;
	
	for(i=0;i<dlugosc;i++)
		{
		if(haslo.charAt(i) == litery[nr])	
			{
				haslo1 = haslo1.ustawZnak(i, litery[nr]);
				trafiona = true;
			}
		}
		
		if(trafiona == true)
		{
			yes.play();
			var element = "lit" + nr;
			document.getElementById(element).style.background = "#003300";
			document.getElementById(element).style.color= "#00C000";
			document.getElementById(element).style.border = "3px solid #00C000";
			document.getElementById(element).style.cursor = "default";
			
			wypiszHaslo();
		}
		else 
		{
			no.play();
			var element = "lit" + nr;
			document.getElementById(element).style.background = "#330000";
			document.getElementById(element).style.color= "#C00000";
			document.getElementById(element).style.border = "3px solid #C00000";
			document.getElementById(element).style.cursor = "default";
			document.getElementById(element).setAttribute("onclick",";");
			
			
			//skucha
			ileSkuch++;
			var obraz = "img/s" + ileSkuch + ".jpg";
			document.getElementById("hangman").innerHTML = '<img src="' + obraz + '" alt="" />';
		}
		

	//wygrana
	if (haslo == haslo1)
	{
	document.getElementById("alphabet").innerHTML  = "Tak jest! Podano prawidłowe hasło: "+haslo+'<br /><br /><span class="reset" onclick="location.reload()">JESZCZE RAZ?</span>';
	win.play();
	}
	
	//przegrana
	if (ileSkuch>=10)
	{
		document.getElementById("alphabet").innerHTML  = "Przegrana! Prawidłowe hasło: "+haslo+'<br /><br /><span class="reset" onclick="location.reload()">JESZCZE RAZ?</span>';
		lose.play();
	}

}
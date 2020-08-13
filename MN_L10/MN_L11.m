%wykres 3d
a = 10;
b = 28;
c = 8/3;

[t,x]=ode45(@(t,x)funkcja(t,x,a,b,c),[0 10], [0.1 0.1 0.1]);

%%

[tE,xE]=ode45(@(t,x)funkcja(t,x,a,b,c),[0 10], [0.1 0.1 0.1+10e-5]);

[tE2,xE2]=ode45(@(t,x)funkcja(t,x,a,b,c),[0 10], [0.1 0.1 0.1+10e-3]);
%%
figure;plot(x(:,3),x(:,2),x(:,1),xE(:,3),xE(:,2),xE(:,1)); xlabel("czas");legend("z","y","x","z+E","y+E","x+E");
%%
figure; plot3(x(:,1),x(:,2),x(:,3));
%%
figure; plot(t,x(:,1)); xlabel("czas"); ylabel("x");
figure; plot(t,x(:,2)); xlabel("czas"); ylabel("y");
figure; plot(t,x(:,3)); xlabel("czas"); ylabel("z");
%%
figure;plot(tE,xE(:,3),tE2,xE2(:,3)); xlabel("czas");legend("z, warunki pocz 0.1+10e-5","z, warunki pocz 0.1 0.1  10e-3");
%%
figure; plot3(x(:,1),x(:,2),x(:,3)); xlabel("X"); ylabel("Y"); zlabel("Z"); legend("x","y","z");
figure; comet3(x(:,1),x(:,2),x(:,3)); xlabel("X"); ylabel("Y"); zlabel("Z"); legend("x","y","z");

%%
resampFreq = 100; % odwrotno�� cz�stotliwo�ci pr�bkowania daje odleg�o�� pomi�dzy punktami, dla kt�rych chcemy znale�� aproksymowane warto�ci

tResamp= t(1):1/resampFreq:t(end); % dla tych warto�ci chcemy obliczy� warto�c funkcji interpoluj�cej

zResamp= interp1(t,x(:,3),zResamp','linear');

figure;

plot(zResamp,Resamp','r');hold on;

plot(t,x(3),'o-'); 

%figure +1e10-5
%fazowy
%plot(x(:,1),x(:,2));
%%
resampFreq = 10;
tResamp= t(1):1/resampFreq:t(end);
tResamp=tResamp';
z=x(:,3);
czas=t(:,1);
zResamp = interp1(czas,z,tResamp);
figure
plot(t,x(:,3),'o-'); hold on; plot(tResamp,zResamp,'r')
 %%
 resampFreq = 10;
tResamp2= tE2(1):1/resampFreq:t(end);
tResamp2=tResamp2';
z2=xE2(:,3);
czas2=tE2(:,1);
zResamp2 = interp1(czas,z,tResamp);
figure
plot(tE2,xE2(:,3),'o-'); hold on; plot(tResamp2,zResamp2,'r')

%%
zRoz=zResamp-zResamp2;
 %%
Obliczmy warto�ci funkcji kwadratowej na przedziale [-50,50] w w�z�ach oddalonych od siebie o 10 (cz�stotliwo�� pr�bkowania 1/10):



z = -3*x.^2-5*x + 6;

Te wektory pos�u�� do wyznaczenia funkcji interpolacyjnej. Je�eli chcemy obliczy� warto�ci pomi�dzy w�z�ami to mo�emy to zrobi� w nast�puj�cy spos�b:

resampFreq = 100; % odwrotno�� cz�stotliwo�ci pr�bkowania daje odleg�o�� pomi�dzy punktami, dla kt�rych chcemy znale�� aproksymowane warto�ci

xResamp= t(1):1/resampFreq:x(end); % dla tych warto�ci chcemy obliczy� warto�c funkcji interpoluj�cej

yResamp= interp1(t,y,xResamp','linear');
%%
diff=diff(x);
%%
histogram(diff);



omega2=1;
%T=2pi/omega
%ode45 to funkcja integrator taki
%pierwszy przecinek podaje rownanie, przedzial, warunki pocz- dwa
%(polozenie i predkosc)

[t,x]=ode45(@(t,x) MN_L9_funkcja(t,x,omega2),[0,2*pi], [1,0]);
[t1,x1]=ode45(@(t,x) MN_L9_funkcja(t,x,omega2),[0,2*pi], [0.8,0]);
%% 
figure 
plot(t,x(:,1))

%%
figure
plot(t,x(:,2))
%% przestrzen fazowa
figure
plot(x(:,1),x(:,2));
hold on
plot(x1(:,1),x1(:,2));
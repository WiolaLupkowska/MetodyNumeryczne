a = 5/10;

[t,x]=ode45(@(t,x)funkcja2(t,x,a),[0 10], [0.1 0.1 0.1+10e-5]);

a = 1/10;
[t1,x1]=ode45(@(t,x)funkcja2(t,x,a),[0 10], [0.1 0.1 0.1+10e-5]);
figure; plot(t,x(:,3), t1,x1(:,3)); xlabel("t"); ylabel("z"); legend("a=5/10","a=1/10");


zRoznice=x1(:,3)-x(1:85,3);
%%
a = 10;
b = 28;
c = 8/3;

[t,x]=ode45(@(t,x)funkcja(t,x,a,b,c),[0 10], [0.1 0.1 0.1]);
[tE,xE]=ode45(@(t,x)funkcja(t,x,a,b,c),[0 10], [0.1 0.1 0.1+10e-5]);
figure;comet3(x(:,3),x(:,2),x(:,1));hold on; comet3(xE(:,3),xE(:,2),xE(:,1)); xlabel("czas");legend("z","y","x","z+E","y+E","x+E");
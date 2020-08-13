[t,x] = ode45(@odefunLV,[0 30],[50 10],[],[1.5 1 1 3 ]);


figure;
plot(t,x);
legend('ofiary','drapiezniki')

figure
plot(x(:,1),x(:,2));



%% 

[t2,x2] = ode45(@odefunLV2,[0 60],[50 10],[],[1.5 1 1 3 1 2]);

figure;
plot(t2,x2);
legend('ofiary','drapiezniki')

figure
plot(x2(:,1),x2(:,2));


%% 

[t3,x3] = ode45(@odefunLV3,[0 60],[50 10],[],[1.5 1 1 3 1 2 0.2 0.4]);

figure;
plot(t3,x3);
legend('ofiary','drapiezniki')

figure
plot(x3(:,1),x3(:,2));


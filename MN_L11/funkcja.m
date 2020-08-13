function [uklad] = funkcja(t,x,a,b,c)
uklad= [a*(x(2)-x(1));  x(1)*(b-x(3))-x(2); x(1)*x(2)-c*x(3)];
    end

%warunki, przedzial


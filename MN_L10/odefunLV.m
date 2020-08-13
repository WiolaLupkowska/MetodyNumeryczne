function dxdt = odefunLV(t,x,params)

dxdt = [(params(1)-params(2)*x(2))*x(1); ((params(3))*x(1)-params(4))*x(2)];
end

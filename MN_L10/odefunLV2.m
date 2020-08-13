function dxdt = odefunLV2(t,x,params)

dxdt = [(params(1)-params(2)*x(2))*x(1)-params(5)*x(1); ((params(3))*x(1)-params(4))*x(2)-params(6)*x(2)];
end



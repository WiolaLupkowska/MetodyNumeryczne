function dxdt = odefunLV3(t,x,params)

dxdt = [(params(1)-params(2)*x(2))*x(1)-params(7)*x(1)*x(1); ((params(3))*x(1)-params(4))*x(2)-params(8)*x(2)*x(2)];
end



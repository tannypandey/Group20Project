import http from './axios-common';
export function getAllBonds(){
        return http.get("/bonds");
        
}
export function getAllCode(){
        return http.get("/code");
        
}
export function getAllMaturity(){
        return http.get("/maturity");
        
}
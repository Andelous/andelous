(function(t){function e(e){for(var o,i,l=e[0],s=e[1],c=e[2],p=0,v=[];p<l.length;p++)i=l[p],Object.prototype.hasOwnProperty.call(n,i)&&n[i]&&v.push(n[i][0]),n[i]=0;for(o in s)Object.prototype.hasOwnProperty.call(s,o)&&(t[o]=s[o]);u&&u(e);while(v.length)v.shift()();return r.push.apply(r,c||[]),a()}function a(){for(var t,e=0;e<r.length;e++){for(var a=r[e],o=!0,l=1;l<a.length;l++){var s=a[l];0!==n[s]&&(o=!1)}o&&(r.splice(e--,1),t=i(i.s=a[0]))}return t}var o={},n={app:0},r=[];function i(e){if(o[e])return o[e].exports;var a=o[e]={i:e,l:!1,exports:{}};return t[e].call(a.exports,a,a.exports,i),a.l=!0,a.exports}i.m=t,i.c=o,i.d=function(t,e,a){i.o(t,e)||Object.defineProperty(t,e,{enumerable:!0,get:a})},i.r=function(t){"undefined"!==typeof Symbol&&Symbol.toStringTag&&Object.defineProperty(t,Symbol.toStringTag,{value:"Module"}),Object.defineProperty(t,"__esModule",{value:!0})},i.t=function(t,e){if(1&e&&(t=i(t)),8&e)return t;if(4&e&&"object"===typeof t&&t&&t.__esModule)return t;var a=Object.create(null);if(i.r(a),Object.defineProperty(a,"default",{enumerable:!0,value:t}),2&e&&"string"!=typeof t)for(var o in t)i.d(a,o,function(e){return t[e]}.bind(null,o));return a},i.n=function(t){var e=t&&t.__esModule?function(){return t["default"]}:function(){return t};return i.d(e,"a",e),e},i.o=function(t,e){return Object.prototype.hasOwnProperty.call(t,e)},i.p="/";var l=window["webpackJsonp"]=window["webpackJsonp"]||[],s=l.push.bind(l);l.push=e,l=l.slice();for(var c=0;c<l.length;c++)e(l[c]);var u=s;r.push([0,"chunk-vendors"]),a()})({0:function(t,e,a){t.exports=a("56d7")},"3e1b":function(t,e,a){t.exports=a.p+"img/yo_small.bef9f0ba.jpg"},"56d7":function(t,e,a){"use strict";a.r(e);a("e260"),a("e6cf"),a("cca6"),a("a79d");var o=a("2b0e"),n=function(){var t=this,e=t.$createElement,o=t._self._c||e;return o("v-app",[o("v-app-bar",{staticClass:"grey darken-4",attrs:{app:""}},[o("v-app-bar-title",[o("router-link",{staticClass:"white--text",staticStyle:{"text-decoration":"none"},attrs:{to:"/"}},[o("v-avatar",[o("v-img",{attrs:{"max-height":"30","max-width":"30",src:a("3e1b")}})],1),o("span",{staticClass:"font-weight-light"},[t._v("Angel")]),o("span",{staticClass:"teal--text font-weight-bold"},[t._v("D")])],1)],1)],1),o("v-main",[o("v-container",{attrs:{fluid:""}},[o("v-row",[o("v-col",{staticClass:"pa-0",attrs:{cols:"0",sm:"1",md:"2",xl:"3"}}),o("v-col",{staticClass:"blue-grey lighten-5 px-6",attrs:{cols:"12",sm:"10",md:"8",xl:"6"}},[o("router-view"),o("br"),o("br")],1),o("v-col",{staticClass:"pa-0",attrs:{cols:"0",sm:"1",md:"2",xl:"3"}})],1)],1)],1),o("v-footer",{staticClass:"\n            grey\n            darken-2\n            d-flex\n            justify-space-between\n            white--text\n            font-weight-light\n            pa-3\n        ",staticStyle:{"font-size":"0.8em"},attrs:{app:""}},[o("span",[t._v("Angel Daniel Alonso Tovar")]),o("span",[t._v("Copyright © "+t._s(t.currentYear))])])],1)},r=[],i={name:"App",data:function(){return{currentYear:(new Date).getFullYear()}}},l=i,s=a("2877"),c=a("6544"),u=a.n(c),p=a("7496"),v=a("40dc"),m=a("bb78"),d=a("8212"),f=a("62ad"),h=a("a523"),g=a("553a"),b=a("adda"),_=a("f6c4"),k=a("0fd9"),y=Object(s["a"])(l,n,r,!1,null,null,null),w=y.exports;u()(y,{VApp:p["a"],VAppBar:v["a"],VAppBarTitle:m["a"],VAvatar:d["a"],VCol:f["a"],VContainer:h["a"],VFooter:g["a"],VImg:b["a"],VMain:_["a"],VRow:k["a"]});var x=a("8c4f"),C=function(){var t=this,e=t.$createElement,a=t._self._c||e;return a("div",[a("v-row",[a("v-col",{attrs:{cols:"12",sm:"8"}},[a("h2",{staticClass:"mb-4"},[t._v("Who am I?")]),a("p",[t._v(" My name is Angel, but you can call me by my pseudonym, "),a("strong",[t._v("Andelous")]),t._v(". I built this page just for the sake of fun. I hope you like what you see. ")]),a("p",[t._v(" Here you can see some of the skills I have, the tools I work with, and some sample apps that I've created "),a("code",[t._v(";)")]),t._v(". ")]),a("h3",{staticClass:"mb-4"},[t._v("A little about me")]),a("p",[t._v(" I grew up in Oaxaca, Mexico, studied Software Engineering and now I'm here. I like to develop applications from scratch; the thought process to come up with solutions, studying the tools, and figuring out how to solve the emergent problems make me passionate about this major. ")]),a("p",[t._v(" I also like chess "),a("v-icon",{attrs:{color:"black",small:""}},[t._v("mdi-chess-pawn")]),t._v(" and videogames "),a("v-icon",{attrs:{color:"black",small:""}},[t._v("mdi-microsoft-xbox-controller")]),t._v(". ")],1)]),a("v-col",{attrs:{cols:"12",sm:"4"}},[a("h2",{staticClass:"mb-4"},[t._v("Quick access")]),t._l(t.linkSections,(function(t){return[a("link-section",{key:t.title,attrs:{title:t.title,links:t.links}}),a("br",{key:t.title+"br"})]}))],2)],1),a("v-divider",{staticClass:"my-4"}),a("v-row",[a("v-col",{attrs:{cols:"12"}},[a("div",{staticClass:"d-flex justify-start align-center"},[a("v-icon",{attrs:{color:"teal darken-2"}},[t._v("mdi-cog")]),a("span",[t._v("  ")]),a("h2",[t._v("Technologies I use")])],1)])],1),a("v-row",t._l(t.technologies,(function(t){return a("v-col",{key:t.icon,staticClass:"text-center",attrs:{cols:"6",sm:"3",lg:"2"}},[a("avatar-icon",{attrs:{icon:t["icon"],"avatar-color":t["avatar-color"],"icon-color":t["icon-color"],"avatar-size":t["avatar-size"],"icon-size":t["icon-size"]}})],1)})),1)],1)},j=[],z=function(){var t=this,e=t.$createElement,a=t._self._c||e;return a("v-avatar",{staticClass:"elevation-4",attrs:{color:t.avatarColor,size:t.avatarSize}},[a("v-icon",{attrs:{color:t.iconColor,size:t.iconSize}},[t._v(" "+t._s(t.icon)+" ")])],1)},S=[],I={name:"AvatarIcon",props:["icon","avatar-size","icon-size","avatar-color","icon-color"],computed:{},data:function(){return{}}},O=I,V=a("132d"),A=Object(s["a"])(O,z,S,!1,null,null,null),T=A.exports;u()(A,{VAvatar:d["a"],VIcon:V["a"]});var P=function(){var t=this,e=t.$createElement,a=t._self._c||e;return a("div",[a("h5",{staticClass:"grey--text mb-1"},[t._v(t._s(t.title))]),t._l(t.links,(function(t){return a("flex-link",{key:t.text,attrs:{text:t.text,href:t.href,target:t.target,icon:t.icon,"icon-color":t["icon-color"]}})}))],2)},M=[],E=function(){var t=this,e=t.$createElement,a=t._self._c||e;return a("a",{staticClass:"d-flex justify-start align-center mb-1",staticStyle:{"text-decoration":"none"},attrs:{target:t.computedTarget,href:t.href}},[a("v-icon",{attrs:{color:t.iconColor}},[t._v(t._s(t.icon))]),t._v("  "+t._s(t.text)+"  "),"_blank"==t.computedTarget?a("v-icon",{attrs:{"x-small":"",color:"blue darken-2"}},[t._v(" mdi-open-in-new ")]):t._e()],1)},$=[],D={props:["text","href","target","icon","icon-color"],computed:{computedTarget:function(){return this.target?this.target:"_self"}}},H=D,Y=Object(s["a"])(H,E,$,!1,null,null,null),B=Y.exports;u()(Y,{VIcon:V["a"]});var F={name:"LinkSection",components:{"flex-link":B},props:["title","links"],data:function(){return{}}},J=F,L=Object(s["a"])(J,P,M,!1,null,null,null),R=L.exports,W={name:"Home",components:{"avatar-icon":T,"link-section":R},data:function(){return{technologies:[{icon:"mdi-microsoft-azure","avatar-color":"white","icon-color":"blue darken-2","avatar-size":"6em","icon-size":"5em"},{icon:"mdi-language-java","avatar-color":"white","icon-color":"red darken-2","avatar-size":"6em","icon-size":"5em"},{icon:"mdi-language-javascript","avatar-color":"white","icon-color":"yellow accent-4","avatar-size":"6em","icon-size":"5em"},{icon:"mdi-database-outline","avatar-color":"white","icon-color":"grey","avatar-size":"6em","icon-size":"5em"}],linkSections:[{title:"Professional",links:[{target:"_blank",href:"https://mx.linkedin.com/in/angel-daniel-alonso-tovar",icon:"mdi-linkedin","icon-color":"blue darken-3",text:"LinkedIn"},{target:"_blank",href:"https://github.com/Andelous",icon:"mdi-github","icon-color":"black",text:"GitHub"}]},{title:"Sample apps",links:[{href:"#",icon:"mdi-check","icon-color":"red",text:"Sample app 1"},{href:"#",icon:"mdi-clipboard","icon-color":"green darken-2",text:"Sample app 2"},{href:"#",icon:"mdi-cog","icon-color":"blue darken-2",text:"Sample app 3"}]},{title:"Want to play?",links:[{target:"_blank",href:"https://www.chess.com/member/andelous",icon:"mdi-chess-pawn","icon-color":"green darken-3",text:"Chess.com"},{target:"_blank",href:"https://steamcommunity.com/profiles/76561197999789497",icon:"mdi-steam","icon-color":"blue-grey darken-3",text:"Steam"}]}]}}},G=W,Q=a("ce7e"),q=Object(s["a"])(G,C,j,!1,null,null,null),K=q.exports;u()(q,{VCol:f["a"],VDivider:Q["a"],VIcon:V["a"],VRow:k["a"]}),o["a"].use(x["a"]);var N=[{path:"/",name:"Home",component:K}],U=new x["a"]({mode:"history",base:"/",routes:N}),X=U,Z=a("2f62");o["a"].use(Z["a"]);var tt=new Z["a"].Store({state:{},mutations:{},actions:{},modules:{}}),et=a("f309");o["a"].use(et["a"]);var at=new et["a"]({});o["a"].config.productionTip=!1,new o["a"]({router:X,store:tt,vuetify:at,render:function(t){return t(w)}}).$mount("#app")}});
//# sourceMappingURL=app.4eb4ab52.js.map
(window["webpackJsonp"] = window["webpackJsonp"] || []).push([["main"],{

/***/ "./src/$$_lazy_route_resource lazy recursive":
/*!**********************************************************!*\
  !*** ./src/$$_lazy_route_resource lazy namespace object ***!
  \**********************************************************/
/*! no static exports found */
/***/ (function(module, exports) {

function webpackEmptyAsyncContext(req) {
	// Here Promise.resolve().then() is used instead of new Promise() to prevent
	// uncaught exception popping up in devtools
	return Promise.resolve().then(function() {
		var e = new Error("Cannot find module '" + req + "'");
		e.code = 'MODULE_NOT_FOUND';
		throw e;
	});
}
webpackEmptyAsyncContext.keys = function() { return []; };
webpackEmptyAsyncContext.resolve = webpackEmptyAsyncContext;
module.exports = webpackEmptyAsyncContext;
webpackEmptyAsyncContext.id = "./src/$$_lazy_route_resource lazy recursive";

/***/ }),

/***/ "./src/app/add-dog/add-dog/add-dog.component.html":
/*!********************************************************!*\
  !*** ./src/app/add-dog/add-dog/add-dog.component.html ***!
  \********************************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = "<div class=\"container\">\n  <h2 class=\"text-center\">Select Dogs</h2>\n  <div class=\"row justify-content-center\">\n    <div class=\"col-6\">\n      <form [formGroup]=\"addForm\" (ngSubmit)=\"onSubmit()\">\n        <div class=\"form-group\">\n          <label for=\"exampleFormControlSelect1\">Example select</label>\n          <select\n            class=\"form-control\"\n            id=\"exampleFormControlSelect1\"\n            [(ngModel)]=\"selectedBreed\"\n            [ngModelOptions]=\"{ standalone: true }\"\n          >\n            <option *ngFor=\"let val of breeds\" [value]=\"val.name\">{{\n              val.name\n            }}</option>\n          </select>\n        </div>\n      </form>\n    </div>\n  </div>\n</div>\n<app-loader *ngIf=\"petFinderService.isLoading\"></app-loader>\n"

/***/ }),

/***/ "./src/app/add-dog/add-dog/add-dog.component.scss":
/*!********************************************************!*\
  !*** ./src/app/add-dog/add-dog/add-dog.component.scss ***!
  \********************************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = "\n/*# sourceMappingURL=data:application/json;base64,eyJ2ZXJzaW9uIjozLCJzb3VyY2VzIjpbXSwibmFtZXMiOltdLCJtYXBwaW5ncyI6IiIsImZpbGUiOiJzcmMvYXBwL2FkZC1kb2cvYWRkLWRvZy9hZGQtZG9nLmNvbXBvbmVudC5zY3NzIn0= */"

/***/ }),

/***/ "./src/app/add-dog/add-dog/add-dog.component.ts":
/*!******************************************************!*\
  !*** ./src/app/add-dog/add-dog/add-dog.component.ts ***!
  \******************************************************/
/*! exports provided: AddDogComponent */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "AddDogComponent", function() { return AddDogComponent; });
/* harmony import */ var tslib__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! tslib */ "./node_modules/tslib/tslib.es6.js");
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm5/core.js");
/* harmony import */ var _angular_forms__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(/*! @angular/forms */ "./node_modules/@angular/forms/fesm5/forms.js");
/* harmony import */ var _service_dog_service__WEBPACK_IMPORTED_MODULE_3__ = __webpack_require__(/*! ../../service/dog.service */ "./src/app/service/dog.service.ts");
/* harmony import */ var _angular_router__WEBPACK_IMPORTED_MODULE_4__ = __webpack_require__(/*! @angular/router */ "./node_modules/@angular/router/fesm5/router.js");
/* harmony import */ var src_app_service_petfinder_service__WEBPACK_IMPORTED_MODULE_5__ = __webpack_require__(/*! src/app/service/petfinder.service */ "./src/app/service/petfinder.service.ts");






var AddDogComponent = /** @class */ (function () {
    function AddDogComponent(formBuilder, router, dogService, petFinderService) {
        this.formBuilder = formBuilder;
        this.router = router;
        this.dogService = dogService;
        this.petFinderService = petFinderService;
    }
    AddDogComponent.prototype.ngOnInit = function () {
        this.addForm = this.formBuilder.group({
            id: [],
            email: ["", _angular_forms__WEBPACK_IMPORTED_MODULE_2__["Validators"].required],
            firstName: ["", _angular_forms__WEBPACK_IMPORTED_MODULE_2__["Validators"].required],
            lastName: ["", _angular_forms__WEBPACK_IMPORTED_MODULE_2__["Validators"].required]
        });
        this.getDogBreeds();
    };
    AddDogComponent.prototype.onSubmit = function () {
        var _this = this;
        this.dogService.createDog(this.addForm.value).subscribe(function (data) {
            _this.petFinderService.getDogs().subscribe(function (data) {
                _this.dogs = data;
                console.log("Result", _this.dogs);
            });
            _this.router.navigate(["list-dog"]);
        });
    };
    AddDogComponent.prototype.getDogBreeds = function () {
        var _this = this;
        this.petFinderService.isLoading = true;
        this.petFinderService.getBreeds().subscribe(function (data) {
            _this.petFinderService.isLoading = false;
            console.log(data);
            _this.breeds = data.breeds;
            console.log(_this.dogs);
        }, function (error) {
            _this.petFinderService.isLoading = false;
        });
    };
    AddDogComponent = tslib__WEBPACK_IMPORTED_MODULE_0__["__decorate"]([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_1__["Component"])({
            selector: "app-add-dog",
            template: __webpack_require__(/*! ./add-dog.component.html */ "./src/app/add-dog/add-dog/add-dog.component.html"),
            styles: [__webpack_require__(/*! ./add-dog.component.scss */ "./src/app/add-dog/add-dog/add-dog.component.scss")]
        }),
        tslib__WEBPACK_IMPORTED_MODULE_0__["__metadata"]("design:paramtypes", [_angular_forms__WEBPACK_IMPORTED_MODULE_2__["FormBuilder"],
            _angular_router__WEBPACK_IMPORTED_MODULE_4__["Router"],
            _service_dog_service__WEBPACK_IMPORTED_MODULE_3__["DogService"],
            src_app_service_petfinder_service__WEBPACK_IMPORTED_MODULE_5__["PetfinderService"]])
    ], AddDogComponent);
    return AddDogComponent;
}());



/***/ }),

/***/ "./src/app/app-routing.module.ts":
/*!***************************************!*\
  !*** ./src/app/app-routing.module.ts ***!
  \***************************************/
/*! exports provided: AppRoutingModule */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "AppRoutingModule", function() { return AppRoutingModule; });
/* harmony import */ var tslib__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! tslib */ "./node_modules/tslib/tslib.es6.js");
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm5/core.js");
/* harmony import */ var _angular_router__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(/*! @angular/router */ "./node_modules/@angular/router/fesm5/router.js");
/* harmony import */ var _register_register_register_component__WEBPACK_IMPORTED_MODULE_3__ = __webpack_require__(/*! ./register/register/register.component */ "./src/app/register/register/register.component.ts");
/* harmony import */ var _login_login_login_component__WEBPACK_IMPORTED_MODULE_4__ = __webpack_require__(/*! ./login/login/login.component */ "./src/app/login/login/login.component.ts");
/* harmony import */ var _add_dog_add_dog_add_dog_component__WEBPACK_IMPORTED_MODULE_5__ = __webpack_require__(/*! ./add-dog/add-dog/add-dog.component */ "./src/app/add-dog/add-dog/add-dog.component.ts");
/* harmony import */ var _edit_dog_edit_dog_edit_dog_component__WEBPACK_IMPORTED_MODULE_6__ = __webpack_require__(/*! ./edit-dog/edit-dog/edit-dog.component */ "./src/app/edit-dog/edit-dog/edit-dog.component.ts");
/* harmony import */ var _list_dog_list_dog_component__WEBPACK_IMPORTED_MODULE_7__ = __webpack_require__(/*! ./list-dog/list-dog.component */ "./src/app/list-dog/list-dog.component.ts");








var routes = [
    { path: "", redirectTo: "/login", pathMatch: "full" },
    {
        path: "register",
        component: _register_register_register_component__WEBPACK_IMPORTED_MODULE_3__["RegisterComponent"]
    },
    {
        path: "login",
        component: _login_login_login_component__WEBPACK_IMPORTED_MODULE_4__["LoginComponent"]
    },
    { path: "add-dog", component: _add_dog_add_dog_add_dog_component__WEBPACK_IMPORTED_MODULE_5__["AddDogComponent"] },
    { path: "edit-dog", component: _edit_dog_edit_dog_edit_dog_component__WEBPACK_IMPORTED_MODULE_6__["EditDogComponent"] },
    { path: "list-dog", component: _list_dog_list_dog_component__WEBPACK_IMPORTED_MODULE_7__["ListDogComponent"] }
];
var AppRoutingModule = /** @class */ (function () {
    function AppRoutingModule() {
    }
    AppRoutingModule = tslib__WEBPACK_IMPORTED_MODULE_0__["__decorate"]([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_1__["NgModule"])({
            imports: [_angular_router__WEBPACK_IMPORTED_MODULE_2__["RouterModule"].forRoot(routes)],
            exports: [_angular_router__WEBPACK_IMPORTED_MODULE_2__["RouterModule"]]
        })
    ], AppRoutingModule);
    return AppRoutingModule;
}());



/***/ }),

/***/ "./src/app/app.component.html":
/*!************************************!*\
  !*** ./src/app/app.component.html ***!
  \************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = "<!--The content below is only a placeholder and can be replaced.-->\n<router-outlet></router-outlet>\n"

/***/ }),

/***/ "./src/app/app.component.scss":
/*!************************************!*\
  !*** ./src/app/app.component.scss ***!
  \************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = "\n/*# sourceMappingURL=data:application/json;base64,eyJ2ZXJzaW9uIjozLCJzb3VyY2VzIjpbXSwibmFtZXMiOltdLCJtYXBwaW5ncyI6IiIsImZpbGUiOiJzcmMvYXBwL2FwcC5jb21wb25lbnQuc2NzcyJ9 */"

/***/ }),

/***/ "./src/app/app.component.ts":
/*!**********************************!*\
  !*** ./src/app/app.component.ts ***!
  \**********************************/
/*! exports provided: AppComponent */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "AppComponent", function() { return AppComponent; });
/* harmony import */ var tslib__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! tslib */ "./node_modules/tslib/tslib.es6.js");
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm5/core.js");


var AppComponent = /** @class */ (function () {
    function AppComponent() {
        this.title = "Petfinder";
    }
    AppComponent = tslib__WEBPACK_IMPORTED_MODULE_0__["__decorate"]([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_1__["Component"])({
            selector: "app-root",
            template: __webpack_require__(/*! ./app.component.html */ "./src/app/app.component.html"),
            styles: [__webpack_require__(/*! ./app.component.scss */ "./src/app/app.component.scss")]
        })
    ], AppComponent);
    return AppComponent;
}());



/***/ }),

/***/ "./src/app/app.module.ts":
/*!*******************************!*\
  !*** ./src/app/app.module.ts ***!
  \*******************************/
/*! exports provided: AppModule */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "AppModule", function() { return AppModule; });
/* harmony import */ var tslib__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! tslib */ "./node_modules/tslib/tslib.es6.js");
/* harmony import */ var _angular_platform_browser__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! @angular/platform-browser */ "./node_modules/@angular/platform-browser/fesm5/platform-browser.js");
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm5/core.js");
/* harmony import */ var _app_routing_module__WEBPACK_IMPORTED_MODULE_3__ = __webpack_require__(/*! ./app-routing.module */ "./src/app/app-routing.module.ts");
/* harmony import */ var _app_component__WEBPACK_IMPORTED_MODULE_4__ = __webpack_require__(/*! ./app.component */ "./src/app/app.component.ts");
/* harmony import */ var _angular_forms__WEBPACK_IMPORTED_MODULE_5__ = __webpack_require__(/*! @angular/forms */ "./node_modules/@angular/forms/fesm5/forms.js");
/* harmony import */ var _register_register_register_component__WEBPACK_IMPORTED_MODULE_6__ = __webpack_require__(/*! ./register/register/register.component */ "./src/app/register/register/register.component.ts");
/* harmony import */ var _login_login_login_component__WEBPACK_IMPORTED_MODULE_7__ = __webpack_require__(/*! ./login/login/login.component */ "./src/app/login/login/login.component.ts");
/* harmony import */ var _add_dog_add_dog_add_dog_component__WEBPACK_IMPORTED_MODULE_8__ = __webpack_require__(/*! ./add-dog/add-dog/add-dog.component */ "./src/app/add-dog/add-dog/add-dog.component.ts");
/* harmony import */ var _edit_dog_edit_dog_edit_dog_component__WEBPACK_IMPORTED_MODULE_9__ = __webpack_require__(/*! ./edit-dog/edit-dog/edit-dog.component */ "./src/app/edit-dog/edit-dog/edit-dog.component.ts");
/* harmony import */ var _list_dog_list_dog_component__WEBPACK_IMPORTED_MODULE_10__ = __webpack_require__(/*! ./list-dog/list-dog.component */ "./src/app/list-dog/list-dog.component.ts");
/* harmony import */ var _service_dog_service__WEBPACK_IMPORTED_MODULE_11__ = __webpack_require__(/*! ./service/dog.service */ "./src/app/service/dog.service.ts");
/* harmony import */ var _service_auth_service__WEBPACK_IMPORTED_MODULE_12__ = __webpack_require__(/*! ./service/auth.service */ "./src/app/service/auth.service.ts");
/* harmony import */ var _angular_common_http__WEBPACK_IMPORTED_MODULE_13__ = __webpack_require__(/*! @angular/common/http */ "./node_modules/@angular/common/fesm5/http.js");
/* harmony import */ var _service_petfinder_service__WEBPACK_IMPORTED_MODULE_14__ = __webpack_require__(/*! ./service/petfinder.service */ "./src/app/service/petfinder.service.ts");
/* harmony import */ var _shared_loader_loader_component__WEBPACK_IMPORTED_MODULE_15__ = __webpack_require__(/*! ./shared/loader/loader.component */ "./src/app/shared/loader/loader.component.ts");
















var AppModule = /** @class */ (function () {
    function AppModule() {
    }
    AppModule = tslib__WEBPACK_IMPORTED_MODULE_0__["__decorate"]([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_2__["NgModule"])({
            declarations: [
                _app_component__WEBPACK_IMPORTED_MODULE_4__["AppComponent"],
                _register_register_register_component__WEBPACK_IMPORTED_MODULE_6__["RegisterComponent"],
                _login_login_login_component__WEBPACK_IMPORTED_MODULE_7__["LoginComponent"],
                _add_dog_add_dog_add_dog_component__WEBPACK_IMPORTED_MODULE_8__["AddDogComponent"],
                _edit_dog_edit_dog_edit_dog_component__WEBPACK_IMPORTED_MODULE_9__["EditDogComponent"],
                _list_dog_list_dog_component__WEBPACK_IMPORTED_MODULE_10__["ListDogComponent"],
                _shared_loader_loader_component__WEBPACK_IMPORTED_MODULE_15__["LoaderComponent"]
            ],
            imports: [
                _angular_platform_browser__WEBPACK_IMPORTED_MODULE_1__["BrowserModule"],
                _app_routing_module__WEBPACK_IMPORTED_MODULE_3__["AppRoutingModule"],
                _angular_forms__WEBPACK_IMPORTED_MODULE_5__["ReactiveFormsModule"],
                _angular_forms__WEBPACK_IMPORTED_MODULE_5__["FormsModule"],
                _angular_common_http__WEBPACK_IMPORTED_MODULE_13__["HttpClientModule"]
            ],
            providers: [_service_auth_service__WEBPACK_IMPORTED_MODULE_12__["AuthenticationService"], _service_dog_service__WEBPACK_IMPORTED_MODULE_11__["DogService"], _service_petfinder_service__WEBPACK_IMPORTED_MODULE_14__["PetfinderService"]],
            bootstrap: [_app_component__WEBPACK_IMPORTED_MODULE_4__["AppComponent"]]
        })
    ], AppModule);
    return AppModule;
}());



/***/ }),

/***/ "./src/app/edit-dog/edit-dog/edit-dog.component.css":
/*!**********************************************************!*\
  !*** ./src/app/edit-dog/edit-dog/edit-dog.component.css ***!
  \**********************************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = "\n/*# sourceMappingURL=data:application/json;base64,eyJ2ZXJzaW9uIjozLCJzb3VyY2VzIjpbXSwibmFtZXMiOltdLCJtYXBwaW5ncyI6IiIsImZpbGUiOiJzcmMvYXBwL2VkaXQtZG9nL2VkaXQtZG9nL2VkaXQtZG9nLmNvbXBvbmVudC5jc3MifQ== */"

/***/ }),

/***/ "./src/app/edit-dog/edit-dog/edit-dog.component.html":
/*!***********************************************************!*\
  !*** ./src/app/edit-dog/edit-dog/edit-dog.component.html ***!
  \***********************************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = "<div class=\"col-md-6\">\n  <h2 class=\"text-center\">Edit User</h2>\n  <form >\n    <div class=\"form-group\">\n      <label for=\"email\">Email address:</label>\n      <input type=\"email\" formControlName=\"email\" placeholder=\"Email\" name=\"email\" class=\"form-control\" id=\"email\">\n    </div>\n\n    <div class=\"form-group\">\n      <label for=\"firstName\">First Name:</label>\n      <input formControlName=\"firstName\" placeholder=\"First Name\" name=\"firstName\" class=\"form-control\" id=\"firstName\">\n    </div>\n\n    <div class=\"form-group\">\n      <label for=\"lastName\">Last Name:</label>\n      <input formControlName=\"lastName\" placeholder=\"Last name\" name=\"lastName\" class=\"form-control\" id=\"lastName\">\n    </div>\n\n    <button class=\"btn btn-success\">Update</button>\n  </form>\n</div>\n"

/***/ }),

/***/ "./src/app/edit-dog/edit-dog/edit-dog.component.ts":
/*!*********************************************************!*\
  !*** ./src/app/edit-dog/edit-dog/edit-dog.component.ts ***!
  \*********************************************************/
/*! exports provided: EditDogComponent */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "EditDogComponent", function() { return EditDogComponent; });
/* harmony import */ var tslib__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! tslib */ "./node_modules/tslib/tslib.es6.js");
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm5/core.js");
/* harmony import */ var _service_dog_service__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(/*! ../../service/dog.service */ "./src/app/service/dog.service.ts");
/* harmony import */ var _angular_router__WEBPACK_IMPORTED_MODULE_3__ = __webpack_require__(/*! @angular/router */ "./node_modules/@angular/router/fesm5/router.js");
/* harmony import */ var _angular_forms__WEBPACK_IMPORTED_MODULE_4__ = __webpack_require__(/*! @angular/forms */ "./node_modules/@angular/forms/fesm5/forms.js");
/* harmony import */ var rxjs_operators__WEBPACK_IMPORTED_MODULE_5__ = __webpack_require__(/*! rxjs/operators */ "./node_modules/rxjs/_esm5/operators/index.js");






var EditDogComponent = /** @class */ (function () {
    function EditDogComponent(formBuilder, router, dogService) {
        this.formBuilder = formBuilder;
        this.router = router;
        this.dogService = dogService;
    }
    EditDogComponent.prototype.ngOnInit = function () {
        var _this = this;
        var userId = localStorage.getItem("editUserId");
        if (!userId) {
            alert("Invalid action.");
            this.router.navigate(["list-dog"]);
            return;
        }
        this.editForm = this.formBuilder.group({
            id: [],
            email: ["", _angular_forms__WEBPACK_IMPORTED_MODULE_4__["Validators"].required],
            firstName: ["", _angular_forms__WEBPACK_IMPORTED_MODULE_4__["Validators"].required],
            lastName: ["", _angular_forms__WEBPACK_IMPORTED_MODULE_4__["Validators"].required]
        });
        this.dogService.getDogById(+userId).subscribe(function (data) {
            _this.editForm.setValue(data);
        });
    };
    EditDogComponent.prototype.onSubmit = function () {
        var _this = this;
        this.dogService
            .updateDog(this.editForm.value)
            .pipe(Object(rxjs_operators__WEBPACK_IMPORTED_MODULE_5__["first"])())
            .subscribe(function (data) {
            _this.router.navigate(["list-dog"]);
        }, function (error) {
            alert(error);
        });
    };
    EditDogComponent = tslib__WEBPACK_IMPORTED_MODULE_0__["__decorate"]([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_1__["Component"])({
            selector: "app-edit-dog",
            template: __webpack_require__(/*! ./edit-dog.component.html */ "./src/app/edit-dog/edit-dog/edit-dog.component.html"),
            styles: [__webpack_require__(/*! ./edit-dog.component.css */ "./src/app/edit-dog/edit-dog/edit-dog.component.css")]
        }),
        tslib__WEBPACK_IMPORTED_MODULE_0__["__metadata"]("design:paramtypes", [_angular_forms__WEBPACK_IMPORTED_MODULE_4__["FormBuilder"],
            _angular_router__WEBPACK_IMPORTED_MODULE_3__["Router"],
            _service_dog_service__WEBPACK_IMPORTED_MODULE_2__["DogService"]])
    ], EditDogComponent);
    return EditDogComponent;
}());



/***/ }),

/***/ "./src/app/list-dog/list-dog.component.html":
/*!**************************************************!*\
  !*** ./src/app/list-dog/list-dog.component.html ***!
  \**************************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = "<div class=\"col-md-12 dogs-list\">\n  <h2>Dog Details</h2>\n  <button class=\"btn btn-danger add-btn\" (click)=\"addDog()\">Add Dog</button>\n  <table class=\"table table-striped\">\n    <thead>\n      <tr>\n        <th class=\"hidden\">Id</th>\n        <th>Name</th>\n        <th>UserName</th>\n        <th>Email</th>\n        <th>Action</th>\n      </tr>\n    </thead>\n    <tbody>\n      <tr *ngFor=\"let user of dogs; index as i\">\n        <td class=\"hidden\">{{ user.id }}</td>\n        <td>{{ user.name }}</td>\n        <td>{{ user.username }}</td>\n        <td>{{ user.email }}</td>\n        <td>\n          <button class=\"btn btn-danger\" (click)=\"deleteDog(dogs)\">\n            Delete\n          </button>\n          <button\n            class=\"btn btn-danger\"\n            (click)=\"editDog(dogs)\"\n            style=\"margin-left: 20px;\"\n          >\n            Edit\n          </button>\n        </td>\n      </tr>\n    </tbody>\n  </table>\n</div>\n"

/***/ }),

/***/ "./src/app/list-dog/list-dog.component.scss":
/*!**************************************************!*\
  !*** ./src/app/list-dog/list-dog.component.scss ***!
  \**************************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = "\n/*# sourceMappingURL=data:application/json;base64,eyJ2ZXJzaW9uIjozLCJzb3VyY2VzIjpbXSwibmFtZXMiOltdLCJtYXBwaW5ncyI6IiIsImZpbGUiOiJzcmMvYXBwL2xpc3QtZG9nL2xpc3QtZG9nLmNvbXBvbmVudC5zY3NzIn0= */"

/***/ }),

/***/ "./src/app/list-dog/list-dog.component.ts":
/*!************************************************!*\
  !*** ./src/app/list-dog/list-dog.component.ts ***!
  \************************************************/
/*! exports provided: ListDogComponent */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "ListDogComponent", function() { return ListDogComponent; });
/* harmony import */ var tslib__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! tslib */ "./node_modules/tslib/tslib.es6.js");
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm5/core.js");
/* harmony import */ var _service_dog_service__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(/*! ../service/dog.service */ "./src/app/service/dog.service.ts");
/* harmony import */ var _service_petfinder_service__WEBPACK_IMPORTED_MODULE_3__ = __webpack_require__(/*! ../service/petfinder.service */ "./src/app/service/petfinder.service.ts");
/* harmony import */ var _angular_router__WEBPACK_IMPORTED_MODULE_4__ = __webpack_require__(/*! @angular/router */ "./node_modules/@angular/router/fesm5/router.js");





var ListDogComponent = /** @class */ (function () {
    function ListDogComponent(router, dogService, petFinderService) {
        this.router = router;
        this.dogService = dogService;
        this.petFinderService = petFinderService;
    }
    ListDogComponent.prototype.ngOnInit = function () {
        this.getDogsDetails();
    };
    ListDogComponent.prototype.getDogsDetails = function () {
        var _this = this;
        this.petFinderService.getBreeds().subscribe(function (data) {
            _this.dogs = data;
        });
    };
    ListDogComponent.prototype.deleteDog = function (dogs, i) {
        var _this = this;
        this.dogService.deleteDog(dogs.id).subscribe(function (data) {
            _this.dogs.splice(i, 1);
            // this.dogs = this.dogs.filter(element => element !== dogs);
            console.log(_this.dogs, "After deletion");
        });
    };
    ListDogComponent.prototype.editDog = function (dogs) {
        localStorage.removeItem("editDogId");
        localStorage.setItem("editDogId", dogs.id.toString());
        this.router.navigate(["edit-dog"]);
    };
    ListDogComponent.prototype.addDog = function () {
        this.router.navigate(["add-dog"]);
    };
    ListDogComponent = tslib__WEBPACK_IMPORTED_MODULE_0__["__decorate"]([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_1__["Component"])({
            selector: "app-list-dog",
            template: __webpack_require__(/*! ./list-dog.component.html */ "./src/app/list-dog/list-dog.component.html"),
            styles: [__webpack_require__(/*! ./list-dog.component.scss */ "./src/app/list-dog/list-dog.component.scss")]
        }),
        tslib__WEBPACK_IMPORTED_MODULE_0__["__metadata"]("design:paramtypes", [_angular_router__WEBPACK_IMPORTED_MODULE_4__["Router"], _service_dog_service__WEBPACK_IMPORTED_MODULE_2__["DogService"], _service_petfinder_service__WEBPACK_IMPORTED_MODULE_3__["PetfinderService"]])
    ], ListDogComponent);
    return ListDogComponent;
}());



/***/ }),

/***/ "./src/app/login/login/login.component.html":
/*!**************************************************!*\
  !*** ./src/app/login/login/login.component.html ***!
  \**************************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = "<div class=\"container\">\n  <div class=\"row\">\n    <div class=\"col-sm-9 col-md-7 col-lg-5 mx-auto\">\n      <div class=\"card card-signin my-5\">\n        <div class=\"card-body\">\n          <h3 class=\"card-title text-center\">Sign In</h3>\n          <form\n            class=\"form-signin\"\n            [formGroup]=\"loginForm\"\n            (ngSubmit)=\"onSubmit()\"\n          >\n            <div class=\"form-label-group\">\n              <input\n                type=\"email\"\n                id=\"inputEmail\"\n                class=\"form-control\"\n                placeholder=\"Email address\"\n                required\n                autofocus\n                formControlName=\"email\"\n                [maxlength]=\"25\"\n              />\n              <label for=\"inputEmail\">Email address</label>\n\n              <!-- validation -->\n              <div class=\"validation-errors\">\n                <ng-container\n                  *ngFor=\"let validation of validationMessages.email\"\n                >\n                  <div\n                    class=\"error-message\"\n                    *ngIf=\"\n                      loginForm.get('email').hasError(validation.type) &&\n                      (loginForm.get('email').dirty ||\n                        loginForm.get('email').touched)\n                    \"\n                  >\n                    {{ validation.message }}\n                  </div>\n                </ng-container>\n              </div>\n            </div>\n\n            <div class=\"form-label-group\">\n              <input\n                type=\"password\"\n                id=\"inputPassword\"\n                class=\"form-control\"\n                placeholder=\"Password\"\n                required\n                formControlName=\"password\"\n                (keyup.enter)=\"onSubmit()\"\n                [maxlength]=\"12\"\n              />\n              <label for=\"inputPassword\">Password</label>\n              <div class=\"validation-errors\">\n                <ng-container\n                  *ngFor=\"let validation of validationMessages.password\"\n                >\n                  <div\n                    class=\"error-message\"\n                    *ngIf=\"\n                      loginForm.get('password').hasError(validation.type) &&\n                      (loginForm.get('password').dirty ||\n                        loginForm.get('password').touched)\n                    \"\n                  >\n                    {{ validation.message }}\n                  </div>\n                </ng-container>\n              </div>\n            </div>\n\n            <button\n              class=\"btn btn-lg btn-success btn-block text-uppercase\"\n              type=\"submit\"\n              [disabled]=\"loginForm.invalid\"\n            >\n              Sign in\n            </button>\n            <hr class=\"my-4\" />\n\n            <button\n              class=\"btn btn-lg btn-primary btn-block text-uppercase\"\n              (click)=\"register()\"\n            >\n              Sign up/ Register Form\n            </button>\n          </form>\n        </div>\n      </div>\n    </div>\n  </div>\n</div>\n"

/***/ }),

/***/ "./src/app/login/login/login.component.scss":
/*!**************************************************!*\
  !*** ./src/app/login/login/login.component.scss ***!
  \**************************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = "\n/*# sourceMappingURL=data:application/json;base64,eyJ2ZXJzaW9uIjozLCJzb3VyY2VzIjpbXSwibmFtZXMiOltdLCJtYXBwaW5ncyI6IiIsImZpbGUiOiJzcmMvYXBwL2xvZ2luL2xvZ2luL2xvZ2luLmNvbXBvbmVudC5zY3NzIn0= */"

/***/ }),

/***/ "./src/app/login/login/login.component.ts":
/*!************************************************!*\
  !*** ./src/app/login/login/login.component.ts ***!
  \************************************************/
/*! exports provided: LoginComponent */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "LoginComponent", function() { return LoginComponent; });
/* harmony import */ var tslib__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! tslib */ "./node_modules/tslib/tslib.es6.js");
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm5/core.js");
/* harmony import */ var _angular_router__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(/*! @angular/router */ "./node_modules/@angular/router/fesm5/router.js");
/* harmony import */ var _angular_forms__WEBPACK_IMPORTED_MODULE_3__ = __webpack_require__(/*! @angular/forms */ "./node_modules/@angular/forms/fesm5/forms.js");




var LoginComponent = /** @class */ (function () {
    // numberAndcharacterPattern = /^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]/;
    function LoginComponent(formBuilder, router) {
        this.formBuilder = formBuilder;
        this.router = router;
        this.submitted = false;
        this.invalidLogin = false;
        this.validationMessages = {
            email: [
                { type: "required", message: "Email is required." },
                {
                    type: "minlength",
                    message: "Email must be at least 5 characters long."
                },
                {
                    type: "maxlength",
                    message: "Email cannot be more than 25 characters long."
                },
                {
                    type: "pattern",
                    message: "Email must contain @ and . character"
                }
            ],
            password: [
                { type: "required", message: "Password is required." },
                {
                    type: "minlength",
                    message: "Password must be at least 8 characters long."
                },
                {
                    type: "maxlength",
                    message: "Password cannot be more than 12 characters long."
                },
                {
                    type: "pattern",
                    message: "Password must contain at least one upper case English letter, one lower case English letter, one digit, one special character."
                }
            ]
        };
        this.emailPattern = /^([a-zA-Z0-9_\.\-])+\@(([a-zA-Z0-9\-])+\.)+([a-zA-Z0-9]{2,4})+$/;
        this.passwordPattern = /^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#\$%\^&\*\[\]"\';:_\-<>\., =\+\/\\]).{8,}$/;
    }
    LoginComponent.prototype.onSubmit = function () {
        this.submitted = true;
        if (this.loginForm.invalid) {
            return;
        }
        if (this.loginForm.controls.email.value == "neelpat29@gmail.com" &&
            this.loginForm.controls.password.value == "Brooks@99") {
            this.router.navigate(["add-dog"]);
        }
        else {
            this.invalidLogin = true;
        }
    };
    LoginComponent.prototype.ngOnInit = function () {
        this.loginForm = this.formBuilder.group({
            email: [
                "neelpat29@gmail.com",
                _angular_forms__WEBPACK_IMPORTED_MODULE_3__["Validators"].compose([
                    _angular_forms__WEBPACK_IMPORTED_MODULE_3__["Validators"].minLength(5),
                    _angular_forms__WEBPACK_IMPORTED_MODULE_3__["Validators"].maxLength(25),
                    _angular_forms__WEBPACK_IMPORTED_MODULE_3__["Validators"].pattern(this.emailPattern),
                    // Validators.pattern(this.numberAndcharacterPattern),
                    _angular_forms__WEBPACK_IMPORTED_MODULE_3__["Validators"].required
                ])
            ],
            password: [
                "Brooks@99",
                _angular_forms__WEBPACK_IMPORTED_MODULE_3__["Validators"].compose([
                    _angular_forms__WEBPACK_IMPORTED_MODULE_3__["Validators"].minLength(8),
                    _angular_forms__WEBPACK_IMPORTED_MODULE_3__["Validators"].maxLength(12),
                    _angular_forms__WEBPACK_IMPORTED_MODULE_3__["Validators"].pattern(this.passwordPattern),
                    _angular_forms__WEBPACK_IMPORTED_MODULE_3__["Validators"].required
                ])
            ]
        });
    };
    LoginComponent.prototype.register = function () {
        this.router.navigateByUrl("register");
    };
    LoginComponent = tslib__WEBPACK_IMPORTED_MODULE_0__["__decorate"]([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_1__["Component"])({
            selector: "app-login",
            template: __webpack_require__(/*! ./login.component.html */ "./src/app/login/login/login.component.html"),
            styles: [__webpack_require__(/*! ./login.component.scss */ "./src/app/login/login/login.component.scss")]
        }),
        tslib__WEBPACK_IMPORTED_MODULE_0__["__metadata"]("design:paramtypes", [_angular_forms__WEBPACK_IMPORTED_MODULE_3__["FormBuilder"], _angular_router__WEBPACK_IMPORTED_MODULE_2__["Router"]])
    ], LoginComponent);
    return LoginComponent;
}());



/***/ }),

/***/ "./src/app/register/register/register.component.html":
/*!***********************************************************!*\
  !*** ./src/app/register/register/register.component.html ***!
  \***********************************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = "<div class=\"container\">\n  <div class=\"row\">\n    <div class=\"col-sm-9 col-md-7 col-lg-5 mx-auto\">\n      <div class=\"card card-signin my-5\">\n        <div class=\"card-body\">\n          <h5 class=\"card-title text-center\">Register</h5>\n          <form class=\"form-signin\">\n            <div class=\"form-label-group\">\n              <input\n                type=\"email\"\n                id=\"inputEmail\"\n                class=\"form-control\"\n                placeholder=\"Enter Email address\"\n                required\n                autofocus\n              />\n              <label for=\"inputEmail\">Email address</label>\n            </div>\n\n            <div class=\"form-label-group\">\n              <input\n                type=\"text\"\n                id=\"inputname\"\n                class=\"form-control\"\n                placeholder=\"Enter Name\"\n                required\n              />\n              <label for=\"inputPassword\">Mobile Number</label>\n            </div>\n\n            <div class=\"form-label-group\">\n              <input\n                type=\"password\"\n                id=\"inputPassword\"\n                class=\"form-control\"\n                placeholder=\" Enter Password\"\n                required\n              />\n              <label for=\"inputPassword\">Password</label>\n            </div>\n            <div class=\"form-label-group\">\n              <input\n                type=\"number\"\n                id=\"inputmobilenumber\"\n                class=\"form-control\"\n                placeholder=\"Enter Mobile Number\"\n                required\n              />\n              <label for=\"inputPassword\">Mobile Number</label>\n            </div>\n\n            <button\n              class=\"btn btn-lg btn-primary btn-block text-uppercase\"\n              type=\"submit\"\n            >\n              Register\n            </button>\n          </form>\n        </div>\n      </div>\n    </div>\n  </div>\n</div>\n"

/***/ }),

/***/ "./src/app/register/register/register.component.scss":
/*!***********************************************************!*\
  !*** ./src/app/register/register/register.component.scss ***!
  \***********************************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = "\n/*# sourceMappingURL=data:application/json;base64,eyJ2ZXJzaW9uIjozLCJzb3VyY2VzIjpbXSwibmFtZXMiOltdLCJtYXBwaW5ncyI6IiIsImZpbGUiOiJzcmMvYXBwL3JlZ2lzdGVyL3JlZ2lzdGVyL3JlZ2lzdGVyLmNvbXBvbmVudC5zY3NzIn0= */"

/***/ }),

/***/ "./src/app/register/register/register.component.ts":
/*!*********************************************************!*\
  !*** ./src/app/register/register/register.component.ts ***!
  \*********************************************************/
/*! exports provided: RegisterComponent */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "RegisterComponent", function() { return RegisterComponent; });
/* harmony import */ var tslib__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! tslib */ "./node_modules/tslib/tslib.es6.js");
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm5/core.js");


var RegisterComponent = /** @class */ (function () {
    function RegisterComponent() {
    }
    RegisterComponent.prototype.ngOnInit = function () {
    };
    RegisterComponent = tslib__WEBPACK_IMPORTED_MODULE_0__["__decorate"]([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_1__["Component"])({
            selector: 'app-register',
            template: __webpack_require__(/*! ./register.component.html */ "./src/app/register/register/register.component.html"),
            styles: [__webpack_require__(/*! ./register.component.scss */ "./src/app/register/register/register.component.scss")]
        }),
        tslib__WEBPACK_IMPORTED_MODULE_0__["__metadata"]("design:paramtypes", [])
    ], RegisterComponent);
    return RegisterComponent;
}());



/***/ }),

/***/ "./src/app/service/auth.service.ts":
/*!*****************************************!*\
  !*** ./src/app/service/auth.service.ts ***!
  \*****************************************/
/*! exports provided: AuthenticationService */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "AuthenticationService", function() { return AuthenticationService; });
/* harmony import */ var tslib__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! tslib */ "./node_modules/tslib/tslib.es6.js");
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm5/core.js");
/* harmony import */ var _angular_common_http__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(/*! @angular/common/http */ "./node_modules/@angular/common/fesm5/http.js");
/* harmony import */ var rxjs_operators__WEBPACK_IMPORTED_MODULE_3__ = __webpack_require__(/*! rxjs/operators */ "./node_modules/rxjs/_esm5/operators/index.js");




var AuthenticationService = /** @class */ (function () {
    function AuthenticationService(http) {
        this.http = http;
    }
    AuthenticationService.prototype.login = function (email, password) {
        return this.http
            .post("/api/authenticate", {
            email: email,
            password: password
        })
            .pipe(Object(rxjs_operators__WEBPACK_IMPORTED_MODULE_3__["map"])(function (user) {
            // login successful if there's a jwt token in the response
            if (user && user.token) {
                // store user details and jwt token in local storage to keep user logged in between page refreshes
                localStorage.setItem("currentUser", JSON.stringify(user));
            }
            return user;
        }));
    };
    AuthenticationService = tslib__WEBPACK_IMPORTED_MODULE_0__["__decorate"]([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_1__["Injectable"])(),
        tslib__WEBPACK_IMPORTED_MODULE_0__["__metadata"]("design:paramtypes", [_angular_common_http__WEBPACK_IMPORTED_MODULE_2__["HttpClient"]])
    ], AuthenticationService);
    return AuthenticationService;
}());



/***/ }),

/***/ "./src/app/service/dog.service.ts":
/*!****************************************!*\
  !*** ./src/app/service/dog.service.ts ***!
  \****************************************/
/*! exports provided: DogService */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "DogService", function() { return DogService; });
/* harmony import */ var tslib__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! tslib */ "./node_modules/tslib/tslib.es6.js");
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm5/core.js");
/* harmony import */ var _angular_common_http__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(/*! @angular/common/http */ "./node_modules/@angular/common/fesm5/http.js");



var BASE_URL = "https://api.petfinder.com/v2";
var DogService = /** @class */ (function () {
    function DogService(http) {
        this.http = http;
    }
    DogService.prototype.getDogById = function (id) {
        return this.http.get(BASE_URL + "/animals/" + id);
    };
    DogService.prototype.createDog = function (dog) {
        return this.http.post(BASE_URL + "/animals", dog);
    };
    DogService.prototype.updateDog = function (dog) {
        return this.http.put(BASE_URL + "/animals/" + dog.id, dog);
    };
    DogService.prototype.deleteDog = function (id) {
        return this.http.delete(BASE_URL + "/animals/" + id);
    };
    DogService = tslib__WEBPACK_IMPORTED_MODULE_0__["__decorate"]([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_1__["Injectable"])(),
        tslib__WEBPACK_IMPORTED_MODULE_0__["__metadata"]("design:paramtypes", [_angular_common_http__WEBPACK_IMPORTED_MODULE_2__["HttpClient"]])
    ], DogService);
    return DogService;
}());



/***/ }),

/***/ "./src/app/service/petfinder.service.ts":
/*!**********************************************!*\
  !*** ./src/app/service/petfinder.service.ts ***!
  \**********************************************/
/*! exports provided: PetfinderService */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "PetfinderService", function() { return PetfinderService; });
/* harmony import */ var tslib__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! tslib */ "./node_modules/tslib/tslib.es6.js");
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm5/core.js");
/* harmony import */ var _angular_common_http__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(/*! @angular/common/http */ "./node_modules/@angular/common/fesm5/http.js");



var BASE_URL = "https://api.petfinder.com/v2";
var CLIENT_ID = "Cstk7ayhA5di3IfCcSykTlC2JtEtHRieCXO6mSteTjAR1oHc5k";
var CLIENT_SECRET = "Q0s1TZMkRGDuc75tOWskj9v3pPLcloGns5jO8Xr2";
var PetfinderService = /** @class */ (function () {
    function PetfinderService(http) {
        var _this = this;
        this.http = http;
        this.http
            .post(BASE_URL + "/oauth2/token", {
            grant_type: "client_credentials",
            client_id: CLIENT_ID,
            client_secret: CLIENT_SECRET
        })
            .subscribe(function (res) {
            _this.token = res.access_token;
        });
    }
    PetfinderService.prototype.setAuthorizationHeader = function () {
        this.headers = new _angular_common_http__WEBPACK_IMPORTED_MODULE_2__["HttpHeaders"]()
            .set("Content-Type", "application/json")
            .set("authorization", "Bearer " + this.token);
    };
    PetfinderService.prototype.getDogs = function () {
        this.setAuthorizationHeader();
        return this.http.get(BASE_URL + "/animals");
    };
    PetfinderService.prototype.getBreeds = function () {
        this.setAuthorizationHeader();
        return this.http.get(BASE_URL + "/types/dog/breeds", {
            headers: this.headers
        });
    };
    PetfinderService.prototype.getDogsByBreed = function (breed) {
        this.setAuthorizationHeader();
        return this.http.get(BASE_URL + "/animals?breed=" + breed);
    };
    PetfinderService = tslib__WEBPACK_IMPORTED_MODULE_0__["__decorate"]([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_1__["Injectable"])(),
        tslib__WEBPACK_IMPORTED_MODULE_0__["__metadata"]("design:paramtypes", [_angular_common_http__WEBPACK_IMPORTED_MODULE_2__["HttpClient"]])
    ], PetfinderService);
    return PetfinderService;
}());



/***/ }),

/***/ "./src/app/shared/loader/loader.component.html":
/*!*****************************************************!*\
  !*** ./src/app/shared/loader/loader.component.html ***!
  \*****************************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = "<div class=\"boxes\">\n    <div class=\"box\">\n        <div></div>\n        <div></div>\n        <div></div>\n        <div></div>\n    </div>\n    <div class=\"box\">\n        <div></div>\n        <div></div>\n        <div></div>\n        <div></div>\n    </div>\n    <div class=\"box\">\n        <div></div>\n        <div></div>\n        <div></div>\n        <div></div>\n    </div>\n    <div class=\"box\">\n        <div></div>\n        <div></div>\n        <div></div>\n        <div></div>\n    </div>\n</div>\n"

/***/ }),

/***/ "./src/app/shared/loader/loader.component.scss":
/*!*****************************************************!*\
  !*** ./src/app/shared/loader/loader.component.scss ***!
  \*****************************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = ".boxes {\n  --size: 32px;\n  --duration: 2600ms;\n  height: calc(var(--size) * 2);\n  width: calc(var(--size) * 3);\n  position: relative;\n  -webkit-transform-style: preserve-3d;\n          transform-style: preserve-3d;\n  -webkit-transform-origin: 50% 50%;\n          transform-origin: 50% 50%;\n  margin-top: calc(var(--size) * 1.5 * -1);\n  -webkit-transform: rotateX(60deg) rotateZ(45deg) rotateY(0deg) translateZ(0px);\n          transform: rotateX(60deg) rotateZ(45deg) rotateY(0deg) translateZ(0px);\n  margin: 10% 40% 10% 50%; }\n  .boxes .box {\n    width: var(--size);\n    height: var(--size);\n    top: 0;\n    left: 0;\n    position: absolute;\n    -webkit-transform-style: preserve-3d;\n            transform-style: preserve-3d; }\n  .boxes .box:nth-child(1) {\n      -webkit-transform: translate(100%, 0);\n              transform: translate(100%, 0);\n      -webkit-animation: box1 var(--duration) linear infinite;\n              animation: box1 var(--duration) linear infinite; }\n  .boxes .box:nth-child(2) {\n      -webkit-transform: translate(0, 100%);\n              transform: translate(0, 100%);\n      -webkit-animation: box2 var(--duration) linear infinite;\n              animation: box2 var(--duration) linear infinite; }\n  .boxes .box:nth-child(3) {\n      -webkit-transform: translate(100%, 100%);\n              transform: translate(100%, 100%);\n      -webkit-animation: box3 var(--duration) linear infinite;\n              animation: box3 var(--duration) linear infinite; }\n  .boxes .box:nth-child(4) {\n      -webkit-transform: translate(200%, 0);\n              transform: translate(200%, 0);\n      -webkit-animation: box4 var(--duration) linear infinite;\n              animation: box4 var(--duration) linear infinite; }\n  .boxes .box > div {\n      --background: #e754bb;\n      --top: auto;\n      --right: auto;\n      --bottom: auto;\n      --left: auto;\n      --translateZ: calc(var(--size) / 2);\n      --rotateY: 0deg;\n      --rotateX: 0deg;\n      position: absolute;\n      width: 100%;\n      height: 100%;\n      background: var(--background);\n      top: var(--top);\n      right: var(--right);\n      bottom: var(--bottom);\n      left: var(--left);\n      -webkit-transform: rotateY(var(--rotateY)) rotateX(var(--rotateX)) translateZ(var(--translateZ));\n              transform: rotateY(var(--rotateY)) rotateX(var(--rotateX)) translateZ(var(--translateZ)); }\n  .boxes .box > div:nth-child(1) {\n        --top: 0;\n        --left: 0; }\n  .boxes .box > div:nth-child(2) {\n        --background: #e70a65;\n        --right: 0;\n        --rotateY: 90deg; }\n  .boxes .box > div:nth-child(3) {\n        --background: #447cf5;\n        --rotateX: -90deg; }\n  .boxes .box > div:nth-child(4) {\n        --background: #dbe3f4;\n        --top: 0;\n        --left: 0;\n        --translateZ: calc(var(--size) * 3 * -1); }\n  @-webkit-keyframes box1 {\n  0%,\n  50% {\n    -webkit-transform: translate(100%, 0);\n            transform: translate(100%, 0); }\n  100% {\n    -webkit-transform: translate(200%, 0);\n            transform: translate(200%, 0); } }\n  @keyframes box1 {\n  0%,\n  50% {\n    -webkit-transform: translate(100%, 0);\n            transform: translate(100%, 0); }\n  100% {\n    -webkit-transform: translate(200%, 0);\n            transform: translate(200%, 0); } }\n  @-webkit-keyframes box2 {\n  0% {\n    -webkit-transform: translate(0, 100%);\n            transform: translate(0, 100%); }\n  50% {\n    -webkit-transform: translate(0, 0);\n            transform: translate(0, 0); }\n  100% {\n    -webkit-transform: translate(100%, 0);\n            transform: translate(100%, 0); } }\n  @keyframes box2 {\n  0% {\n    -webkit-transform: translate(0, 100%);\n            transform: translate(0, 100%); }\n  50% {\n    -webkit-transform: translate(0, 0);\n            transform: translate(0, 0); }\n  100% {\n    -webkit-transform: translate(100%, 0);\n            transform: translate(100%, 0); } }\n  @-webkit-keyframes box3 {\n  0%,\n  50% {\n    -webkit-transform: translate(100%, 100%);\n            transform: translate(100%, 100%); }\n  100% {\n    -webkit-transform: translate(0, 100%);\n            transform: translate(0, 100%); } }\n  @keyframes box3 {\n  0%,\n  50% {\n    -webkit-transform: translate(100%, 100%);\n            transform: translate(100%, 100%); }\n  100% {\n    -webkit-transform: translate(0, 100%);\n            transform: translate(0, 100%); } }\n  @-webkit-keyframes box4 {\n  0% {\n    -webkit-transform: translate(200%, 0);\n            transform: translate(200%, 0); }\n  50% {\n    -webkit-transform: translate(200%, 100%);\n            transform: translate(200%, 100%); }\n  100% {\n    -webkit-transform: translate(100%, 100%);\n            transform: translate(100%, 100%); } }\n  @keyframes box4 {\n  0% {\n    -webkit-transform: translate(200%, 0);\n            transform: translate(200%, 0); }\n  50% {\n    -webkit-transform: translate(200%, 100%);\n            transform: translate(200%, 100%); }\n  100% {\n    -webkit-transform: translate(100%, 100%);\n            transform: translate(100%, 100%); } }\n  html {\n  -webkit-font-smoothing: antialiased; }\n  * {\n  box-sizing: border-box; }\n  *:before, *:after {\n    box-sizing: border-box; }\n  body {\n  min-height: 100vh;\n  font-family: Roboto, Arial;\n  color: #adafb6;\n  display: flex;\n  justify-content: center;\n  align-items: center;\n  background: #f9fbff; }\n  body .dribbble {\n    position: fixed;\n    display: block;\n    right: 20px;\n    bottom: 20px; }\n  body .dribbble img {\n      display: block;\n      height: 28px; }\n\n/*# sourceMappingURL=data:application/json;base64,eyJ2ZXJzaW9uIjozLCJzb3VyY2VzIjpbInNyYy9hcHAvc2hhcmVkL2xvYWRlci9DOlxcVXNlcnNcXG5pbmphXFxEZXNrdG9wXFxrOWtpZHNuZy9zcmNcXGFwcFxcc2hhcmVkXFxsb2FkZXJcXGxvYWRlci5jb21wb25lbnQuc2NzcyJdLCJuYW1lcyI6W10sIm1hcHBpbmdzIjoiQUFLQTtFQUNFLFlBQU87RUFDUCxrQkFBVztFQUNYLDZCQUE2QjtFQUM3Qiw0QkFBNEI7RUFDNUIsa0JBQWtCO0VBQ2xCLG9DQUE0QjtVQUE1Qiw0QkFBNEI7RUFDNUIsaUNBQXlCO1VBQXpCLHlCQUF5QjtFQUN6Qix3Q0FBd0M7RUFDeEMsOEVBQXNFO1VBQXRFLHNFQUFzRTtFQUN0RSx1QkFBdUIsRUFBQTtFQVZ6QjtJQVlJLGtCQUFrQjtJQUNsQixtQkFBbUI7SUFDbkIsTUFBTTtJQUNOLE9BQU87SUFDUCxrQkFBa0I7SUFDbEIsb0NBQTRCO1lBQTVCLDRCQUE0QixFQUFBO0VBakJoQztNQW1CTSxxQ0FBNkI7Y0FBN0IsNkJBQTZCO01BQzdCLHVEQUErQztjQUEvQywrQ0FBK0MsRUFBQTtFQXBCckQ7TUF1Qk0scUNBQTZCO2NBQTdCLDZCQUE2QjtNQUM3Qix1REFBK0M7Y0FBL0MsK0NBQStDLEVBQUE7RUF4QnJEO01BMkJNLHdDQUFnQztjQUFoQyxnQ0FBZ0M7TUFDaEMsdURBQStDO2NBQS9DLCtDQUErQyxFQUFBO0VBNUJyRDtNQStCTSxxQ0FBNkI7Y0FBN0IsNkJBQTZCO01BQzdCLHVEQUErQztjQUEvQywrQ0FBK0MsRUFBQTtFQWhDckQ7TUFtQ00scUJBQWE7TUFDYixXQUFNO01BQ04sYUFBUTtNQUNSLGNBQVM7TUFDVCxZQUFPO01BQ1AsbUNBQWE7TUFDYixlQUFVO01BQ1YsZUFBVTtNQUNWLGtCQUFrQjtNQUNsQixXQUFXO01BQ1gsWUFBWTtNQUNaLDZCQUE2QjtNQUM3QixlQUFlO01BQ2YsbUJBQW1CO01BQ25CLHFCQUFxQjtNQUNyQixpQkFBaUI7TUFDakIsZ0dBQytCO2NBRC9CLHdGQUMrQixFQUFBO0VBcERyQztRQXNEUSxRQUFNO1FBQ04sU0FBTyxFQUFBO0VBdkRmO1FBMERRLHFCQUFhO1FBQ2IsVUFBUTtRQUNSLGdCQUFVLEVBQUE7RUE1RGxCO1FBK0RRLHFCQUFhO1FBQ2IsaUJBQVUsRUFBQTtFQWhFbEI7UUFtRVEscUJBQWE7UUFDYixRQUFNO1FBQ04sU0FBTztRQUNQLHdDQUFhLEVBQUE7RUFNckI7RUFDRTs7SUFFRSxxQ0FBNkI7WUFBN0IsNkJBQTZCLEVBQUE7RUFFL0I7SUFDRSxxQ0FBNkI7WUFBN0IsNkJBQTZCLEVBQUEsRUFBQTtFQU5qQztFQUNFOztJQUVFLHFDQUE2QjtZQUE3Qiw2QkFBNkIsRUFBQTtFQUUvQjtJQUNFLHFDQUE2QjtZQUE3Qiw2QkFBNkIsRUFBQSxFQUFBO0VBSWpDO0VBQ0U7SUFDRSxxQ0FBNkI7WUFBN0IsNkJBQTZCLEVBQUE7RUFFL0I7SUFDRSxrQ0FBMEI7WUFBMUIsMEJBQTBCLEVBQUE7RUFFNUI7SUFDRSxxQ0FBNkI7WUFBN0IsNkJBQTZCLEVBQUEsRUFBQTtFQVJqQztFQUNFO0lBQ0UscUNBQTZCO1lBQTdCLDZCQUE2QixFQUFBO0VBRS9CO0lBQ0Usa0NBQTBCO1lBQTFCLDBCQUEwQixFQUFBO0VBRTVCO0lBQ0UscUNBQTZCO1lBQTdCLDZCQUE2QixFQUFBLEVBQUE7RUFJakM7RUFDRTs7SUFFRSx3Q0FBZ0M7WUFBaEMsZ0NBQWdDLEVBQUE7RUFFbEM7SUFDRSxxQ0FBNkI7WUFBN0IsNkJBQTZCLEVBQUEsRUFBQTtFQU5qQztFQUNFOztJQUVFLHdDQUFnQztZQUFoQyxnQ0FBZ0MsRUFBQTtFQUVsQztJQUNFLHFDQUE2QjtZQUE3Qiw2QkFBNkIsRUFBQSxFQUFBO0VBSWpDO0VBQ0U7SUFDRSxxQ0FBNkI7WUFBN0IsNkJBQTZCLEVBQUE7RUFFL0I7SUFDRSx3Q0FBZ0M7WUFBaEMsZ0NBQWdDLEVBQUE7RUFFbEM7SUFDRSx3Q0FBZ0M7WUFBaEMsZ0NBQWdDLEVBQUEsRUFBQTtFQVJwQztFQUNFO0lBQ0UscUNBQTZCO1lBQTdCLDZCQUE2QixFQUFBO0VBRS9CO0lBQ0Usd0NBQWdDO1lBQWhDLGdDQUFnQyxFQUFBO0VBRWxDO0lBQ0Usd0NBQWdDO1lBQWhDLGdDQUFnQyxFQUFBLEVBQUE7RUFJcEM7RUFDRSxtQ0FBbUMsRUFBQTtFQUdyQztFQUNFLHNCQUFzQixFQUFBO0VBRHhCO0lBSUksc0JBQXNCLEVBQUE7RUFLMUI7RUFDRSxpQkFBaUI7RUFDakIsMEJBQTBCO0VBQzFCLGNBQWM7RUFDZCxhQUFhO0VBQ2IsdUJBQXVCO0VBQ3ZCLG1CQUFtQjtFQUNuQixtQkFBbUIsRUFBQTtFQVByQjtJQVNJLGVBQWU7SUFDZixjQUFjO0lBQ2QsV0FBVztJQUNYLFlBQVksRUFBQTtFQVpoQjtNQWNNLGNBQWM7TUFDZCxZQUFZLEVBQUEiLCJmaWxlIjoic3JjL2FwcC9zaGFyZWQvbG9hZGVyL2xvYWRlci5jb21wb25lbnQuc2NzcyIsInNvdXJjZXNDb250ZW50IjpbIiRjb2xvcjogI2U3NTRiYjtcclxuJGNvbG9yUmlnaHQ6IGRhcmtlbigjZjc0NjhmLCAxNSUpO1xyXG4kY29sb3JMZWZ0OiBkYXJrZW4oIzVjOGRmNiwgNSUpO1xyXG4kc2hhZG93OiAjZGJlM2Y0O1xyXG5cclxuLmJveGVzIHtcclxuICAtLXNpemU6IDMycHg7XHJcbiAgLS1kdXJhdGlvbjogMjYwMG1zO1xyXG4gIGhlaWdodDogY2FsYyh2YXIoLS1zaXplKSAqIDIpO1xyXG4gIHdpZHRoOiBjYWxjKHZhcigtLXNpemUpICogMyk7XHJcbiAgcG9zaXRpb246IHJlbGF0aXZlO1xyXG4gIHRyYW5zZm9ybS1zdHlsZTogcHJlc2VydmUtM2Q7XHJcbiAgdHJhbnNmb3JtLW9yaWdpbjogNTAlIDUwJTtcclxuICBtYXJnaW4tdG9wOiBjYWxjKHZhcigtLXNpemUpICogMS41ICogLTEpO1xyXG4gIHRyYW5zZm9ybTogcm90YXRlWCg2MGRlZykgcm90YXRlWig0NWRlZykgcm90YXRlWSgwZGVnKSB0cmFuc2xhdGVaKDBweCk7XHJcbiAgbWFyZ2luOiAxMCUgNDAlIDEwJSA1MCU7XHJcbiAgLmJveCB7XHJcbiAgICB3aWR0aDogdmFyKC0tc2l6ZSk7XHJcbiAgICBoZWlnaHQ6IHZhcigtLXNpemUpO1xyXG4gICAgdG9wOiAwO1xyXG4gICAgbGVmdDogMDtcclxuICAgIHBvc2l0aW9uOiBhYnNvbHV0ZTtcclxuICAgIHRyYW5zZm9ybS1zdHlsZTogcHJlc2VydmUtM2Q7XHJcbiAgICAmOm50aC1jaGlsZCgxKSB7XHJcbiAgICAgIHRyYW5zZm9ybTogdHJhbnNsYXRlKDEwMCUsIDApO1xyXG4gICAgICBhbmltYXRpb246IGJveDEgdmFyKC0tZHVyYXRpb24pIGxpbmVhciBpbmZpbml0ZTtcclxuICAgIH1cclxuICAgICY6bnRoLWNoaWxkKDIpIHtcclxuICAgICAgdHJhbnNmb3JtOiB0cmFuc2xhdGUoMCwgMTAwJSk7XHJcbiAgICAgIGFuaW1hdGlvbjogYm94MiB2YXIoLS1kdXJhdGlvbikgbGluZWFyIGluZmluaXRlO1xyXG4gICAgfVxyXG4gICAgJjpudGgtY2hpbGQoMykge1xyXG4gICAgICB0cmFuc2Zvcm06IHRyYW5zbGF0ZSgxMDAlLCAxMDAlKTtcclxuICAgICAgYW5pbWF0aW9uOiBib3gzIHZhcigtLWR1cmF0aW9uKSBsaW5lYXIgaW5maW5pdGU7XHJcbiAgICB9XHJcbiAgICAmOm50aC1jaGlsZCg0KSB7XHJcbiAgICAgIHRyYW5zZm9ybTogdHJhbnNsYXRlKDIwMCUsIDApO1xyXG4gICAgICBhbmltYXRpb246IGJveDQgdmFyKC0tZHVyYXRpb24pIGxpbmVhciBpbmZpbml0ZTtcclxuICAgIH1cclxuICAgICYgPiBkaXYge1xyXG4gICAgICAtLWJhY2tncm91bmQ6ICN7JGNvbG9yfTtcclxuICAgICAgLS10b3A6IGF1dG87XHJcbiAgICAgIC0tcmlnaHQ6IGF1dG87XHJcbiAgICAgIC0tYm90dG9tOiBhdXRvO1xyXG4gICAgICAtLWxlZnQ6IGF1dG87XHJcbiAgICAgIC0tdHJhbnNsYXRlWjogY2FsYyh2YXIoLS1zaXplKSAvIDIpO1xyXG4gICAgICAtLXJvdGF0ZVk6IDBkZWc7XHJcbiAgICAgIC0tcm90YXRlWDogMGRlZztcclxuICAgICAgcG9zaXRpb246IGFic29sdXRlO1xyXG4gICAgICB3aWR0aDogMTAwJTtcclxuICAgICAgaGVpZ2h0OiAxMDAlO1xyXG4gICAgICBiYWNrZ3JvdW5kOiB2YXIoLS1iYWNrZ3JvdW5kKTtcclxuICAgICAgdG9wOiB2YXIoLS10b3ApO1xyXG4gICAgICByaWdodDogdmFyKC0tcmlnaHQpO1xyXG4gICAgICBib3R0b206IHZhcigtLWJvdHRvbSk7XHJcbiAgICAgIGxlZnQ6IHZhcigtLWxlZnQpO1xyXG4gICAgICB0cmFuc2Zvcm06IHJvdGF0ZVkodmFyKC0tcm90YXRlWSkpIHJvdGF0ZVgodmFyKC0tcm90YXRlWCkpXHJcbiAgICAgICAgdHJhbnNsYXRlWih2YXIoLS10cmFuc2xhdGVaKSk7XHJcbiAgICAgICY6bnRoLWNoaWxkKDEpIHtcclxuICAgICAgICAtLXRvcDogMDtcclxuICAgICAgICAtLWxlZnQ6IDA7XHJcbiAgICAgIH1cclxuICAgICAgJjpudGgtY2hpbGQoMikge1xyXG4gICAgICAgIC0tYmFja2dyb3VuZDogI3skY29sb3JSaWdodH07XHJcbiAgICAgICAgLS1yaWdodDogMDtcclxuICAgICAgICAtLXJvdGF0ZVk6IDkwZGVnO1xyXG4gICAgICB9XHJcbiAgICAgICY6bnRoLWNoaWxkKDMpIHtcclxuICAgICAgICAtLWJhY2tncm91bmQ6ICN7JGNvbG9yTGVmdH07XHJcbiAgICAgICAgLS1yb3RhdGVYOiAtOTBkZWc7XHJcbiAgICAgIH1cclxuICAgICAgJjpudGgtY2hpbGQoNCkge1xyXG4gICAgICAgIC0tYmFja2dyb3VuZDogI3skc2hhZG93fTtcclxuICAgICAgICAtLXRvcDogMDtcclxuICAgICAgICAtLWxlZnQ6IDA7XHJcbiAgICAgICAgLS10cmFuc2xhdGVaOiBjYWxjKHZhcigtLXNpemUpICogMyAqIC0xKTtcclxuICAgICAgfVxyXG4gICAgfVxyXG4gIH1cclxufVxyXG5cclxuQGtleWZyYW1lcyBib3gxIHtcclxuICAwJSxcclxuICA1MCUge1xyXG4gICAgdHJhbnNmb3JtOiB0cmFuc2xhdGUoMTAwJSwgMCk7XHJcbiAgfVxyXG4gIDEwMCUge1xyXG4gICAgdHJhbnNmb3JtOiB0cmFuc2xhdGUoMjAwJSwgMCk7XHJcbiAgfVxyXG59XHJcblxyXG5Aa2V5ZnJhbWVzIGJveDIge1xyXG4gIDAlIHtcclxuICAgIHRyYW5zZm9ybTogdHJhbnNsYXRlKDAsIDEwMCUpO1xyXG4gIH1cclxuICA1MCUge1xyXG4gICAgdHJhbnNmb3JtOiB0cmFuc2xhdGUoMCwgMCk7XHJcbiAgfVxyXG4gIDEwMCUge1xyXG4gICAgdHJhbnNmb3JtOiB0cmFuc2xhdGUoMTAwJSwgMCk7XHJcbiAgfVxyXG59XHJcblxyXG5Aa2V5ZnJhbWVzIGJveDMge1xyXG4gIDAlLFxyXG4gIDUwJSB7XHJcbiAgICB0cmFuc2Zvcm06IHRyYW5zbGF0ZSgxMDAlLCAxMDAlKTtcclxuICB9XHJcbiAgMTAwJSB7XHJcbiAgICB0cmFuc2Zvcm06IHRyYW5zbGF0ZSgwLCAxMDAlKTtcclxuICB9XHJcbn1cclxuXHJcbkBrZXlmcmFtZXMgYm94NCB7XHJcbiAgMCUge1xyXG4gICAgdHJhbnNmb3JtOiB0cmFuc2xhdGUoMjAwJSwgMCk7XHJcbiAgfVxyXG4gIDUwJSB7XHJcbiAgICB0cmFuc2Zvcm06IHRyYW5zbGF0ZSgyMDAlLCAxMDAlKTtcclxuICB9XHJcbiAgMTAwJSB7XHJcbiAgICB0cmFuc2Zvcm06IHRyYW5zbGF0ZSgxMDAlLCAxMDAlKTtcclxuICB9XHJcbn1cclxuXHJcbmh0bWwge1xyXG4gIC13ZWJraXQtZm9udC1zbW9vdGhpbmc6IGFudGlhbGlhc2VkO1xyXG59XHJcblxyXG4qIHtcclxuICBib3gtc2l6aW5nOiBib3JkZXItYm94O1xyXG4gICY6YmVmb3JlLFxyXG4gICY6YWZ0ZXIge1xyXG4gICAgYm94LXNpemluZzogYm9yZGVyLWJveDtcclxuICB9XHJcbn1cclxuXHJcbi8vIENlbnRlciAmIGRyaWJiYmxlXHJcbmJvZHkge1xyXG4gIG1pbi1oZWlnaHQ6IDEwMHZoO1xyXG4gIGZvbnQtZmFtaWx5OiBSb2JvdG8sIEFyaWFsO1xyXG4gIGNvbG9yOiAjYWRhZmI2O1xyXG4gIGRpc3BsYXk6IGZsZXg7XHJcbiAganVzdGlmeS1jb250ZW50OiBjZW50ZXI7XHJcbiAgYWxpZ24taXRlbXM6IGNlbnRlcjtcclxuICBiYWNrZ3JvdW5kOiAjZjlmYmZmO1xyXG4gIC5kcmliYmJsZSB7XHJcbiAgICBwb3NpdGlvbjogZml4ZWQ7XHJcbiAgICBkaXNwbGF5OiBibG9jaztcclxuICAgIHJpZ2h0OiAyMHB4O1xyXG4gICAgYm90dG9tOiAyMHB4O1xyXG4gICAgaW1nIHtcclxuICAgICAgZGlzcGxheTogYmxvY2s7XHJcbiAgICAgIGhlaWdodDogMjhweDtcclxuICAgIH1cclxuICB9XHJcbn1cclxuIl19 */"

/***/ }),

/***/ "./src/app/shared/loader/loader.component.ts":
/*!***************************************************!*\
  !*** ./src/app/shared/loader/loader.component.ts ***!
  \***************************************************/
/*! exports provided: LoaderComponent */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "LoaderComponent", function() { return LoaderComponent; });
/* harmony import */ var tslib__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! tslib */ "./node_modules/tslib/tslib.es6.js");
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm5/core.js");


var LoaderComponent = /** @class */ (function () {
    function LoaderComponent() {
    }
    LoaderComponent.prototype.ngOnInit = function () {
    };
    LoaderComponent = tslib__WEBPACK_IMPORTED_MODULE_0__["__decorate"]([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_1__["Component"])({
            selector: 'app-loader',
            template: __webpack_require__(/*! ./loader.component.html */ "./src/app/shared/loader/loader.component.html"),
            styles: [__webpack_require__(/*! ./loader.component.scss */ "./src/app/shared/loader/loader.component.scss")]
        }),
        tslib__WEBPACK_IMPORTED_MODULE_0__["__metadata"]("design:paramtypes", [])
    ], LoaderComponent);
    return LoaderComponent;
}());



/***/ }),

/***/ "./src/environments/environment.ts":
/*!*****************************************!*\
  !*** ./src/environments/environment.ts ***!
  \*****************************************/
/*! exports provided: environment */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "environment", function() { return environment; });
// This file can be replaced during build by using the `fileReplacements` array.
// `ng build --prod` replaces `environment.ts` with `environment.prod.ts`.
// The list of file replacements can be found in `angular.json`.
var environment = {
    production: false
};
/*
 * For easier debugging in development mode, you can import the following file
 * to ignore zone related error stack frames such as `zone.run`, `zoneDelegate.invokeTask`.
 *
 * This import should be commented out in production mode because it will have a negative impact
 * on performance if an error is thrown.
 */
// import 'zone.js/dist/zone-error';  // Included with Angular CLI.


/***/ }),

/***/ "./src/main.ts":
/*!*********************!*\
  !*** ./src/main.ts ***!
  \*********************/
/*! no exports provided */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm5/core.js");
/* harmony import */ var _angular_platform_browser_dynamic__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! @angular/platform-browser-dynamic */ "./node_modules/@angular/platform-browser-dynamic/fesm5/platform-browser-dynamic.js");
/* harmony import */ var _app_app_module__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(/*! ./app/app.module */ "./src/app/app.module.ts");
/* harmony import */ var _environments_environment__WEBPACK_IMPORTED_MODULE_3__ = __webpack_require__(/*! ./environments/environment */ "./src/environments/environment.ts");




if (_environments_environment__WEBPACK_IMPORTED_MODULE_3__["environment"].production) {
    Object(_angular_core__WEBPACK_IMPORTED_MODULE_0__["enableProdMode"])();
}
Object(_angular_platform_browser_dynamic__WEBPACK_IMPORTED_MODULE_1__["platformBrowserDynamic"])().bootstrapModule(_app_app_module__WEBPACK_IMPORTED_MODULE_2__["AppModule"])
    .catch(function (err) { return console.error(err); });


/***/ }),

/***/ 0:
/*!***************************!*\
  !*** multi ./src/main.ts ***!
  \***************************/
/*! no static exports found */
/***/ (function(module, exports, __webpack_require__) {

module.exports = __webpack_require__(/*! C:\Users\ninja\Desktop\k9kidsng\src\main.ts */"./src/main.ts");


/***/ })

},[[0,"runtime","vendor"]]]);
//# sourceMappingURL=main.js.map
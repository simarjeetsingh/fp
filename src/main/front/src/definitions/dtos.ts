
export interface Item {
    code?: string;
    id?: string;
    text?: string;
}

export interface NamedValue {
    name: string;
    value?: any;
}

export interface LoginForm {
    username: string;
    password: string;
    error: string;
    rememberMe: boolean;
}

export interface UserDtoExt {
    password?: string;
    email?: string;
    id?: string;
    lang?: string;
    md5?: string;
    projects?: { [key: string]: Project; };
    roles?: Array<string>;
    username?: string;
    validated?: boolean;
    phone?: string;
    apiKey?: string;
    avatar?: string;
}

export interface Project {
    code: string;
    id: string;
    name: string;
    owner: UserDtoExt;
}

export interface Configuration {
    username: string;
    password: string;
    apiKey?: string;
}

// Classes
export class StoreData implements NamedValue {
    name: string;
    value: any;

    constructor(name: string, value: any) {
        this.name = name;
        this.value = value;
    }
}

export class StoreDataPath extends StoreData {
    param: string;

    constructor(name: string, param: string) {
        super(name, null);
        this.param = param;
    }
}

export interface BreadcrumbConfig {
    deep: number;
    show: boolean;
    breadcrumbs: Array<Breadcrumb>;
}

export interface Breadcrumb {
    name: string;
    path: string;
}

export interface ApiError {
    message: string;
    errors: any;
}
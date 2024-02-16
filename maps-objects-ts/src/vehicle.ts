export class Vehicle {
    public readonly id: string
    public readonly type: VehicleType

    public readonly registration_number: string | null
    public readonly model: string | null
    public readonly route: string | null
    public readonly route_id: string | null

    public readonly lat: number
    public readonly lng: number

    public readonly speed: number | null
    public readonly arrow: number | null

    public readonly kttu: boolean
    public readonly long: boolean
    public readonly routeless: boolean

    constructor(data: any) {
        this.id = data['id'];
        this.registration_number = data['registration_number'];
        this.model = data['model'];
        this.type = data['type'];
        this.route = data['route'];
        this.route_id = data['route_id'];
        this.lat = data['lat'];
        this.lng = data['lng'];
        this.speed = data['speed'];
        this.arrow = data['arrow'];
        this.kttu = data['kttu'];
        this.long = data['long'];
        this.routeless = data['routeless'];
    }
}

export class VehicleInfo {
    public readonly num: string | null
    public readonly model: string | null
    public readonly years: number | null
    public readonly factory_id: number | null
    public readonly built_in: string | null
    public readonly exploitation_since: string
    public readonly depot: string | null
    public readonly registration_number: string | null
    public readonly comment: string | null
    public readonly more_url: string | null
    public readonly image_url: string | null
    public readonly small_image_url: string | null
    public readonly tags: string[] | any[] | null

    constructor(data: any) {
        this.num = data['num'];
        this.model = data['model'];
        this.years = data['years'];
        this.factory_id = data['factory_id'];
        this.built_in = data['built_in'];
        this.exploitation_since = data['exploitation_since'];
        this.depot = data['depot'];
        this.registration_number = data['registration_number'];
        this.comment = data['comment'];
        this.more_url = data['more_url'];
        this.image_url = data['image_url'];
        this.small_image_url = data['small_image_url'];
        this.tags = data['tags'];
    }
}

export enum VehicleType {
    TROLLEY = "trolley",
    BUS = "bus",
    EBUS = "ebus",
    TRAM = "tram",
    SERVICE = "service",
    COMMERCIAL = "commercial"
}


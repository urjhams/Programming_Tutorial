import Foundation

public enum Currency: Double {
    case PENY = 0.01
    case NICKLE = 0.05
    case DIME = 0.25
    case QUARTER = 0.5

    static let allValues = [PENY,NICKLE,DIME,QUARTER]
}

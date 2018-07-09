import Foundation

/*Todo: Create an enum with all Planets in the Solarsystem as
 *allowed input types (in SWIFT).
 * Also save mass and radius of the planets. Here are the needed
 * values:
 *
 * MERCURY (3.303e+23, 2.4397e6), VENUS (4.869e+24, 6.0518e6),
 * EARTH (5.976e+24, 6.37814e6), MARS (6.421e+23, 3.3972e6),
 * JUPITER (1.9e+27, 7.1492e7), SATURN (5.688e+26, 6.0268e7),
 * URANUS (8.686e+25, 2.5559e7), NEPTUNE (1.024e+26, 2.4746e7);
 *
 * There should also be a constant for gravity:
 * g = 6.67300E-11;
 *
 * Write getter methods for mass and radius. Also write functions
 * to compute the gravity
 * Gravity = gravityconstant*mass/radius^2
 * and the weight
 * Weiht = mass*gravity
 *
 * Print all the planets in this class and don't forget to test
 * your methods
 */

 enum Planet: RawRepresentable {
     case Mercury
     case Venus
     case Earth
     case Mars
     case Jupiter
     case Saturn
     case Uranus
     case Neptune

     typealias RawValue = (mass: Double, radius: Double)

     static let allValues = [Mercury, Venus, Earth, Mars, Jupiter, Saturn, Uranus, Neptune]
     /*in swift 4.2, use protocol CaseIterable and call Planet.allCases instead, current swift is 4.1.2*/

     var gravity: Double {
         let g = 6.67300E-1
         return (g * self.rawValue.mass / self.rawValue.radius * self.rawValue.radius)
     }

     init?(rawValue: (mass: Double, radius: Double)) {
         switch rawValue {
         case (3.303e+23, 2.4397e6):
             self = .Mercury
         case (4.869e+24, 6.0518e6):
             self = .Venus
         case (5.976e+24, 6.37814e6):
             self = .Earth
         case (6.421e+23, 3.3972e6):
             self = .Mars
         case (1.9e+27, 7.1492e7):
             self = .Jupiter
         case (5.688e+26, 6.0268e7):
             self = .Saturn
         case (8.686e+25, 2.5559e7):
             self = .Uranus
         case (1.024e+26, 2.4746e7):
             self = .Neptune
         default:
             return nil
         }
     }

     var rawValue: (mass: Double, radius: Double) {
         switch self {
         case .Mercury:
             return (3.303e+23, 2.4397e6)
         case .Venus:
             return (4.869e+24, 6.0518e6)
         case .Earth:
             return (5.976e+24, 6.37814e6)
         case .Mars:
             return (6.421e+23, 3.3972e6)
         case .Jupiter:
             return (1.9e+27, 7.1492e7)
         case .Saturn:
             return (5.688e+26, 6.0268e7)
         case .Uranus:
             return (8.686e+25, 2.5559e7)
         case .Neptune:
             return (1.024e+26, 2.4746e7)
         }
     }
 }

 for value in Planet.allValues {
     print("name: \(value)\n\tmass: \(value.rawValue.mass)\n\tradius: \(value.rawValue.radius)\n\tgravity: \(value.gravity)\n")
 }
/*--------------- for using with CaseIterable protocol in swfit 4.2 (xcode 10)
for value in Planet.allCases
*/

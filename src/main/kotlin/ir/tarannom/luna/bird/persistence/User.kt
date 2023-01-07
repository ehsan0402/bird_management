package ir.tarannom.luna.bird.persistence

import jakarta.persistence.*
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Size
import java.time.Instant

@Entity
@Table(name = "user")
open class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    open var id: Int? = null

    @Size(max = 50)
    @NotNull
    @Column(name = "email", nullable = false, length = 50)
    open var email: String? = null

    @Size(max = 250)
    @NotNull
    @Column(name = "password", nullable = false, length = 250)
    open var password: String? = null

    @Size(max = 20)
    @NotNull
    @Column(name = "first_name", nullable = false, length = 20)
    open var firstName: String? = null

    @Size(max = 30)
    @NotNull
    @Column(name = "last_name", nullable = false, length = 30)
    open var lastName: String? = null

    @NotNull
    @Column(name = "birth_date", nullable = false)
    open var birthDate: Instant? = null

    @NotNull
    @Column(name = "creation_date", nullable = false)
    open var creationDate: Instant? = null

    @NotNull
    @Column(name = "is_active", nullable = false)
    open var isActive: Boolean? = false

    @NotNull
    @Column(name = "last_visit", nullable = false)
    open var lastVisit: Instant? = null

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "city_id", nullable = false)
    open var city: City? = null
}
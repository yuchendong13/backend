package com.team701.buddymatcher.domain.users;

import javax.persistence.*;

@Entity
@Table(name = "USER")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "USER_NAME", nullable = false)
    private String name;

    @Column(name = "USER_EMAIL", nullable = false)
    private String email;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "BUDDIES_ID")
    private Buddies buddies;

    @Column(name = "USER_PAIRING_ENABLED")
    private Boolean pairingEnabled;

    public Long getId() {
        return id;
    }

    public User setId(Long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public User setName(String name) {
        this.name = name;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public User setEmail(String email) {
        this.email = email;
        return this;
    }

    public Buddies getBuddies() {
        return buddies;
    }

    public User setBuddies(Buddies buddies) {
        this.buddies = buddies;
        return this;
    }

    public Boolean getPairingEnabled() {
        return pairingEnabled;
    }

    public User setPairingEnabled(Boolean pairingEnabled) {
        this.pairingEnabled = pairingEnabled;
        return this;
    }
}
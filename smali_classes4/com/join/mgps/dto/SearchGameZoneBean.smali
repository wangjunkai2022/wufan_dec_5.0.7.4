.class public Lcom/join/mgps/dto/SearchGameZoneBean;
.super Ljava/lang/Object;
.source "SearchGameZoneBean.java"


# instance fields
.field private zone_id:Ljava/lang/String;

.field private zone_name:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getZone_id()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/SearchGameZoneBean;->zone_id:Ljava/lang/String;

    return-object v0
.end method

.method public getZone_name()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/SearchGameZoneBean;->zone_name:Ljava/lang/String;

    return-object v0
.end method

.method public setZone_id(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dto/SearchGameZoneBean;->zone_id:Ljava/lang/String;

    return-void
.end method

.method public setZone_name(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dto/SearchGameZoneBean;->zone_name:Ljava/lang/String;

    return-void
.end method

.class public Lcom/join/mgps/ad/RewardAdParams;
.super Ljava/lang/Object;
.source "RewardAdParams.java"

# interfaces
.implements Ljava/io/Serializable;


# instance fields
.field private b:Ljava/lang/String;

.field private c:Ljava/lang/String;

.field private d:I

.field private e:I

.field private f:Lcom/join/mgps/dto/SingleGameAdCfgBean;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;IILcom/join/mgps/dto/SingleGameAdCfgBean;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/join/mgps/ad/RewardAdParams;->b:Ljava/lang/String;

    .line 3
    iput-object p2, p0, Lcom/join/mgps/ad/RewardAdParams;->c:Ljava/lang/String;

    .line 4
    iput p3, p0, Lcom/join/mgps/ad/RewardAdParams;->d:I

    .line 5
    iput p4, p0, Lcom/join/mgps/ad/RewardAdParams;->e:I

    .line 6
    iput-object p5, p0, Lcom/join/mgps/ad/RewardAdParams;->f:Lcom/join/mgps/dto/SingleGameAdCfgBean;

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/ad/RewardAdParams;->c:Ljava/lang/String;

    return-object v0
.end method

.method public b()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/join/mgps/ad/RewardAdParams;->d:I

    return v0
.end method

.method public c()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/ad/RewardAdParams;->b:Ljava/lang/String;

    return-object v0
.end method

.method public d()Lcom/join/mgps/dto/SingleGameAdCfgBean;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/ad/RewardAdParams;->f:Lcom/join/mgps/dto/SingleGameAdCfgBean;

    return-object v0
.end method

.method public e()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/join/mgps/ad/RewardAdParams;->e:I

    return v0
.end method

.method public f(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/ad/RewardAdParams;->c:Ljava/lang/String;

    return-void
.end method

.method public g(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/join/mgps/ad/RewardAdParams;->d:I

    return-void
.end method

.method public h(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/ad/RewardAdParams;->b:Ljava/lang/String;

    return-void
.end method

.method public i(Lcom/join/mgps/dto/SingleGameAdCfgBean;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/ad/RewardAdParams;->f:Lcom/join/mgps/dto/SingleGameAdCfgBean;

    return-void
.end method

.method public j(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/join/mgps/ad/RewardAdParams;->e:I

    return-void
.end method

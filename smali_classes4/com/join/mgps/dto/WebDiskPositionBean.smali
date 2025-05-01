.class public Lcom/join/mgps/dto/WebDiskPositionBean;
.super Ljava/lang/Object;
.source "WebDiskPositionBean.java"


# instance fields
.field private pc_game:Lcom/join/mgps/dto/WebDiskPositionModeBean;

.field private simulator_game:Lcom/join/mgps/dto/WebDiskPositionModeBean;

.field private single_game:Lcom/join/mgps/dto/WebDiskPositionModeBean;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getPc_game()Lcom/join/mgps/dto/WebDiskPositionModeBean;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/WebDiskPositionBean;->pc_game:Lcom/join/mgps/dto/WebDiskPositionModeBean;

    return-object v0
.end method

.method public getSimulator_game()Lcom/join/mgps/dto/WebDiskPositionModeBean;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/WebDiskPositionBean;->simulator_game:Lcom/join/mgps/dto/WebDiskPositionModeBean;

    return-object v0
.end method

.method public getSingle_game()Lcom/join/mgps/dto/WebDiskPositionModeBean;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/WebDiskPositionBean;->single_game:Lcom/join/mgps/dto/WebDiskPositionModeBean;

    return-object v0
.end method

.method public setPc_game(Lcom/join/mgps/dto/WebDiskPositionModeBean;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dto/WebDiskPositionBean;->pc_game:Lcom/join/mgps/dto/WebDiskPositionModeBean;

    return-void
.end method

.method public setSimulator_game(Lcom/join/mgps/dto/WebDiskPositionModeBean;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dto/WebDiskPositionBean;->simulator_game:Lcom/join/mgps/dto/WebDiskPositionModeBean;

    return-void
.end method

.method public setSingle_game(Lcom/join/mgps/dto/WebDiskPositionModeBean;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dto/WebDiskPositionBean;->single_game:Lcom/join/mgps/dto/WebDiskPositionModeBean;

    return-void
.end method

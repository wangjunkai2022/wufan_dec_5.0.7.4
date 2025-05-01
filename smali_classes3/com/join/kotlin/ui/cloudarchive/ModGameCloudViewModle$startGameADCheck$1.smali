.class public final Lcom/join/kotlin/ui/cloudarchive/ModGameCloudViewModle$startGameADCheck$1;
.super Ls1/c;
.source "ModGameCloudViewModle.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/kotlin/ui/cloudarchive/ModGameCloudViewModle;->startGameADCheck(Landroid/content/Context;Lkotlin/jvm/functions/Function0;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic $adc:I

.field final synthetic $func:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $u:I

.field final synthetic $userPrefs:Lcom/papa91/wrapper/UserPrefs;


# direct methods
.method constructor <init>(Lkotlin/jvm/functions/Function0;Lcom/papa91/wrapper/UserPrefs;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "Lcom/papa91/wrapper/UserPrefs;",
            "II)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/join/kotlin/ui/cloudarchive/ModGameCloudViewModle$startGameADCheck$1;->$func:Lkotlin/jvm/functions/Function0;

    iput-object p2, p0, Lcom/join/kotlin/ui/cloudarchive/ModGameCloudViewModle$startGameADCheck$1;->$userPrefs:Lcom/papa91/wrapper/UserPrefs;

    iput p3, p0, Lcom/join/kotlin/ui/cloudarchive/ModGameCloudViewModle$startGameADCheck$1;->$u:I

    iput p4, p0, Lcom/join/kotlin/ui/cloudarchive/ModGameCloudViewModle$startGameADCheck$1;->$adc:I

    .line 1
    invoke-direct {p0}, Ls1/c;-><init>()V

    return-void
.end method


# virtual methods
.method public onAdClose()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/ui/cloudarchive/ModGameCloudViewModle$startGameADCheck$1;->$func:Lkotlin/jvm/functions/Function0;

    invoke-interface {v0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    return-void
.end method

.method public onAdShow()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/ui/cloudarchive/ModGameCloudViewModle$startGameADCheck$1;->$userPrefs:Lcom/papa91/wrapper/UserPrefs;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget v2, p0, Lcom/join/kotlin/ui/cloudarchive/ModGameCloudViewModle$startGameADCheck$1;->$u:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    iget v2, p0, Lcom/join/kotlin/ui/cloudarchive/ModGameCloudViewModle$startGameADCheck$1;->$adc:I

    invoke-virtual {v0, v1, v2}, Lcom/papa91/wrapper/UserPrefs;->setAdGamesConfig(Ljava/lang/String;I)V

    return-void
.end method

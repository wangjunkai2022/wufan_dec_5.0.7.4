.class Lcom/join/mgps/activity/PapaMainV3Fragment_$m;
.super Ljava/lang/Object;
.source "PapaMainV3Fragment_.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/activity/PapaMainV3Fragment_;->f2(Lcom/join/mgps/dto/PAPAHomeBeanV7;Ljava/lang/String;IZ)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/join/mgps/dto/PAPAHomeBeanV7;

.field final synthetic c:Ljava/lang/String;

.field final synthetic d:I

.field final synthetic e:Z

.field final synthetic f:Lcom/join/mgps/activity/PapaMainV3Fragment_;


# direct methods
.method constructor <init>(Lcom/join/mgps/activity/PapaMainV3Fragment_;Lcom/join/mgps/dto/PAPAHomeBeanV7;Ljava/lang/String;IZ)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/PapaMainV3Fragment_$m;->f:Lcom/join/mgps/activity/PapaMainV3Fragment_;

    iput-object p2, p0, Lcom/join/mgps/activity/PapaMainV3Fragment_$m;->b:Lcom/join/mgps/dto/PAPAHomeBeanV7;

    iput-object p3, p0, Lcom/join/mgps/activity/PapaMainV3Fragment_$m;->c:Ljava/lang/String;

    iput p4, p0, Lcom/join/mgps/activity/PapaMainV3Fragment_$m;->d:I

    iput-boolean p5, p0, Lcom/join/mgps/activity/PapaMainV3Fragment_$m;->e:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/PapaMainV3Fragment_$m;->f:Lcom/join/mgps/activity/PapaMainV3Fragment_;

    iget-object v1, p0, Lcom/join/mgps/activity/PapaMainV3Fragment_$m;->b:Lcom/join/mgps/dto/PAPAHomeBeanV7;

    iget-object v2, p0, Lcom/join/mgps/activity/PapaMainV3Fragment_$m;->c:Ljava/lang/String;

    iget v3, p0, Lcom/join/mgps/activity/PapaMainV3Fragment_$m;->d:I

    iget-boolean v4, p0, Lcom/join/mgps/activity/PapaMainV3Fragment_$m;->e:Z

    invoke-static {v0, v1, v2, v3, v4}, Lcom/join/mgps/activity/PapaMainV3Fragment_;->Y2(Lcom/join/mgps/activity/PapaMainV3Fragment_;Lcom/join/mgps/dto/PAPAHomeBeanV7;Ljava/lang/String;IZ)V

    return-void
.end method

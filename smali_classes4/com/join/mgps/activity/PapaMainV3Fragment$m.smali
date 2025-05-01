.class Lcom/join/mgps/activity/PapaMainV3Fragment$m;
.super Ljava/lang/Object;
.source "PapaMainV3Fragment.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/activity/PapaMainV3Fragment;->f2(Lcom/join/mgps/dto/PAPAHomeBeanV7;Ljava/lang/String;IZ)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/join/mgps/activity/PapaMainV3Fragment;


# direct methods
.method constructor <init>(Lcom/join/mgps/activity/PapaMainV3Fragment;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/PapaMainV3Fragment$m;->b:Lcom/join/mgps/activity/PapaMainV3Fragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/PapaMainV3Fragment$m;->b:Lcom/join/mgps/activity/PapaMainV3Fragment;

    iget-object v0, v0, Lcom/join/mgps/activity/PapaMainV3Fragment;->Q:Lcom/join/android/app/component/video/g;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Lcom/join/android/app/component/video/g;->e()V

    :cond_0
    return-void
.end method

.class public final synthetic Lcom/join/android/app/common/dialog/i;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Lcom/join/android/app/common/dialog/LocalGameThreeDialog;

.field public final synthetic c:Lcom/join/mgps/activity/CheckLocalGameFragment;

.field public final synthetic d:I


# direct methods
.method public synthetic constructor <init>(Lcom/join/android/app/common/dialog/LocalGameThreeDialog;Lcom/join/mgps/activity/CheckLocalGameFragment;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/join/android/app/common/dialog/i;->b:Lcom/join/android/app/common/dialog/LocalGameThreeDialog;

    iput-object p2, p0, Lcom/join/android/app/common/dialog/i;->c:Lcom/join/mgps/activity/CheckLocalGameFragment;

    iput p3, p0, Lcom/join/android/app/common/dialog/i;->d:I

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lcom/join/android/app/common/dialog/i;->b:Lcom/join/android/app/common/dialog/LocalGameThreeDialog;

    iget-object v1, p0, Lcom/join/android/app/common/dialog/i;->c:Lcom/join/mgps/activity/CheckLocalGameFragment;

    iget v2, p0, Lcom/join/android/app/common/dialog/i;->d:I

    invoke-static {v0, v1, v2}, Lcom/join/android/app/common/dialog/LocalGameThreeDialog;->X(Lcom/join/android/app/common/dialog/LocalGameThreeDialog;Lcom/join/mgps/activity/CheckLocalGameFragment;I)V

    return-void
.end method

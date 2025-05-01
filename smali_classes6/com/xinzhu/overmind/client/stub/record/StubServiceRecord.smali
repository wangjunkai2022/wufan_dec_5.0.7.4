.class public Lcom/xinzhu/overmind/client/stub/record/StubServiceRecord;
.super Ljava/lang/Object;
.source "StubServiceRecord.java"


# instance fields
.field public mFlags:I

.field public mServiceInfo:Landroid/content/pm/ServiceInfo;

.field public mServiceIntent:Landroid/content/Intent;

.field public mStartId:I

.field public mUserId:I


# direct methods
.method public constructor <init>(Landroid/content/Intent;Landroid/content/pm/ServiceInfo;III)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/xinzhu/overmind/client/stub/record/StubServiceRecord;->mServiceIntent:Landroid/content/Intent;

    .line 3
    iput-object p2, p0, Lcom/xinzhu/overmind/client/stub/record/StubServiceRecord;->mServiceInfo:Landroid/content/pm/ServiceInfo;

    .line 4
    iput p3, p0, Lcom/xinzhu/overmind/client/stub/record/StubServiceRecord;->mUserId:I

    .line 5
    iput p4, p0, Lcom/xinzhu/overmind/client/stub/record/StubServiceRecord;->mStartId:I

    .line 6
    iput p5, p0, Lcom/xinzhu/overmind/client/stub/record/StubServiceRecord;->mFlags:I

    return-void
.end method

.method public static create(Landroid/content/Intent;)Lcom/xinzhu/overmind/client/stub/record/StubServiceRecord;
    .locals 7

    const-string v0, "_VM_|_target_"

    .line 1
    invoke-virtual {p0, v0}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Landroid/content/Intent;

    const-string v0, "_VM_|_service_info_"

    .line 2
    invoke-virtual {p0, v0}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Landroid/content/pm/ServiceInfo;

    const-string v0, "_VM_|_user_id_"

    const/4 v1, 0x0

    .line 3
    invoke-virtual {p0, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v4

    const-string v0, "_VM_|_start_id_"

    .line 4
    invoke-virtual {p0, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v5

    const-string v0, "_VM_|_flags_"

    .line 5
    invoke-virtual {p0, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v6

    .line 6
    new-instance p0, Lcom/xinzhu/overmind/client/stub/record/StubServiceRecord;

    move-object v1, p0

    invoke-direct/range {v1 .. v6}, Lcom/xinzhu/overmind/client/stub/record/StubServiceRecord;-><init>(Landroid/content/Intent;Landroid/content/pm/ServiceInfo;III)V

    return-object p0
.end method

.method public static saveStub(Landroid/content/Intent;Landroid/content/Intent;Landroid/content/pm/ServiceInfo;III)V
    .locals 1

    const-string v0, "_VM_|_target_"

    .line 1
    invoke-virtual {p0, v0, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    const-string p1, "_VM_|_service_info_"

    .line 2
    invoke-virtual {p0, p1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    const-string p1, "_VM_|_user_id_"

    .line 3
    invoke-virtual {p0, p1, p3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    const-string p1, "_VM_|_start_id_"

    .line 4
    invoke-virtual {p0, p1, p4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    const-string p1, "_VM_|_flags_"

    .line 5
    invoke-virtual {p0, p1, p5}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    return-void
.end method

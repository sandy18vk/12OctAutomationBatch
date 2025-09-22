terraform {
  required_providers {
    google = {
      source  = "hashicorp/google"
      version = ">= 5.0"
    }
  }
}

provider "google" {
  project = buoyant-keel-455805-r7
  region  = var.region
  zone    = var.zone
}

resource "google_storage_bucket" "demo" {
  name          = var.bucket_name
  location      = var.region
  force_destroy = true
}

terraform {
  required_providers {
    google = {
      source  = "hashicorp/google"
      version = "~> 5.0"
    }
  }
}
resource "google_storage_bucket" "demo" {
  name          = var.bucket_name


